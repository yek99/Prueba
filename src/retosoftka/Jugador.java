package retosoftka;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
public class Jugador extends niveles
{
    public String nombre;
    public String id;
    public String Direccion;
    public Jugador(String nombre, String id,String Direccion)
    {
        this.nombre=nombre;
        this.id=id;
        this.Direccion=Direccion;
    } 
    public Jugador()
    {
        this.nombre="Jugador";
        this.id="Id jugador";
        this.Direccion="Puntaje.csv";
    } 
    public void juego()// Estructura del juego 
    {
       bancoPreguntasNivel1();              
       Guardardatos();
    }
    public void Guardardatos()   //Clase que al final del juego me guarda los datos del jugador
    {
                FileWriter flwriter = null;
		try {
			flwriter = new FileWriter(this.Direccion, true);
                    try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {
                        bfwriter.write("\n"+this.id+","+this.nombre+","+this.puntos);
                    }
			System.out.println("Puntaje guardado ");
 
		} catch (IOException e) {
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
				}
			}
		}
	}	
}  



        
