/**
 * Script para la inclusion de mapas de google
 * y su manejo.
 */
function initialize() {
	//Colocar la longitud y latitud iniciales.
	//Nos ubicaremos en lat long para la Ciudad de México: (19.4300, -99.1000)
	var latlng = 
		new google.maps.LatLng(24.0, -102.6);
	var myOptions = {
			//Colocar factor de zoom.
			zoom: 5,
			center: latlng,
			mapTypeId: google.maps.MapTypeId.ROADMAP
	};
	
	map1 = new google.maps.Map(
			document.getElementById("map"),
			myOptions);
	
}

function addMapMarker(){
	initialize();

	var info1 = new google.maps.InfoWindow;
	var onMarkerMouseOver = function(){
		var latLng = new google.maps.LatLng(21.1561, -100.9308)
		info1.setContent("<h3>Dolores Hidalgo</h3>" +
				"latitude:"+latLng.lat()
				+", longitude: "+latLng.lng()
				+"<br /><br />" +
				"<a href='https://es.wikipedia.org/" +
				"wiki/Dolores_Hidalgo'>Link of site</a>");
		info1.open(map1, this);
	};

	var marker1 = new google.maps.Marker({
		map: map1,
		position: new google.maps.LatLng(21.1561, -100.9308)
	});
	
	google.maps.event.addListener(marker1, 
			'mouseover', onMarkerMouseOver());
	
}

