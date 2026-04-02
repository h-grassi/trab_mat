package nivel1;
import java.util.Scanner;

public class Menu{
    public static void exibir() {
        Scanner scanner = new Scanner(System.in);
        int opcao; 
        
        System.out.println("Nível 1 selecionado."); 
        System.out.println("Qual exercício gostaria de realizar?");
        System.out.println("1: Soma e média de um vetor");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> new Exercicio1().executar();// Exercicio1.exibir(); break;
            default -> System.out.println("Opção inválida. Digite um número entre 1 e 1.");
        }
    }
}