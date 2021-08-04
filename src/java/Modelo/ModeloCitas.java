/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidad.Citas;
import Entidad.DoctorEspecialidad;
import Entidad.Especialidad;
import Utils.MysqlDBConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edicz
 */
public class ModeloCitas {
    public List<Citas> listarCita()
    {   Citas alu=null;
        List<Citas> data=new ArrayList<Citas>();
        Connection cn=null;
        ResultSet rs=null;
        PreparedStatement pstm=null;
        try 
        {   cn=MysqlDBConexion.getConexion();
            String sql="select * from citas";
            pstm=cn.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next())
            {   alu=new Citas();
                alu.setIdCit(rs.getInt("idCit"));
                alu.setPrecio(rs.getString("precio"));
                alu.setFechaCit(rs.getString("fechaCit"));
                alu.setHoraCit(rs.getString("horaCit"));
                alu.setDuracionCit(rs.getString("duracionCit"));
                alu.setIdDoctor(rs.getInt("idDoctor"));
                alu.setIdPaciente(rs.getInt("idPaciente"));
                data.add(alu);
            }
        } catch (Exception e) 
            {   e.printStackTrace();
            }
        finally
        {  try 
            {   if(rs!=null)rs.close();
                if(pstm!=null)pstm.close();
                if(cn!=null)cn.close();
            } catch (Exception e2) 
                {   e2.printStackTrace();
                }
        }
        return data;
    }
    public List<DoctorEspecialidad> listarDoctorEspecialidad()
    {   DoctorEspecialidad alu=null;
        List<DoctorEspecialidad> data=new ArrayList<DoctorEspecialidad>();
        Connection cn=null;
        ResultSet rs=null;
        PreparedStatement pstm=null;
        try 
        {   cn=MysqlDBConexion.getConexion();
            String sql="select doctor.idDoctor, doctor.nomDoc, doctor.apeDoc, especialidad.especialidad from doctor inner join especialidad where doctor.idEsp = especialidad.idEsp";
            pstm=cn.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next())
            {   alu=new DoctorEspecialidad();
                alu.setIdDoc(rs.getInt("idDoctor"));
                alu.setNomDocEsp(rs.getString("nomDoc"));
                alu.setApeDocEsp(rs.getString("apeDoc"));
                alu.setDocEspecialidad(rs.getString("especialidad"));
                data.add(alu);
            }
        } catch (Exception e) 
            {   e.printStackTrace();
            }
        finally
        {  try 
            {   if(rs!=null)rs.close();
                if(pstm!=null)pstm.close();
                if(cn!=null)cn.close();
            } catch (Exception e2) 
                {   e2.printStackTrace();
                }
        }
        return data;
    }
    public List<Citas> listarCitaPaciente(int idPaciente)
	{
                List<Citas> data=new ArrayList<Citas>();
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Citas alu = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="select * from citas where idPaciente=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPaciente);
			rs = pstm.executeQuery();
                        while(rs.next())
                        {
                            alu=new Citas();
                            alu.setIdCit(rs.getInt("idCit"));
                            alu.setPrecio(rs.getString("precio"));
                            alu.setFechaCit(rs.getString("fechaCit"));
                            alu.setHoraCit(rs.getString("horaCit"));
                            alu.setDuracionCit(rs.getString("duracionCit"));
                            alu.setIdDoctor(rs.getInt("idDoctor"));
                            alu.setIdPaciente(rs.getInt("idPaciente"));
                            data.add(alu);
                        }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!= null) rs.close();
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return data;
	}
    public List<Citas> listarCitaDoctor(int idPaciente)
	{
                List<Citas> data=new ArrayList<Citas>();
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Citas alu = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="select * from citas where idDoctor=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPaciente);
			rs = pstm.executeQuery();
                        while(rs.next())
                        {
                            alu=new Citas();
                            alu.setIdCit(rs.getInt("idCit"));
                            alu.setPrecio(rs.getString("precio"));
                            alu.setFechaCit(rs.getString("fechaCit"));
                            alu.setHoraCit(rs.getString("horaCit"));
                            alu.setDuracionCit(rs.getString("duracionCit"));
                            alu.setIdDoctor(rs.getInt("idDoctor"));
                            alu.setIdPaciente(rs.getInt("idPaciente"));
                            data.add(alu);
                        }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!= null) rs.close();
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return data;
	}
    //SELECT * FROM `doctor` WHERE idEsp=1
    public int insertaCita(Citas obj)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			
			conn = MysqlDBConexion.getConexion();
			String sql ="insert into citas values(null,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getPrecio());
                        pstm.setString(2, obj.getFechaCit());
			pstm.setString(3, obj.getHoraCit());
                        pstm.setString(4, obj.getDuracionCit());
                        pstm.setInt(5, obj.getIdDoctor());
                        pstm.setInt(6, obj.getIdPaciente());
                        
			salida = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return salida;
	}
    public int insertaCitaRegistro(Citas obj)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			
			conn = MysqlDBConexion.getConexion();
			String sql ="insert into citas values(null,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getPrecio());
                        pstm.setString(2, obj.getFechaCit());
			pstm.setString(3, obj.getHoraCit());
                        pstm.setString(4, obj.getDuracionCit());
                        pstm.setInt(5, obj.getIdDoctor());
                        pstm.setInt(6, obj.getIdPaciente());
                        
			salida = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return salida;
	}
	public Citas buscaCita(int idCit)
	{
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Citas obj = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="select * from citas where idCit=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idCit);
			rs = pstm.executeQuery();
			if(rs.next()){
				obj = new Citas();
				obj.setIdCit(rs.getInt("idCit"));
				obj.setPrecio(rs.getString("precio"));
                                obj.setFechaCit(rs.getString("fechaCit"));
                                obj.setHoraCit(rs.getString("horaCit"));
                                obj.setDuracionCit(rs.getString("duracionCit"));
                                obj.setIdDoctor(rs.getInt("idDoctor"));
                                obj.setIdPaciente(rs.getInt("idPaciente"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!= null) rs.close();
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return obj;
	}
	
	public int eliminaCita(int idCit)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="delete from citas where idCit=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idCit);
			salida = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		return salida;
	}
	
	public int actualizaCita(Citas obj){
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="update citas set precio=?, fechaCit=?, horaCit=?, duracionCit=?, idDoctor=?, idPaciente=? where idCit=?";     
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getPrecio());
                        pstm.setString(2, obj.getFechaCit());
                        pstm.setString(3, obj.getHoraCit());
                        pstm.setString(4, obj.getDuracionCit());
			pstm.setInt(5, obj.getIdDoctor());
                        pstm.setInt(6, obj.getIdPaciente());
                        pstm.setInt(7, obj.getIdCit());
			salida = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		return salida;
	}
}
