/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Doctor;
import Modelo.ModeloDoctor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edicz
 */
@WebServlet(name = "ServletDoctor2", urlPatterns = {"/ServletDoctor2"})
public class ServletDoctor2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletDoctor2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletDoctor2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException 
    {
        String tipo=request.getParameter("tipo");
        if(tipo.equals("listar"))
            listar(request,response);
        	if(tipo.equals("registrar"))
		{
			registrar(request, response);
		}
		else if(tipo.equals("listar"))
			{
				listar(request, response);
			}
			else if(tipo.equals("actualizar"))
				{
					actualizar(request, response);
				}
				else if(tipo.equals("buscar"))
					{
						buscar(request, response);
					}
					else if(tipo.equals("eliminar"))
						{
							eliminar(request, response);
						}
    }
    private void listar(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        List<Doctor> info=new ModeloDoctor().listarDoctor();
        request.setAttribute("data", info);
        request.getRequestDispatcher("listarDoctor.jsp").forward(request, response);
    }

    
    protected void registrar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		
                String nomDoc = request.getParameter("nomDoc");
                String apeDoc = request.getParameter("apeDoc");
                String fecDoc = request.getParameter("fecDoc");
                String dniDoc = request.getParameter("dniDoc");
                String userDoc = request.getParameter("userDoc");
                String passwordDoc = request.getParameter("passwordDoc");
                String idEsp = request.getParameter("idEsp");
                
		//se Crea el objeto cursos
		Doctor a = new Doctor();
		
                a.setNomDoc(nomDoc);
                a.setApeDoc(apeDoc);
                a.setFecDoc(fecDoc);
                a.setDniDoc(Integer.parseInt(dniDoc));
                a.setUserDoc(userDoc);
                a.setPasswordDoc(passwordDoc);
                a.setIdEsp(Integer.parseInt(idEsp));
                
		//Se inserta a la BD el curso
		ModeloDoctor model = new ModeloDoctor();
		model.insertaDoctor(a);
		
		//Se lista todos los cursos
		listar(request, response);
		
	}
     
    protected void actualizar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		//Se obtiene los parametros}
                String nomDoc = request.getParameter("nomDoc");
                String apeDoc = request.getParameter("apeDoc");
                String fecDoc = request.getParameter("fecDoc");
                String dniDoc = request.getParameter("dniDoc");
                String userDoc = request.getParameter("userDoc");
                String passwordDoc = request.getParameter("passwordDoc");
                String idEsp = request.getParameter("idEsp");
                
		String id = request.getParameter("id");
		
		//se Crea el objeto cursos
		Doctor a = new Doctor();
		a.setCodDoc(Integer.parseInt(id));
		a.setNomDoc(nomDoc);
                a.setApeDoc(apeDoc);
                a.setFecDoc(fecDoc);
                a.setDniDoc(Integer.parseInt(dniDoc));
                a.setUserDoc(userDoc);
                a.setPasswordDoc(passwordDoc);
                a.setIdEsp(Integer.parseInt(idEsp));
		
		//Se inserta a la BD el cursos
		ModeloDoctor model = new ModeloDoctor();
		model.actualizaDoctor(a);
				
		//Se lista todos los cursos
		listar(request, response);
				
	}
	protected void buscar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		String id = request.getParameter("id");
		
		//Se inserta a la BD el cursos
		ModeloDoctor model = new ModeloDoctor();
		Doctor a = model.buscaDoctor(Integer.parseInt(id));
		
		//Se almacena en memoria llamada request
		request.setAttribute("data",a);
			
		//Se reenvia el request(con los datos) al jsp listaCursos.jsp
		request.getRequestDispatcher("/actualizaDoctor.jsp").forward(request, response);
				
	}
	protected void eliminar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		String id = request.getParameter("id");
		
		//Se inserta a la BD el cursos
		ModeloDoctor model = new ModeloDoctor();
		model.eliminaDoctor(Integer.parseInt(id));
		
		//Se lista todos los cursos
		listar(request, response);
	}
}
