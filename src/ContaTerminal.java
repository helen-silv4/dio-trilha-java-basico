import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // para considerar o separador de decimais como PONTO
        Locale.setDefault(Locale.US);

        // instância da classe Scanner
        Scanner entrada = new Scanner(System.in);

        // atributos
        int numero, agencia;
        String nomeCliente;
        float saldo;

        // solicitando entrada de dados e armazenando nas variáveis
        System.out.println("----------------- CONTA BANCÁRIA -----------------");
        System.out.print("Digite o número: ");
        numero = entrada.nextInt();
        System.out.print("Digite a agência: ");
        agencia = entrada.nextInt();
        System.out.print("Digite o nome do titular: ");
        nomeCliente = entrada.next();
        System.out.print("Digite o saldo: ");
        saldo = entrada.nextFloat();

        // encerrando Scanner
        entrada.close();

        // saída de dados
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + String.format("%03d-%d", agencia / 10, agencia % 10) +
                           ", conta " + numero + " e seu saldo R$" + String.format("%.2f", saldo) +
                           " já está disponível para saque!" );
    }
}