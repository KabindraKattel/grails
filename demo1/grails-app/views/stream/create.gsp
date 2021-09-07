<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>"Create"</title>
</head>

<body>
    <g:form controller="Stream" action="create">
        <label for="name"> Stream Name</label>
        <g:textField name="name"/><br/>
        <g:actionSubmit value="Create"/>
    </g:form>
</body>
</html>