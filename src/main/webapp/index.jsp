<html>
<body>
<h2>This is index.jsp!</h2>

<a href="test/hello">REST Endpoint</a>
<br>
<!-- Link with forward-slash -->
${pageContext.request.contextPath}
<br>
<a href="${pageContext.request.contextPath}/test/hello">REST Endpoint</a>

<br>

<h3>Endpoint</h3>
<a href="${pageContext.request.contextPath}/api/students">Students - Collection Operation</a>

</body>
</html>
