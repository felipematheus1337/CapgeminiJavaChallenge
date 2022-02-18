package Questao1;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        String palavra = "*" +
                "";

        int n;

        Scanner input = new Scanner(System.in);


        System.out.println("Input range");
        n = Integer.parseInt(input.nextLine());

        //Ascending

        int linhas = n;
        for (int i = 0; i < linhas; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(palavra+ ""+ " ");
            }
            System.out.println();
        }


        }
    }



