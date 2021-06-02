<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
	<title>Alumni- St.joseph's</title>
	<link rel="stylesheet" href="style.css" type="text/css">

	<script>

    function ok()
    {
        var name = document.getElementById("name").value;
        var phone_number = document.getElementById("phone_number").value;
        var email = document.getElementById("email_address").value;
        var Rollno = document.getElementById("Rollno").value;
        var year = document.getElementById("Yearofpass").value;
        var University = document.getElementById("University").value;
        var stream = document.getElementById("Stream").value;
        var department = document.getElementById("department").value;
        var node = document.getElementById("counter").innerHTML;
        var counter = parseInt(node);
        if(document.getElementById("compname1") && document.getElementById("designation1"))
        {
        	var compname1 = document.getElementById("compname1").value;
        	var designation1 = document.getElementById("designation1").value;
        }
        if(document.getElementById("compname2") && document.getElementById("designation2"))
        {
        	var compname2 = document.getElementById("compname2").value;
        	var designation2 = document.getElementById("designation2").value;
        }
        document.writeln(name+"</br>"+phone_number+"</br>"+email+"</br>"+Rollno+"</br>"+year+"</br>"+University+"</br>"+stream+"</br>"+department);
        if(compname1!=null && designation1 !=null)
        {
            document.writeln(compname1+"</br>"+designation1);
        }
        if(compname2!=null && designation2 !=null)
        {
            document.writeln(compname2+"</br>"+designation2);
        }

    }

      function myFunction() {
  var table = document.getElementById("myTable");
  var length = table.rows.length;
  var row = table.insertRow(length);
  var counter;
  if(length==0)
  {
    counter =1
  }
  else
  {
    counter = (length/3)+1;
  }
    row.innerHTML ="<span style='font-size:14px'><strong>Company"+counter+"</strong></span>" ;
  var length = table.rows.length;
  var row = table.insertRow(length);
  row.innerHTML = "<span style='font-size:13px'><strong>CompanyName:</strong></span>";
  var input = document.createElement("input");
input.setAttribute("type","text");
input.setAttribute("id","compname"+counter);
input.setAttribute("class","company");
input.setAttribute("name","compname"+counter);
  row.appendChild(input);
    var length = table.rows.length;
   var row = table.insertRow(length);
  row.innerHTML = "<span style='font-size:13px'><strong>Designation:</strong></span>";
  var input = document.createElement("input");
input.setAttribute("type","text");
input.setAttribute("name","designation"+counter);
input.id = "designation"+counter;
  row.appendChild(input);
  var set = document.getElementById("counter");
  set.innerHTML = counter;

}


var loadFile = function(event) {
var image = document.getElementById('output');
image.src = URL.createObjectURL(event.target.files[0]);
}; 
       

    </script>
</head>
<body>
	<div id="header">
		<div class="clearfix">
			<div class="logo">
				<a href="index.html"><img src="images/logosjce.jpeg" alt="LOGO" height="52" width="362"></a>
			</div>
			<ul class="navigation">
				<li>
					<a href="index.html">Home</a>
				</li>
				<li>
					<a href="about.html">About</a>
				</li>
				<li>
					<a href="practices.html">Events</a>
				</li>
				<li>
					<a href="lawyers.html">Elite Alumni</a>
				</li>
				<li>
					<a href="news.html">Office Bearers</a>
					<!--<div>
						<a href="singlepost.html">News Single Post</a>
					</div>-->
				</li>
				<li class="active">
					<a href="contact.html">Register</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="contents">
		<div class="clearfix">
			<div class="sidebar">
				<div>
					<h2>Contact Info</h2>
					<ul class="contact">
						<li>
							<p>
								<span class="home"></span> <em>St.Joseph's <br> College Of Engineering</em> Off Old Mamallapuram Road,<br>Kamaraj Nagar,Semmancheri,<br>Chennai-119.
							</p>
						</li>
						<li>
							<p class="phone">
								Phone: (044) 2450 1060
							</p>
						</li>
						<li>
							<p class="fax">
								Fax: (044) 2450 0861
							</p>
						</li>
						<li>
							<p class="mail">
								Email: jprstjosephs@stjosephs.ac.in
							</p>
						</li>
					</ul>
				</div>
			</div>
			<div class="main">
				<h1>Register</h1>
				<h2>Enter your Details</h2>
				<br>
				<form action="register1" method="post" class="message" enctype = "multipart/form-data">
