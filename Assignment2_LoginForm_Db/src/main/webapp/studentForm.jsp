<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="stdLogin.jpg">
	<h1 style='text-align:center;color:blue'>Registration Form</h1>

	<div align="center">
		<form method="post" action="./filter/std">
			<table>
				<tr style="color:blue">

					<td><label for="firstname">FirstName</label></td>

					<td><input type="text" name="firstname"></td>

				</tr>

				<tr style="color:blue">

					<td><label for="lastname">LastName</label></td>

					<td><input type="text" name="lastname"></td>



				</tr>

				<tr style="color:blue">
					<td><label for="email">Email</label></td>

					<td><input type="email" name="email"></td>
				</tr>
				<tr style="color:blue">

					<td><label for="mobile">PhoneNumber</label></td>

					<td><input type="text" name="mobile"></td>



				</tr>
				<tr style="color:blue">

					<td><label for="gender">Gender</label></td>
					<td><input type="radio" name="gender" value="Male">Male
						<input type="radio" name="gender" value="Female">Female</td>
				</tr>
				<tr style="color:blue">

					<td><label for="skill">Skills</label></td>

					<td><input type="checkbox" name="skill1" value="java">JAVA
						<input type="checkbox" name="skill2" value="c++">C++ <input
						type="checkbox" name="skill3" value="c">C <input
						type="checkbox" name="skill4" value="python">PYTHON</td>
				</tr>
				<tr style="color:blue">

					<td><label for="qual">Qualification</label></td>

					<td><select name="qual">

							<option>BTech</option>

							<option>BE</option>

							<option>MTech</option>

							<option>BCA</option>

							<option>MCA</option>

					</select></td>



				</tr>
				<tr style="color:blue">

					<td><label for="add">Address</label></td>

					<td><textarea rows="7" cols="30" name="area"></textarea></td>



				</tr>
				<tr align="center" style="color:blue">

					<td colspan="2"><input type="submit" value="Submit"
						style="background-color: pink"></td>

				</tr>

			</table>


		</form>
	</div>
</body>
</html>