import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe10 {
    public static final int CAPACIDADE = 50;
    public static int[] vetor = new int[CAPACIDADE];
    public static int tamanho = 0;

    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluirValor();
                    break;
                case 2:
                    pesquisarValor();
                    break;
                case 3:
                    alterarValor();
                    break;
                case 4:
                    excluirValor();
                    break;
                case 5:
                    mostrarValores();
                    break;
                case 6:
                    ordenarValores(vetor);
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 8);

        sc.close();
    }

    public static void incluirValor() {
        Scanner sc = new Scanner(System.in);

        if (tamanho >= CAPACIDADE) {
            System.out.println("Não é possível incluir mais valores. O vetor está cheio.");
            return;
        }

        System.out.print("Digite o valor a ser incluído: ");
        int valor = sc.nextInt();
        vetor[tamanho] = valor;
        tamanho++;
        System.out.println("Valor incluído no vetor.");
    } 

    public static void pesquisarValor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor a ser pesquisado: ");
        int valor = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O valor está presente no vetor.");
        } else {
            System.out.println("O valor não foi encontrado no vetor.");
        }
    }

    public static void alterarValor() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número a ser alterado: ");
    int numantigo = sc.nextInt();
    System.out.println("Digite o novo número: ");
    int numnovo = sc.nextInt();
    boolean encontrado = false;
    
    for (int i = 0; i < tamanho; i++) {
        if (vetor[i] == numantigo) {
        vetor[i] = numnovo;
        encontrado = true;
    }}
    if (encontrado) {
        System.out.println("O número foi alterado.");
    }else{
        System.out.println("O número não foi encontrado.");
    } 
    }

    public static void excluirValor() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor a ser excluído");
    int excluido = sc.nextInt();
    boolean encontrado = false;
    for(int i = 0; i < tamanho; i++){
        if (vetor[i] == excluido) {
            vetor[i] = vetor[i + 1];
            encontrado = true;
            tamanho--;
        }
    } if (encontrado) {
        System.out.println("O valor foi excluído.");
    } else{
        System.out.println("O valor informado não está presente no vetor.");
    }
    }

    public static void mostrarValores() {
    for(int i = 0; i < tamanho; i++){
        System.out.print(vetor[i] + " ");
    }
    }
    private static void ordenarValores(int vetor[]) {
      Arrays.sort(vetor, 0, tamanho);
        
        System.out.println("Valores ordenados em ordem crescente:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

        
    
    private static void inverterValores() {
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
        
        System.out.println("Valores invertidos:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}