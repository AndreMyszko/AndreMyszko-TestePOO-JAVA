import java.util.Scanner;
import java.util.Random;

public class Questao2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numRandom = random.nextInt(7);
        System.out.println("Tenta adivinhar um número de 1 até 7:");
        int tentativa = scanner.nextInt();

        boolean loop = true;
        while(loop){
            if(tentativa == numRandom){
                System.out.println("Parabéns! \n O número era " + numRandom);
                loop = false;

            }else{
                System.out.println("Errou, tente novamente. \n Nova tentativa:");
                tentativa = scanner.nextInt();
            }
        }
        scanner.close();
    } 
}