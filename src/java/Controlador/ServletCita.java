/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Citas;
import Entidad.Doctor;
import Entidad.DoctorEspecialidad;
import Entidad.Especialidad;
import Modelo.ModeloCitas;
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
@WebServlet(name = "ServletCita", urlPatterns = {"/ServletCita"})
public class ServletCita extends HttpServlet {

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
            out.println("<title>Servlet ServletCita</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletCita at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
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
                        }else if(tipo.equals("listarCita"))
                            {
                                listarCita(request, response);
                            }else if(tipo.equals("listarCitaPaciente"))
                                {
                                    listarCitaPaciente(request, response);
                                }else if(tipo.equals("listarCitaDoctor"))
                                    {
                                        listarCitaDoctor(request, response);
                                    }else if(tipo.equals("listarRegistro"))
                                        {
                                            listarRegistro(request, response);
                                        }else if(tipo.equals("registrarRegistro"))
                                            {
                                                registrarRegistro(request, response);
                                            }
        
    }
    private void listar(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        List<DoctorEspecialidad> info3=new ModeloCitas().listarDoctorEspecialidad();
        request.setAttribute("data3", info3);
        request.getRequestDispatcher("registrarCitas.jsp").forward(request, response);
    }
    private void listarRegistro(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        List<DoctorEspecialidad> info3=new ModeloCitas().listarDoctorEspecialidad();
        request.setAttribute("data3", info3);
        request.getRequestDispatcher("insertaCita.jsp").forward(request, response);
    }
    private void listarCita(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        List<Citas> info=new ModeloCitas().listarCita();
        request.setAttribute("data", info);
        request.getRequestDispatcher("listarCita.jsp").forward(request, response);
    }
    protected void listarCitaPaciente(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		String id = request.getParameter("id");
		
		//Se inserta a la BD el cursos
		List<Citas> info = new ModeloCitas().listarCitaPaciente(Integer.parseInt(id));
		
		//Se almacena en memoria llamada request
		request.setAttribute("data",info);
			
		//Se reenvia el request(con los datos) al jsp listaCursos.jsp
		request.getRequestDispatcher("/listarCitaPaciente.jsp").forward(request, response);
				
	}
    protected void listarCitaDoctor(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		String id = request.getParameter("id");
		
		//Se inserta a la BD el cursos
		List<Citas> info = new ModeloCitas().listarCitaDoctor(Integer.parseInt(id));
		
		//Se almacena en memoria llamada request
		request.setAttribute("data",info);
			
		//Se reenvia el request(con los datos) al jsp listaCursos.jsp
		request.getRequestDispatcher("/listarCitaDoctor.jsp").forward(request, response);
				
	}
    
    protected void registrar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		
                String precio = request.getParameter("precio");
                String fechaCit = request.getParameter("fechaCit");
                String horaCit = request.getParameter("horaCit");
                String duracionCit = request.getParameter("duracionCit");
                String idDoctor = request.getParameter("idDoctor");
                String idPaciente = request.getParameter("idPaciente");
                
		//se Crea el objeto cursos
		Citas a = new Citas();
		
                a.setPrecio(precio);
                a.setFechaCit(fechaCit);
                a.setHoraCit(horaCit);
                a.setDuracionCit(duracionCit);
                a.setIdDoctor(Integer.parseInt(idDoctor));
                a.setIdPaciente(Integer.parseInt(idPaciente));
                
		//Se inserta a la BD el curso
		ModeloCitas model = new ModeloCitas();
		model.insertaCita(a);
		
		//Se lista todos los cursos
                request.getRequestDispatcher("registrarCitas.jsp").forward(request,response);
		
	}
    protected void registrarRegistro(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		
                String precio = request.getParameter("precio");
                String fechaCit = request.getParameter("fechaCit");
                String horaCit = request.getParameter("horaCit");
                String duracionCit = request.getParameter("duracionCit");
                String idDoctor = request.getParameter("idDoctor");
                String idPaciente = request.getParameter("idPaciente");
                
		//se Crea el objeto cursos
		Citas a = new Citas();
		
                a.setPrecio(precio);
                a.setFechaCit(fechaCit);
                a.setHoraCit(horaCit);
                a.setDuracionCit(duracionCit);
                a.setIdDoctor(Integer.parseInt(idDoctor));
                a.setIdPaciente(Integer.parseInt(idPaciente));
                
		//Se inserta a la BD el curso
		ModeloCitas model = new ModeloCitas();
		model.insertaCitaRegistro(a);
		
		//Se lista todos los cursos
                listarCita(request, response);
		
	}
     
    protected void actualizar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		//Se obtiene los parametros}
                String precio = request.getParameter("precio");
                String fechaCit = request.getParameter("fechaCit");
                String horaCit = request.getParameter("horaCit");
                String duracionCit = request.getParameter("duracionCit");
                String idDoctor = request.getParameter("idDoctor");
                String idPaciente = request.getParameter("idPaciente");
                
		String id = request.getParameter("id");
		
		//se Crea el objeto cursos
		Citas a = new Citas();
		a.setIdCit(Integer.parseInt(id));
                a.setPrecio(precio);
                a.setFechaCit(fechaCit);
                a.setHoraCit(horaCit);
                a.setDuracionCit(duracionCit);
                a.setIdDoctor(Integer.parseInt(idDoctor));
                a.setIdPaciente(Integer.parseInt(idPaciente));
		
		//Se inserta a la BD el cursos
		ModeloCitas model = new ModeloCitas();
		model.actualizaCita(a);
				
		//Se lista todos los cursos
		listarCita(request, response);
				
	}
	protected void buscar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		String id = request.getParameter("id");
		
		//Se inserta a la BD el cursos
		ModeloCitas model = new ModeloCitas();
		Citas a = model.buscaCita(Integer.parseInt(id));
		
		//Se almacena en memoria llamada request
		request.setAttribute("data",a);
			
		//Se reenvia el request(con los datos) al jsp listaCursos.jsp
		request.getRequestDispatcher("/actualizaCita.jsp").forward(request, response);
				
	}
	protected void eliminar(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Se obtiene los parametros
		String id = request.getParameter("id");
		
		//Se inserta a la BD el cursos
		ModeloCitas model = new ModeloCitas();
		model.eliminaCita(Integer.parseInt(id));
		
		//Se lista todos los cursos
		listarCita(request, response);
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

}
