import java.util.Scanner;

public class Curso {

    String codigoCurso;
    String nomeCurso;
    double duracaoCurso;

    public void lerDados(){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o código do curso:");
        this.codigoCurso = s.nextLine();

        System.out.println("Digite o nome do curso:");
        this.nomeCurso = s.nextLine();

        System.out.println("Digite a duração do curso:");
        this.duracaoCurso = s.nextDouble();

    }

    public void mostrarDados(){

        System.out.println("Código do curso: " + this.codigoCurso);
        System.out.println("Nome do curso: " + this.nomeCurso);
        System.out.println("Duração do curso: " + this.duracaoCurso);

    }

}
