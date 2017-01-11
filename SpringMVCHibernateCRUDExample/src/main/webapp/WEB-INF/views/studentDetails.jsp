<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>           
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 50%;
}
th {
  background: SteelBlue;
  color: white;
}
 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
                padding: 5px 10px;
            }
</style>
</head>
<body>
<form:form method="post" modelAttribute="student" action="/SpringMVCHibernateCRUDExample/addStudent">
<table>
		<tr>
			<th colspan="2">Add Student</th>
		</tr>
		<tr>
		<form:hidden path="id" />
          <td><form:label path="studentName">Student Name:</form:label></td>
          <td><form:input path="studentName" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
		  <td><form:label path="fatherName">Father Name:</form:label></td>
          <td><form:input path="fatherName" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="dob">D.O.B:</form:label></td>
          <td><form:input path="dob" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="medium">Medium:</form:label></td>
          <td><form:input path="medium" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="classObtained">Class Obtained:</form:label></td>
          <td><form:input path="classObtained" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="classSection">Class Section:</form:label></td>
          <td><form:input path="classSection" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="primaryContactNo">Primary Contact No:</form:label></td>
          <td><form:input path="primaryContactNo" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="secondContactNo">Secondary Contact No:</form:label></td>
          <td><form:input path="secondContactNo" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="email">Email ID:</form:label></td>
          <td><form:input path="email" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="address1">Address:</form:label></td>
          <td><form:input path="address1" size="30" maxlength="100"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="pin">Pin Code:</form:label></td>
          <td><form:input path="pin" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="guardianName">Guardian Name:</form:label></td>
          <td><form:input path="guardianName" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="guardianRelation">Guardian Relation :</form:label></td>
          <td><form:input path="guardianRelation" size="30" maxlength="100"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="preSchoolName">Previous School Name:</form:label></td>
          <td><form:input path="preSchoolName" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="passMonYr">Passing Month & Year:</form:label></td>
          <td><form:input path="passMonYr" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="passingClass">Passing Class:</form:label></td>
          <td><form:input path="passingClass" size="30" maxlength="100"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="passingClassPercent">Passing Class % :</form:label></td>
          <td><form:input path="passingClassPercent" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="gender">Gender :</form:label></td>
          <td><form:input path="gender" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="caste">Caste :</form:label></td>
          <td><form:input path="caste" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="religion">Religion :</form:label></td>
          <td><form:input path="religion" size="30" maxlength="100"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="nationality">Nationality :</form:label></td>
          <td><form:input path="nationality" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="address2">Local Address :</form:label></td>
          <td><form:input path="address2" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="casteCat">Caste Category :</form:label></td>
          <td><form:input path="casteCat" size="30" maxlength="30"></form:input></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Student List</h3>
<c:if test="${!empty listOfStudents}">
	<table class="tg">
	<tr>
		<th width="80">ApplicationId</th>
		<th width="120">Student Name</th>
		<th width="120">Father's Name</th>
		<th width="120">Medium</th>
		<th width="120">Class Obtained:</th>
		<th width="120">Primary Contact No:</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfStudents}" var="student">
		<tr>
			<td>${student.id}</td>
			<td>${student.studentName}</td>
			<td>${student.fatherName}</td>
			<td>${student.medium}</td>
			<td>${student.classObtained}</td>
			<td>${student.primaryContactNo}</td>
			<td><a href="<c:url value='/updateStudent/${student.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteStudent/${student.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
