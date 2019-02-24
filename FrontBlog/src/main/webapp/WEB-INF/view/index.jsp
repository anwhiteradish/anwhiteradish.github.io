<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
</head>
<body>
<button id="btn123" value="123">123</button>
<script type="text/javascript">
$("#btn123").click(function(){
	
	 /*document.formName.action="${pageContext.request.contextPath }/comment?id=${blog.id}";
	   document.formName.submit(); */
	 $.post(
			"${pageContext.request.contextPath }/comment?id=${blog.id}",
			{"blog_id":1,"userName":"123","content":"123"},
			function(data){
				if(data=="评论成功"){
					alert(data)
					window.location.reload();
					$("#comment").html(data);
				}
			},"json") 
})
</script>
</body>
</html>