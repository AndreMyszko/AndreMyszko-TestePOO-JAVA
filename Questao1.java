import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomeAtleta = new ArrayList<>();
        List<String> paisAtleta = new ArrayList<>();
        List<Integer> arremessoAtleta = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            
            System.out.println("Bem vindo ao sistema de cadastro de arremessos da olimíada!");
    
            System.out.println("nome do atleta:");
            String nome = scanner.next();
            nomeAtleta.add(nome);
    
            System.out.println("país do atleta:");
            String pais = scanner.next();
            paisAtleta.add(pais);
    
            System.out.println("distância do arremesso:");
            int arremesso = scanner.nextInt();
            arremessoAtleta.add(arremesso);
        }

        System.out.println("\nOURO\nnomeAtleta: " + nomeAtleta.get(0) + "\npaisAtleta: " + paisAtleta.get(0) + "\narremessoAtleta:" + arremessoAtleta.get(0) + "\n");
        System.out.println("PRATA\nnomeAtleta: " + nomeAtleta.get(1) + "\npaisAtleta: " + paisAtleta.get(1) + "\narremessoAtleta:" + arremessoAtleta.get(1) + "\n");
        System.out.println("BRONZE\nnomeAtleta: " + nomeAtleta.get(2) + "\npaisAtleta: " + paisAtleta.get(2) + "\narremessoAtleta:" + arremessoAtleta.get(2) + "\n");

    }
}
