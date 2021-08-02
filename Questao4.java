import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o MULTIPLICADOR:");
        int multiplicador = scanner.nextInt();
        System.out.println("Insira o INÍCIO do intervalo:");
        int inicio_intervalo = scanner.nextInt();
        System.out.println("Insira o FINAL do intervalo:");
        int fim_intervalo = scanner.nextInt();

        while(inicio_intervalo != fim_intervalo){
            int result = multiplicador * inicio_intervalo;
            System.out.println(multiplicador + " x " + inicio_intervalo + " = " + result);
            inicio_intervalo++;
        }

    }
}
