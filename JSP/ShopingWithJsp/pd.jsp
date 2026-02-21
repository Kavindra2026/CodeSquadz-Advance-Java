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
					Welcome to Online PenDrive Shop
				</div>
            </div>
        </div>        
    </header>
 <div class="wrap">
 <form method="post" action="pens.jsp">
	<div class="main-content">
		<ul>
		  <li>
			  <img src="images/pd1.jpg" >
			  <span>PD - 1</span><span> Price: 500</span>
			  <span>
				<input type="checkbox" name="Pen" id="pd1" value="pd1"/>
				<label for="pd1">Add To Cart</label>
				<input type="hidden" name="pd1" value="500"/>
			  </span>
		  </li>
		   <li>
			  <img src="images/pd2.jpg" >
			  <span>PD- 2</span><span> Price: 399</span>
			  <span>
				<input type="checkbox" name="Pen" id="pd2" value="pd2"/>
				<label for="pd2">Add To Cart</label>
				<input type="hidden" name="pd2" value="399"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/pd3.jpg" >
			  <span>PD-3</span><span> Price: 390</span>
			  <span>
				<input type="checkbox" name="Pen" id="pd3" value="pd3"/>
				<label for="pd3">Add To Cart</label>
				<input type="hidden" name="pd3" value="390"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/pd4.jpg" >
			  <span>PD- 4</span><span> Price: 490</span>
			  <span>
				<input type="checkbox" name="Pen" id="pd4" value="pd4"/>
				<label for="pd4">Add To Cart</label>
				<input type="hidden" name="pd4" value="490"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/pd5.jpg" >
			  <span>PD-5 </span><span> Price: 899</span>
			  <span>
				<input type="checkbox" name="Pen" id="pd5" value="pd5"/>
				<label for="pd5">Add To Cart</label>
				<input type="hidden" name="pd5" value="899"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/pd6.jpg" >
			  <span>PD-6 </span><span> Price: 649</span>
			  <span>
				<input type="checkbox" name="Pen" id="pd6" value="pd6"/>
				<label for="pd6">Add To Cart</label>
				<input type="hidden" name="pd6" value="649"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/pd7.jpg" >
			  <span>PD-7</span><span> Price: 449</span>
			  <span>
				<input type="checkbox" name="Pen" id="pd7" value="pd7"/>
				<label for="pd7">Add To Cart</label>
				<input type="hidden" name="pd7" value="449"/>
			  </span>
		  </li>
		  <li>
			  <img src="images/pd8.jpg" >
			  <span>PD-8</span><span> Price: 789</span>
			  <span>
				<input type="checkbox" name="Pen" id="pd8" value="pd8"/>
				<label for="pd8">Add To Cart</label>
				<input type="hidden" name="pd8" value="789"/>
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
			A product of Pendrive Shoping Center &copy;
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