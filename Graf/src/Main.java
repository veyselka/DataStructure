public class Main {
    public static void main(String[] args) {
        graf g=new graf(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        System.out.println(g.tostring());
        System.out.println("yonsuzmu ?"+g.yonsuzMu());
    }
}