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
					Welcome to Online Calculator Shop
				</div>
            </div>
        </div>        
    </header>
 <div class="wrap">
 <form method="post" action="calculators.jsp">
	<div class="main-content">
		<ul>
		  <li>
			  <img src="images/c1.jpg" >
			  <span>C1</span><span> Price: 500</span>
			  <span>
				<input type="checkbox" name="Calci" id="c1" value="c1"/>
				<label for="c1">Add To Cart</label>
				<input type="hidden" name="c1" value="500"/>
			  </span>
		  </li>
		   <li>
			  <img src="images/c2.jpg" >
			  <span>C2</span><span> Price: 479</span>
			  <span>
				<input type="checkbox" name="Calci" id="c2" value="c2"/>
				<label for="c2">Add To Cart</label>
				<input type="hidden" name="c2" value="479"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/c3.jpg" >
			  <span>C3</span><span> Price: 390</span>
			  <span>
				<input type="checkbox" name="Calci" id="c3" value="c3"/>
				<label for="c3">Add To Cart</label>
				<input type="hidden" name="c3" value="390"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/c4.jpg" >
			  <span>C4 </span><span> Price: 490</span>
			  <span>
				<input type="checkbox" name="Calci" id="c4" value="c4"/>
				<label for="c4">Add To Cart</label>
				<input type="hidden" name="c4" value="490"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/c5.jpg" >
			  <span>C%</span><span> Price: 899</span>
			  <span>
				<input type="checkbox" name="Calci" id="c5" value="c5"/>
				<label for="c5">Add To Cart</label>
				<input type="hidden" name="c5" value="899"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/c6.jpg" >
			  <span>C6</span><span> Price: 349</span>
			  <span>
				<input type="checkbox" name="Calci" id="c6" value="c6"/>
				<label for="c6">Add To Cart</label>
				<input type="hidden" name="c6" value="349"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/c7.jpg" >
			  <span>C7 </span><span> Price: 449</span>
			  <span>
				<input type="checkbox" name="Calci" id="c7" value="c7"/>
				<label for="c7">Add To Cart</label>
				<input type="hidden" name="c7" value="449"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/c8.jpg" >
			  <span>C8</span><span> Price: 790</span>
			  <span>
				<input type="checkbox" name="Calci" id="c8" value="c8"/>
				<label for="c8">Add To Cart</label>
				<input type="hidden" name="c8" value="790"/>
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
			A product of Calculator Shoping Center &copy;
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