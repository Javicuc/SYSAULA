/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.InterfaceDAO.iDAOManager;
import SQL.BD_Conexion;
import java.sql.Connection;

/**
 *
 * @author javilubz
 */
public class DAOManager implements iDAOManager{
    
    private Connection con = null;
    
    private AulaDAO aulaDao = null;
    private EdificioDAO edificioDao = null;
    private HorarioDAO horarioDao = null;
    private Lista_HorariosDAO listaHorariosDao = null;
    private MateriaDAO materiaDao = null;
    private ProfesorDAO profesorDao = null;
    private SolicitudDAO solicitudDao = null;
    private UniversidadDAO universidadDao = null;
    private LoginDAO loginDao = null;
    
    public DAOManager(){
        this.con = BD_Conexion.getInstance();
    }
    
    @Override
    public AulaDAO getAulaDAO() {
        if(this.aulaDao == null)
            aulaDao = new AulaDAO(con);
        return aulaDao;
    }

    @Override
    public EdificioDAO getEdificioDAO() {
        if(this.edificioDao == null)
            edificioDao = new EdificioDAO(con);
        return edificioDao;
    }

    @Override
    public HorarioDAO getHorarioDAO() {
        if (this.horarioDao == null)
            horarioDao = new HorarioDAO(con);
        return horarioDao;
    }

    @Override
    public Lista_HorariosDAO getLista_HorariosDAO() {
        if(this.listaHorariosDao == null)
            listaHorariosDao = new Lista_HorariosDAO(con);
        return listaHorariosDao;
    }

    @Override
    public MateriaDAO getMateriaDAO() {
        if(this.materiaDao == null)
            materiaDao = new MateriaDAO(con);
        return materiaDao;
    }

    @Override
    public ProfesorDAO getProfesorDAO() {
        if(this.profesorDao == null)
            profesorDao = new ProfesorDAO(con);
        return profesorDao;
    }

    @Override
    public SolicitudDAO getSolicitudDAO() {
        if(this.solicitudDao == null)
            solicitudDao = new SolicitudDAO(con);
        return solicitudDao;
    }

    @Override
    public UniversidadDAO getUniversidadDAO() {
        if(this.universidadDao == null)
            universidadDao = new UniversidadDAO(con);
        return universidadDao;
    }

    @Override
    public LoginDAO getLoginDAO() {
        if(this.loginDao == null)
            loginDao = new LoginDAO(con);
        return loginDao;
    }
    
}
