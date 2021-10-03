<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Marks</title>
    <asset:stylesheet src="student-teacher-index.css"/>
    <asset:stylesheet src="paginate.css"/>
</head>

<body>
<table>
    <thead>
    <tr class="header-row">
        <th>Teacher Name</th>
        <th>Experience Years</th>
    </tr>
    </thead>
    <tbody>
    <g:each status="i" var="subject" in="${subjects}">
        <tr class="${(i % 2) == 0 ? 'odd-row' : 'even-row'}">
            <td>${subject.name}</td>
            <td>${subject.obtainedMark.obtainedMarks}</td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>