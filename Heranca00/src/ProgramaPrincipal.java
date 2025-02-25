public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        p1.setNome("Sofia");
        p2.setNome("Renzo");
        p3.setNome("Renan");
        p4.setNome("Claudio");

        p1.setIdade(18);
        p2.setIdade(18);
        p3.setIdade(20);
        p4.setIdade(33);

        p2.setCurso("Engenharia de Software");
        //p1.setCurso("Engenharia de Software");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
