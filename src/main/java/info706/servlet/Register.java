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

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ColisBean ejb;
	
	public Register() {
		super();
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double poids = Double.parseDouble( request.getParameter("poids") ),
			   valeur = Double.parseDouble( request.getParameter("valeur") ),
			   latitude = Double.parseDouble( request.getParameter("latitude") ),
			   longitude = Double.parseDouble( request.getParameter("longitude") );

		String origine = request.getParameter("origine"),
			   destination = request.getParameter("destination"),
			   emplacement = request.getParameter("emplacement"),
			   etat = "reigistered";
				
		ejb.registerColis(poids, valeur, latitude, longitude, origine, destination, emplacement, etat);
			
		request.setAttribute("colis", ejb.getAllColis());
		
		request.getRequestDispatcher("/progress.jsp").forward(request, response);
	}
}
