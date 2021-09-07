<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Stream</title>
</head>

<body>
<script>
    function processDbOps(){
        select = document.getElementById("db_ops");
        option = select.options[select.selectedIndex].value;
        console.log(option)
        if (option === "create")
            window.open("${createLink(action: 'create', controller: 'Stream')}",'_blank');
        else if (option === "read")
            window.open("${createLink(action: 'read', controller: 'Stream')}",'_blank');
        else if (option === "update")
            window.open("${createLink(action: 'pre_update', controller: 'Stream')}",'_blank');
        else if (option === "delete")
            window.open("${createLink(action: 'pre_delete', controller: 'Stream')}",'_blank');
    }
</script>
<label for="db_ops"> <custom:emoticon happy="true">Choose a database Operation:</custom:emoticon></label>
<select name="db_ops" id="db_ops" onchange="processDbOps()">
    <option disabled selected value>--select option--</option>
    <option value="create">Create</option>
    <option value="read">Read</option>
    <option value="update">Update</option>
    <option value="delete">Delete</option>
</select>
<custom:note message="Click an option and corresponding action page will be opened in new tab"/>
</body>
</html>