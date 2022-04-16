import java.util.Scanner;
public class javaJokenpo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in); //vou usar esse scanner para ler strings

        int jogador, computador;
        String resp;
        System.out.print("Voce quer jogar Jokenpo contra o computador? [S/N] ");
        resp = str.nextLine();
        /*temos q
        ue melhorar essa logica, ignorando lower case ou upper case
        para caso o usuario digite "s" ela funcione
        */
        while(resp.equals("S")){
        //primeiro criamos o menu para informar o usuario
        System.out.println("\f");
        System.out.println("-----------");
        System.out.println("JOKENPO");
        System.out.println("-----------");
        System.out.println("Menu de opções");
        System.out.println("[1]Pedra");
        System.out.println("[2]Papel");
        System.out.println("[3]Tesoura");
        System.out.println("");
        System.out.print("Sua jogada: ");
        jogador = sc.nextInt();
        //aqui criamos a logica do jogador
        switch(jogador){
            case 1:
                System.out.println("Jogador escolheu Pedra!");
             break;
            case 2:
                System.out.println("Jogador escolheu Papel!");
             break;
            case 3:
                System.out.println("Jogador escolheu Tesoura!");
             break;
            default:
                System.out.println("Erro, digite uma jogada valida [1, 2 ou 3]");
                /*podemos mais pra frente desenvolver uma logica para quando o jogador errar a escolha
                a gente de a opcao dele escolher denovo!
                */
        }
        //logica do computador
        computador = (int)Math.random()*3 + 1; //*3 faz o computador escolher 0, 1 ou 2, ent eu adiciono o + 1 pra ficar que nem o menu
        switch(computador){
            case 1:
                System.out.println("Computador escolheu Pedra!");
             break;
            case 2:
                System.out.println("Computador escolheu Papel!");
             break;
            case 3:
                System.out.println("Computador escolheu Tesoura!");
             break; //nao precisamos do default pois obrigamos o computador a escolher entre 1 2 ou 3
        }
        //logica do vencedor
        if(jogador == computador){
            System.out.println("EMPATE");
        }else if((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
            System.out.println("Vitória do Jogador");
        }else{
            System.out.println("Vitória do Computador");
        }
        System.out.println("");
        System.out.println("FIM DE JOGO");
        System.out.println("\f");
        System.out.print("Voce quer jogar outra partida? [S/N] ");
        resp = str.nextLine();
        }

        System.out.println("Obrigado por jogar!");

    }
}