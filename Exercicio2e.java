import java.util.Scanner;

public class Exercicio2e{
    public static void main (String args[]){
     
         Scanner teclado = new Scanner(System.in);

         double altura, baseMaior, baseMenor, area;

         System.out.println("Agora digit um valor da altura:");
         altura = teclado.nextDouble(); 

         System.out.println("Agora digit um valor da baseMaior:");
         baseMaior = teclado.nextDouble(); 

         System.out.println("Agora digit um valor da baseMenor:");
         baseMenor = teclado.nextDouble(); 

         area =  (baseMaior + baseMenor)* altura /2;
         System.out.printf("Valor da area = %.3f\n", area);

    }     
}





