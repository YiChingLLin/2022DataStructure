

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BmiA
 */
@WebServlet("/BmiA")
public class BmiA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BmiA() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /*
     * 第一種作法:在class中直接寫html
     */
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 回應get request&送post表單
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestUri = request.getRequestURI();
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Bmi</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<form action='" + requestUri + "' method='post'>");
		out.println("<input type='text' name='height' placeholder = 'height'/>");
		out.println("<input type='text' name='weight' placeholder = 'weight'/>");
		out.println("<input type='submit' value='submit' />");
		out.println("</form>");
		
		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 回應post request丟過來的表單
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		double weight  = Double.parseDouble(request.getParameter("weight"));
		double height  = Double.parseDouble(request.getParameter("height"));
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Bmi</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("Bmi : " + (weight / height / height));
		
		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}

}
