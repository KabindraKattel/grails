<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Update</title>
</head>

<body>
    <h3>Click a row to update contents inside.</h3>
    <table>
        <thead>
        <tr>
            <th>Stream Name</th>
        </tr>
        </thead>
       <tbody>
            <g:each in="${streamRecords}" var="streamRecord" status="index">
                <input type="hidden" value="${streamRecord.id}">
                <tr id="streamRecord-${index}" onclick="proceedUpdate(this)">
                    <td >${streamRecord.name}</td>
                </tr>
            </g:each>
       </tbody>
    </table>
    <script>
        function proceedUpdate(element) {
            const row_index = element.rowIndex-1;
            const token = document.getElementsByTagName("input");
            const id = token[row_index].value;
            window.location = "${createLink(action: 'update', controller: 'Stream')}"+"?id="+id;
        }
    </script>
</body>
</html>