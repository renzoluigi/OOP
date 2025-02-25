public class ProgramaPrincipal {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Curso em Video");
        v[1] = new Video("Jogando jogos");
        v[2] = new Video("Me at zoo");

        for(Video video:v){
            System.out.println(video.toString());
        }
        Gafanhoto g1 = new Gafanhoto("Renzo",18,"M","renzoo");
        System.out.println(g1.toString());

        Gafanhoto g2 = new Gafanhoto("Ronald",22,"F","oronaldd");

        Visualizacao[] vis = new Visualizacao[3];

        vis[0] = new Visualizacao(g1,v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());


        vis[1] = new Visualizacao(g1,v[1]);
        vis[1].avaliar(44f);
        System.out.println(vis[1].toString());

        vis[2] = new Visualizacao(g2,v[0]);
        vis[2].avaliar(8);
        System.out.println(vis[2].toString());
    }
}
