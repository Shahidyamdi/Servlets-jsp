package comcapgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Firstservlet
 */
public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Firstservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		ServletConfig config = this.getServletConfig();
		writer.println("first servlet init param-1 " + config.getInitParameter("homeloan"));
		writer.println("<br><br>");
		writer.println("second servlet init param-2 " + config.getInitParameter("carloan"));
		writer.println("<br><br>");

		ServletContext context = getServletContext();
		writer.println("first servlet context param-1 " + context.getInitParameter("username"));
		writer.println("<br><br>");
		writer.println("first servlet context param-2 " + context.getInitParameter("password"));
		writer.println("<br><br>");

	}

}
