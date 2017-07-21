package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String login1, password1;
		
		login1 = request.getParameter("username1");
		password1 = request.getParameter("password1");
		
		Model m = new Model ();
		
		if (m.uu(login1, password1)) {
			
			request.getSession().setAttribute("user", login1);
	
			
			response.sendRedirect("success.jsp");
			
			
		} else {response.sendRedirect("formRegister.jsp");}
		
		
		
		
		
	}

}
