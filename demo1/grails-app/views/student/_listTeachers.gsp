<br>
<p><b>Username:</b> ${username}</p>
<br>
<br>
<table>
    <thead>
    <tr class="header-row">
        <th>Teachers</th>
    </tr>
    </thead>
    <tbody>
    <g:each status="i" var="teacher" in="${teachers}" >
        <tr class="${ (i % 2) == 0 ? 'odd-row' : 'even-row' }">
            <td>${teacher}</td>
        </tr>
    </g:each>
    </tbody>
</table>