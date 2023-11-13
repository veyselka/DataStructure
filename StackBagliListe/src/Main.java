public class Main {
    public static void main(String[] args) {
        Liste l=new Liste();
        Eleman e=new Eleman(12);
        l.push(e);
        l.listele();
        e=new Eleman(31);
        l.push(e);
        l.listele();
        e=new Eleman(42);
        l.push(e);
        l.listele();
        e =new Eleman(65);
        l.push(e);
        l.listele();
        l.pop();
        l.listele();
        l.aranan(11);
        l.listele();


    }
}