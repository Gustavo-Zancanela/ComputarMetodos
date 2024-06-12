
import java.util.Scanner;

public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        Scanner sc = new Scanner(System.in);
        System.out.println("digite em graus Fahrenheit para a conversão ");
        double graus = sc.nextDouble();
        
        ComputeMethods contas = new ComputeMethods();
        contas.fToC(graus);
         
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        contas.Hipotenusa(num1, num2);
        
        sc.close();
        
        contas.roll();
    }
}
