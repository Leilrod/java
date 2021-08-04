import java.util.Scanner;

public class Exercicio2c{
    public static void main (String args[]){

    Scanner teclado = new Scanner(System.in);

    double altura, base, area;

      System.out.println("Agora digit um valor da base:");
      base = teclado.nextDouble();  
       
      System.out.println("Agora digit um valor da altura:");
      altura = teclado.nextDouble();

      area = (base*altura)/2;
      System.out.printf("Valor da area = %.3f\n", area);
    
    }

}