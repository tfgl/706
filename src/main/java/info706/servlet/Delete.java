package info706.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info706.ejb.ColisBean;

@WebServlet("/Delete")
public class Delete extends HttpServlet {

	@EJB
	private ColisBean ejb;
	
	public Delete() {
		super();
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id = Integer.parseInt( request.getParameter("id") );

		ejb.deleteColis(id);
		request.getRequestDispatcher("/Progression").forward(request, response);
	}

}
