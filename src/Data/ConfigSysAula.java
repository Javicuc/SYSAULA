/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author javilubz
 */
public class ConfigSysAula {
    private String Servidor;
    private String Puerto;
    private String Usuario;
    private String Clave;
    private String BaseDatos;
    private String Universidad;
    private String Calendario;
    private String OrdenConsulta;
    private String MostrarRegConsulta;

    public ConfigSysAula(String Servidor, String Puerto, String Usuario, String Clave, String BaseDatos, String Universidad, String Calendario, String OrdenConsulta, String MostrarRegConsulta) {
        this.Servidor = Servidor;
        this.Puerto = Puerto;
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.BaseDatos = BaseDatos;
        this.Universidad = Universidad;
        this.Calendario = Calendario;
        this.OrdenConsulta = OrdenConsulta;
        this.MostrarRegConsulta = MostrarRegConsulta;
    }

    public ConfigSysAula() {
    }

    @Override
    public String toString() {
        return "ConfigSysAula{" + "Servidor=" + Servidor + ", Puerto=" + Puerto + ", Usuario=" + Usuario + ", Clave=" + Clave + ", BaseDatos=" + BaseDatos + ", Universidad=" + Universidad + ", Calendario=" + Calendario + ", OrdenConsulta=" + OrdenConsulta + ", MostrarRegConsulta=" + MostrarRegConsulta + '}';
    }

    public String getServidor() {
        return Servidor;
    }

    public void setServidor(String Servidor) {
        this.Servidor = Servidor;
    }

    public String getPuerto() {
        return Puerto;
    }

    public void setPuerto(String Puerto) {
        this.Puerto = Puerto;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getBaseDatos() {
        return BaseDatos;
    }

    public void setBaseDatos(String BaseDatos) {
        this.BaseDatos = BaseDatos;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getCalendario() {
        return Calendario;
    }

    public void setCalendario(String Calendario) {
        this.Calendario = Calendario;
    }

    public String getOrdenConsulta() {
        return OrdenConsulta;
    }

    public void setOrdenConsulta(String OrdenConsulta) {
        this.OrdenConsulta = OrdenConsulta;
    }

    public String getMostrarRegConsulta() {
        return MostrarRegConsulta;
    }

    public void setMostrarRegConsulta(String MostrarRegConsulta) {
        this.MostrarRegConsulta = MostrarRegConsulta;
    }
}
