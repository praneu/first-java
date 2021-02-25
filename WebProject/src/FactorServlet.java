

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FactorServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		String s = request.getParameter("l1");
		int s1 = Integer.parseInt(s);
		
		for(int i =1; i<=s1;i++) {
			
			if(s1%i==0) {
				out.println(i);
			}
		}
	}
}
