
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Dashboard</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
%{--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">--}%
    <asset:stylesheet src="student-index.css" />
</head>

<body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
%{--    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>--}%
%{--    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>--}%
%{--    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>--}%
%{--    <asset:javascript src="student-index.js"/>--}%
%{--    <nav class="navbar navbar-expand-lg navbar-light bg-light">--}%
%{--        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">--}%
%{--            <span class="navbar-toggler-icon"></span>--}%
%{--        </button>--}%
%{--        <div class="collapse navbar-collapse" id="navbarSupportedContent">--}%
%{--            <ul class="navbar-nav mr-auto">--}%
%{--               <li class="nav-item active">--}%
%{--                   <a data-toggle="tab" class="nav-link" href="#streamSubjects">--}%
%{--                   Stream Subjects <span class="sr-only">(current)</span>--}%
%{--                    </a>--}%
%{--                </li>--}%
%{--                <li class="nav-item">--}%
%{--                    <a data-toggle="tab" class="nav-link" href="#teachers">Teachers</a>--}%
%{--                </li>--}%
%{--            </ul>--}%
%{--        </div>--}%
%{--    </nav>--}%

%{--    <div class="tab-content">--}%
%{--    <div id="streamSubjects" class="tab-pane fade in active">--}%
%{--        <g:render template="listStreamSubjects" model="['stream':stream, 'subjects':subjects]"/>--}%
%{--    </div>--}%
%{--    <div id="teachers" class="tab-pane fade">--}%
%{--        <g:render template="listTeachers" model="['username':username]"/>--}%
%{--    </div>--}%
%{--</div>--}%

%{--    <div id="streamSubjects" ><g:render template="listStreamSubjects" model="['stream':stream, 'subjects':subjects]"/></div>--}%
%{--    <div id="teachers" ><g:render template="listTeachers" model="['username':username]"/></div>--}%
<nav class="container">
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#streamSubjects">Stream Subjects</a></li>
        <li><a data-toggle="tab" href="#teachers">Teachers</a></li>
    </ul>

    <div class="tab-content">
        <div id="streamSubjects" class="tab-pane fade in active">
                <g:render template="listStreamSubjects" model="['stream':stream, 'subjects':subjects]"/>
    </div>
        <div id="teachers" class="tab-pane fade">
                <g:render template="listTeachers" model="['username':username]"/>
            </div>
    </div>
</nav>

</body>
</html>