public class Kuyruk {
    Ogrenci [] dizi;
    int size;
    int bas;
    int son;
    Kuyruk(int size){
        this.size=size;
        dizi=new Ogrenci[size];
        bas=0;
        son=0;
    }
    boolean doluMu(){
        return bas==(son+1)%size;
    }
    boolean bosMu(){
        return bas==son;
    }
    void sekle(Ogrenci yeni){
        if (!doluMu()){
            dizi[son]=yeni;
            son=(son+1)%size;

        } else {
            System.out.println("kuyruk dolu");
        }
    }
    Ogrenci bsil(){
        Ogrenci temp;
        if (!bosMu()){
            temp=dizi[bas];
            bas=(bas+1)%size;

        }
        System.out.println("Kuyruk boş");
        return null;
    }
    void Listele(){
        int index=bas;
        if (!bosMu()){
            while (index!=son){
                if (dizi[index]!=null){
                    System.out.print(dizi[index].no+" "+dizi[index].isim);
                    System.out.println(" ");
                }
                index=(index+1)%size;
            }
            System.out.println("--------------------");
        }else {
            System.out.println("kuyruk boş");
        }
    }
}
