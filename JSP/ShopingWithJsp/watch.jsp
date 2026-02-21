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
					Welcome to Online Watch Shop
				</div>
            </div>
        </div>        
    </header>
 <div class="wrap">
 <form method="post" action="watches.jsp">
	<div class="main-content">
		<ul>
		  <li>
			  <img src="images/w1.jpg" >
			  <span>Watch 1 </span><span> Price: 2000</span>
			  <span>
				<input type="checkbox" name="Watches" id="w1" value="w1"/>
				<label for="w1">Add To Cart</label>
				<input type="hidden" name="w1" value="2000"/>
			  </span>
		  </li>
		   <li>
			  <img src="images/w2.jpg" >
			  <span>Watch 2 </span><span> Price: 1799</span>
			  <span>
				<input type="checkbox" name="Watches" id="w2" value="w2"/>
				<label for="w2">Add To Cart</label>
				<input type="hidden" name="w2" value="1799"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/w3.jpg" >
			  <span>Watch</span><span> Price: 2990</span>
			  <span>
				<input type="checkbox" name="Watches" id="w3" value="w3"/>
				<label for="w3">Add To Cart</label>
				<input type="hidden" name="w3" value="2990"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/w4.jpg" >
			  <span>Watch 4 </span><span> Price: 1190</span>
			  <span>
				<input type="checkbox" name="Watches" id="w4" value="w4"/>
				<label for="w4">Add To Cart</label>
				<input type="hidden" name="w4" value="1190"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/w5.jpg" >
			  <span>Watch 5</span><span> Price: 1999</span>
			  <span>
				<input type="checkbox" name="Watches" id="w5" value="w5"/>
				<label for="w5">Add To Cart</label>
				<input type="hidden" name="w5" value="1999"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/w6.jpg" >
			  <span>Watch 6 </span><span> Price: 1399</span>
			  <span>
				<input type="checkbox" name="Watches" id="w6" value="w6"/>
				<label for="w6">Add To Cart</label>
				<input type="hidden" name="w6" value="1399"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/w7.jpg" >
			  <span>Watch 7</span><span> Price: 1299</span>
			  <span>
				<input type="checkbox" name="Watches" id="w7" value="w7"/>
				<label for="w7">Add To Cart</label>
				<input type="hidden" name="w7" value="1299"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/w8.jpg" >
			  <span>Watch 8</span><span> Price: 1299</span>
			  <span>
				<input type="checkbox" name="Watches" id="w8" value="w8"/>
				<label for="w8">Add To Cart</label>
				<input type="hidden" name="w8" value="1299"/>
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
			A product of Watch Shoping Center &copy;
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