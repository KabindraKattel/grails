<br>
<p><b>Username:</b> ${username}</p>
<br>
<p><b>Stream:</b> ${stream}</p>
<br>
<table>
    <thead>
        <tr class="header-row">
            <th>Subjects</th>
        </tr>
    </thead>
    <tbody>
        <g:each status="i" var="subject" in="${subjects}" >
            <tr class="${ (i % 2) == 0 ? 'odd-row' : 'even-row' }">
                <td>${subject}</td>
            </tr>
        </g:each>
    </tbody>
</table>