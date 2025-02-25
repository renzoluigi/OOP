public class ProgramaPrincipal {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor p1 = new Professor();
        b1.setMatricula(102);
        b1.setNome("Rodo");
        b1.renovarBolsa();
        b1.pagarMensalidade();
        p1.setSalario(1000);
        System.out.println(p1.getSalario());
        p1.receberAumento(10);
        System.out.println(p1.getSalario());
    }
}
