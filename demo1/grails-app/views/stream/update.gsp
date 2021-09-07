<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Update</title>
</head>

<body>
    <g:form controller="Stream" action="update">
        <g:hiddenField name="id" value="${id}"/>
        <label for="name"> Stream Name</label>
        <g:textField name="name" value="${streamRecord.name}"/><br/>
        <g:actionSubmit value="Update"/>
    </g:form>
</body>
</html>