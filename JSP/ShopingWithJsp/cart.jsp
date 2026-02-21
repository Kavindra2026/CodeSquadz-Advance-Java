<%@ page session="false" %>

<html>
<body bgcolor ="#FFFFA9">
<center>
<%
		HttpSession  session = request.getSession(false);
		if(session!=null)
		{
		String[] selectedmobiles=(String[])session.getAttribute ("selectedmobiles");
		int[] price=(int[])session.getAttribute("price");


		String[] selectedlaptops=(String[])session.getAttribute("selectedlaptops");
		int[] pricel=(int[])session.getAttribute("pricel");
	


		String[] selectedwatches=(String[])session.getAttribute ("selectedwatches");
                int[] pricew=(int[])session.getAttribute("pricew");


		String[] selectedcars=(String[])session.getAttribute ("selectedcars");
                int[] pricec=(int[])session.getAttribute("pricec");	


	
		String[] selectedcalci=(String[])session.getAttribute ("selectedcalci");
                int[] pricecl=(int[])session.getAttribute("pricecl");


		String[] selectedpens=(String[])session.getAttribute ("selectedpens");
                int[] pricep=(int[])session.getAttribute("pricep");	

%><center><h2><i><u>Your Cart Details</u></i></h2></center>	
	<table width='50%' border='1'>
	<tr>
	<th>Type</th>
	<th>Name</th>
	<th>Price</th>
	</tr>
<%
int totalprice=0,totalpricel=0,totalpricew=0,totalpricec=0,totalpricep=0,totalpricecl=0; 	
     if(selectedmobiles!=null && selectedmobiles.length>0)  
	{
		int cost[]=new int[selectedmobiles.length];			
		for(int i=0;i<selectedmobiles.length;i++)
		{
			cost[i]=price[i];
			totalprice=totalprice+cost[i];
		} 
		for(int i=0;i<selectedmobiles.length;i++)
		{
out.print("<tr><td>Mobile</td><td><a href='image.jsp?image_id="+selectedmobiles[i]+"'>"+selectedmobiles[i].replace('_','-').toUpperCase()+"</a></td>");
		out.print("<td>"+cost[i]+"</td></tr>");
		}
		out.println("<tr bgcolor='yellow'><td ><br></td><td>Mobile Total Amount:</td><td>"+totalprice+"</td></tr>");
	}
	
	 if(selectedlaptops!=null && selectedlaptops.length>0)  
	{
		int costl[]=new int[selectedlaptops.length];		
		for(int i=0;i<selectedlaptops.length;i++)
		{
			costl[i]=pricel[i];
			totalpricel=totalpricel+costl[i];
		} 
		for(int i=0;i<selectedlaptops.length;i++)
		{
out.print("<tr><td>Laptop</td><td><a href='image.jsp?image_id="+selectedlaptops[i]+"'>"+selectedlaptops[i].replace('_','-').toUpperCase()+"</a></td>");
		out.print("<td>"+costl[i]+"</td></tr>");
		}
		out.println("<tr bgcolor='yellow'><td ><br></td><td>Laptop Total Amount:</td><td>"+totalpricel+"</td></tr>");
	}


	     if(selectedwatches!=null && selectedwatches.length>0)  
	{
		int costw[]=new int[selectedwatches.length];
		for(int i=0;i<selectedwatches.length;i++)
		{
			costw[i]=pricew[i];
			totalpricew=totalpricew+costw[i];
		} 
		for(int i=0;i<selectedwatches.length;i++)
		{
out.print("<tr><td>Watch</td><td><a href='image.jsp?image_id="+selectedwatches[i]+"'>"+selectedwatches[i].replace('_','-').toUpperCase()+"</a></td>");
		out.print("<td>"+costw[i]+"</td></tr>");
		}
		out.println("<tr bgcolor='yellow'><td ><br></td><td>Watches Total Amount:</td><td>"+totalpricew+"</td></tr>");
	}


     if(selectedcars!=null && selectedcars.length>0)  
	{
		int costc[]=new int[selectedcars.length];			
		for(int i=0;i<selectedcars.length;i++)
			{
				costc[i]=pricec[i];
				totalpricec=totalpricec+costc[i];
			} 
		for(int i=0;i<selectedcars.length;i++)
		{
out.print("<tr><td>Car</td><td><a href='image.jsp?image_id="+selectedcars[i]+"'>"+selectedcars[i].replace('_','-').toUpperCase()+"</a></td>");
		out.print("<td>"+costc[i]+"</td></tr>");
		}
		out.println("<tr bgcolor='yellow'><td ><br></td><td>Cars Total Amount:</td><td>"+totalpricec+"</td></tr>");
	}

     if(selectedpens!=null && selectedpens.length>0)  
	{
		int costp[]=new int[selectedpens.length];		
		for(int i=0;i<selectedpens.length;i++)
			{
				costp[i]=pricep[i];
				totalpricep=totalpricep+costp[i];
			} 
		for(int i=0;i<selectedpens.length;i++)
		{
out.print("<tr><td>Pen Drive</td><td><a href='image.jsp?image_id="+selectedpens[i]+"'>"+selectedpens[i].replace('_','-').toUpperCase()+"</a></td>");
		out.print("<td>"+costp[i]+"</td></tr>");
		}
		out.println("<tr bgcolor='yellow'><td ><br></td><td>Pen Drives Total Amount:</td><td>"+totalpricep+"</td></tr>");
	}

     if(selectedcalci!=null && selectedcalci.length>0)  
	{
		int costcl[]=new int[selectedcalci.length];		
		for(int i=0;i<selectedcalci.length;i++)
			{
				costcl[i]=pricecl[i];
				totalpricecl=totalpricecl+costcl[i];
			} 
		for(int i=0;i<selectedcalci.length;i++)
		{
out.print("<tr><td>Calculator</td><td><a href='image.jsp?image_id="+selectedcalci[i]+"'>"+selectedcalci[i].replace('_','-').toUpperCase()+"</a></td>");
		out.print("<td>"+costcl[i]+"</td></tr>");
		}
		out.println("<tr bgcolor='yellow'><td ><br></td><td>Calculators Total Amount:</td><td>"+totalpricecl+"</td></tr>");
	}
int gtotal=totalprice+totalpricel+totalpricec+totalpricew+totalpricep+totalpricecl;

out.println("<tr bgcolor='pink'><td ><br></td><td>Grand Total:</td><td>"+gtotal+"</td></tr>");
out.println("<tr bgcolor='white'><td><br></td><td><a href='welcome.jsp'><h2>Back</h2></a></td><td><input type='submit' value='Payment'></td></tr></table>");

}
 else
 {
%>
<jsp:forward page="welcome.jsp"/>
<%
}
%>
</center>
</body>
</html>