public class Aluno extends Pessoa { //classe filha/subclasse
    private int matr;
    private String curso;

    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada.");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int m) {
        this.matr = m;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String c) {
        this.curso = c;
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
