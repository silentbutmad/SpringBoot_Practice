<%@ page language="java" contentType="text/html; charset=UTF-8"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!doctype>
<html>
    <head></head>
    <body>
        <form:form action="save" modelAttribute="student" method="POST" >
            <fieldset legend="Student Enquriy Form" aline="center">
                Name : <form:input path=name >
                Email : <form:input path="Email">
                Gender : <form:radiobutton path="gender"></form:radiobutton>
                course : <form:dropdown path="course"></form:dropdown>
                timings : <form:checkbox></form:checkbox>
                <form:button></form:button>
            </fieldset>
        </form:form>
    </body>
</html>


