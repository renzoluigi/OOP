public class Aula02 {
    public static void main(String[] args) {
        Caneta00 c1 = new Caneta00(); //instanciacao
        c1.carga = 70;
        //c1.tampada = true;
        c1.cor = "Vermelha";
        c1.modelo = "Bic";
        //c1.ponta = 0.5f; (privada)
        //metodos
        c1.status();
        //c1.rabiscar();
        c1.alternar_tampada();

        Caneta00 c2 = new Caneta00();
        c2.modelo = "YellowDiamond";
        c2.carga = 1;

        c2.status();
        //c2.rabiscar();
        //c2.rabiscar();
    }
}
