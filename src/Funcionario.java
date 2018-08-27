import java.util.Scanner;

public class Funcionario {

    String nomeFunc;
    String enderecoFunc;
    String telefoneFunc;
    String cpfFunc;
    String ctpsFunc;
    double salarioFunc;

    public void lerDados (){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        this.nomeFunc = s.nextLine();

        System.out.println("Digite o endereço do funcionário:");
        this.enderecoFunc = s.nextLine();

        System.out.println("Digite o telefone do funcionário:");
        this.telefoneFunc = s.nextLine();

        System.out.println("Digite o CPF do funcionário:");
        this.cpfFunc = s.nextLine();

        System.out.println("Digite a CTPS do funcionário:");
        this.ctpsFunc = s.nextLine();

        System.out.println("Digite o salário do funcionário:");
        this.salarioFunc = s.nextDouble();

    }

    public void mostrarDados (){

        System.out.println("Nome: " + this.nomeFunc);
        System.out.println("Nome: " + this.enderecoFunc);
        System.out.println("Nome: " + this.telefoneFunc);
        System.out.println("Nome: " + this.cpfFunc);
        System.out.println("Nome: " + this.ctpsFunc);
        System.out.println("Nome: " + this.salarioFunc);


    }
}
