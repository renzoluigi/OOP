public class Professor extends Pessoa { //classe filha/subclasse
    private String especialidade;
    private float salario;


    public void receberAumento(float a){
        setSalario(getSalario() + a);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String e) {
        this.especialidade = e;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float s) {
        this.salario = s;
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
