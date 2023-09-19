public class Estudante {
    private double nota1;
    private double nota2;
    private double nota3;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota3() {
        return nota3;
    }
    public void calculaMedia(){
        double media = (nota1 + nota2 + nota3);
        System.out.println("Nota final: " + media);
        if (media < 60) {
            System.out.println("Falhou!");
            double qntdRestante = 60 - media;
            System.out.println("Necessita de " + qntdRestante + " pontos.");
        }else{
            System.out.println("Passou!");
        }
    }
}
