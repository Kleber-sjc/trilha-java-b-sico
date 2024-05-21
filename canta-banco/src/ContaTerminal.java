import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
       //TODO:Conhecer e importar a casse Scaner

       //Exibir as mensagens para o nosso usuário

       //Obter pala scaner os valores digitados no terminal

       //Exibir a mensagem conta criada
       System.out.println("\n==== Olá!, seja bem vindo ao Banco DIO. ====\n");
    
       float saldo = 237.48f;
       //int conta = teclado.nextInt();
       //int agencia = teclado.nextInt();
       //String nome= teclado.nextLine();


       System.out.print( "Digite o nome de usuário: ");
       String nome = teclado.nextLine();
       System.out.print( "Digite o número da agência: ");
       int agencia = teclado.nextInt();
       System.out.print( "Digite o número da conta ");
       int conta = teclado.nextInt();
       System.out.printf("\nO saldo em conta é R$"+saldo);
       System.out.println("\nOlá! "+nome+",obrigado por criar uma conta em nosso banco, sua agência é "+agencia+ ",conta "+conta+" e seu saldo "+saldo+" já está disponivel para saque.\n\n");



    }
}
