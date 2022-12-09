package Principal;
import java.util.Scanner;
import Salud.Persona;

public class inicio 
{
    
    public static void main(String[]args)
    {
        int op;
        Scanner lectura= new Scanner(System.in);
        Persona datos=  new Persona();
        do
        {
        System.out.println("\nBienvenido al menu de inicio\nelija una de las siguentes opcion\ningrese 1 si desea ingresar datos\nIngrese 2 si desea ver la informacion del usuario\nIngrese 3 si desea calcular su peso Actual\nIngrese 4 si desea Determinar si es mayor de edad\nIngrese 5 datos para calculo\nElija 6 si desea mostrar datos con calculo\nIngrese 7 para salir \n");
        op= lectura.nextInt();
        if(op==1) datos.pedirDatos();
        else if(op==2) datos.mostrarPersonal();
        else if(op==3) datos.calcularImc(datos.getPeso(),datos.getEstatura());
        else if(op==4) datos.mayorEdad();
       
        else{System.out.println("Dato invalido");}
        }while(op!=5);
    }
    
    
}
