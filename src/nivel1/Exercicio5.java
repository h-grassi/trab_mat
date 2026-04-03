package nivel1;
import  java.util.Random;

public class Exercicio5 {

    // Método principal deste exercício que será chamado pelo seu Menu
    public void executar() {
        System.out.println("Exercício 5: Remover duplicatas (sem ordenar)");
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 5;
        int [] vetor = new int[10];

        System.out.print("Vetor original: [");
        for(int i = 0; i<10 ; i ++){
            vetor[i] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
            System.out.print(vetor[i]);
            if(i< vetor.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");

        for(int i=0; i <= vetor.length; i++){
            int [] aux_vet = new int[vetor.length];

            for(int x=0; x <= vetor.length; x++){
                if(x != i && vetor[i] == vetor[x]){
                    System.out.println( "Em construção!!");
                }
            }
            
        } 
        System.out.println("");
}}