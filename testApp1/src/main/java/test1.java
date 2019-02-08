

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class test1
 */
@WebServlet("/test1")
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	// un nom
//		String paramAuteur = request.getParameter("auteur");
//		String message = "Transmisstion de variable : OK ! " + paramAuteur ;
//		request.setAttribute("attribut", message);
	
		
	// nom prenom avec majuscule
		
		request.setCharacterEncoding("UTF-8");

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
//		request.setAttribute("nom", nom.toUpperCase());
//		request.setAttribute("prenom", prenom.toUpperCase());
		this.getServletContext().getRequestDispatcher("/WEB-INF/MaMavenjsp.jsp").forward(request, response);
	}	
//	      String login = request.getParameter( "txtLogin" );
//	        String password = request.getParameter( "txtPassword" );
//	        if ( login == null ) login = "";
//	        if ( password == null ) password = "";
//	        
//	        HttpSession session = request.getSession( true );
//	        session.setAttribute( "login", login );
//	        session.setAttribute( "password", password );
//	        
//	        request.getRequestDispatcher( "/WEB-INF/formulaire.jsp" ).forward( request, response );
//}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		request.setAttribute("nom", nom.toUpperCase());
		request.setAttribute("prenom", prenom.toUpperCase());
		this.getServletContext().getRequestDispatcher("/WEB-INF/MaMavenjsp.jsp").forward(request, response);
		
//	      String login = request.getParameter( "txtLogin" );
//	        String password = request.getParameter( "txtPassword" );
//
//	        HttpSession session = request.getSession( true );
//	        session.setAttribute( "login", login );
//	        session.setAttribute( "password", password );
//
//	        System.out.println( "in the doPost" );
//	        
//	        if ( login.equals( "bond" ) && password.equals( "007" ) ) {
//	            session.setAttribute( "isConnected", true );
//	            request.getRequestDispatcher( "/Connected.jsp" ).forward( request, response );
//	        } else {
//	            session.setAttribute( "isConnected", false );
//	            request.getRequestDispatcher( "/Login.jsp" ).forward( request, response );
//	}

}
}