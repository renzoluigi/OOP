import java.util.Scanner;

public class Banco{
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean aberta;
    //construtor
    public Banco(){
        this.nome = null;
        this.saldo = 0f;
        this.aberta = false;
        this.numConta = 0;
        this.tipo = null;
    }
    //status
    public void status(){
        System.out.println("=== STATUS DA SUA CONTA ===");
        System.out.println("Titular: " + getNome());
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo de conta: " + getTipo());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Conta está aberta? " + getAberta());
    }
    //getter e setters
    public boolean getAberta(){return this.aberta;}
    private void setAberta(boolean e){aberta = e;}
    public int getNumConta(){return this.numConta;}
    private void setNumConta(){this.numConta = (int) (Math.random()*1000);}
    public String getNome(){return this.nome;}
    private void setNome(String n){this.nome = n;}
    public float getSaldo(){return this.saldo;}
    public String getTipo(){return this.tipo;}
    private void setTipo(String t){this.tipo = t;}
    //metodos
    public void abrirConta(){
        if (!getAberta()) {
            System.out.println("Bem-vindo ao YellowBank");
            Scanner input = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            setNome(input.nextLine());
            System.out.println("Caso deseje abrir uma conta corrente, você ganhará um bônus de 50 reais, caso deseje uma conta poupança, receberá um bônus de 150 reais");
            System.out.print("Conta Corrente ou Conta Poupança? [CC/CP] ");
            String n = input.nextLine();
            if (n.equals("CC")) {
                System.out.println("Abrindo uma conta corrente...");
                setAberta(true);
                depositar(50);
                setNumConta();
                setTipo(n);
                System.out.println("Conta corrente aberta com sucesso!");
            } else if (n.equals("CP")) {
                System.out.println("Abrindo uma conta poupança...");
                setAberta(true);
                setNumConta();
                setTipo(n);
                depositar(50);
                System.out.println("Conta poupança aberta com sucesso.");
            }else{
                System.out.println("Você não digitou uma opção válida, tente realizar a operação novamente!");
            }
        } else {
            System.out.println("Sua conta já está aberta!");
        }
    }

    public void fecharConta(){
        if (getAberta()) {
            if (this.saldo == 0) {
                System.out.println("Fechando a conta...");
                setAberta(false);
                System.out.println("Conta fechada com sucesso");
            }else if (this.saldo<0){
                System.out.println("Você não pode fechar a conta tendo débito com o banco!");
            }else{
                System.out.println("Você não pode fechar a conta com saldo.");
            }
        }else{
            System.out.println("ERRO! Sua conta não foi aberta ainda.");
        }
    }
    public void depositar(float valor){
        if (getAberta()){
            this.saldo  += valor;
            System.out.println("Depósito de " + valor + "realizado.");
        }else{
            System.out.println("ERRO! Você não tem uma conta aberta.");
        }
    }
    public void sacar(float valor){
        if (getAberta()){
            if (getSaldo()-valor < -150){System.out.println("Saque inválido, saldo com limite negativo");}
            else{
                this.saldo -= valor;
                System.out.println("Foram sacados " + valor + " reais.");
            }
        }else{
            System.out.println("ERRO! Você não tem uma conta aberta.");
        }
    }
    public void pagarMensal(){
        if (getTipo().equals("CC")) {this.saldo-=12f;}
        else {this.saldo-=20f;}
    }
}
