import java.util.Scanner;

public class Aluno extends Pessoa {

    String matriculaAluno;
    Curso curso;

    public void lerDados(){
        super.lerDados();
        Scanner s = new Scanner(System.in);

        this.curso = new Curso();
        this.curso.lerDados();

        System.out.println("Digite a matrícula do aluno:");
        this.matriculaAluno = s.nextLine();

    }

    public void mostrarDados (){
        super.mostrarDados();
        this.curso.mostrarDados();
        System.out.println("Matrícula do aluno: " + this.matriculaAluno);
    }
}
