<html>
	<body>
		<%!
			javax.servlet.jsp.JspWriter localOut;

			class BaseClass
			{
				public void start() throws java.io.IOException
				{
					localOut.println("Starting...<BR>");
				}
			}

			class DerivedClass1 extends BaseClass
			{
				public void fly() throws java.io.IOException
				{
					localOut.println("Flying...<BR>");
				}
			}

			class DerivedClass2 extends DerivedClass1
			{
				public void fly() throws java.io.IOException
				{
					localOut.println("Flying...from derive2<BR>");
				}
			}
		%>
		<%
			localOut=out;
			out.println();
			out.println("Creating a DerivedClass2 object...<BR>");
			BaseClass p=new DerivedClass2();
			p.start();
			DerivedClass2 p1=new DerivedClass2();
			p1.fly();
		%>
	</body>
</html>

<%--
Creating a DerivedClass2 object...
Starting...
Flying...from derive2
--%>