var directionsDisplay;
var directionsService = new google.maps.DirectionsService();
var map;
  function initialize(){
	var directionsRerenderOptions = {
			markerOptions:{
				icon: new google.maps.MarkerImage("images/Oil-Barrel-icon.png")
			}
	};
	directionsDisplay = new google.maps.DirectionsRenderer();
	directionsDisplay.setOptions(directionsRerenderOptions);
	var mexico_city = new google.maps.LatLng(19.434, -99.138);
	var my_options = {zoom: 5, mapTypeId:google.maps.MapTypeId.ROADMAP, center: mexico_city};
	var map = new google.maps.Map(document.getElementById('map-canvas'), my_options);
			directionsDisplay.setMap(map);
  }
  function handleDirectionsResponse(start, end, directionsResult){
	directionsDisplay.setDirections(directionsResult);
	var routes = directionsResult.routes;
	for(var i=0; i<routes.length; i++){
		var totalDistance = 0;
		var legs = routes[i].legs;
		for(j=0; j<legs.length; j++){
			totalDistance += legs[j].distance.value;
		}
		document.getElementById("distance").innerHTML= Math.round(totalDistance/1000);
	}
  }
  function calcRoute(){
	var start = document.getElementById("start").value;
	var end = document.getElementById("end").value;
	var request = { origin: start, destination: end,
		travelMode: google.maps.DirectionsTravelMode.DRIVING
	};
	directionsService.route(request, function(directionsResult, status){
		if(status==google.maps.DirectionsStatus.OK){
			handleDirectionsResponse(
					start, end, directionsResult);
		}
	});
}