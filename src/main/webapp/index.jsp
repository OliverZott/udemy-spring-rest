<html>
<body>
<h1>This is index.jsp!</h1>


<!-- Link without forward-slash -->
<a href="test/hello">REST Endpoint</a>

<br>
<br>
<hr>
<h3>API-Endpoints</h3>

<!-- Link with forward-slash -->
<div>
    <b>Students - Collection Operation: </b>

    <p>
    <div>
        <a href="${pageContext.request.contextPath}/api/students">${pageContext.request.contextPath}/api/students</a>
    </div>
    </p>


</div>

</body>
</html>
