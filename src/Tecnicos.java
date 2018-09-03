import java.util.Scanner;

public class Tecnicos extends Funcionario {

    String cargoTecnico;
    String departamentoTecnico;
    Funcionario funcionario;

    public void lerDados (){

        super.lerDados();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o cargo do técnico:");
        this.cargoTecnico = s.nextLine();
        System.out.println("Digite o endereço do técnico:");
        this.departamentoTecnico = s.nextLine();
    }

    public void mostrarDados (){

        super.mostrarDados();
        System.out.println("Cargo: " + this.cargoTecnico);
        System.out.println("Departamento: " + this.departamentoTecnico);
    }
}
