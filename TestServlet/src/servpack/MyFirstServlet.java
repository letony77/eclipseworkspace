package servpack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 TODO Auto-generated method stub
//		ServletOutputStream out = response.getOutputStream();
//		out.println("<HTML>\n");
//        out.println("<HEAD>\n");
//        out.println("<TITLE> Bonjour </TITLE> \n");
//        out.println("</HEAD> \n");
//        out.println("<BODY> \n");
//        out.println("<H1>Bonjour </H1> \n");
//        out.println("<P> Salut Hamza comment tu vas ? </P>");
//        out.println("</BODY> \n");
//        
//        out.println("le nom est " + request.getParameter("nom"));
		
		this.getServletContext().getRequestDispatcher("/testJSP.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
}
