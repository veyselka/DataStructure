public class Main {
    public static void main(String[] args) {
        Kuyruk kuyruk=new Kuyruk(5);
        Ogrenci yeni=new Ogrenci(123,"Ali");
        kuyruk.sekle(yeni);
        kuyruk.Listele();
        yeni=new Ogrenci(345,"veli");
        kuyruk.sekle(yeni);
        kuyruk.Listele();
        yeni=new Ogrenci(678,"selim");
        kuyruk.sekle(yeni);
        kuyruk.Listele();
        yeni=new Ogrenci(910,"muro");
        kuyruk.sekle(yeni);
        kuyruk.Listele();
        yeni=new Ogrenci(111,"yusi");
        kuyruk.sekle(yeni);
        kuyruk.Listele();
    }
}