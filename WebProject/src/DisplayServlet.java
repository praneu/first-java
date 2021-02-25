

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String p = request.getParameter("s1");
		String q = request.getParameter("s2");

		int n1 = Integer.parseInt(p);
		int n2 = Integer.parseInt(q);

		for(int i = n1; i<=n2;i++) {
			out.println(i);
		}

	}
}
