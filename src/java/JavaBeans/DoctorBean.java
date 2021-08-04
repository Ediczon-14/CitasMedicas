/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

/**
 *
 * @author edicz
 */
public class DoctorBean {
    public DoctorBean() 
    {
    }
    private String nomDoc;
    private String apeDoc;
    private String fecDoc;
    private String userDoc;
    private String passwordDoc;
    private int idEsp;
    private int dniDoc;
    private int codDoc;

    public String getNomDoc() {
        return nomDoc;
    }

    public void setNomDoc(String nomDoc) {
        this.nomDoc = nomDoc;
    }

    public String getApeDoc() {
        return apeDoc;
    }

    public void setApeDoc(String apeDoc) {
        this.apeDoc = apeDoc;
    }

    public String getFecDoc() {
        return fecDoc;
    }

    public void setFecDoc(String fecDoc) {
        this.fecDoc = fecDoc;
    }

    public String getUserDoc() {
        return userDoc;
    }

    public void setUserDoc(String userDoc) {
        this.userDoc = userDoc;
    }

    public String getPasswordDoc() {
        return passwordDoc;
    }

    public void setPasswordDoc(String passwordDoc) {
        this.passwordDoc = passwordDoc;
    }

    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
    }

    public int getDniDoc() {
        return dniDoc;
    }

    public void setDniDoc(int dniDoc) {
        this.dniDoc = dniDoc;
    }

    public int getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(int codDoc) {
        this.codDoc = codDoc;
    }
}
