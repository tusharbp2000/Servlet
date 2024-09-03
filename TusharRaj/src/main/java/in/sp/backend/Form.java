package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitapp")
public class Form extends HttpServlet
{
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{
		String fname=req.getParameter("name1");
		String sname=req.getParameter("name2");
		String email=req.getParameter("email1");
		String fname1=req.getParameter("mobile1");
		String gen1=req.getParameter("gen");
		String birthdate=req.getParameter("birth1");
		String address=req.getParameter("add1");
		String city=req.getParameter("city1");
		String pin=req.getParameter("pin1");
		String state=req.getParameter("state1");
		String qualification=req.getParameter("quali1");
		String cs=req.getParameter("cs1");
		String it=req.getParameter("it1");
		String ca=req.getParameter("ca1");
		String tc=req.getParameter("tc1");
		String pass=req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		out.println("First Name : "+ fname);
		out.println("Last Name : "+ sname);
		out.println("Email : "+ email);
		out.println("Mobile no. : "+ fname1);
		out.println("Gender : "+ gen1);
		out.println("Birthday : "+ birthdate);
		out.println("Address : "+ address);
		out.println("City : "+ city);
		out.println("PIN : "+ pin);
		out.println("State : "+ state);
		out.println("Qualification : "+ qualification);
		out.println("Computer Science : "+ cs);
		out.println("Information Technology : "+ it);
		out.println("Computer Architecture : "+ ca);
		out.println("Tele Communication : "+ tc);
		out.println("Password : "+ pass);
		
		
	}

}
