

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("t1");
		int n1 = Integer.parseInt(s1);
		String s2 = request.getParameter("t2");
		int n2 = Integer.parseInt(s2);
		out.println(n1+n2);

	}


}
