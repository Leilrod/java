public class Continhas{
    public static void main(String args[]){

        int a, b, c;

        a = 23;
        b = 4;

        c = a + b;
        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da subt = " + c);

        c = a * b;
        System.out.println("Valor da mult = " + c);

        c = a / b;
        System.out.println("Valor da divi = " + c);

        c = a % b;
        System.out.println("Valor do resto= " + c);
    
        System.out.println("  ---- agora continhas quebradas!!! ----- ");

        float x, y, z;

        x = 23.0f;
        y = 3.0f;
        z = x / y;
        System.out.println("Valor da divisão quebrada = " + z);
        System.out.printf("Valor agora com 2 casas decimais %.2f", z);
        System.out.printf("Valor com 3 casas decimais %.3f\n", z);     
        
    } 
}