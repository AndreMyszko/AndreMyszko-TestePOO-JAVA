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

        scanner.close();

        int dif_intervalo = fim_intervalo - inicio_intervalo;

        if(inicio_intervalo > fim_intervalo){
            System.out.println("Erro: O início é maior que o fim do intervalo.");
        }
        else if (dif_intervalo > 10){
            System.out.println("Erro: O intervalo entre início e fim não pode ser maior do que 10.");
        }
        else if(inicio_intervalo > 1000 || inicio_intervalo < 0 || fim_intervalo > 1000 || fim_intervalo < 0){
            System.out.println("Erro: O valores de intervalo devem ser maiores que 0 e menores que 1000.");
        }
        else if(multiplicador > 1000){
            System.out.println("Erro: Mutiplicador não pode ser maior que 1000.");
        }else{    
            while(inicio_intervalo != fim_intervalo){
                int result = multiplicador * inicio_intervalo;
                System.out.println(multiplicador + " x " + inicio_intervalo + " = " + result);
                inicio_intervalo++;
            }
        }

    }
}