<p>Name<br>
<input  style="width: 270px " type="text" name="name" required>
</p>
<p><input type="file"  accept="image/*" name="image" id="file"  onchange="loadFile(event)" style="display: none;"></p>
<p><label for="file" style="cursor: pointer;">Upload Image</label></p>
<p><img id="output" width="200" /></p>
<p>
	<label>
            Gender<br><select name="gender" style="width: 270px; padding: 6px 10px">
                <option value="" selected="selected">Select One</option>
                <option value="male" >Male</option>
                <option value="female">Female</option>
                <option value="others">Others</option>
            </select>
	</label>
</p>

<label>Rollno<br>
<input style="width: 270px" type="text" name="Rollno" >
</label>
<p>
<label>Department<br>
<select style="width: 270px; padding: 6px 10px" name="department" >
<option value="" selected="selected">Select One</option>
<option value="CSE" >CSE</option>
<option value="IT" >IT</option>
<option value="BIOTECH" >BIOTECHNOLOGY</option>
<option value="MECH" >MECHANICAL</option>
<option value="CIVIL" >CIVIL</option>
<option value="ECE" >ECE</option>
<option value="EEE" >EEE</option>
<option value="EIE" >EIE</option>
<option value="ICE" >ICE</option>
<option value="CHEM" >CHEM</option>
</select>
</label>
<p>
<label>YearOfPassing<br>
<select style="width: 270px; padding: 6px 10px" name="Yearofpass">
<option value="" selected="selected">Select One</option>
<option value="2017-2021" >2017-2021</option>
<option value="2016-2020" >2016-2020</option>
<option value="2015-2019" >2015-2019</option>
<option value="2014-2018" >2014-2018</option>
<option value="2013-2017" >2013-2017</option>
<option value="2012-2016" >2012-2016</option>
<option value="2011-2015" >2011-2015</option>
<option value="2010-2014" >2010-2014</option>
<option value="2009-2013" >2009-2013</option>
<option value="2008-2012" >2008-2012</option>
<option value="2007-2011" >2007-2011</option>
<option value="2006-2010" >2006-2010</option>
<option value="2005-2009" >2005-2009</option>
</select>
</label>
</p>
<input name="johnitto">.
<p>Phone<br>
<input style="width: 270px; padding: 6px 10px" type="tel" name="phone_number">
</p>

