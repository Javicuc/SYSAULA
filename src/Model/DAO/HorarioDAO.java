/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Horario;
import Model.InterfaceDAO.iHorarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import SQL.Tablas.COLHORARIO;
import SQL.Tablas.Tabla;
import java.sql.Time;

/**
 *
 * @author javilubz
 */
public class HorarioDAO implements iHorarioDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.HORARIO + " (" + COLHORARIO.HORA_INICIO + ", " + COLHORARIO.HORA_FINAL + ", " + COLHORARIO.DIA 
            + ", " + COLHORARIO.FK_MATERIA + ") VALUES (?,?,?,?)";
    final String UPDATE = "UPDATE "+ Tabla.HORARIO + " SET " + COLHORARIO.HORA_INICIO + " = ?, " + COLHORARIO.HORA_FINAL + " = ?, " + COLHORARIO.DIA 
            + " = ?, "+ COLHORARIO.FK_MATERIA + " = ? WHERE " + COLHORARIO.ID_HORARIO + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.HORARIO + " ORDER BY " + COLHORARIO.ID_HORARIO;
    final String GETONE = "SELECT * FROM " + Tabla.HORARIO + " WHERE " + COLHORARIO.ID_HORARIO + " = ?";
    final String DELETE = "DELETE FROM " + Tabla.HORARIO + " WHERE " + COLHORARIO.ID_HORARIO + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.HORARIO + " ORDER BY %s";
    
    public HorarioDAO(Connection con){
        this.con = con;
    }

    @Override
    public boolean crear(Horario obj) throws SQLException {
        boolean insertar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setTime(1, obj.getHora_Inicio());
            ps.setTime(2, obj.getHora_Final());
            ps.setString(3, obj.getDia());
            ps.setInt(4, obj.getFK_Materia());
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
    public List<Horario> readAll() throws SQLException {
        List<Horario> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Horario hor = convertirRS(rs);
                list.add(hor);
            }
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
        return list;
    }

    @Override
    public List<Horario> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Horario raadByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Horario obj) throws SQLException {
        boolean actualizar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(UPDATE);
            ps.setTime(1, obj.getHora_Inicio());
            ps.setTime(2, obj.getHora_Final());
            ps.setString(3, obj.getDia());
            ps.setInt(4, obj.getFK_Materia());
            ps.setInt(5, obj.getID_Horario());
            if(ps.executeUpdate() != 0)
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
    public boolean delete(Horario obj) throws SQLException {
        boolean eliminar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setInt(1, obj.getID_Horario());
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
    public boolean alreadyExisting(Horario obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Horario convertirRS(ResultSet rs){
        Horario horario = null;
        try {
            int    id  = rs.getInt(COLHORARIO.ID_HORARIO);
            Time   hri = rs.getTime(COLHORARIO.HORA_INICIO);
            Time   hrf = rs.getTime(COLHORARIO.HORA_FINAL);
            String dia = rs.getString(COLHORARIO.DIA);
            int    fkm = rs.getInt(COLHORARIO.FK_MATERIA);
            horario = new Horario(id, hri, hrf, dia, fkm);
        } catch (SQLException ex) {
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return horario;
    }
}
