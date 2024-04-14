import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int acao = 0;
        float saldoAdicional = 0;
        float saldoRetirado = 0;
        float saldo = 3000;
        System.out.println("""
                ****************************************************
                        Dados do cliente:
                        Nome:           Vitor Moreira Araujo
                        Tipo conta:     Corrente
                        Saldo Inicial:  %f
                ****************************************************
                """.formatted(saldo));
        while(acao != 4){
            System.out.println("""
                        Operações:
                        
                        1 - Consultar saldo
                        2 - Receber Valor
                        3 - Transferir valor
                        4 - Sair
                        
                        Digite a opção desejada
                        """.formatted(saldo)
            );
            acao = leitura.nextInt();
            switch (acao){
                case 1:
                    System.out.println("O saldo na conta é: " + saldo);

                    break;
                case 2:
                    System.out.println("Digite o valor que irá receber");
                    saldoAdicional = leitura.nextFloat();
                    saldo = saldo + saldoAdicional;
                    System.out.println("Saldo atualizado R$" + saldo);

                    break;
                case 3:
                    System.out.println("Informe o valor que irá transferir");
                    saldoRetirado = leitura.nextFloat();
                    if (saldoRetirado > saldo){
                        System.out.println("Saldo insuficiente para a transferência, tente novamente");
                    } else {
                        saldo = saldo - saldoRetirado;
                        System.out.println("Saldo atual é " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando inválido, tente novamente");
            }
        }




    }
}