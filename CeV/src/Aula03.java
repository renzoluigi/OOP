public class Aula03 {
    public static void main(String[] args) {
        Caneta00 c1 = new Caneta00();
        c1.carga = 70;
        // o atributo eh protegido, mas ao realizar a chamada de classe "Caneta00 c1 = new Caneta00();" os atributos listados estao dentro da classe.
        c1.status();
        c1.alternar_tampada();
        c1.status();
        //c1.rabiscar();
    }
}
