public class Funcionario extends Pessoa { //classe filha/subclasse
    private String setor;
    private boolean trabalhando;


    public void mudarTrabalho(){
        setTrabalhando(!getTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String s) {
        this.setor = s;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean t) {
        this.trabalhando = t;
    }

    @Override
    public void fazerAniv() {
        super.fazerAniv();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String n) {
        super.setNome(n);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int i) {
        super.setIdade(i);
    }

    @Override
    public String getSexo() {
        return super.getSexo();
    }

    @Override
    public void setSexo(String s) {
        super.setSexo(s);
    }
}
