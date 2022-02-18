package Questao2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String senha;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("");
        senha = input.nextLine();
        System.out.println(senha);

        for(int i = 0; i < senha.length(); i++) {
            if(senha.charAt(i) != ' ')
                count++;
        }

        System.out.println(count);




        //Validação e possível refatoração da senha podendo adicionar mais caracteres!
        /*
        if(count < 6) {
         System.out.println("Faça sua senha segura e insira mais " +  (6 - senha.length()) +" caracteres! o Mínimo são 6!!");
         String novasenha;
         System.out.println("Digite mais caracteres pra sua senha !");
         novasenha = input.nextLine();
         senha = senha + novasenha;
         System.out.println(senha);
     }
     */





    }
}
