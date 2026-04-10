package nivel3;
import java.util.Scanner; 

public class Exercicio16 {
    public void executar(){
        Scanner scanner = new Scanner(System.in);
        String [][] campo = new String[3][3];
        int jogoFinalizado = 0;
        System.out.println("Exercício 16: jogo da velha");
        //monta o campo 
        montaCampo(campo);
        exibeCampo(campo);

        System.out.println("Vamos começar:");
       //inicia o jogo 
        while (jogoFinalizado == 0){
            jogador(1);
            jogador(2);
            exibeCampo(campo);
            encerraJogo(jogoFinalizado);
            jogoFinalizado = 1;
        }
    }
    
    
    public void montaCampo(String [][] campo){
        for(int i=0; i< campo.length; i++){
            for(int x = 0; x < campo[i].length; x ++){
                campo[i][x]= " ";
            }
        }
    }

    public void exibeCampo(String [][] campo){
         System.out.println("Campo");
        for(int i=0; i< campo.length; i++){
            for(int x = 0; x < campo[i].length; x ++){
                System.out.print(campo[i][x]);
                if(x < campo[x].length - 1){
                    System.out.print("|");
                }
            }
            if(i < campo[i].length - 1){
                System.out.println("\n-|-|-");
            }
        }
        System.out.println("");
    }
    public void jogador(int jogador){
        char letra;
        int linha;
        int coluna;
        if (jogador == 1){
            letra = 'X';
        }else{
            letra= 'O';
        }
        System.out.println("Rodada do Jogador " + jogador );
        System.out.println("Escolha a linha e a coluna : (valores de 0 até 3)");
        

    }   

    public void addMovimento(String player, int lin, int col, String [][] campo){
        campo [lin][col] = player;
    }
    public void encerraJogo(int jogoFinalizado){
        jogoFinalizado = 1;
    }

}

