<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<title>main</title>
</head>
<body>
<script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=	2195bda5cc0442e30e93d9b9b8e78985&libraries=services"></script>
<script type="text/javascript">	
	function checkAddress(){				
		var addr = document.getElementById("address").value;
		var start = document.getElementById("start").value;
		var end = document.getElementById("end").value; 
		var person = parseInt(document.getElementById("adult").value) + parseInt(document.getElementById("children").value);

		var geocoder = new kakao.maps.services.Geocoder();

		geocoder.addressSearch(addr, function(result, status) {
 		    if(status === kakao.maps.services.Status.ZERO_RESULT) {
				alert("잘못된 주소입니다");
		    }else if(status === kakao.maps.services.Status.OK) {
		    	location.href=
		    		"${cotextPath}/threeb/house/search.do?address=" + addr
 		    		+ "&start=" + start
		    		+ "&end=" + end
		    		+ "&person=" + person; 
		    }else if(status === kakao.maps.services.Status.ERROR) {
		    	alert("error");
		    } 
		});    	
	}
</script>
	<div class="main">
	<table border="1">
		<tr>
			<td>
				주소 
			</td>
			<td>
				<input type="text" name="address" id="address" value="경기도">
			</td>
		<tr>
			<td>
				출발  
			</td>
			<td>
				<input type="date" name="trip-start" id="start" min="2020-10-29" max="2100-12-31" value="2020-11-03">
			</td>
		</tr>
		<tr>
			<td>
				도착
			</td>
			<td>
				<input type="date" name="trip-end" id="end" min="2020-10-29" max="2100-12-31" value="2020-11-03">
			</td>
		</tr>
		<tr>
			<td>
				성인
			</td>
			<td>
				<input type="text" name="adult" id="adult" value="0">
			</td>
		</tr>
		<tr>
			<td>
				어린이
			</td>
			<td>
				<input type="text" name="children" id="children" value="0">
			</td>
		</tr>
		<tr>
			<td colspan="3" align="center">
				<input type="submit" value="검색" onClick="checkAddress()">
			</td>
		</tr>
	</table>
	</div>
</body>
</html>