

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class InsertServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int s1 = Integer.parseInt(request.getParameter("empId"));
		String s2 = request.getParameter("empName");
		int s3 = Integer.parseInt(request.getParameter("empSal"));
		String s4 = request.getParameter("empCity");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			out.println();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pramesh","root","welcome");
			Statement st = conn.createStatement();
			st.execute("insert into emp values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
		} catch (SQLException e) {
			out.println();
		}

	}

}
