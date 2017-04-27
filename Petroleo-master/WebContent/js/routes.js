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
	var mexico_city = new google.maps.LatLng(22.1564699, -100.98554089999999);
	var my_options = {zoom: 5, mapTypeId:google.maps.MapTypeId.ROADMAP, center: mexico_city};
	var map = new google.maps.Map(document.getElementById('map-canvas'), my_options);
			directionsDisplay.setMap(map);
			
			
			var infoWindow2 = new google.maps.InfoWindow;
		    var onMarkerMouseOver = function() {
		      var latLng = this.getPosition();
		      infoWindow2.setContent('<h3>Mexico City</h3>Latitude= ' +
		          latLng.lat() + '<br>Longitude= ' + latLng.lng()+'<br><br><a href="http://en.wikipedia.org/wiki/Mexico_city"><img src="images/Mexico.jpg " /></a>');
		      infoWindow2.open(map, this);
		    };
		    google.maps.event.addListener(map, 'mouseout', function() {
		      infoWindow2.close();
		    });
			

		   var mkr = new google.maps.Marker({
					draggable: true,
					icon : "images/pozo.gif",
					
					position:{lat: 19.4978, lng: -99.1269},
					map: map,
					title: 'Ciudad de Mexico'
					
				});
		    google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		/*	<!--------------------aqui se agrega un marcador-------------------------->*/
			
		    
		    
		    var infoWindow2 = new google.maps.InfoWindow;
		    var onMarkerMouseOver = function() {
		      var latLng = this.getPosition();
		      infoWindow2.setContent('<h3>Salamanca Guanajuato </h3>Latitude= ' +
		          latLng.lat() + '<br>Longitude= ' + latLng.lng()+'<br><br><a href="https://es.wikipedia.org/wiki/Salamanca_(M%C3%A9xico)"><img src="images/salamanca.jpg " /></a>');
		      infoWindow2.open(map, this);
		    };
		    google.maps.event.addListener(map, 'mouseout', function() {
		      infoWindow2.close();
		    });
			

		   var mkr = new google.maps.Marker({
					draggable: true,
					icon : "images/pozo.gif",
					
					position:{lat: 20.5739314, lng: -101.19571719999999},
					map: map,
					title: 'Salamanca Guanajuato'
					
				});
		    google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		
			
		    
		    var infoWindow2 = new google.maps.InfoWindow;
		    var onMarkerMouseOver = function() {
		      var latLng = this.getPosition();
		      infoWindow2.setContent('<h3>Monterrey Nuevo Leon </h3>Latitude= ' +
		          latLng.lat() + '<br>Longitude= ' + latLng.lng()+'<br><br><a href="https://es.wikipedia.org/wiki/Monterrey"><img src="images/Monterrey.jpg " /></a>');
		      infoWindow2.open(map, this);
		    };
		    google.maps.event.addListener(map, 'mouseout', function() {
		      infoWindow2.close();
		    });
			

		   var mkr = new google.maps.Marker({
					draggable: true,
					icon : "images/pozo.gif",
					
					position:{lat: 25.6866142, lng: -100.3161126},
					map: map,
					title: 'Monterrey'
					
				});
		    google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		    
		    
		    var infoWindow2 = new google.maps.InfoWindow;
		    var onMarkerMouseOver = function() {
		      var latLng = this.getPosition();
		      infoWindow2.setContent('<h3>Veracruz </h3>Latitude= ' +
		          latLng.lat() + '<br>Longitude= ' + latLng.lng()+'<br><br><a href="https://es.wikipedia.org/wiki/Veracruz"><img src="images/veracruz.jpg " /></a>');
		      infoWindow2.open(map, this);
		    };
		    google.maps.event.addListener(map, 'mouseout', function() {
		      infoWindow2.close();
		    });
			

		   var mkr = new google.maps.Marker({
					draggable: true,
					icon : "images/pozo.gif",
					
					position:{lat: 19.173773, lng: -96.13422409999998},
					map: map,
					title: 'Monterrey'
					
				}); 
		    google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		    
		    
		    var infoWindow2 = new google.maps.InfoWindow;
		    var onMarkerMouseOver = function() {
		      var latLng = this.getPosition();
		      infoWindow2.setContent('<h3>Tampico </h3>Latitude= ' +
		          latLng.lat() + '<br>Longitude= ' + latLng.lng()+'<br><br><a href="https://es.wikipedia.org/wiki/Tampico"><img src="images/tampico.jpg " /></a>');
		      infoWindow2.open(map, this);
		    };
		    google.maps.event.addListener(map, 'mouseout', function() {
		      infoWindow2.close();
		    });
			

		   var mkr = new google.maps.Marker({
					draggable: true,
					icon : "images/pozo.gif",
					
					position:{lat: 22.233104, lng: -97.861099},
					map: map,
					title: 'Tampico'
					
				});
		    google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		    
		    var infoWindow2 = new google.maps.InfoWindow;
		    var onMarkerMouseOver = function() {
		      var latLng = this.getPosition();
		      infoWindow2.setContent('<h3>Tabasco </h3>Latitude= ' +
		          latLng.lat() + '<br>Longitude= ' + latLng.lng()+'<br><br><a href="https://es.wikipedia.org/wiki/Tabasco"><img src="images/tabasco.jpg " /></a>');
		      infoWindow2.open(map, this);
		    };
		    google.maps.event.addListener(map, 'mouseout', function() {
		      infoWindow2.close();
		    });
			

		   var mkr = new google.maps.Marker({
					draggable: true,
					icon : "images/pozo.gif",
					
					position:{lat: 17.840917, lng: -92.618927},
					map: map,
					title: 'Tabasco'
					
				});
		    google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		    
 google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		    
		    var infoWindow2 = new google.maps.InfoWindow;
		    var onMarkerMouseOver = function() {
		      var latLng = this.getPosition();
		      infoWindow2.setContent('<h3>Poza Rica De Hidalgo</h3>Latitude= ' +
		          latLng.lat() + '<br>Longitude= ' + latLng.lng()+'<br><br><a href="https://es.wikipedia.org/wiki/Poza_Rica_de_Hidalgo"><img src="images/poza.jpg " /></a>');
		      infoWindow2.open(map, this);
		    };
		    google.maps.event.addListener(map, 'mouseout', function() {
		      infoWindow2.close();
		    });
			

		   var mkr = new google.maps.Marker({
					draggable: true,
					icon : "images/pozo.gif",
					
					position:{lat: 20.5270592, lng: -97.4629119},
					map: map,
					title: 'Poza Rica De Hidalgo'
					
				});
		    google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		    
		    
		    var infoWindow2 = new google.maps.InfoWindow;
		    var onMarkerMouseOver = function() {
		      var latLng = this.getPosition();
		      infoWindow2.setContent('<h3>Tamaulipas</h3>Latitude= ' +
		          latLng.lat() + '<br>Longitude= ' + latLng.lng()+'<br><br><a href="https://es.wikipedia.org/wiki/Tamaulipas"><img src="images/tamaulipas.jpg " /></a>');
		      infoWindow2.open(map, this);
		    };
		    google.maps.event.addListener(map, 'mouseout', function() {
		      infoWindow2.close();
		    });
			

		   var mkr = new google.maps.Marker({
					draggable: true,
					icon : "images/pozo.gif",
					
					position:{lat:24.26694, lng: -98.836276},
					map: map,
					title: 'Tamaulipas'
					
				});
		    google.maps.event.addListener(mkr, 'mouseover', onMarkerMouseOver);
		
			
			
  }
  
  var robot;
  var totalr=0;
  var totalDis=0;

  function handleDirectionsResponse(start, end, directionsResult){
	directionsDisplay.setDirections(directionsResult);
	var routes = directionsResult.routes;
	for(var i=0; i<routes.length; i++){
		var totalDistance = 0;
		var legs = routes[i].legs;
		for(j=0; j<legs.length; j++){
			totalDistance += legs[j].distance.value;
		}
		document.getElementById("distance").innerHTML=Math.round(totalDistance/1000);
		var month = ((totalDistance/1000) /730)/0.1;

	
		
		
		if ((totalDistance/1000) <=403.2 ){
			robot = 1;
			
			
		}if ((totalDistance/1000) >403.2 && (totalDistance/1000)<=806.4){
			robot = 2; 
			
			
		}if ((totalDistance/1000) >806.4 && (totalDistance/1000)<=1209.6){
			robot = 3;
			
		}if ((totalDistance/1000) >1209.6 && (totalDistance/1000)<=1612.8){
			robot = 4;
			
		}if ((totalDistance/1000) >1612.8 && (totalDistance/1000)<=2016){
			robot = 5;
			
		}
		totalr=totalr+robot;
		totalDis=totalDis+((totalDistance/1000));
		
		document.getElementById("totaldis").innerHTML= totalDis;
		document.getElementById("totalrt").innerHTML= totalr;
		document.getElementById("robot").innerHTML= robot;
		document.getElementById("distance").innerHTML=Math.round(totalDistance/1000);
		document.getElementById("meses").innerHTML= month.toFixed(2)/robot;
		
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
  
  
  