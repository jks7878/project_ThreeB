<%@page import="net.sf.json.JSON"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%
	request.setCharacterEncoding("UTF-8");
%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>숙소</title>
</head>
<body>	
<div>
<div id="map" style="width:600px;height:900px;">
<!-- services와 clusterer, drawing 라이브러리 불러오기 -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=	2195bda5cc0442e30e93d9b9b8e78985&libraries=services,clusterer,drawing"></script>
<script>		
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = {
        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표  
        level: 10 // 지도의 확대 레벨
    };  
													
	// 지도를 생성합니다    
	var map = new kakao.maps.Map(mapContainer, mapOption); 

	// 주소-좌표 변환 객체를 생성합니다
	var geocoder = new kakao.maps.services.Geocoder(); 
	var callback = function(result, status){
		if (status === kakao.maps.services.Status.OK) {		
			var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
		}
	}
		
	// 주소로 좌표를 검색합니다
	geocoder.addressSearch("${location}", function(result, status) {
	    // 정상적으로 검색이 완료됐으면 
	    if (status === kakao.maps.services.Status.OK) {					
	        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);		       	
	     	// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
	       	map.setCenter(coords);
	    }
	});
	
	var houseList = new Array();
	<c:forEach var="i" items="${houseList}">
		var obj = new Object();
		obj.title = "${i.houseTitle}";
		obj.type = "${i.houseType}";
		obj.person = "${i.housePerson}";
		obj.location = "${i.location}";
		obj.charge = "${i.houseCharge}";
		houseList.push(obj);
	</c:forEach>

	var i = 0;	
	houseList.forEach(function(addr, i) {
		geocoder.addressSearch(houseList[i].location, function(result, status) {	
			var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
		    if (status === kakao.maps.services.Status.OK) {
		    	console.log(result);
		 		var marker = new kakao.maps.Marker({
					map:map, 
					position:coords
				}); 
		 		
		 		// 인포윈도우로 장소에 대한 설명을 표시합니다
			    var infowindow = new kakao.maps.InfoWindow({
			    	position:coords,
			        content:'<div style="width:150px;text-align:center;padding:5px 0;">' + houseList[i].charge + '</div>'		        
			    });
		 		
			    kakao.maps.event.addListener(marker, 'click', function() {
			    	marker.setZIndex(5); 
			    	infowindow.setZIndex(5);
			  	});
			    infowindow.open(map, marker);
	    	}		    	    				    
			i++;
		});	
	});
</script>	
</div>
</div>
</body>
</html>