

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReverseServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter getout = response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");

		StringBuffer sbr = new StringBuffer(s1);

		if(s2.contentEquals(sbr.reverse())) {
			response.sendRedirect("http://localhost:8080/WebProject/home.html");
		}
		else
			getout.println("Login Failed!!");
	}
}
