import java.util.Scanner;

public class Exercicios{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    double lado, area;

      System.out.println("Agora digit um valor Double:");
       lado = teclado.nextDouble();

       area = lado * lado;

        System.out.printf("Valor da area = %.3f\n", area);
        
    }
}