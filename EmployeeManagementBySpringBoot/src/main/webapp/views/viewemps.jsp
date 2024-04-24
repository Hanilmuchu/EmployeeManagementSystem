<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<center>
<h1>Employees List</h1>
<table border="1"
		cellpadding="5">
        <tr>
            <th>Employee Id</th>
            <th>Employee Name</th>
            <th>Password</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Mobile Number</th>
            <th>Designation</th>
            <th>Salary</th>
            <th>Address</th>
            <th>State</th>
            <th>Country</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <tr>
        <c:forEach var="emp" items="${emp}">
         <tr>
            <td>${emp.empId}</td>
            <td>${emp.empName}</td>
            <td>${emp.password}</td>
            <td>${emp.email}</td>
            <td>${emp.gender}</td>
            <td>${emp.mno}</td>
            <td>${emp.desg}</td>
            <td>${emp.sal}</td>
            <td>${emp.addr}</td>
            <td>${emp.state}</td>
            <td>${emp.country}</td>
            <td><button><a href="/edit/${emp.empId}">Edit</a></button></td>
            <td><button><a href="/delete/${emp.empId}">Delete</a></button> </td>
        </tr>
        </c:forEach>
        </tr>
     </table>
     <br></br> <br></br>
     <button><a href="/">Home</a></button>
</center>