import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dugum d=new Dugum(5);
        Dugum d1=new Dugum(8);
        Dugum d2=new Dugum(11);
        Dugum d3=new Dugum(15);
        Dugum d4=new Dugum(18);
        Lıste l=new Lıste();
        l.basaekle(d);
        l.listele();
        l.basaekle(d1);
        l.listele();
        l.sonaekle(d2);
        l.listele();
        l.bastansil();
        l.listele();
        l.sondansil();
        l.listele();
        l.basaekle(d3);
        l.listele();
        l.sonaekle(d4);
        l.listele();
        l.aranansayı(15);
        l.arayaekleme(15,d1);
        l.listele();
        l.girilenElemaniSil(18);
        l.listele();
    }
}