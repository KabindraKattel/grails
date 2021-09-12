<br>

<p><b>Username:</b> ${username}</p>
<br>
<br>
<table>
    <thead>
    <tr class="header-row">
        <th>Name</th>
        <th>DOB</th>
        <th>P. Address</th>
        <th>S. Address</th>
        <th>Stream</th>
    </tr>
    </thead>
    <tbody>
    <g:each status="i" var="student" in="${students}">
        <tr class="${(i % 2) == 0 ? 'odd-row' : 'even-row'}">
            <td>${student.name}</td>
            <td>${student.dob}</td>
            <td>${student.address.primary}</td>
            <td>${student.address.secondary}</td>
            <td>${student.stream.name}</td>
        </tr>
    </g:each>
    </tbody>
</table>