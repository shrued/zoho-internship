<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" name="viewport" content="width=device-width, initial-scale=1" charset=UTF-8" >
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>Alumni Details</title>
        <style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}
</style>
    </head>
    <body style="background-color: #e1eebf;">
    <div class="w3-top">
  <div class="w3-bar w3-white w3-wide w3-padding w3-card">
    <a href="#home" class="w3-bar-item w3-button"></a>
</div>
    <center>
    </br>
    </br>
    </br>
    </br>
    </br>
        <form method="post" action="regdeets.jsp">
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead bgcolor="#808080";>
                    <tr>
                        <th colspan="2">Enter details here</th>
                    </tr>
                </thead>
                <tbody bgcolor="#faebd7";>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name" value="" /></td>
                    </tr>
		    <tr>
                        <td>Gender</td>
                        <td><input type="text" name="gender" value="" /></td>
                    </tr>
		    <tr>
                        <td>Degree</td>
                        <td><label for="degree"></label>
						<select name="degree">
						  <option value="bach">Bachelors</option>
						  <option value="masters">Masters</option>
						</select>
						</td>
                    </tr>
		    <tr>
                        <td>Branch</td>
                        <td><label for="branch"></label>
						<select name="branch">
						  <option value="cse">CSE</option>
						  <option value="it">IT</option>
						  <option value="ece">ECE</option>
						  <option value="eee">EEE</option>
						  <option value="bt">Biotech</option>
						  <option value="mech">Mechanical</option>
						  <option value="civil">Civil</option>
						</select></td>
                    </tr>
                    
                    <tr>
                        <td>Year of Graduation</td>
                        <td><input type="year" name="gradyear" value="" /></td>
                    </tr>
		    <tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>