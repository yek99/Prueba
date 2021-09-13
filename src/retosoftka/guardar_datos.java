package retosoftka;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Diego Alejandro Henao Jimenez. 
 */
public class guardar_datos  // Esta clase se encarja de Crear el archivo de acuerdo al tipo de formato escogido. 
{
    public String Direccion="Puntaje.csv";
    public guardar_datos(String Direccion)
    {
                FileWriter flwriter = null;
		try {
			flwriter = new FileWriter(Direccion);			
                    try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {	
                        bfwriter.write("ID"+","+" Nombre"+","+"Puntaje");
                    }
					} catch (IOException e) {
                                        } finally 
                                         {
                                            if (flwriter != null)
                                                 {
                                                 try {//
                                                     flwriter.close();
                                                      } catch (IOException e) 
                                                      {
                                                      }
                                            }                      
                                         }
    }
    public guardar_datos()// respaldo por si el usuario no escoge alguna direecion. 
    {
        String Dieccion="Puntaje.csv";
                FileWriter flwriter = null;
		try {
			flwriter = new FileWriter(Direccion);			
            try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {
                bfwriter.write("ID"+","+" Nombre"+","+"Puntaje");
            }
		} catch (IOException e) {
                                        } finally 
                                         {
                                            if (flwriter != null)
                                                 {
                                                 try {//
                                                     flwriter.close();
                                                      } catch (IOException e) 
                                                      {
                                                      }
                                            }                      
                                         }
    }
}
