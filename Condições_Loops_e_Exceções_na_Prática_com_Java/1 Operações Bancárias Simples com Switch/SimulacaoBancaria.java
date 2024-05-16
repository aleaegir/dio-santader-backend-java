import java.util.Scanner;

public class SimulacaoBancaria {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       double saldo = 0;

       while (true) {

           int opcao = scanner.nextInt();

           switch (opcao) {

               case 1: //DEPOSITAR

                   double saldoProv = scanner.nextDouble();

                   saldo += saldoProv;

                   System.out.println("Saldo atual: "+saldo);

                   break;

               case 2: // SACAR

                   double saldoRetirada = scanner.nextDouble();

                   if( saldoRetirada <= saldo){

                       saldo -= saldoRetirada;

                       System.out.println("Saldo atual: "+saldo);

                   }else {

                       System.out.println("Saldo insuficiente.");

                   }

                   break;

               case 3: // CONSULTAR SALDO

                   System.out.println("Saldo atual: "+saldo);

                   break;

               case 0:

                   System.out.println("Programa encerrado.");

                   return;

               default:// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:

                   System.out.println("Opção inválida. Tente novamente.");

           }

       }

   }

}

