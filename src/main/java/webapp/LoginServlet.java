package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	LoginService service=new LoginService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/loginform.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String userName=request.getParameter("name");
		String password=request.getParameter("password");
		if(service.checkValid(userName, password)) {
			request.setAttribute("name", userName);
			request.getRequestDispatcher("/WEB-INF/views/page.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Invalid Password or UserName. \n Register if you are new User.");
			request.getRequestDispatcher("/WEB-INF/views/loginform.jsp").forward(request, response);
		}
	}

}