/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidad.Paciente;
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
public class ModeloPaciente {
    public Paciente iniciarSesion(String log,String pas)
    {
		Paciente obj=null;
		Connection cn=null;
		ResultSet rs=null;
		PreparedStatement pstm=null;
		try 
                {
                    String sql="select * from paciente where userPac=? and passwordPac=?";
                    cn=MysqlDBConexion.getConexion();
                    pstm=cn.prepareStatement(sql);
                    pstm.setString(1, log);
                    pstm.setString(2, pas);
                    rs=pstm.executeQuery();
                    if(rs.next())
                    {
                        obj=new Paciente();
                        obj.setCodPac(rs.getInt(1));
                        obj.setNomPac(rs.getString(2));
                        obj.setApePac(rs.getString(3));
                        obj.setFecPac(rs.getString(4));
                        obj.setDniPac(rs.getInt(5));
                        obj.setUserPac(rs.getString(6));
                        obj.setPasswordPac(rs.getString(7));
                        obj.setCorreoPac(rs.getString(8));
                    }
		} catch (Exception e) 
                {
                    e.printStackTrace();
		}
		finally
                {
                    try 
                    {
                        if(rs!=null)rs.close();
                        if(pstm!=null)pstm.close();
                        if(cn!=null)cn.close();
                    } 
                    catch (Exception e2) 
                    {
                        e2.printStackTrace();
                    }
		}
		return obj;
	}
    public List<Paciente> listarPaciente()
    {   Paciente alu=null;
        List<Paciente> data=new ArrayList<Paciente>();
        Connection cn=null;
        ResultSet rs=null;
        PreparedStatement pstm=null;
        try 
        {   cn=MysqlDBConexion.getConexion();
            String sql="select * from paciente";
            pstm=cn.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next())
            {   alu=new Paciente();
                alu.setCodPac(rs.getInt("idPaciente"));
                alu.setNomPac(rs.getString("nomPac"));
                alu.setApePac(rs.getString("apePac"));
                alu.setFecPac(rs.getString("fecPac"));
                alu.setDniPac(rs.getInt("dniPac"));
                alu.setUserPac(rs.getString("userPac"));
                alu.setPasswordPac(rs.getString("passwordPac"));
                alu.setCorreoPac(rs.getString("correoPac"));
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
    public int insertaPaciente(Paciente obj)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			
			conn = MysqlDBConexion.getConexion();
			String sql ="insert into paciente values(null,?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getNomPac());
                        pstm.setString(2, obj.getApePac());
			pstm.setString(3, obj.getFecPac());
                        pstm.setInt(4, obj.getDniPac());
                        pstm.setString(5, obj.getUserPac());
                        pstm.setString(6, obj.getPasswordPac());
                        pstm.setString(7, obj.getCorreoPac());
                        
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
	public Paciente buscaPaciente(int idPaciente)
	{
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Paciente obj = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="select * from paciente where idPaciente=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPaciente);
			rs = pstm.executeQuery();
			if(rs.next()){
				obj = new Paciente();
				obj.setCodPac(rs.getInt("idPaciente"));
				obj.setNomPac(rs.getString("nomPac"));
                                obj.setApePac(rs.getString("apePac"));
                                obj.setFecPac(rs.getString("fecPac"));
                                obj.setDniPac(rs.getInt("dniPac"));
                                obj.setUserPac(rs.getString("userPac"));
                                obj.setPasswordPac(rs.getString("passwordPac"));
                                obj.setCorreoPac(rs.getString("correoPac"));
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
	
	public int eliminaPaciente(int idPa)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="delete from paciente where idPaciente=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPa);
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
	
	public int actualizaPaciente(Paciente obj){
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="update paciente set nomPac=?, apePac=?, fecPac=?, dniPac=?, userPac=?, passwordPac=?, correoPac=? where idPaciente=?";     
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getNomPac());
                        pstm.setString(2, obj.getApePac());
                        pstm.setString(3, obj.getFecPac());
                        pstm.setInt(4, obj.getDniPac());
			pstm.setString(5, obj.getUserPac());
                        pstm.setString(6, obj.getPasswordPac());
                        pstm.setString(7, obj.getCorreoPac());
                        pstm.setInt(8, obj.getCodPac());
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
