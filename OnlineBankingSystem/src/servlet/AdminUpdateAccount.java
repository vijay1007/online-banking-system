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
 * Servlet implementation class AdminUpdateAccount
 */
@WebServlet("/AdminUpdateAccount")
public class AdminUpdateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String aadhar = request.getParameter("aadhar");
		int accno = Integer.parseInt(request.getParameter("accno"));
		String name = request.getParameter("name");
		String acctype = request.getParameter("acctype");
		String password = request.getParameter("password");
		try {
			Accounts a = new Accounts();
			a.update(accno, name, acctype, 0, password, aadhar);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Successfully updated").append(request.getContextPath());
		response.sendRedirect("AdminAllAccounts.jsp");
	}

}
