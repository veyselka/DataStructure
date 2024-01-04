public class Kuyruk {
    Dugum bas,son;
    Kuyruk(){
        bas=null;
        son=null;
    }

    boolean bosMu(){
        return bas==null;
    }
    void sEkle(Dugum yeni){
        if (bosMu()){
            bas=yeni;
            son=yeni;
        }else {
            son.ileri=yeni;
            son=yeni;
        }
    }
    Dugum bSilme(){
        Dugum temp=bas;
        if (!bosMu()){
            bas=bas.ileri;
            if (bas==null){
                son=null;
            }
        }
        return temp;
    }
    void listele(){
        Dugum temp=bas;
        if (!bosMu()){
            while (temp!=null){
                System.out.print(temp.içerik+"-->");
                temp=temp.ileri;
            }
            System.out.println(" ");
            System.out.println("---------------------------");
        }else {
            System.out.println("kuyruk boş");
        }
    }
}
