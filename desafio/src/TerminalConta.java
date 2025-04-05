import java.util.Locale;
import java.util.Scanner;



public class TerminalConta {
    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //TODO:Exibir as mensagens para o nosso usuario;
        System.out.println("==========================");
        System.out.println("||Vamos criar uma conta||");
        System.out.println("==========================");


        //TODO:Obter pela scanner os valores digitados no terminal;
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta=scanner.nextInt();

        System.out.println("=============================");
        System.out.println("Por favor, digite o número da Agência");
        String agencia=scanner.next();
        scanner.nextLine();
        //desviei da atividade pois fiquei curioso porque ele so lia uma linha em vez dela toda .
        System.out.println("=============================");
        System.out.println("Por favor,digite o seu nome:");
        String nome=scanner.nextLine();
        System.out.println("=============================");
        System.out.println("Informe o seu saldo:");
        double saldo=scanner.nextDouble();
        //TODO:Exibir a mensagem conta criada;
        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.println("Olá "+nome+",obrigado por criar uma conta em nosso banco, sua agência é "+agencia+",conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");
    }


}