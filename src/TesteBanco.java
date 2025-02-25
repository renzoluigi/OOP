public class TesteBanco {
    public static void main(String[] args) {
        Banco c1 = new Banco();
        c1.abrirConta();
        c1.depositar(150);
        c1.sacar(300);
        c1.fecharConta();
        c1.status();
        Banco c2 = new Banco();
        c2.abrirConta();
        c2.pagarMensal();
        c2.sacar(120);
        c2.status();
    }
}
