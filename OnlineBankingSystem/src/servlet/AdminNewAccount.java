package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import db.Accounts;
/**
 * Servlet implementation class AdminNewAccount
 */
@WebServlet("/AdminNewAccount")
public class AdminNewAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminNewAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Successfully created new account/Go back to login page.<button>Back</button>").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String aadhar = request.getParameter("aadhar");
		String accno = request.getParameter("accno");
		String name = request.getParameter("name");
		String acctype = request.getParameter("acctype");
		String password = request.getParameter("password");
		Accounts a;
		try {
			a = new Accounts();
			a.insert(Integer.parseInt(accno), name, acctype, 0, password, aadhar);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Successfully created new Account. go back.").append(request.getContextPath());
		response.sendRedirect("AdminAllAccounts.jsp");
	}

}
