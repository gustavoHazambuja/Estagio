package Exercicio_2;

import java.util.Scanner;

import Exercio_3.soma;

public class String_a {

   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int qtd = 0;

        System.out.println("Informe uma palavra");
        String palavra = in.nextLine();

        char letra = 'a';
        // String letraString = Character.toString(letra);

        for(int i = 0; i<palavra.length(); i++){
            if(palavra.toLowerCase().charAt(i) == letra){
                qtd++;
            }
        }

        if(qtd>0){
            System.out.printf("A palavra %s contém %d letra(s) (a)", palavra,qtd);
        }
        else{
            System.out.printf("A palavra %s não contém a letra (a)", palavra);
        }

       

       


    }
}
