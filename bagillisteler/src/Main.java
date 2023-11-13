public class Main {
    public static void main(String[] args) {
        Liste l=new Liste();
        Eleman e1=new Eleman(5);
        Eleman e2=new Eleman(7);
        Eleman e3=new Eleman(8);
        l.sonaEkle(e1);
        l.sonaEkle(e2);
        l.başaEkle(e3);
        l.başaEkle(new Eleman(9));
        l.elemanArama(7);
        l.Listele();
        System.out.println("silinen eleman :"+l.sondanSil().veri);


        l.Listele();
    }
}
