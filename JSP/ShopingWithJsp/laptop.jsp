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
					Welcome to Online Laptop Shop
				</div>
            </div>
        </div>        
    </header>
 <div class="wrap">
 <form method="post" action="laptops.jsp">
	<div class="main-content">
		<ul>
		
		
		
		
		
		  <li>
			  <img src="images/Sony.jpg" >
			  <span>Sony </span><span> Price: 350</span>
			  <span>
				<input type="checkbox" name="Laptops" id="Sony" value="Sony"/>
				<label for="Sony">Add To Cart</label>
				<input type="hidden" name="Sony" value="350"/>
			  </span>
		  </li>
		   <li>
			  <img src="images/AndroidBased.jpg" >
			  <span>Android  Based </span><span> Price: 499</span>
			  <span>
				<input type="checkbox" name="Laptops" id="AndroidBased" value="AndroidBased"/>
				<label for="AndroidBased">Add To Cart</label>
				<input type="hidden" name="AndroidBased" value="499"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/Apple.jpg" >
			  <span>Apple </span><span> Price: 399</span>
			  <span>
				<input type="checkbox" name="Laptops" id="Apple" value="Apple"/>
				<label for="Apple">Add To Cart</label>
				<input type="hidden" name="Apple" value="399"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/DELL.jpg" >
			  <span>DELL </span><span> Price: 299</span>
			  <span>
				<input type="checkbox" name="Laptops" id="DELL" value="DELL"/>
				<label for="DELL">Add To Cart</label>
				<input type="hidden" name="DELL" value="299"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/HP.jpg" >
			  <span> HP</span><span> Price: 599</span>
			  <span>
				<input type="checkbox" name="Laptops" id="HP" value="HP"/>
				<label for="HP">Add To Cart</label>
				<input type="hidden" name="HP" value="599"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/ACER.jpg" >
			  <span>ACER </span><span> Price: 231</span>
			  <span>
				<input type="checkbox" name="Laptops" id="ACER" value="ACER"/>
				<label for="ACER">Add To Cart</label>
				<input type="hidden" name="ACER" value="231"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/HCL.jpg" >
			  <span>HCL</span><span> Price: 329</span>
			  <span>
				<input type="checkbox" name="Laptops" id="HCL" value="HCL"/>
				<label for="HCL">Add To Cart</label>
				<input type="hidden" name="HCL" value="329"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/COMPAQ.jpg" >
			  <span>COMPAQ</span><span> Price: 470</span>
			  <span>
				<input type="checkbox" name="Laptops" id="COMPAQ" value="COMPAQ"/>
				<label for="COMPAQ">Add To Cart</label>
				<input type="hidden" name="COMPAQ" value="470"/>
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
			A product of Laptop Shoping Center &copy;
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