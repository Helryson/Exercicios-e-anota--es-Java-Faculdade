import java.util.*;
public class Ex3 {
    public static void main(String[] args){
        
        Scanner tecla = new Scanner(System.in);
        double nota, soma = 0, media;
        int i;

        System.out.print("Insira seu nome: ");
        String nome = tecla.nextLine();

        for(i=1; i<=5;i++){

            System.out.printf(nome + ", insira a %d nota: ", i);
            soma += tecla.nextDouble();
            
        }

        media = soma/5;
        
        if(media >= 60 && media <= 100){
            System.out.print("APROVADO");
        }
        else if(media >= 40 && media < 60){
            System.out.print("RECUPERAÇÃO");
        }
        else if(media < 40){
            System.out.print("REPROVADO");
        }
        

    }
}
