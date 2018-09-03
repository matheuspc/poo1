import java.util.Scanner;

public class Funcionario extends Pessoa{

    String enderecoFunc;
    String telefoneFunc;
    String ctpsFunc;
    double salarioFunc;

    public void lerDados (){
        super.lerDados();

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o endereço do funcionário:");
        this.enderecoFunc = s.nextLine();

        System.out.println("Digite o telefone do funcionário:");
        this.telefoneFunc = s.nextLine();

        System.out.println("Digite a CTPS do funcionário:");
        this.ctpsFunc = s.nextLine();

        System.out.println("Digite o salário do funcionário:");
        this.salarioFunc = s.nextDouble();

    }

    public void mostrarDados (){

        super.mostrarDados();
        System.out.println("Endereço do Funcioniário: " + this.enderecoFunc);
        System.out.println("Telefone do Funcioniário: " + this.telefoneFunc);
        System.out.println("CTPS do Funcioniário: " + this.ctpsFunc);
        System.out.println("Salário do Funcioniário: " + this.salarioFunc);


    }
}
