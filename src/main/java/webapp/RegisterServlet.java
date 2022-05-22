package webapp;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/register.do")
public class RegisterServlet extends HttpServlet {
	LoginService service=new LoginService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/registerform.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String userName=request.getParameter("name");
		String password=request.getParameter("password");
		if(service.register(userName, password)) {
			request.setAttribute("name", userName);
			request.setAttribute("successMessage", "Your Registration was Successful..");
			Set<String> keySet=service.userMap.keySet();
			for (String key : keySet) {
				System.out.println("UserName="+key+"\nPassword="+service.userMap.get(key));
			}
			request.getRequestDispatcher("/WEB-INF/views/page.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "User Name already Exists/ The Password length must be 8 or above");
			request.getRequestDispatcher("/WEB-INF/views/registerform.jsp").forward(request, response);
		}
	}

}