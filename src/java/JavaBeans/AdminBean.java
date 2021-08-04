/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;
import Entidad.Admin;
/**
 *
 * @author edicz
 */
public class AdminBean {
    public AdminBean() 
    {
    }
    private int codAdmin;
    private String usuario;
    private String nombre;
    private String apellido;
    private String clave;

    public int getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(int codAdmin) {
        this.codAdmin = codAdmin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
