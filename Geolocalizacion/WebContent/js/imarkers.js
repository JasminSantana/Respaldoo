/**
 * Icon in markers
 */

google.maps.event.addDomListener(window, 'load',
		function(){
			var map = new google.maps.Map(document.getElementById('div_map'),{
				zoom: 6,
				center: new google.maps.LatLng(19.430,-99.100),
				mapTypeId: google.maps.MapTypeId.SATELLITE
				
		});
			var info1 = new google.maps.InfoWindow;
			var clickMarker1 = function(){
				var marker = this;
				var latLng = marker.getPosition();
				info1.setContent('<h3>Dolores Hidalgo</h3><img src="images/dolores.jpg"/>');
				info1.open(map, marker);
			};
			google.maps.event.addListener(map, 'mouseout', function(){
				info1.close();
			});
			var iconMarker = new google.maps.MarkerImage(
					"images/Oil-Barrel-icon.png");
			var marker1= new google.maps.Marker({
				map:map,
				position: new google.maps.LatLng(21.1561, -100.9308),
				icon: iconMarker
			});
			google.maps.event.addListener(marker1, 'click',clickMarker1);
	});