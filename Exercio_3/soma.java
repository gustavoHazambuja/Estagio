package Exercio_3;

public class soma {
    
    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;
    
        for(int k = 1; k<indice; k++){
            soma += k;
        }

        System.out.printf("Soma total: %d", soma);
    }
   

    
}
