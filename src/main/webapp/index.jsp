<html>
<body>
<h2>This is index.jsp!</h2>

<a href="test/hello">REST Endpoint</a>
<br>
<!-- Link with forward-slash -->
<a href="${pageContext.request.contextPath}/test/hello">REST Endpoint</a>
<br>
${pageContext.request.contextPath}

</body>
</html>
