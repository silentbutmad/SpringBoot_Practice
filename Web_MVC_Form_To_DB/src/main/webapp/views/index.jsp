<%@ page language="java" contentType="text/html; charset=UTF-8"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!doctype html>
<html>
    <head>

    </head>
    <body>
        <form:form action="save" modelAttribute="student" method="Post">
            <fieldset style="width:350px">
                <legend> Student Enquriy Form</legend>
                <p><font color="green">${msg}</font></p>
                <table>
                    <tr>
                        <th>Name : </th>
                        <td>
                            <form:input path="name"/>
                        </td>
                    </tr>
                    <tr>
                        <th>Email : </th>
                        <td>
                            <form:input path="email"/>
                        <td>
                    </tr>
                    <tr>
                        <th>Gender : </th>
                        <td>
                            <form:radiobutton path="gender" value="M"/>Male
                            <form:radiobutton path="gender" value="F"/>Fe-Male
                        </td>
                    </tr>
                    <tr>
                        <th>Courses : </th>
                        <td>
                            <form:select path="course" items="${courses}"/>
                        </td>
                    </tr>
                    <tr>
                        <th>Timings</th>
                        <td>
                            <form:checkboxes path="timings" items="${timings}"/>
                        </td>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type="submit" value="Save"/>
                        </th>
                    </tr>
                </table>
            </filedset>
        </form:form>
    </body>

</html>