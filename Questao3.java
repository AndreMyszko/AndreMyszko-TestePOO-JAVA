import java.util.Scanner;

public class Questao3 {
    public static double valorPassado = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor desejado para receber informações sobre os impostos:");
        valorPassado = scanner.nextDouble();
        scanner.close();

        System.out.println("ICMS: \n" + calculaICMS(valorPassado));
        System.out.println("IPI: \n" + calculaIPI(valorPassado));
        System.out.println("COFINS: \n" + calculaCOFINS(valorPassado));
    }  
    
    public static Double calculaICMS(double valor){
        valor = valorPassado + (valorPassado * 27 / 100);
        return valor;
    }

    public static Double calculaIPI(double valor){
        if(valorPassado > 25000){
            valor = valorPassado + (valorPassado * 5 / 100);
        }else{
            valor = valorPassado + (valorPassado * 10 / 100);
        }
        return valor;
    }

    public static Double calculaCOFINS(double valor){
        if(valorPassado > 1300){
            valor = valorPassado + (valorPassado * 4 / 100);
        }
        return valor;
    }
}
