import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        
        Scanner tecla = new Scanner(System.in);
        //Considerando um sistema que possui 3 notas diferentes para cada aluno, temos
        double media, soma = 0, nota;

        System.out.print("Insira a quantidade de alunos: ");
        int qntAlunos = tecla.nextInt(), i;
        Double[] armazenanota = new Double[qntAlunos];
        
        System.out.println("Insira uma nota entre 0 e 100!\n");

        for(i=0; i<qntAlunos; i++){
            System.out.print("Insira a 1ª nota  do aluno " + (i+1) + ": ");
            nota = tecla.nextDouble();
            soma += nota;

            System.out.print("Insira a 2ª nota  do aluno " + (i+1) + ": ");
            nota = tecla.nextDouble();
            soma += nota;

            System.out.print("Insira a 3ª nota  do aluno " + (i+1) + ": ");
            nota = tecla.nextDouble();
            soma += nota;

            media = soma/3;
            armazenanota[i]=media;
            soma = 0;
        }
        for(i=0; i<qntAlunos; i++){
            System.out.println("Média do aluno " + (i+1) + ": " + armazenanota[i]);
        }
        
    }
}
