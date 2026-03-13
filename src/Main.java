import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nu  = 0, na = 0, rep = 0 ;
        Random rand = new Random();
        Scanner lector = new Scanner(System.in);
        System.out.println("Adivine el numero aleatorio entre 1 y 50 tiene 3 oportunidades");

        na = rand.nextInt(50) + 1;

        while (nu != na && rep < 3) {
            nu = Integer.parseInt(lector.nextLine());

            if (nu > na) {
                System.out.println("El numero es menor");
            }


            if (nu < na) {
                System.out.println("El numero es mayor");
            }
            rep++;

            if (nu == na) {
                System.out.println("Adivino el numero");
                break;

            }

            if (rep==3){
                System.out.println("No adivino el numero, era: " + na);
            }

        }





    }
}