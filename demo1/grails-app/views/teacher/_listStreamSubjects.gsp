<br>

<p><b>Username:</b> ${username}</p>
<br>
<br>
<table>
    <thead>
    <tr class="header-row">
        <th>Subject</th>
        <th>Stream</th>
    </tr>
    </thead>
    <tbody>
    <g:each status="i" var="subject" in="${subjects}">
        <tr class="${(i % 2) == 0 ? 'odd-row' : 'even-row'}">
            <td>${subject.name}</td>
            <td>${subject.stream.name}</td>
        </tr>
    </g:each>
    </tbody>
</table>