public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String t,String a,int totP,Pessoa l) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = totP;
        this.aberto = false;
        pagAtual = 0;
        this.leitor = l;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ",\ntotPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ",\nleitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() +
                ", sexo=" +  leitor.getSexo() +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {setAberto(true);}

    @Override
    public void fechar() {setAberto(false);}

    @Override
    public void folhear(int p) {
        if (getAberto()){
            if (p > getTotPaginas()){
                setPagAtual(0);
            } else {
                setPagAtual(p);
            }
        } else {
            System.out.println("Não há como folhear um livro que está fechado!");
        }
    }

    @Override
    public void avancarPag() {
        if (getAberto()){
            setPagAtual(getPagAtual()+1);
        } else {
            System.out.println("O livro está fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if (getAberto()){
            setPagAtual(getPagAtual()-1);
        } else {
            System.out.println("O livro está fechado!");
        }
    }
}
