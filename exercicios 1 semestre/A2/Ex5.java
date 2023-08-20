import java.util.*;
public interface Ex5 {
    public static void main(String[] args){
        Random random = new Random();
        int[] nmraleatorio = new int[100];
        int soma = 0, par = 0, impar = 0;

        //Cria um loop que gera um número aleatório para cada posição no vetor.
        System.out.print(" 100 Números aleatórios de 1 a 9999: ");
        for(int i=0; i<100; i++){
            nmraleatorio[i] = random.nextInt(9999)+1;
            System.out.print(nmraleatorio[i] + " ");
            soma += nmraleatorio[i];
            if(nmraleatorio[i] % 2 == 0){
                par++;
            }
            else{
                impar++;
            }
            
        }
        
        System.out.println("\nQuantidade de números pares: " + par + "\nQuantidade de números ímpares: " + impar);
        
        //Imprime o vetor que contém os números aleatorios armazenados.
        System.out.print("Soma: " + soma);
    }    
}
