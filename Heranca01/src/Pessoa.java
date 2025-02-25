public abstract class Pessoa { //classes abstratas nao instanciam objetos
    protected String nome; //todas as subclasses tem acesso, e podem usar this.nome ou this.nome = xyz
    protected int idade;
    protected String sexo;

    public final void fazerAniv(){
        setIdade(getIdade()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
