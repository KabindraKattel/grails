<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Admin</title>
    <asset:stylesheet src="student-teacher-index.css"/>
    <asset:stylesheet src="paginate.css"/>
</head>

<body>
<g:paginate next="Forward" prev="Back"
            maxsteps="0" controller="admin"
            action="index" total="${teachersCount}"/>
<table>
    <thead>
    <tr class="header-row">
        <th>Teacher Name</th>
        <th>Experience Years</th>
    </tr>
    </thead>
    <tbody>
    <g:each status="i" var="teacher" in="${teachers}">
        <tr class="${(i % 2) == 0 ? 'odd-row' : 'even-row'}">
            <td>${teacher.name}</td>
            <td>${teacher.xpYears}</td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>