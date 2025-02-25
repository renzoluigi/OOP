public class Caneta01 {
    public String modelo;
    private float ponta;
    private boolean tampada;
    public String cor;

    //metodo construtor (padronizador)
    public Caneta01(String m,String c,float p) {
        setModelo(m);
        this.cor = c;
        setPonta(p);
        this.tampar();
    }

    public void status(){
        System.out.println("===SOBRE A CANETA===");
        System.out.println("O modelo da caneta é: " + this.getModelo());
        System.out.println("A ponta da caneta tem: " + this.getPonta() + "mm.");
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

}
