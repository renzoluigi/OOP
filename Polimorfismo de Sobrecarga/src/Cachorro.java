public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("Au!Au!Au!");
    }

    public void reagir(String frase){ // mesmo metodo, assinatura diferente (qntd e tipo de parametros)
        if (frase == "Toma comida" || frase == "Olá"){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora,int min){ // mesmo metodo, assinatura diferente (qntd e tipo de parametros)
        if (hora <12){
            System.out.println("Abanar");
        } else if (hora>=18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){ // mesmo metodo, assinatura diferente (qntd e tipo de parametros)
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade, float peso){ // mesmo metodo, assinatura diferente (qntd e tipo de parametros)
        if (idade<5){
            if (peso<10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso<10){
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
