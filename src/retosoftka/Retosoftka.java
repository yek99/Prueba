package retosoftka;
/**
 * @author Diego Alejandro Henao Jimenez. 
 */
public class Retosoftka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String Direccion="Puntaje.csv"; //Direccion en la cual quieres guardar los datos, puede ser. CSV o TXT
        guardar_datos Datos=new guardar_datos(Direccion);// Clase que gestiona la creacion del archivo
        Jugador jugador1=new Jugador("Diego","2323",Direccion);// Jugador 1, Tíene Nombre, identificacion, Direecion 
        jugador1.juego();
        Jugador jugador2=new Jugador();
        jugador2.juego();
    }
}

        
 
         

