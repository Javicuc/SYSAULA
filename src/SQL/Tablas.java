package SQL;

/**
 *
 * @author javilubz
 */
public class Tablas {
    public interface Tabla {
        String AULA           = "Aula";
        String EDIFICIO       = "Edificio";
        String HORARIO        = "Horario";
        String MATERIA        = "Materia";
        String PROFESOR       = "Profesor";
        String UNIVERSIDAD    = "Universidad";
        String LISTA_HORARIOS = "Lista_Horarios";
        String SOLICITUD      = "Solicitud";
        
    }
     
    interface ColumnasAula{
        String ID_AULA     = "ID_Aula";
        String NUMERO      = "Numero";
        String FK_EDIFICIO = "FK_Edificio";
    }
    interface ColumnasEdificio{
        String ID_NOMBRE      = "ID_Nombre";
        String FK_UNIVERSIDAD = "FK_Universidad";
    }
    interface ColumnasHorario{
        String ID_HORARIO  = "ID_Horario";
        String HORA_INICIO = "Hora_Inicio";
        String HORA_FINAL  = "Hora_Final";
        String DIA         = "Dia";
        String FK_MATERIA  = "FK_Materia";
    }
    interface ColumnasMateria{
        String ID_NRC = "ID_NRC";
        String CLAVE  = "Clave";
        String NOMBRE = "Nombre";
    }
    interface ColumnasProfesor{
        String ID_PROFESOR  = "ID_Profesor";
        String NOMBRE       = "Nombre";
        String DEPARTAMENTO = "Departamento";
        String FK_CENTRO    = "FK_Centro";
    }
    interface ColumnasUniversidad{
        String ID_CENTRO = "ID_Centro";
        String NOMBRE    = "Nombre";
        String ACRONIMO  = "Acronimo";
    }
    interface ColumnasListaHorarios{
        String ID_LISTAHORARIO = "ID_ListaHorario";
        String FK_AULA      = "FK_Aula";
        String FK_MATERIA   = "FK_Materia";
        String STATUS       = "Estado";
    }
    interface ColumnasSolicitud{
        String ID_SOLICITUD = "ID_Solicitud";
        String ASUNTO       = "Asunto";
        String DESCRIPCION  = "Descripcion";
        String FECHAHORA    = "FechaHora";
        String FK_PROFESOR  = "FK_Profesor";
        String FK_Aula      = "FK_Aula";
    }
    
    public static class COLAULA implements ColumnasAula{
        
    }
    public static class COLEDIFICIO implements ColumnasEdificio{
        
    }
    public static class COLMATERIA implements ColumnasMateria{
        
    }
    public static class COLHORARIO implements ColumnasHorario{
        
    }
    public static class COLPROFESOR implements ColumnasProfesor{
        
    }
    public static class COLUNIVERSIDAD implements ColumnasUniversidad{
        
    }
    public static class COLLISTAHORARIOS implements ColumnasListaHorarios{
        
    }
    public static class COLSOLICITUD implements ColumnasSolicitud{
        
    }
}
