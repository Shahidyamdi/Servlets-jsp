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
 * Servlet implementation class Secondservlet
 */
public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Secondservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		ServletConfig config = getServletConfig();
		writer.println("second servlet init param-1 " + config.getInitParameter("vcs1"));
		writer.println("<br><br>");
		writer.println("second servlet init param-2 " + config.getInitParameter("vcs2"));
		writer.println("<br><br>");

		ServletContext context = getServletContext();
		writer.println("second servlet context param-1 " + context.getInitParameter("username"));
		writer.println("<br><br>");
		writer.println("second servlet context param-2 " + context.getInitParameter("password"));
		writer.println("<br><br>");

	}

}
