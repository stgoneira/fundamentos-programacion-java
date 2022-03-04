import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerNumero {

    public static void main(String[] args) {
        Integer numero = null;
        boolean ready = false;
        
        do {
            try {
                System.out.println("Ingrese un número entre 1 y 4:");        
                Scanner sc  = new Scanner(System.in);
                numero      = sc.nextInt();
            } catch(InputMismatchException ime) {
                System.out.println("Solo se permiten números");
                continue;
            } catch(Exception e) {
                System.out.println("Ocurrio un error, vuelva a intentar...");
                continue;
            }
        
            if( numero > 4) {
                System.out.println("muy grande");
            } else if(numero < 1) {
                System.out.println("muy pequeño");
            } else if(numero >= 1 && numero <= 4) {
                System.out.println("El número ingresado fue: "+numero);
                ready = true;
            }             
        
        } while(!ready);
    }    
}

