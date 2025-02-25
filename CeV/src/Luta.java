public class Luta {
    private Lutador desafiado; //tipo abstrato de dados
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {setAprovada(false);}

    public Lutador getDesafiado() {return this.desafiado;}

    public void setDesafiado(Lutador dd) {this.desafiado = dd;}

    public Lutador getDesafiante() {return this.desafiante;}

    public void setDesafiante(Lutador de) {this.desafiante = de;}

    public int getRounds() {return this.rounds;}

    public void setRounds(int r) {this.rounds = r;}

    public boolean getAprovada() {return this.aprovada;}

    public void setAprovada(boolean ap) {this.aprovada = ap;}

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())) {
            if (l1 == l2){
                System.out.println("ERRO! Os lutadores não podem ser a mesma pessoa.");
            } else {
                setAprovada(true);
                setDesafiado(l1);
                setDesafiante(l2);
                System.out.println("Luta entre " + l1.getNome() + " e " + l2.getNome() + " marcada!");
            }
        } else {
            System.out.println("ERRO! Os lutadores devem ser da mesma categoria.");
        }
    }

    public void lutar() {
        if (getAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();
            double probabilidade = Math.random() * 100;
            if (probabilidade < 40) { // 40% de chance para o desafiado vencer
                System.out.println("O GANHADOR FOI... " + desafiado.getNome().toUpperCase() + "!!!!");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else if (probabilidade < 80) { // 40% de chance para o desafiante vencer
                System.out.println("O GANHADOR FOI... " + desafiante.getNome().toUpperCase() + "!!!!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            } else { // 20% de chance de empate
                System.out.println("A LUTA FOI DEFINIDA COMO... EMPATE!!!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            }
        } else {
            System.out.println("Não há nenhuma luta marcada!");
        }
    }
}
