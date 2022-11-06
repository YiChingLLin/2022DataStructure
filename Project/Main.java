import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Main() {
	    super();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Hello World");
		out.println("</h1>");
		out.println("<p>");
		out.println("You can write some messages here!");
		out.println("</p>");
		
		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}
}
