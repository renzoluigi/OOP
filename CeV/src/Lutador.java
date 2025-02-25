public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //construtor
    public Lutador(String no,String na,int id,float al,float pe,int vi,int de,int em) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }

    //getters e setters
    public String getNome(){return this.nome;}
    public void setNome(String no){this.nome = no;}
    public String getNacionalidade(){return this.nacionalidade;}
    public void setNacionalidade(String na){this.nacionalidade = na;}
    public int getIdade(){return this.idade;}
    public void setIdade(int id){this.idade = id;}
    public float getAltura(){return this.altura;}
    public void setAltura(float al){this.altura = al;}
    public float getPeso(){return this.peso;}
    public void setPeso(float pe){
        this.peso = pe;
        setCategoria();
    }
    public String getCategoria(){return this.categoria;}
    public void setCategoria(){
        if (this.peso < 52.2){this.categoria = "Inválido";}
        else if (this.peso <= 70.3){this.categoria = "Peso-Leve";}
        else if (this.peso <= 77.1){this.categoria = "Peso Meio-Médio";}
        else if (this.peso <= 83.9){this.categoria = "Peso-Médio";}
        else if (this.peso <= 92.9){this.categoria = "Peso Meio-Pesado";}
        else if (this.peso <= 120.2){this.categoria = "Peso-Pesado";}
        else{this.categoria = "Inválido";}
    }
    public int getVitorias(){return this.vitorias;}
    public void setVitorias(int v){this.vitorias = v;}
    public int getDerrotas(){return this.derrotas;}
    public void setDerrotas(int d){this.derrotas = d;}
    public int getEmpates(){return this.empates;}
    public void setEmpates(int e){this.empates = e;}

    //metodos
    public void apresentar(){
        System.out.println("=== APRESENTAÇÃO ===");
        System.out.println("Lutador: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Peso: " + getPeso() + "kg");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("====================");
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("Categoria " + getCategoria());
        System.out.println(getVitorias() + "vitórias");
        System.out.println(getDerrotas() + "derrotas.");
        System.out.println(getEmpates() + "empates.");
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
}
