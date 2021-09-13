
package retosoftka;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Diego Alejandro Henao Jimenez
 */
public class niveles{
    public int puntos=0; 
    public String resultadoN1;
    public void ResultadoPreg(String Res,String Mayus,String Minus, int nivel) //Control de los resultados
    {
       if(Res.equals(Mayus) || Res.equals(Minus) )
                {   
                    System.out.println("Respuesta correcta");
                    respuestaCorrecta(nivel);
                    System.out.println(this.puntos);
                }
                else{
                System.out.println("fin del juego");
                     }    
    }
    public void bancoPreguntasNivel1() //Banco de datos para el nivel 1
    {   Random rand = new Random(); 
        int  numPreg= 1 + rand.nextInt((5- 1) + 1); /// numeros aleatorios
        Scanner sc = new Scanner(System.in);
     
        switch(numPreg)
        {
            
            case 1 -> { 
                System.out.println("¿Cuanto es 1+1?\n"+"\n A.2\nB.3\nC.4\nS. Precione s si decea salir del juego");              
                System.out.println("Por favor ingrese su resultado: ");//Se pide un dato al usuari0             
                this.resultadoN1 = sc.nextLine();               
                ResultadoPreg(this.resultadoN1,"A","a",1);
            }
            case 2 -> {
                System.out.println("¿Cuanto es 5+5?\n"+"\n A. 3\nB. 100\nC. 10\nD. 25\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"C","c",1);
            }
            case 3 -> {
                System.out.println("¿Cuanto es 10+5?\n"+"\n A. 3\nB. 15\nC. 25\nD. 25\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",1);
            }
            case 4 -> {
                System.out.println("¿Cuanto es 10+15?\n"+"\n A. 25\nB. 25,2\nC.30\nD. 70\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",1);
            }
            case 5 -> {
                System.out.println("¿Cuanto es 30+15?\n"+"\n A. 25\nB. 45\nC. 30\nD. 70\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",1);
            }            
        }
    }    
        public void bancoPreguntasNivel2()
    {   Random rand = new Random(); 
        int  numPreg= 1 + rand.nextInt((5- 1) + 1); /// numeros aleatorios
        Scanner sc = new Scanner(System.in);     
        switch(numPreg)
        {            
            case 1 -> { 
                System.out.println("¿Cuanto es 1*1?\n"+"\n A.1\nB.3\nC.4\nS. Presione s si desea salir del juego");
                System.out.println("Por favor ingrese su resultado: ");//Se pide un dato al usuari0             
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",2);                
            }
            case 2 -> {
                System.out.println("¿Cuanto es 5*5?\n"+"\n A. 3\nB. 100\nC. 10\nD. 25\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"D","d",2);
            }
            case 3 -> {
                System.out.println("¿Cuanto es 10*5?\n"+"\n A. 3\nB. 50\nC. 25\nD. 25\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",2);
            }
            case 4 -> {
                System.out.println("¿Cuanto es 10*15?\n"+"\n A. 150\nB. 25,2\nC.30\nD. 700\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",2);
            }
            case 5 -> {
                System.out.println("¿Cuanto es 30*15?\n"+"\n A. 25\nB. 450\nC. 30\nD. 70\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",2);
            }            
        }   
    }
        public void bancoPreguntasNivel3()
    {   Random rand = new Random(); 
        int  numPreg= 1 + rand.nextInt((5- 1) + 1); /// numeros aleatorios
        Scanner sc = new Scanner(System.in);     
        switch(numPreg)
        {            
            case 1 -> { 
                System.out.println("¿Cuanto es 1/1?\n"+"\n A.1\nB.3\nC.4\nS. Presione s si desea salir del juego");
                System.out.println("Por favor ingrese su resultado: ");//Se pide un dato al usuari0             
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",3);                
            }
            case 2 -> {
                System.out.println("¿Cuanto es 5/5?\n"+"\n A. 3\nB. 100\nC. 10\nD. 1\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"D","d",3);
            }
            case 3 -> {
                System.out.println("¿Cuanto es 10/5?\n"+"\n A. 3\nB. 2\nC. 25\nD. 25\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",3);
            }
            case 4 -> {
                System.out.println("¿Cuanto es 10/15?\n"+"\n A. 0.666\nB. 1,85\nC.3\nD. 2\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",3);
            }
            case 5 -> {
                System.out.println("¿Cuanto es 30/15?\n"+"\n A. 4\nB. 2\nC. 1.5\nD. 1\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",3);
            }            
        }   
    }
             public void bancoPreguntasNivel4()
    {   Random rand = new Random(); 
        int  numPreg= 1 + rand.nextInt((5- 1) + 1); /// numeros aleatorios
        Scanner sc = new Scanner(System.in);     
        switch(numPreg)
        {            
            case 1 -> { 
                System.out.println("¿Cuanto es 1!?\n"+"\n A.1\nB.3\nC.4\nS. Presione s si desea salir del juego");
                System.out.println("Por favor ingrese su resultado: ");//Se pide un dato al usuari0             
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",4);                
            }
            case 2 -> {
                System.out.println("¿Cuanto es 5!?\n"+"\n A. 11\nB. 100\nC. 25\nD. 120\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"D","d",4);
            }
            case 3 -> {
                System.out.println("¿Cuanto es 4!?\n"+"\n A. 28\nB. 24\nC. 30\nD. 80\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",4);
            }
            case 4 -> {
                System.out.println("¿Cuanto es 2!?\n"+"\n A. 0.666\nB. 2\nC. 10\nD. 7\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",4);
            }
            case 5 -> {
                System.out.println("¿Cuanto es 3!?\n"+"\n A. 4\nB. 6\nC. 3\nD. 8\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",4);
            }            
        }   
    }
             public void bancoPreguntasNivel5()
    {   Random rand = new Random(); 
        int  numPreg= 1 + rand.nextInt((5- 1) + 1); /// numeros aleatorios
        Scanner sc = new Scanner(System.in);     
        switch(numPreg)
        {            
            case 1 -> { 
                System.out.println("¿Cuanto es log(1)?\n"+"\n A.0 \nB.3\nC.4\nS. Presione s si desea salir del juego");
                System.out.println("Por favor ingrese su resultado: ");//Se pide un dato al usuari0             
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",5);                
            }
            case 2 -> {
                System.out.println("¿Cuanto es log(5)?\n"+"\n A. 4\nB. 5\nC. 0,9989\nD. 0,6989\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"D","d",5);
            }
            case 3 -> {
                System.out.println("¿Cuanto es log(4)?\n"+"\n A. 4\nB. 0.6020\nC. 0,9989\nD. 0,6989\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",5);
            }
            case 4 -> {
                System.out.println("¿Cuanto es log(2)?\n"+"\n A. 0.3010\nB. 5\nC. 0,9989\nD. 0,6989\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"A","a",5);
            }
            case 5 -> {
                System.out.println("¿Cuanto es log(3)?\n"+"\n A. 4\nB. 0.477\nC. 3\nD. 8\nS. Presione s si desea salir del juego");        
                System.out.println("Por favor ingrese su resultado: ");
                this.resultadoN1 = sc.nextLine();
                ResultadoPreg(this.resultadoN1,"B","b",5);
            }            
        }   
    }            
    public void respuestaCorrecta(int nivel) // Este metodo realiza el salto de nivel a nivel, de acuerdo si la respuesta es correcta
        {    if (nivel==1)
            {
                this.puntos=this.puntos+10;
               bancoPreguntasNivel2();
            }
            if (nivel==2)
            {
                this.puntos=this.puntos+15;
               bancoPreguntasNivel3();
            }
            if (nivel==3)
            {
                this.puntos=this.puntos+20;
               bancoPreguntasNivel4();
            }if (nivel==4)
            {
                this.puntos=this.puntos+25;
               bancoPreguntasNivel5();
            }
            if (nivel==5)
            {
                this.puntos=this.puntos+30;
               System.out.println("fin del juego");
            }
        }
    
    
}