<p>
<label>Email<br>
<input style="width: 270px; padding: 6px 10px" type="email" name="email_address">
</label>
</p>
<hr>
Current Work Place
<hr>
<p>
	<label>
		Company Name<br><input style="width: 270px" type="text" name="currcompany"><br>
		Designation<br><input style="width: 270px" type="text" name="currdesignation">
	<label>Country<br>
		<select style="width: 270px; padding: 6px 10px" name="country" >
   <option value="Afganistan">Afghanistan</option>
   <option value="Albania">Albania</option>
   <option value="Algeria">Algeria</option>
   <option value="American Samoa">American Samoa</option>
   <option value="Andorra">Andorra</option>
   <option value="Angola">Angola</option>
   <option value="Anguilla">Anguilla</option>
   <option value="Antigua & Barbuda">Antigua & Barbuda</option>
   <option value="Argentina">Argentina</option>
   <option value="Armenia">Armenia</option>
   <option value="Aruba">Aruba</option>
   <option value="Australia">Australia</option>
   <option value="Austria">Austria</option>
   <option value="Azerbaijan">Azerbaijan</option>
   <option value="Bahamas">Bahamas</option>
   <option value="Bahrain">Bahrain</option>
   <option value="Bangladesh">Bangladesh</option>
   <option value="Barbados">Barbados</option>
   <option value="Belarus">Belarus</option>
   <option value="Belgium">Belgium</option>
   <option value="Belize">Belize</option>
   <option value="Benin">Benin</option>
   <option value="Bermuda">Bermuda</option>
   <option value="Bhutan">Bhutan</option>
   <option value="Bolivia">Bolivia</option>
   <option value="Bonaire">Bonaire</option>
   <option value="Bosnia & Herzegovina">Bosnia & Herzegovina</option>
   <option value="Botswana">Botswana</option>
   <option value="Brazil">Brazil</option>
   <option value="British Indian Ocean Ter">British Indian Ocean Ter</option>
   <option value="Brunei">Brunei</option>
   <option value="Bulgaria">Bulgaria</option>
   <option value="Burkina Faso">Burkina Faso</option>
   <option value="Burundi">Burundi</option>
   <option value="Cambodia">Cambodia</option>
   <option value="Cameroon">Cameroon</option>
   <option value="Canada">Canada</option>
   <option value="Canary Islands">Canary Islands</option>
   <option value="Cape Verde">Cape Verde</option>
   <option value="Cayman Islands">Cayman Islands</option>
   <option value="Central African Republic">Central African Republic</option>
   <option value="Chad">Chad</option>
   <option value="Channel Islands">Channel Islands</option>
   <option value="Chile">Chile</option>
   <option value="China">China</option>
   <option value="Christmas Island">Christmas Island</option>
   <option value="Cocos Island">Cocos Island</option> 
   <option value="Colombia">Colombia</option>
   <option value="Comoros">Comoros</option>
   <option value="Congo">Congo</option>
   <option value="Cook Islands">Cook Islands</option>
   <option value="Costa Rica">Costa Rica</option>
   <option value="Cote DIvoire">Cote DIvoire</option>
   <option value="Croatia">Croatia</option>
   <option value="Cuba">Cuba</option>
   <option value="Curaco">Curacao</option>
   <option value="Cyprus">Cyprus</option>
   <option value="Czech Republic">Czech Republic</option>
   <option value="Denmark">Denmark</option>
   <option value="Djibouti">Djibouti</option>
   <option value="Dominica">Dominica</option>
   <option value="Dominican Republic">Dominican Republic</option>
   <option value="East Timor">East Timor</option>
   <option value="Ecuador">Ecuador</option>
   <option value="Egypt">Egypt</option>
   <option value="El Salvador">El Salvador</option>
   <option value="Equatorial Guinea">Equatorial Guinea</option>
   <option value="Eritrea">Eritrea</option>
   <option value="Estonia">Estonia</option>
   <option value="Ethiopia">Ethiopia</option>
   <option value="Falkland Islands">Falkland Islands</option>
   <option value="Faroe Islands">Faroe Islands</option>
   <option value="Fiji">Fiji</option>
   <option value="Finland">Finland</option>
   <option value="France">France</option>
   <option value="French Guiana">French Guiana</option>
   <option value="French Polynesia">French Polynesia</option>
   <option value="French Southern Ter">French Southern Ter</option>
   <option value="Gabon">Gabon</option>
   <option value="Gambia">Gambia</option>
   <option value="Georgia">Georgia</option>
   <option value="Germany">Germany</option>
   <option value="Ghana">Ghana</option>
   <option value="Gibraltar">Gibraltar</option>
   <option value="Great Britain">Great Britain</option>
   <option value="Greece">Greece</option>
   <option value="Greenland">Greenland</option>
   <option value="Grenada">Grenada</option>
   <option value="Guadeloupe">Guadeloupe</option>
   <option value="Guam">Guam</option>
   <option value="Guatemala">Guatemala</option>
   <option value="Guinea">Guinea</option>
   <option value="Guyana">Guyana</option>
   <option value="Haiti">Haiti</option>
   <option value="Hawaii">Hawaii</option>
   <option value="Honduras">Honduras</option>
   <option value="Hong Kong">Hong Kong</option>
   <option value="Hungary">Hungary</option>
   <option value="Iceland">Iceland</option>
   <option value="Indonesia">Indonesia</option>
   <option value="India" selected>India</option>
   <option value="Iran">Iran</option>
   <option value="Iraq">Iraq</option>
   <option value="Ireland">Ireland</option>
   <option value="Isle of Man">Isle of Man</option>
   <option value="Israel">Israel</option>
   <option value="Italy">Italy</option>
   <option value="Jamaica">Jamaica</option>
   <option value="Japan">Japan</option>
   <option value="Jordan">Jordan</option>
   <option value="Kazakhstan">Kazakhstan</option>
   <option value="Kenya">Kenya</option>
   <option value="Kiribati">Kiribati</option>
   <option value="Korea North">Korea North</option>
   <option value="Korea Sout">Korea South</option>
   <option value="Kuwait">Kuwait</option>
   <option value="Kyrgyzstan">Kyrgyzstan</option>
   <option value="Laos">Laos</option>
   <option value="Latvia">Latvia</option>
   <option value="Lebanon">Lebanon</option>
   <option value="Lesotho">Lesotho</option>
   <option value="Liberia">Liberia</option>
   <option value="Libya">Libya</option>
   <option value="Liechtenstein">Liechtenstein</option>
   <option value="Lithuania">Lithuania</option>
   <option value="Luxembourg">Luxembourg</option>
   <option value="Macau">Macau</option>
   <option value="Macedonia">Macedonia</option>
   <option value="Madagascar">Madagascar</option>
   <option value="Malaysia">Malaysia</option>
   <option value="Malawi">Malawi</option>
   <option value="Maldives">Maldives</option>
   <option value="Mali">Mali</option>
   <option value="Malta">Malta</option>
   <option value="Marshall Islands">Marshall Islands</option>
   <option value="Martinique">Martinique</option>
   <option value="Mauritania">Mauritania</option>
   <option value="Mauritius">Mauritius</option>
   <option value="Mayotte">Mayotte</option>
   <option value="Mexico">Mexico</option>
   <option value="Midway Islands">Midway Islands</option>
   <option value="Moldova">Moldova</option>
   <option value="Monaco">Monaco</option>
   <option value="Mongolia">Mongolia</option>
   <option value="Montserrat">Montserrat</option>
   <option value="Morocco">Morocco</option>
   <option value="Mozambique">Mozambique</option>
   <option value="Myanmar">Myanmar</option>
   <option value="Nambia">Nambia</option>
   <option value="Nauru">Nauru</option>
   <option value="Nepal">Nepal</option>
   <option value="Netherland Antilles">Netherland Antilles</option>
   <option value="Netherlands">Netherlands (Holland, Europe)</option>
   <option value="Nevis">Nevis</option>
   <option value="New Caledonia">New Caledonia</option>
   <option value="New Zealand">New Zealand</option>
   <option value="Nicaragua">Nicaragua</option>
   <option value="Niger">Niger</option>
   <option value="Nigeria">Nigeria</option>
   <option value="Niue">Niue</option>
   <option value="Norfolk Island">Norfolk Island</option>
   <option value="Norway">Norway</option>
   <option value="Oman">Oman</option>
   <option value="Pakistan">Pakistan</option>
   <option value="Palau Island">Palau Island</option>
   <option value="Palestine">Palestine</option>
   <option value="Panama">Panama</option>
   <option value="Papua New Guinea">Papua New Guinea</option>
   <option value="Paraguay">Paraguay</option>
   <option value="Peru">Peru</option>
   <option value="Phillipines">Philippines</option>
   <option value="Pitcairn Island">Pitcairn Island</option>
   <option value="Poland">Poland</option>
   <option value="Portugal">Portugal</option>
   <option value="Puerto Rico">Puerto Rico</option>
   <option value="Qatar">Qatar</option>
   <option value="Republic of Montenegro">Republic of Montenegro</option>
   <option value="Republic of Serbia">Republic of Serbia</option>
   <option value="Reunion">Reunion</option>
   <option value="Romania">Romania</option>
   <option value="Russia">Russia</option>
   <option value="Rwanda">Rwanda</option>
   <option value="St Barthelemy">St Barthelemy</option>
   <option value="St Eustatius">St Eustatius</option>
   <option value="St Helena">St Helena</option>
   <option value="St Kitts-Nevis">St Kitts-Nevis</option>
   <option value="St Lucia">St Lucia</option>
   <option value="St Maarten">St Maarten</option>
   <option value="St Pierre & Miquelon">St Pierre & Miquelon</option>
   <option value="St Vincent & Grenadines">St Vincent & Grenadines</option>
   <option value="Saipan">Saipan</option>
   <option value="Samoa">Samoa</option>
   <option value="Samoa American">Samoa American</option>
   <option value="San Marino">San Marino</option>
   <option value="Sao Tome & Principe">Sao Tome & Principe</option>
   <option value="Saudi Arabia">Saudi Arabia</option>
   <option value="Senegal">Senegal</option>
   <option value="Seychelles">Seychelles</option>
   <option value="Sierra Leone">Sierra Leone</option>
   <option value="Singapore">Singapore</option>
   <option value="Slovakia">Slovakia</option>
   <option value="Slovenia">Slovenia</option>
   <option value="Solomon Islands">Solomon Islands</option>
   <option value="Somalia">Somalia</option>
   <option value="South Africa">South Africa</option>
   <option value="Spain">Spain</option>
   <option value="Sri Lanka">Sri Lanka</option>
   <option value="Sudan">Sudan</option>
   <option value="Suriname">Suriname</option>
   <option value="Swaziland">Swaziland</option>
   <option value="Sweden">Sweden</option>
   <option value="Switzerland">Switzerland</option>
   <option value="Syria">Syria</option>
   <option value="Tahiti">Tahiti</option>
   <option value="Taiwan">Taiwan</option>
   <option value="Tajikistan">Tajikistan</option>
   <option value="Tanzania">Tanzania</option>
   <option value="Thailand">Thailand</option>
   <option value="Togo">Togo</option>
   <option value="Tokelau">Tokelau</option>
   <option value="Tonga">Tonga</option>
   <option value="Trinidad & Tobago">Trinidad & Tobago</option>
   <option value="Tunisia">Tunisia</option>
   <option value="Turkey">Turkey</option>
   <option value="Turkmenistan">Turkmenistan</option>
   <option value="Turks & Caicos Is">Turks & Caicos Is</option>
   <option value="Tuvalu">Tuvalu</option>
   <option value="Uganda">Uganda</option>
   <option value="United Kingdom">United Kingdom</option>
   <option value="Ukraine">Ukraine</option>
   <option value="United Arab Erimates">United Arab Emirates</option>
   <option value="United States of America">United States of America</option>
   <option value="Uraguay">Uruguay</option>
   <option value="Uzbekistan">Uzbekistan</option>
   <option value="Vanuatu">Vanuatu</option>
   <option value="Vatican City State">Vatican City State</option>
   <option value="Venezuela">Venezuela</option>
   <option value="Vietnam">Vietnam</option>
   <option value="Virgin Islands (Brit)">Virgin Islands (Brit)</option>
   <option value="Virgin Islands (USA)">Virgin Islands (USA)</option>
   <option value="Wake Island">Wake Island</option>
   <option value="Wallis & Futana Is">Wallis & Futana Is</option>
   <option value="Yemen">Yemen</option>
   <option value="Zaire">Zaire</option>
   <option value="Zambia">Zambia</option>
   <option value="Zimbabwe">Zimbabwe</option>
