package Model;

import java.util.Objects;

/**
 *
 * @author Javicuc
 */
public class Profesor {
    private int ID_Profesor;
    private String Nombre;
    private String Departamento;
    private String FK_Universidad;
    
    public Profesor(){
        
    }

    public Profesor(int ID_Profesor, String Nombre, String Departamento, String FK_Universidad) {
        this.ID_Profesor = ID_Profesor;
        this.Nombre = Nombre;
        this.Departamento = Departamento;
        this.FK_Universidad = FK_Universidad;
    }

    public Profesor(String Nombre, String fku) {
        this.Nombre = Nombre;
        this.FK_Universidad = fku;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public int getID_Profesor() {
        return ID_Profesor;
    }

    public void setID_Profesor(int ID_Profesor) {
        this.ID_Profesor = ID_Profesor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFK_Universidad() {
        return FK_Universidad;
    }

    public void setFK_Universidad(String FK_Universidad) {
        this.FK_Universidad = FK_Universidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.ID_Profesor;
        hash = 83 * hash + Objects.hashCode(this.Nombre);
        hash = 83 * hash + Objects.hashCode(this.FK_Universidad);
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
        final Profesor other = (Profesor) obj;
        if (this.ID_Profesor != other.ID_Profesor) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.FK_Universidad, other.FK_Universidad)) {
            return false;
        }
        return true;
    }
    
    
}
