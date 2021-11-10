package info706.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info706.ejb.ColisBean;
import info706.jpa.Colis;

@WebServlet("/Update")
public class Update extends HttpServlet {

	@EJB
	private ColisBean ejb;
	
	public Update() {
		super();
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id = Integer.parseInt( request.getParameter("id") );
		
		request.setAttribute("colis", ejb.getColis(id));
		request.getRequestDispatcher("/updateColis.jsp").forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id = Integer.parseInt( request.getParameter("id") );
		
		double latitude = Double.parseDouble( request.getParameter("latitude") ),
			   longitude = Double.parseDouble( request.getParameter("longitude") );
		
		String emplacement = request.getParameter("emplacement"),
			   etat = "registered";
		
		ejb.updateColis(id, latitude, longitude, emplacement, etat);
		
		request.getRequestDispatcher("Progression").forward(request, response);
	}
}
