public class Gabinete {
    String marca;
    String cor;
    boolean aberto;
    boolean ligado;
    void status(){
        System.out.println("===Status do gabinete===");
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está aberto? " + this.aberto);
        System.out.println("Está ligado? " + this.ligado);
    }
    void botaoOnOff(){
        if (this.ligado){
            System.out.println("Desligando o computador...");
            this.ligado = !this.ligado;
        }else{
            System.out.println("Ligando o computador...");
            this.ligado = !this.ligado;
        }
    }
    void abrir(){
        this.aberto = true;
    }
    void fechar(){
        this.aberto = false;
    }
}