</select>
	</label>
	
</p>

<hr>Companies Worked<hr><br><label>
<table class="table" id="myTable">
 
</table>
</label>
<button style="width:120px; padding: 6px 10px" type="button" onclick="myFunction()">Add company</button>
<p id="counter" style="text-align: right;"></p>
<p style="font-size: 14px"><hr>Higher Studies (If any)<hr></p>
<label>University<br>
<input style="width: 270px" type="text" name="University" >
</label>
<p>
<label>Stream<br>
<input style="width: 270px" type="text" name="Stream">
</label>
</p>


<p><button class="button1" style=" width:120px; padding: 6px 10px; float: right;" onclick="ok()">Submit</button></p>
				</form>
			</div>
		</div>
	</div>
	<div id="footer">
		<div class="clearfix">
			<div class="section">
				<h4>Links</h4>
				<p>
					<a href=http://stjosephs.ac.in/index.html/>St.joseph's.ac.in</a><br>
					<a href=http://stjosephs.ac.in/FeedBack.html#/>Feedback</a>	
			    </p>
			</div>
			<div class="section contact">
				<h4>Contact Us</h4>
				<p>
					<span>Address:</span> Kamaraj Nagar,<br>Semmancheri,chennai-119
				</p>
				<p>
					<span>Phone:</span> (044) 2450 1060
				</p>
				<p>
					<span>Email:</span> jprstjosephs@stjosephs.ac.in
				</p>
			</div>
			<div class="section">
				<h4>SEND US A MESSAGE</h4>
				<p>
					Feel free to send us a message.
				</p>
				<a href="mailto:jprstjosephs@stjosephs.ac.in" class="subscribe">Mail us</a>
			</div>
		</div>
		<div id="footnote">
			<div class="clearfix">
				<!--<div class="connect">
					<a href="http://freewebsitetemplates.com/go/facebook/" class="facebook"></a><a href="http://freewebsitetemplates.com/go/twitter/" class="twitter"></a><a href="http://freewebsitetemplates.com/go/googleplus/" class="googleplus"></a><a href="http://pinterest.com/fwtemplates/" class="pinterest"></a>
				</div>-->
				<p>
					© Copyright St.Joseph's College Of Engineering. All Rights Reserved.
				</p>
			</div>
		</div>
	</div>
</body>
</html>