<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 29.12.17
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Part 2.2</title>
</head>
<body>
    <form action="part2" method="post">
        <table>
            <%Map list = (Map) session.getAttribute("list");
            ArrayList nameList = (ArrayList) session.getAttribute("namelist");

                for (Map.Entry<String, Integer> e : list.entrySet()) {
            %>
            <td><%=toy%>,</td>
            <%}%>

        </table>
    </form>
</body>
</html>
