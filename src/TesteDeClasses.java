public class TesteDeClasses {
    public static void main(String[] args) {
        Gabinete g1 = new Gabinete();
        g1.marca = "Tdagger";
        g1.cor = "Preto";

        g1.status();
        g1.botaoOnOff();
        g1.status();
        g1.abrir();
        g1.status();
        g1.fechar();
        g1.botaoOnOff();
        g1.status();
    }
}
