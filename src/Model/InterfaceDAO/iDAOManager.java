/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.DAO.*;

/**
 *
 * @author javilubz
 */
public interface iDAOManager {
    AulaDAO getAulaDAO();
    EdificioDAO getEdificioDAO();
    HorarioDAO getHorarioDAO();
    Lista_HorariosDAO getLista_HorariosDAO();
    MateriaDAO getMateriaDAO();
    ProfesorDAO getProfesorDAO();
    SolicitudDAO getSolicitudDAO();
    UniversidadDAO getUniversidadDAO();
    LoginDAO getLoginDAO();
}
