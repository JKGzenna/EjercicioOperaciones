package ejerciciooperaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JUAN
 */
public class EjercicioOperaciones {

    public static void main(String[] args) throws Exception {
        
        int a, b;
        double x, y;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Escribe un número entero: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Escribe un número entero: ");
        b = Integer.parseInt(br.readLine());
        System.out.println("Escribe un número real: ");
        x = Double.parseDouble(br.readLine());
        System.out.println("Escribe un número real: ");
        y = Double.parseDouble(br.readLine());
        
        System.out.println("ENTEROS");
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("b-a = "+(b-a));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("b/a = "+(b/a));
        System.out.println("a%b = "+(a%b));
        System.out.println("b%a = "+(b%a));
        
        System.out.println("ENTERO Y REAL");
        System.out.println("x+y = "+(x+y));
        System.out.println("x-y = "+(x-y));
        System.out.println("y-x = "+(y-x));
        System.out.println("x*y = "+(x*y));
        System.out.println("x/y = "+(x/y));
        System.out.println("y/x = "+(y/x));
        System.out.println("x%y = "+(x%y));
        System.out.println("y%x = "+(y%x));
    }
    
}
