/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidad.Admin;
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
public class ModeloAdmin {
    public Admin iniciarSesion(String log,String pas)
    {
		Admin obj=null;
		Connection cn=null;
		ResultSet rs=null;
		PreparedStatement pstm=null;
		try 
                {
                    String sql="select * from administrador where usuario=? and clave=?";
                    cn=MysqlDBConexion.getConexion();
                    pstm=cn.prepareStatement(sql);
                    pstm.setString(1, log);
                    pstm.setString(2, pas);
                    rs=pstm.executeQuery();
                    if(rs.next())
                    {
                        obj=new Admin();
                        obj.setCodAdmin(rs.getInt(1));
                        obj.setUsuario(rs.getString(2));
                        obj.setClave(rs.getString(3));
                        obj.setNombre(rs.getString(4));
                        obj.setApellido(rs.getString(5));
                        
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
    public List<Admin> listarAdmin()
    {   Admin alu=null;
        List<Admin> data=new ArrayList<Admin>();
        Connection cn=null;
        ResultSet rs=null;
        PreparedStatement pstm=null;
        try 
        {   cn=MysqlDBConexion.getConexion();
            String sql="select * from administrador";
            pstm=cn.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next())
            {   alu=new Admin();
                alu.setCodAdmin(rs.getInt("idAdmin"));
                alu.setUsuario(rs.getString("usuario"));
                alu.setClave(rs.getString("clave"));
                alu.setNombre(rs.getString("nombre"));
                alu.setApellido(rs.getString("apellido"));
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
    public int insertaAdmin(Admin obj)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			
			conn = MysqlDBConexion.getConexion();
			String sql ="insert into administrador values(null,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getUsuario());
                        pstm.setString(2, obj.getClave());
			pstm.setString(3, obj.getNombre());
                        pstm.setString(4, obj.getApellido());
                        
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
	public Admin buscaAdmin(int idAdmin)
	{
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Admin obj = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="select * from administrador where idAdmin=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idAdmin);
			rs = pstm.executeQuery();
			if(rs.next()){
				obj = new Admin();
				obj.setCodAdmin(rs.getInt("idAdmin"));
				obj.setNombre(rs.getString("nombre"));
                                obj.setApellido(rs.getString("apellido"));
                                obj.setUsuario(rs.getString("usuario"));
                                obj.setClave(rs.getString("clave"));
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
	
	public int eliminaAdmin(int idAd)
	{
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="delete from administrador where idAdmin=?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idAd);
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
	
	public int actualizaAdmin(Admin obj){
		int salida = -1;
		
		Connection conn= null;
		PreparedStatement pstm = null;
		try {
			conn = MysqlDBConexion.getConexion();
			String sql ="update administrador set usuario=?, clave=?, nombre=?, apellido=? where idAdmin=?";     
			pstm = conn.prepareStatement(sql);
                        pstm.setString(1, obj.getUsuario());
                        pstm.setString(2, obj.getClave());
                        pstm.setString(3, obj.getNombre());
                        pstm.setString(4, obj.getApellido());
			pstm.setInt(5, obj.getCodAdmin());
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
