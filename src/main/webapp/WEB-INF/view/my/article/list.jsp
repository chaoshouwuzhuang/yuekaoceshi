<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript">

function myopen(id){
	alert(id)
	window.open("/article/getDetail?aId="+id,"_blank");
	
}

</script>
</head>
<body>

	<c:forEach items="${myarticles.list}" var="article">
		<dl>
			<dt><a href="javascript:myopen(${article.id })">${article.title }</a></dt>
			<dd>作者:${sessionScope.USER_SESSION_KEY.username} 发布时间:${article.created}
				频道:${article.chnName}  分类:${article.catName}
			</dd>
		</dl>
		<hr>
	</c:forEach>


</body>
</html>