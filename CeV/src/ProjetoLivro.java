public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("Renzo",18,"Masculino");
        p[1] = new Pessoa("Sofia",20,"Feminino");

        l[0] = new Livro("Aprendendo Java","Gustavo Guanabara",200,p[0]);
        l[1] = new Livro("Ultra-aprendizado","Scott Young",304,p[0]);
        l[2] = new Livro("Trono de vidro","Marta Simonsen",537,p[1]);
        l[1].abrir();
        l[1].folhear(200);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
    }
}
