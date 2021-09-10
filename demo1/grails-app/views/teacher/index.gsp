
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Teacher Dashboard</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <asset:stylesheet src="teacher-index.css" />
</head>

<body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<nav class="container">
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#streamSubjects">Stream Subjects</a></li>
        <li><a data-toggle="tab" href="#students">Students</a></li>
    </ul>

    <div class="tab-content">
        <div id="streamSubjects" class="tab-pane fade in active">
                <g:render template="listStreamSubjects" model="['username':username,'stream':stream, 'subjects':subjects]"/>
    </div>
        <div id="students" class="tab-pane fade">
                <g:render template="listStudents" model="['username':username, 'students':students]"/>
            </div>
    </div>
</nav>

</body>
</html>