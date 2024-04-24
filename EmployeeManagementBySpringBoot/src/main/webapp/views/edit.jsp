<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<center>
<h1>Edit Employee Form</h1>
<br></br>
<form:form action="editemp" method="GET">
<table>
        <tr>
            <td>Employee Id</td>
            <td><form:input path="empId"/></td>
        </tr>
        <tr>
            <td>Employee Name</td>
            <td><form:input path="empName"/> </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><form:input path="password"/> </td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email"/> </td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><form:input path="gender"/> </td>
        </tr>
        <tr>
            <td>Mobile Number</td>
            <td><form:input path="mno"/> </td>
        </tr>
        <tr>
            <td>Designation</td>
            <td><form:input path="desg"/> </td>
        </tr>
        <tr>
            <td>Salary</td>
            <td><form:input path="sal"/> </td>
        </tr>
        <tr>
            <td>Address</td>
            <td><form:input path="addr"/> </td>
        </tr>
        <tr>
            <td>State</td>
            <td><form:input path="state"/> </td>
        </tr>
        <tr>
            <td>Country</td>
            <td>><form:input path="country"/> </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Edit&Save"> </td>
        </tr>
     </table>
</form:form>
<br></br>
<button><a href="/addemp">Add User</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</button>
<button><a href="viewallemps">View Users</a>
</button>
</center>