/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.InterfaceDAO.iLista_HorariosDAO;
import Model.Lista_Horarios;
import Model.TablaAulas;
import SQL.Tablas.Tabla;
import SQL.Tablas.COLLISTAHORARIOS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javilubz
 */
public class Lista_HorariosDAO implements iLista_HorariosDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.LISTA_HORARIOS + " (" + COLLISTAHORARIOS.FK_AULA + ", " + COLLISTAHORARIOS.FK_MATERIA + ", " 
            + COLLISTAHORARIOS.FK_PROFESOR + ", " + COLLISTAHORARIOS.STATUS + ") VALUES (?,?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.LISTA_HORARIOS + " SET " + COLLISTAHORARIOS.STATUS + " = ? WHERE " 
            + COLLISTAHORARIOS.FK_AULA + " = ? AND " + COLLISTAHORARIOS.FK_MATERIA + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.LISTA_HORARIOS + " ORDER BY " + COLLISTAHORARIOS.STATUS;
    final String GETONE = "SELECT * FROM " + Tabla.LISTA_HORARIOS + " WHERE " + COLLISTAHORARIOS.ID_LISTAHORARIO + " = ?";
    final String DELETE = "DELETE FROM " + Tabla.LISTA_HORARIOS +" WHERE " + COLLISTAHORARIOS.ID_LISTAHORARIO + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.LISTA_HORARIOS + " ORDER BY %s";
    final String GETTABLAAULAS = "SELECT Materia.ID_NRC,Materia.Clave,Materia.Nombre,Horario.Hora_Inicio,"
            + "Horario.Hora_Final,Horario.Dia,Aula.Numero,Lista_Horarios.Estado,Lista_Horarios.ID_ListaHorario "
            + "FROM Materia INNER JOIN Horario ON Materia.ID_NRC = Horario.FK_Materia "
            + "INNER JOIN Lista_Horarios ON Materia.ID_NRC = Lista_Horarios.FK_Materia "
            + "INNER JOIN Aula ON Lista_Horarios.FK_Aula = Aula.ID_Aula "
            + "WHERE Aula.FK_Edificio = ? AND Horario.Hora_Inicio >= ? AND Horario.Hora_Final <= ? "
            + "AND Horario.Dia LIKE ? ORDER BY Aula.Numero, Horario.Hora_Inicio";
    
    public Lista_HorariosDAO(Connection con){
        this.con = con;
    }
    @Override
    public boolean crear(Lista_Horarios obj) throws SQLException {
        boolean insertar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setString(1, obj.getFK_Aula());
            ps.setInt(2, obj.getFK_Materia());
            ps.setInt(3, obj.getFK_Profesor());
            ps.setByte(4, obj.getStatus());
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
    public List<Lista_Horarios> readAll() throws SQLException {
        List<Lista_Horarios> list = new ArrayList<Lista_Horarios>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Lista_Horarios obj = convertirRS(rs);
                list.add(obj);
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
    public List<Lista_Horarios> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lista_Horarios raadByID(int primaryKey) throws SQLException {
        Lista_Horarios obj = null;
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
    public boolean update(Lista_Horarios obj) throws SQLException {
        boolean actualizar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(UPDATE);
            ps.setInt(1, obj.getStatus());
            ps.setString(2, obj.getFK_Aula());
            ps.setInt(3, obj.getFK_Materia());
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
    public boolean delete(Lista_Horarios obj) throws SQLException {
        boolean eliminar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setInt(1, obj.getID_ListaHorario());
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
    public boolean alreadyExisting(Lista_Horarios obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Lista_Horarios convertirRS(ResultSet rs) {
        Lista_Horarios obj = null;
        try {
            int id     = rs.getInt(COLLISTAHORARIOS.ID_LISTAHORARIO);
            String fka = rs.getString(COLLISTAHORARIOS.FK_AULA);
            int fkm    = rs.getInt(COLLISTAHORARIOS.FK_MATERIA);
            int fkp    = rs.getInt(COLLISTAHORARIOS.FK_PROFESOR);
            byte stat  = rs.getByte(COLLISTAHORARIOS.STATUS);
            obj = new Lista_Horarios(id,fka,fkm,fkp,stat);
        } catch (SQLException ex) {
            Logger.getLogger(Lista_Horarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public List<TablaAulas> getTablaAulas(String edificio, Time HRi, Time HRf, String dia) throws SQLException{
        List<TablaAulas> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(GETTABLAAULAS);
            ps.setString(1, edificio);
            ps.setTime(2, HRi);
            ps.setTime(3, HRf);
            ps.setString(4, "%"+dia+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                TablaAulas obj = convertirAulaRS(rs);
                list.add(obj);
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
    private TablaAulas convertirAulaRS(ResultSet rs){
        TablaAulas obj = null;
        try {
            int id = rs.getInt("ID_NRC");
            String clave = rs.getString("Clave");
            String nombre = rs.getString("Nombre");
            Time hri = rs.getTime("Hora_Inicio");
            Time hrf = rs.getTime("Hora_Final");
            String dia = rs.getString("Dia");
            String aula = rs.getString("Numero");
            byte status = rs.getByte("Estado");
            int idLista = rs.getInt("ID_ListaHorario");
            obj = new TablaAulas(id, clave, nombre, hri, hrf, dia, aula, status, idLista);
        } catch (SQLException ex) {
            Logger.getLogger(Lista_Horarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
}
