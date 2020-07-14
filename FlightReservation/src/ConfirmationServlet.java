

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConfirmationServlet
 */
@WebServlet("/ConfirmationServlet")
public class ConfirmationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		PrintWriter output = response.getWriter();
		output.println("<html>");
		output.println("<head>");
		output.println("<title>Flight Reservation System</title>");
		output.println("</head>");
		output.println("<body>");
		output.println("<p> You have selected these flights");
		output.println(session.getAttribute("srcFlight"));
		output.println("<br />");
		output.println(request.getParameter("returnFlight"));
		output.println("</p>");
		output.println("<form action='SuccessServlet' method='post'>");
		output.println("Username: <input type='text' name='username' />");
		output.println("Email: <input type='text' name='email' />");
		output.println("Telephone: <input type='text' name='telephone' />");
		output.println("<input type='submit' value='Submit' />");
		output.println("</form>");
		output.println("</body>");
		output.println("</html>");
	}

}
