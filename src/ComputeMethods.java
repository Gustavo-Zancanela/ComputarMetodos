
import java.util.Random;


public class ComputeMethods {
    
    public double fToC(double degreesF)
    {
        double celsius = (degreesF - 32) / 1.8;
        System.out.println("resultado em Celsius: " + celsius);
        return celsius;
        
    }//fim do metodo de transformacao de Fahrenheit para Celsius
    
    public double Hipotenusa(int a, int b)
    {
        double resultado = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(resultado);
        return resultado;
        
    }//fim do metodo de calcular a hipotenusa
    
    public int roll()
    {
       Random rnd = new Random();
        int soma = rnd.nextInt(6)+1 + rnd.nextInt(6)+1;
        System.out.println(soma);
        return soma;
    
    }//fim do metodo de rolar os dados 
            
    
    
}//fim da classe ComputeMethods

