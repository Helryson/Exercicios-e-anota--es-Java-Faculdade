import java.util.*;
public class Ex4 {
    String nome;
    int numero, votos = 0;

    public Ex4(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    void adicionaVoto(){
        this.votos += 1;
        System.out.println("\nVocê votou com sucesso em " + nome + ".");
    }
    int retornaVoto(){
        return this.votos;
    }

    String retornaInfo(){
        return "Nome: " + nome + "\nNúmero: " + numero;
    }
    

    public static void main(String[] args){
        
        Scanner tecla = new Scanner(System.in);
        int voto, option, i, VTotais;

        Ex4 cndt1 = new Ex4("Joao da pesca", 1234);
        Ex4 cndt2 = new Ex4("Maria das Dores", 1324);
        Ex4 cndt3 = new Ex4("Caio da sinuca", 1243);
        Ex4 cndt4 = new Ex4("Aninha Pipokinha", 1342);
        Ex4 cndt5 = new Ex4("Geraldo do barzin", 1432);

        System.out.println("Candidato 1: ");
        System.out.println(cndt1.retornaInfo());

        System.out.println("\nCandidato 2: ");
        System.out.println(cndt2.retornaInfo());

        System.out.println("\nCandidato 3: ");
        System.out.println(cndt3.retornaInfo());

        System.out.println("\nCandidato 4: ");
        System.out.println(cndt4.retornaInfo());

        System.out.println("\nCandidato 5: ");
        System.out.println(cndt5.retornaInfo());

            System.out.print("\nDigite o número do seu candidato: ");
            voto = tecla.nextInt();

            if (voto == cndt1.numero) {
                cndt1.adicionaVoto();
            } else if (voto == cndt2.numero) {
                cndt2.adicionaVoto();
            } else if (voto == cndt3.numero) {
                cndt3.adicionaVoto();
            } else if (voto == cndt4.numero) {
                cndt4.adicionaVoto();
            } else if (voto == cndt5.numero) {
                cndt5.adicionaVoto();
            } else {
                System.out.println("Voto anulado");
            }
            

        int maiorVotos = cndt1.votos;
        String candidatoMaisVotado = cndt1.nome;

        if (cndt2.votos > maiorVotos) {
            maiorVotos = cndt2.votos;
            candidatoMaisVotado = cndt2.nome;
        }
        if (cndt3.votos > maiorVotos) {
            maiorVotos = cndt3.votos;
            candidatoMaisVotado = cndt3.nome;
        }
        if (cndt4.votos > maiorVotos) {
            maiorVotos = cndt4.votos;
            candidatoMaisVotado = cndt4.nome;
        }
        if (cndt5.votos > maiorVotos) {
            maiorVotos = cndt5.votos;
            candidatoMaisVotado = cndt5.nome;
        }

        VTotais = cndt1.votos + cndt2.votos + cndt3.votos + cndt4.votos + cndt5.votos;
        double percentual = VTotais/2;

        if (maiorVotos > percentual) {
            System.out.println("\nCandidato " + candidatoMaisVotado + " venceu a eleição!");
        } else {
            System.out.println("\nNenhum candidato obteve mais do que 50% dos votos. Será realizada outra votação entre os candidatos com maior votação.");
        }

        do{
            System.out.println("\nBem vindo ao menu");
            System.out.println("1 - Número de votos totais");
            System.out.println("2 - Número de votos recebidos por cada um dos candidatos");
            System.out.println("3 - Qual candidato obteve mais votos");
            System.out.println("4 - Sair");
            option = tecla.nextInt();

            switch(option){

                case 1: System.out.println("\nNúmero de votos totais: " + VTotais);
                break;
                
                case 2: System.out.println("Candidato Joao da pesca: " + cndt1.votos + "\nCandidado Maria das Dores: " + cndt2.votos + "\nCandidadto Caio da sinuca: "+ cndt3.votos + "\nCandidadto Aninha Pipokinha: " + cndt4.votos + "\nCandidadto Geraldo do barzin: " + cndt5.votos);
                break;

                case 3: System.out.println("Mais votado: " + candidatoMaisVotado + ", com " + maiorVotos + " votos.");
                
            }

        }while(option != 4);

        tecla.close();

    }    
}
