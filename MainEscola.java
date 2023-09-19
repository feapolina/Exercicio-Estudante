import java.util.Locale;
import java.util.Scanner;

public class MainEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //
        Estudante aluno = new Estudante();

        //atribuindo o nome
        System.out.println("Nome: ");
        aluno.setNome(sc.nextLine());

        // conferindo se a primeira nota ta no intervalo 1-30
        do {
            System.out.println("Digite a nota 1: ");
            aluno.setNota1(sc.nextDouble());
        }while(aluno.getNota1() < 1 || aluno.getNota1() > 30);

        //conferindo se a segunda nota ta no intervalo 1-35
        do {
            System.out.println("Digite a nota 2: ");
            aluno.setNota2(sc.nextDouble());
        }while(aluno.getNota2() < 1 || aluno.getNota2() > 35);

        //conferindo se a terceira nota ta no intervalo 1-35
        do {
            System.out.println("Digite a nota 3: ");
            aluno.setNota3(sc.nextDouble());
        }while(aluno.getNota3() < 1 || aluno.getNota3() > 35);
        aluno.calculaMedia();
        sc.close();



    }
}
