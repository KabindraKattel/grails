<br>
<p><b>Username:</b> ${username}</p>
<br>
<br>
<table>
    <thead>
    <tr class="header-row">
        <th>Students</th>
    </tr>
    </thead>
    <tbody>
    <g:each status="i" var="student" in="${students}" >
        <tr class="${ (i % 2) == 0 ? 'odd-row' : 'even-row' }">
            <td>${student}</td>
        </tr>
    </g:each>
    </tbody>
</table>