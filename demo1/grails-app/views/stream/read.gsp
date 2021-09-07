<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Read</title>
</head>

<body>
    <table>
        <thead>
            <tr>
                <th>Stream Name</th>
            </tr>
        </thead>
        <tbody>
            <g:each in="${streamRecords}" var="streamRecord" status="index">
                <tr id="streamRecord-${index}">
                    <td>${streamRecord.name}</td>
                </tr>
            </g:each>
        </tbody>
    </table>
</body>
</html>