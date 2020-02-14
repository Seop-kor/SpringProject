<%--
  Created by IntelliJ IDEA.
  User: Seop
  Date: 2020-02-11
  Time: 오후 5:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Project</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
<%@include file="menubar.jsp"%>
<%-- <jsp:include page="menubar.jsp"></jsp:include> --%>
<link rel="stylesheet" href="https://unpkg.com/swiper/css/swiper.css">
<link rel="stylesheet" href="https://unpkg.com/swiper/css/swiper.min.css">
<link rel="stylesheet" href="/resource/css/swi.css">
<div class="swiper-container myswiper">
  <div class="swiper-wrapper" align="center">
    <div class="swiper-slide"><img src="/resource/img/left1.jpg"></div>
    <div class="swiper-slide"><img src="/resource/img/right1.jpg"></div>
    <div class="swiper-slide"><img src="/resource/img/left2.jpg"></div>
    <div class="swiper-slide"><img src="/resource/img/right2.jpg"></div>
    <div class="swiper-slide"><img src="/resource/img/left3.jpg"></div>
    <div class="swiper-slide"><img src="/resource/img/right3.jpg"></div>
  </div>
  <div class="swiper-pagination"></div>
</div>
<script src="https://unpkg.com/swiper/js/swiper.js"></script>
<script src="https://unpkg.com/swiper/js/swiper.min.js"></script>
<script>
  new Swiper('.myswiper',{
    effect: 'coverflow',
    autoHeight : true,
    loop: true,
    pagination : { // 페이징 설정
      el : '.swiper-pagination',
      clickable : true, // 페이징을 클릭하면 해당 영역으로 이동, 필요시 지정해 줘야 기능 작동
    },
  });
</script>
</body>
</html>
