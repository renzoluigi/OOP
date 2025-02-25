public class Caneta00 {
    //atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    //metodos (procedimentos)
    public void status() {
        System.out.println("===Status da " + this + "===");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
    private void rabiscar() {
        if (this.tampada) {
            System.out.println("A caneta está tampada, destampe para rabiscar!");
        } else if (this.carga <= 0) {
            System.out.println("Impossível rabiscar, a carga está zerada!");
        } else {
            System.out.println("Rabiscando!");
            this.carga--;
        }
    }
    public void alternar_tampada(){
        this.tampada = !this.tampada;
        //this se refere ao objeto que realizou a chamada
    }
}
