/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author edicz
 */
public class Citas {
    private String fechaCit,duracionCit,horaCit,precio;
    private int idCit,idDoctor,idPaciente;

    public String getFechaCit() {
        return fechaCit;
    }

    public void setFechaCit(String fechaCit) {
        this.fechaCit = fechaCit;
    }

    public String getDuracionCit() {
        return duracionCit;
    }

    public void setDuracionCit(String duracionCit) {
        this.duracionCit = duracionCit;
    }

    public String getHoraCit() {
        return horaCit;
    }

    public void setHoraCit(String horaCit) {
        this.horaCit = horaCit;
    }

    public int getIdCit() {
        return idCit;
    }

    public void setIdCit(int idCit) {
        this.idCit = idCit;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
}
