

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flight.model.FlightInfo;

/**
 * Servlet implementation class ReturnFlightSelectionServlet
 */
@WebServlet("/ReturnFlightSelectionServlet")
public class ReturnFlightSelectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		String source = (String) session.getAttribute("source");
		System.out.println(source);
		String destination = (String) session.getAttribute("destination");
		System.out.println(destination);
		
		String srcFlight = request.getParameter("srcFlight");
		System.out.println(srcFlight);
		session.setAttribute("srcFlight", srcFlight);
		
		List<FlightInfo> returnFlights = (List<FlightInfo>) getServletContext().getAttribute("returnFlights");
		
		PrintWriter output = response.getWriter();
		output.println("<html>");
		output.println("<head>");
		output.println("<title>Flight Reservation System</title>");
		output.println("</head>");
		output.println("<body>");
		output.println("<form action='ConfirmationServlet' method='post'>");

		for (FlightInfo flightInfo : returnFlights) {
			output.println("<input type='radio' name='returnFlight' value='" + flightInfo.getFlightNo() +"' />");
			output.println("<label>");
			output.println(flightInfo);
			output.println("</label>");
		}
		output.println("<input type='submit' value='Select' />");
		output.println("</form>");
		output.println("</body>");
		output.println("</html>");
	}

}
