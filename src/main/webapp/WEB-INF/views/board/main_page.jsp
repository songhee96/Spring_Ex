<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<jsp:include page="../commons/global_nav.jsp"></jsp:include>
</head>
<body>

<c:choose><!-- 로그인 확인 여부 -->
	<c:when test="${!empty sessionUser}">
	${sessionUser.member_nick }님 반갑습니다.<br>
	<a href="${pageContext.request.contextPath}/member/logout_process.do">로그아웃</a>		
	</c:when>
	
	<c:otherwise>
		비회원 접근...<a href="${pageContext.request.contextPath}/member/login_process.do">로그인</a>	
	</c:otherwise>
</c:choose>


	<c:if test="${!empty sessionUser}"><!-- 로그인 했을때 글쓰기 보이게 하는거 -->
	<a href="${pageContext.request.contextPath}/member/write_content_page.do">글쓰기</a>	
	</c:if>
	
	<br>
	
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
	<c:forEach items="${datalist}" var="xxx">
		<tr>
			<td>${xxx.boardVo.board_no }</td>
			<td>${xxx.boardVo.board_title }</td>
			<td>${xxx.memberVo.member_nick}</td>
			<td>${xxx.boardVo.board_writedate}</td>
			<td>${xxx.boardVo.board_readcount}</td>				
		</tr>	
	</c:forEach>
	
	
	
	
	 
	</table>








<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


</body>
</html>