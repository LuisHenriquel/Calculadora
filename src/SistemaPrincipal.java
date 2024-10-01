import java.util.Scanner;

public class SistemaPrincipal{
public static void main(String[] args) {
boolean loop = true;
    while (loop){
        SistemaCalculadora calcu = new SistemaCalculadora();
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Para fazer Adição digite [1]");
        System.out.println("Para fazer Subtração digite [2]");
        System.out.println("Para fazer Divisão digite [3]");
        System.out.println("Para fazer multiplicação digite [4]");
        System.out.println("Para Sair digite [5]");
        int opcao = scan.nextInt();
        scan.nextLine();



            switch (opcao) {
                case 1: {
                    System.out.println("Digite o primeiro numero");
                    double nume = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o segundo numero");
                    double nume2 = scan.nextInt();
                    scan.nextLine();
                    calcu.Adicao(nume, nume2);
                    break;

                }
                case 2: {
                    System.out.println("Digite o primeiro numero");
                    double nume = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o segundo numero");
                    double nume2 = scan.nextInt();
                    scan.nextLine();
                    calcu.Subtracao(nume, nume2);
                    break;
                }
                case 3: {
                    System.out.println("Digite o primeiro numero");
                    double nume = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o segundo numero");
                    double nume2 = scan.nextInt();
                    scan.nextLine();
                    calcu.Divisao(nume, nume2);
                    break;
                }
                case 4: {
                    System.out.println("Digite o primeiro numero");
                    double nume = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o segundo numero");
                    double nume2 = scan.nextInt();
                    scan.nextLine();
                    calcu.Multiplicacao(nume, nume2);
                    break;
                }
                case 5: {

                    System.out.println("Saindo da calculadora............");
                    loop =false;
                    break;
                }
                default: {
                    System.out.println("[ERRO] Digite uma opção valida");
                }


            }

        }

    }
}