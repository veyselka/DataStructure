public class Main {
    public static void main(String[] args) {
        Kuyruk k=new Kuyruk();
        Dugum yeni=new Dugum(15);
        k.sEkle(yeni);
        k.listele();
        yeni=new Dugum(16);
        k.sEkle(yeni);
        k.listele();
        yeni=new Dugum(17);
        k.sEkle(yeni);
        k.listele();
        yeni=new Dugum(18);
        k.sEkle(yeni);
        k.listele();
        yeni=new Dugum(19);
        k.sEkle(yeni);
        k.listele();
        k.bSilme();
        k.listele();

    }
}