<%@ page session="false" %>

<html>
<head>
    <link href="style.css" rel="stylesheet" type="text/css" />
</head>
<% HttpSession session = request.getSession(false); 
if(session!=null)
{ 
%>

<body>
    <header>
        <div class="masthead">
            <div class="wrap">
               <div class="head-line">
			Welcome to Online Mobile Shop
		</div>
            </div>
        </div>        
    </header>
 <div class="wrap">
 <form method="post" action="mobiles.jsp">
	<div class="main-content">
		<ul>
		  <li>
			  <img src="images/nokia_5235.jpg" >
			  <span>Nokia 5235 </span><span> Price: 5000</span>
			  <span>
				<input type="checkbox" name="Mobiles" id="nokia_5235" value="nokia_5235"/>
				<label for="nokia_5235">Add To Cart</label>
				<input type="hidden" name="nokia_5235" value="5000"/>
			  </span>
		  </li>

		   <li>
			  <img src="images/nokia_asha305.jpg" >
			  <span>Nokia Asha305 </span><span> Price: 4799</span>
			  <span>
				<input type="checkbox" name="Mobiles" id="nokia_asha305" value="nokia_asha305"/>
				<label for="nokia_asha305">Add To Cart</label>
				<input type="hidden" name="nokia_asha305" value="4799"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/nokia_e6.jpg" >
			  <span>Nokia E6 </span><span> Price: 3990</span>
			  <span>
				<input type="checkbox" name="Mobiles" id="nokia_e6" value="nokia_e6"/>
				<label for="nokia_e6">Add To Cart</label>
				<input type="hidden" name="nokia_e6" value="3990"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/nokia_asha720.jpg" >
			  <span>Nokia Asha720 </span><span> Price: 10190</span>
			  <span>
				<input type="checkbox" name="Mobiles" id="nokia_asha720" value="nokia_asha720"/>
				<label for="nokia_asha720">Add To Cart</label>
				<input type="hidden" name="nokia_asha720" value="10190"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/samsung_galaxy_duos.jpg" >
			  <span>Samsung Galaxy Duas </span><span> Price: 8999</span>
			  <span>
				<input type="checkbox" name="Mobiles" id="samsung_galaxy_duos" value="samsung_galaxy_duos"/>
				<label for="samsung_galaxy_duos">Add To Cart</label>
				<input type="hidden" name="samsung_galaxy_duos" value="8999"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/samsung_galaxy_n7100.jpg" >
			  <span>Samsung Galaxy7100 </span><span> Price: 13149</span>
			  <span>
				<input type="checkbox" name="Mobiles" id="samsung_galaxy_n7100" value="samsung_galaxy_n7100"/>
				<label for="samsung_galaxy_n7100">Add To Cart</label>
				<input type="hidden" name="samsung_galaxy_n7100" value="13149"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/samsung_galaxy_sII.jpg" >
			  <span>Samsung Galaxy SII </span><span> Price: 12449</span>
			  <span>
				<input type="checkbox" name="Mobiles" id="samsung_galaxy_sII" value="samsung_galaxy_sII"/>
				<label for="samsung_galaxy_sII">Add To Cart</label>
				<input type="hidden" name="samsung_galaxy_sII" value="12449"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/samsung_s6802.jpg" >
			  <span>Samsung S6802</span><span> Price: 7890</span>
			  <span>
				<input type="checkbox" name="Mobiles" id="samsung_s6802" value="samsung_s6802"/>
				<label for="samsung_s6802">Add To Cart</label>
				<input type="hidden" name="samsung_s6802" value="7890"/>
			  </span>
		  </li>  
</ul>
	
	</div>
	<div class="sbutton">
		<button type="submit" class="submitbtn">Proceed for Payment</button>
	</div>
	</form>
 </div>
    <footer>
        <div class="wrap">         
            <p class="copyrightstatment">
			A product of Mobile Shoping Center & copy;
            </p>
        </div>
    </footer>
<% 
} 
else 
{
%>

<jsp:forward page="front.jsp"/>
<%}%>
</body>
</html>