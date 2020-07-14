

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flight.model.FlightInfo;

/**
 * Servlet implementation class SourceSelectionServlet
 */
@WebServlet("/SourceSelectionServlet")
public class SourceSelectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Map<String, Map<String, List<FlightInfo>>> FLIGHTS = new HashMap<>();
	
	static {
		Map<String, List<FlightInfo>> fromEgypt = new HashMap<>();
		fromEgypt.put("UK", Arrays.asList(new FlightInfo("Egy-UK001", "Egypt", "UK", 100, 0, LocalDate.of(2020, 7, 13), LocalDate.of(2020, 7, 13)),
				new FlightInfo("Egy-UK002", "Egypt", "UK", 200, 65, LocalDate.of(2020, 7, 14), LocalDate.of(2020, 7, 15)),
				new FlightInfo("Egy-UK003", "Egypt", "UK", 377, 224, LocalDate.of(2020, 7, 12), LocalDate.of(2020, 7, 12)),
				new FlightInfo("Egy-UK004", "Egypt", "UK", 100, 89, LocalDate.of(2020, 7, 13), LocalDate.of(2020, 7, 13))));
		
		Map<String, List<FlightInfo>> fromUK = new HashMap<>();
		fromUK.put("Egypt", Arrays.asList(new FlightInfo("UK-Egy001", "UK", "Egypt", 100, 0, LocalDate.of(2020, 7, 20), LocalDate.of(2020, 7, 20)),
				new FlightInfo("UK-Egy002", "UK", "Egypt", 200, 65, LocalDate.of(2020, 7, 21), LocalDate.of(2020, 7, 22)),
				new FlightInfo("UK-Egy003", "UK", "Egypt", 377, 224, LocalDate.of(2020, 7, 19), LocalDate.of(2020, 7, 19)),
				new FlightInfo("UK-Egy004", "UK", "Egypt", 100, 89, LocalDate.of(2020, 7, 20), LocalDate.of(2020, 7, 20))));
		
		FLIGHTS.put("Egypt", fromEgypt);
		FLIGHTS.put("UK", fromUK);

	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("in Init");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("In service");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		
		HttpSession session = request.getSession();
		session.setAttribute("source", source);
		session.setAttribute("destination", destination);
		
		List<FlightInfo> flightList = FLIGHTS.get(source).get(destination);
		
		PrintWriter output = response.getWriter();
		output.println("<html>");
		output.println("<head>");
		output.println("<title>Flight Reservation System</title>");
		output.println("</head>");
		output.println("<body>");
		output.println("<form action='ReturnFlightSelectionServlet' method='post'>");

		for (FlightInfo flightInfo : flightList) {
			output.println("<input type='radio' name='srcFlight' value='" + flightInfo.getFlightNo() +"' />");
			output.println("<label>");
			output.println(flightInfo);
			output.println("</label>");
		}
		output.println("<input type='submit' value='Select' />");
		output.println("</form>");
		output.println("</body>");
		output.println("</html>");
		
		getServletContext().setAttribute("returnFlights", FLIGHTS.get(destination).get(source));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
