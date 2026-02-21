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
					Welcome to Online CAR Shop
				</div>
            </div>
        </div>        
    </header>
 <div class="wrap">
 <form method="post" action="carss.jsp">
			
	<div class="main-content">
		<ul>
		  <li>
			  <img src="images/car1.jpg" >
			  <span>CAR 1 </span><span> Price: 50000</span>
			  <span>
				<input type="checkbox" name="Cars" id="car1" value="car1"/>
				<label for="car1">Add To Cart</label>
				<input type="hidden" name="car1" value="50000"/>
			  </span>
		  </li>
		   <li>
			  <img src="images/car2.jpg" >
			  <span>CAR 2 </span><span> Price: 99999</span>
			  <span>
				<input type="checkbox" name="Cars" id="car2" value="car2"/>
				<label for="car2">Add To Cart</label>
				<input type="hidden" name="car2" value="99999"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/car3.jpg" >
			  <span>CAR 3</span><span> Price: 89990</span>
			  <span>
				<input type="checkbox" name="Cars" id="car3" value="car3"/>
				<label for="car3">Add To Cart</label>
				<input type="hidden" name="car3" value="89990"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/car4.jpg" >
			  <span>CAR 4</span><span> Price: 100000</span>
			  <span>
				<input type="checkbox" name="Cars" id="car4" value="car4"/>
				<label for="car4">Add To Cart</label>
				<input type="hidden" name="car4" value="100000"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/car5.jpg" >
			  <span>CAR 5</span><span> Price: 89999</span>
			  <span>
				<input type="checkbox" name="Cars" id="car5" value="car5"/>
				<label for="car5">Add To Cart</label>
				<input type="hidden" name="car5" value="89999"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/car6.jpg" >
			  <span>CAR 6 </span><span> Price: 130000</span>
			  <span>
				<input type="checkbox" name="Cars" id="car6" value="car6"/>
				<label for="car6">Add To Cart</label>
				<input type="hidden" name="car6" value="130000"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/car7.jpg" >
			  <span>CAR 7 </span><span> Price: 199999</span>
			  <span>
				<input type="checkbox" name="Cars" id="car7" value="car7"/>
				<label for="car7">Add To Cart</label>
				<input type="hidden" name="car7" value="199999"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/car8.jpg" >
			  <span>CAR 8</span><span> Price: 999990</span>
			  <span>
				<input type="checkbox" name="Cars" id="car8" value="car8"/>
				<label for="car8">Add To Cart</label>
				<input type="hidden" name="car8" value="999990"/>
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
			A product of Car Shoping Center &copy;
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