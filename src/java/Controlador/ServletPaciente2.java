/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Paciente;
import Modelo.ModeloPaciente;
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
@WebServlet(name = "ServletPaciente2", urlPatterns = {"/ServletPaciente2"})
public class ServletPaciente2 extends HttpServlet {

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
            out.println("<title>Servlet ServletPaciente2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPaciente2 at " + request.getContextPath() + "</h1>");
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
        List<Paciente> info=new ModeloPaciente().listarPaciente();
        request.setAttribute("data", info);
        request.getRequestDispatcher("listarPaciente.jsp").forward(request, response);
    }

    
    protected void registrar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		
                String nomPac = request.getParameter("nomPac");
                String apePac = request.getParameter("apePac");
                String fecPac = request.getParameter("fecPac");
                String dniPac = request.getParameter("dniPac");
                String userPac = request.getParameter("userPac");
                String passwordPac = request.getParameter("passwordPac");
                String correoPac = request.getParameter("correoPac");
                
		//se Crea el objeto cursos
		Paciente a = new Paciente();
		
                a.setNomPac(nomPac);
                a.setApePac(apePac);
                a.setFecPac(fecPac);
                a.setDniPac(Integer.parseInt(dniPac));
                a.setUserPac(userPac);
                a.setPasswordPac(passwordPac);
                a.setCorreoPac(correoPac);
                
		//Se inserta a la BD el curso
		ModeloPaciente model = new ModeloPaciente();
		model.insertaPaciente(a);
		
		//Se lista todos los cursos
		request.getRequestDispatcher("loginPaciente.jsp").forward(request,response);
		
	}
     
    protected void actualizar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		//Se obtiene los parametros}
                String nomPac = request.getParameter("nomPac");
                String apePac = request.getParameter("apePac");
                String fecPac = request.getParameter("fecPac");
                String dniPac = request.getParameter("dniPac");
                String userPac = request.getParameter("userPac");
                String passwordPac = request.getParameter("passwordPac");
                String correoPac = request.getParameter("correoPac");
                
		String id = request.getParameter("id");
		
		//se Crea el objeto cursos
		Paciente a = new Paciente();
		a.setCodPac(Integer.parseInt(id));
		a.setNomPac(nomPac);
                a.setApePac(apePac);
                a.setFecPac(fecPac);
                a.setDniPac(Integer.parseInt(dniPac));
                a.setUserPac(userPac);
                a.setPasswordPac(passwordPac);
                a.setCorreoPac(correoPac);
		
		//Se inserta a la BD el cursos
		ModeloPaciente model = new ModeloPaciente();
		model.actualizaPaciente(a);
				
		//Se lista todos los cursos
		listar(request, response);
				
	}
	protected void buscar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		String id = request.getParameter("id");
		
		//Se inserta a la BD el cursos
		ModeloPaciente model = new ModeloPaciente();
		Paciente a = model.buscaPaciente(Integer.parseInt(id));
		
		//Se almacena en memoria llamada request
		request.setAttribute("data",a);
			
		//Se reenvia el request(con los datos) al jsp listaCursos.jsp
		request.getRequestDispatcher("/actualizaPaciente.jsp").forward(request, response);
				
	}
	protected void eliminar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		String id = request.getParameter("id");
		
		//Se inserta a la BD el cursos
		ModeloPaciente model = new ModeloPaciente();
		model.eliminaPaciente(Integer.parseInt(id));
		
		//Se lista todos los cursos
		listar(request, response);
	}
}
