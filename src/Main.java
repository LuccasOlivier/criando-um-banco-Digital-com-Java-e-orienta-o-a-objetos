import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Criar cliente com nome e senha
        Cliente cliente1 = new Cliente("Lucas", "senha123");
        cliente1.setNome("Lucas");

        // Solicitar senha para autenticação
        System.out.println("Digite a senha para autenticar");
        String senhaInput = scanner.nextLine();

        if(cliente1.autenticar(senhaInput)){
            System.out.println("Autenticação bem-sucedida!");

            //Criar contas para clientes autenticados
            Conta cc = new ContaCorrente(cliente1);
            Conta cp = new ContaPoupanca(cliente1);

            //Operações com as contas
            cc.depositar(100);
            cc.transferir(50, cp);

            //Exibir Extratos
            cc.imprimirExtrato();
            cp.imprimirExtrato();
        } else{
            System.out.println("Senha incorreto. Acesso negado.");
        }
        scanner.close();
    }
}
