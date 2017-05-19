/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.InterfaceDAO.iSolicitudDAO;
import Model.Solicitud;
import SQL.Tablas.COLSOLICITUD;
import SQL.Tablas.Tabla;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javilubz
 */
public class SolicitudDAO implements iSolicitudDAO{

    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.SOLICITUD + " (" + COLSOLICITUD.ASUNTO + ", " + COLSOLICITUD.DESCRIPCION + ", " + COLSOLICITUD.FECHAHORA 
            + ", " + COLSOLICITUD.FK_PROFESOR + ", " + COLSOLICITUD.FK_Aula +") "+ "VALUES (?,?,?,?,?)";
    final String UPDATE = "UPDATE "+ Tabla.SOLICITUD + " SET " + COLSOLICITUD.ASUNTO + " = ?, " + COLSOLICITUD.DESCRIPCION + " = ?, " 
            + COLSOLICITUD.FECHAHORA + " = ?, " + COLSOLICITUD.FK_PROFESOR + " = ?, " + COLSOLICITUD.FK_Aula  + " = ? WHERE " 
            + COLSOLICITUD.ID_SOLICITUD + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.SOLICITUD + " ORDER BY " + COLSOLICITUD.ID_SOLICITUD;
    final String GETONE = "SELECT * FROM " + Tabla.SOLICITUD + " WHERE " + COLSOLICITUD.ID_SOLICITUD + " = ? ";
    final String DELETE = "DELETE FROM " + Tabla.SOLICITUD + " WHERE " + COLSOLICITUD.ID_SOLICITUD + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.SOLICITUD + " ORDER BY %s";
    final String GETLAST = "SELECT * FROM Solicitud ORDER BY ID_Solicitud DESC LIMIT 1";
    public SolicitudDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Solicitud obj) throws SQLException {
        boolean insertar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setString(1, obj.getAsunto());
            ps.setString(2, obj.getDescripcion());
            ps.setTimestamp(3, obj.getFechaHora());
            ps.setInt(4, obj.getFK_Profesor());
            ps.setString(5, obj.getFK_Aula());
            ps.executeUpdate();
            insertar = true;
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch(SQLException e) {
                    throw new SQLException(e);
                }
            }
        }
        return insertar;
    }

    @Override
    public List<Solicitud> readAll() throws SQLException {
        List<Solicitud> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = con.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Solicitud obj = convertirRS(rs);
                list.add(obj);
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }finally{
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }    
            }
        }
        return list;
    }

    @Override
    public List<Solicitud> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Solicitud raadByID(int primaryKey) throws SQLException {
        Solicitud obj = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(GETONE);
            ps.setInt(1, primaryKey);
            rs = ps.executeQuery();
            while (rs.next()) 
                obj = convertirRS(rs);
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }    
            }
        }
        return obj;
    }

    @Override
    public boolean update(Solicitud obj) throws SQLException {
        boolean actualizar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(UPDATE);
            ps.setString(1, obj.getAsunto());
            ps.setString(2, obj.getDescripcion());
            ps.setTimestamp(3, obj.getFechaHora());
            ps.setInt(4, obj.getFK_Profesor());
            ps.setString(5, obj.getFK_Aula());
            ps.setInt(6, obj.getID_Solicitud());
            ps.executeUpdate();
            actualizar = true;
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch(SQLException e) {
                    throw new SQLException(e);
                }
            }
        }
        return actualizar;
    }

    @Override
    public boolean delete(Solicitud obj) throws SQLException {
        boolean eliminar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setInt(1, obj.getID_Solicitud());
            if(ps.executeUpdate() != 0)
                eliminar = true;
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch(SQLException e) {
                    throw new SQLException(e);
                }
            }
        }
        return eliminar;
    }

    @Override
    public boolean deleteByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alreadyExisting(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alreadyExisting(Solicitud obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Solicitud convertirRS(ResultSet rs) {
        Solicitud obj = null;
        try {
            int    id_sol = rs.getInt(COLSOLICITUD.ID_SOLICITUD);
            String asunto = rs.getString(COLSOLICITUD.ASUNTO);
            String desc   = rs.getString(COLSOLICITUD.DESCRIPCION);
            Timestamp fh  = rs.getTimestamp(COLSOLICITUD.FECHAHORA);
            int    idprof = rs.getInt(COLSOLICITUD.FK_PROFESOR);
            String idAula = rs.getString(COLSOLICITUD.FK_Aula);
            obj = new Solicitud(id_sol, asunto, desc, fh, idprof, idAula);
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public Solicitud getLastID() throws SQLException{
        Solicitud obj = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(GETLAST);
            rs = ps.executeQuery();
            while (rs.next()) 
                obj = convertirRS(rs);
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }    
            }
        }
        return obj;
    }
}
