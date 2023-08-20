import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);

        int a, i, j, soma = 0;
        System.out.print("Informe o número de linhas e colunas das matrizes: ");
        a = tecla.nextInt();
        int[][] matriz1 = new int[a][a];
        int[][] matriz2 = new int[a][a];
        int[][] matriz3 = new int[a][a];

        for(i=0; i<a; i++){
            for(j=0; j<a; j++){
                System.out.print("Informe o número da posição " + "[" + i + "]" + "[" + j + "] da matriz 1: " );
                matriz1[i][j] = tecla.nextInt();
            }
        }

        for(i=0; i<a; i++){
            for(j=0; j<a; j++){
                System.out.print("Informe o número da posição " + "[" + i + "]" + "[" + j + "] da matriz 2: " );
                matriz2[i][j] = tecla.nextInt();
            }
        }

        System.out.println("Matriz 3:");
        for(i=0; i<a; i++){
            for(j=0; j<a; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print("[" + matriz3[i][j] + "] ");
            }
            System.out.print("\n");
        }
    }    
}
