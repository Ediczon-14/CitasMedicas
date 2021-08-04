/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidad.Doctor;
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
public class ModeloDoctor {
    public Doctor iniciarSesion(String log,String pas)
    {
		Doctor obj=null;
		Connection cn=null;
		ResultSet rs=null;
		PreparedStatement pstm=null;
		try 
                {
                    String sql="select * from doctor where userDoc=? and passwordDoc=?";
                    cn=MysqlDBConexion.getConexion();
                    pstm=cn.prepareStatement(sql);
                    pstm.setString(1, log);
                    pstm.setString(2, pas);
                    rs=pstm.executeQuery();
                    if(rs.next())
                    {
                        obj=new Doctor();
                        obj.setCodDoc(rs.getInt(1));
                        obj.setNomDoc(rs.getString(2));
                        obj.setApeDoc(rs.getString(3));
                        obj.setFecDoc(rs.getString(4));
                        obj.setDniDoc(rs.getInt(5));
                        obj.setUserDoc(rs.getString(6));
                        obj.setPasswordDoc(rs.getString(7));
                        obj.setIdEsp(rs.getInt(8));
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
    public List<Doctor> listarDoctor()
    {   Doctor alu=null;
        List<Doctor> data=new ArrayList<Doctor>();
        Connection cn=null;
        ResultSet rs=null;
        PreparedStatement pstm=null;
        try 
        {   cn=MysqlDBConexion.getConexion();
            String sql="select * from doctor";
            pstm=cn.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next())
            {   alu=new Doctor();
                alu.setCodDoc(rs.getInt("idDoctor"));
                alu.setNomDoc(rs.getString("nomDoc"));
                alu.setApeDoc(rs.getString("apeDoc"));
                alu.setFecDoc(rs.getString("fecDoc"));
                alu.setDniDoc(rs.getInt("dniDoc"));
                alu.setUserDoc(rs.getString("userDoc"));
                alu.setPasswordDoc(rs.getString("passwordDoc"));
                alu.setIdEsp(rs.getInt("idEsp"));
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
    public int insertaDoctor(Doctor obj)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			
			conn = MysqlDBConexion.getConexion();
			String sql ="insert into doctor values(null,?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getNomDoc());
                        pstm.setString(2, obj.getApeDoc());
			pstm.setString(3, obj.getFecDoc());
                        pstm.setInt(4, obj.getDniDoc());
                        pstm.setString(5, obj.getUserDoc());
                        pstm.setString(6, obj.getPasswordDoc());
                        pstm.setInt(7, obj.getIdEsp());
                        
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
	public Doctor buscaDoctor(int idDoctor)
	{
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Doctor obj = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="select * from doctor where idDoctor=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idDoctor);
			rs = pstm.executeQuery();
			if(rs.next()){
				obj = new Doctor();
				obj.setCodDoc(rs.getInt("idDoctor"));
				obj.setNomDoc(rs.getString("nomDoc"));
                                obj.setApeDoc(rs.getString("apeDoc"));
                                obj.setFecDoc(rs.getString("fecDoc"));
                                obj.setDniDoc(rs.getInt("dniDoc"));
                                obj.setUserDoc(rs.getString("userDoc"));
                                obj.setPasswordDoc(rs.getString("passwordDoc"));
                                obj.setIdEsp(rs.getInt("idEsp"));
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
	
	public int eliminaDoctor(int idDoc)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="delete from doctor where idDoctor=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idDoc);
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
	
	public int actualizaDoctor(Doctor obj){
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="update doctor set nomDoc=?, apeDoc=?, fecDoc=?, dniDoc=?, userDoc=?, passwordDoc=?, idEsp=? where idDoctor=?";     
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getNomDoc());
                        pstm.setString(2, obj.getApeDoc());
                        pstm.setString(3, obj.getFecDoc());
                        pstm.setInt(4, obj.getDniDoc());
			pstm.setString(5, obj.getUserDoc());
                        pstm.setString(6, obj.getPasswordDoc());
                        pstm.setInt(7, obj.getIdEsp());
                        pstm.setInt(8, obj.getCodDoc());
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
