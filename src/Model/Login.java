/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author javilubz
 */
public class Login {
    private int ID_Login;
    private String Usuario;
    private String Clave;

    public Login(int ID_Login, String Usuario, String Clave) {
        this.ID_Login = ID_Login;
        this.Usuario = Usuario;
        this.Clave = Clave;
    }

    public Login() {
    }

    @Override
    public String toString() {
        return "Login{" + "ID_Login=" + ID_Login + ", Usuario=" + Usuario + ", Clave=" + Clave + '}';
    }

    public int getID_Login() {
        return ID_Login;
    }

    public void setID_Login(int ID_Login) {
        this.ID_Login = ID_Login;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.ID_Login;
        hash = 83 * hash + Objects.hashCode(this.Usuario);
        hash = 83 * hash + Objects.hashCode(this.Clave);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (this.ID_Login != other.ID_Login) {
            return false;
        }
        if (!Objects.equals(this.Usuario, other.Usuario)) {
            return false;
        }
        if (!Objects.equals(this.Clave, other.Clave)) {
            return false;
        }
        return true;
    }
    
    
}
