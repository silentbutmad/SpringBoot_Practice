<%@ page language="java" contentType="text/html; charset=UTF-8"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!doctype html>
<html>
    <head></head>
    <body>
        <form:form action="save" modelAttribute="student" method="POST" style="width:400px" >
            <fieldset>
                <legend > Student Enquriy Form</legend>
                <p><font color="green">${msg}</font></p>
                Name : <form:input path="name" /><br><br>
                Email : <form:input path="email" /><br><br>
                Gender : <form:radiobutton path="gender" value="M" />Male
                <form:radiobutton path="gender" value="F" />Fe-Male <br><br>
                Courses : <form:select items="${courses}" path="course" /> <br><br>
                Timings : <form:checkboxes items="${timings}" path="timings" /><br><br>
                <input type="submit" value="Save"/>

            </fieldset>
        </form:form>
    </body>
</html>


