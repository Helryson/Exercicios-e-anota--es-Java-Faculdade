import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        double renda = 0, soma1 = 0, media1;
        int filhos = 0, count1 = 0, count2 = 0, soma2 =0;
        float media2;

        while(renda >= 0){
            System.out.println("Olá, estamos coletando dados sobre renda e natalidade para uma pesquisa!");
            System.out.print("Qual a sua renda mensal? ");
            renda = tecla.nextDouble();
            if(renda < 0){
                break;
            }
            soma1 += renda;
            count1++;
        
            media1 = soma1/count1;
            System.out.println("A média salarial da população até o momento é " + media1 + ".");
            System.out.print("Possui quantos filhos?: ");
            filhos = tecla.nextInt();
            soma2 += filhos;
            count2++;

            media2 = soma2/count2;
            System.out.println("A média de filhos da população até o momento é " + media2 + ".");

            while(renda >= 0){
                System.out.print("Qual a sua renda mensal? ");
                renda = tecla.nextDouble();
                if(renda < 0){
                    break;
                }
                soma1 += renda;
                count1++;
            
                media1 = soma1/count1;
                System.out.println("A média salarial da população até o momento é " + media1 + ".");
                System.out.print("Possui quantos filhos?: ");
                filhos = tecla.nextInt();
                soma2 += filhos;
                count2++;
    
                media2 = soma2/count2;
                System.out.println("A média de filhos da população até o momento é " + media2 + ".");
            }
        }

    }
}
