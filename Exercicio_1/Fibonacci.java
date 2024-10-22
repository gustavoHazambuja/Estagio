package Exercicio_1;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = in.nextInt();

        if(pertenceFibonacci(num)){
            System.out.println("Este número pertence a sequência de fibonacci");
        }
        else{
            System.out.println("Este número não pertence a sequência de fibonacci");

        }
       
           
    }
    public static boolean pertenceFibonacci(int num){
        int primeiroTermo = 0;
        int segundoTermo = 1;

        while(primeiroTermo <=  num){
            if(primeiroTermo == num){
                return true;
            }
        
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

         return false;
    }
}
