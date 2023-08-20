import java.util.Scanner;
import java.util.Random;
public class Ex7 {
    public static void main(String[] args){

        Random random = new Random();
        Scanner tecla = new Scanner(System.in);
        
        int nmraleatorio = random.nextInt(100)+1;
        System.out.println("Tente adivinhar o número em que estou pensando(Dica: está entre 1 e 100)");
        int palpite = tecla.nextInt();

        while(palpite != nmraleatorio){

            if(palpite > nmraleatorio){
            System.out.println("Muito alto. Tente um valor menor!");
            }
            else if(palpite < nmraleatorio){
                System.out.println("Muito baixo. Tente um valor maior!");
            }
            palpite = tecla.nextInt();
        }
        if(palpite == nmraleatorio){
            System.out.print("Parabéns, você acertou!!!");
        }
    }
}
