public class Lıste {
    Dugum bas,son;
    Lıste(){
        bas=null;
        son=null;
    }
    public void basaekle(Dugum yeni){
        if(bas==null){
            son=yeni;
            bas=yeni;
        }else {
            bas.geri=yeni;
            yeni.ileri=bas;
            bas=yeni;
        }
    }
    public void sonaekle(Dugum yeni){
        if(son==null){
            bas=yeni;
            son=yeni;
        }else {
            son.ileri=yeni;
            yeni.geri=son;
            son=yeni;
        }
    }
    public void listele(){
        if(bas==null){
            System.out.println("liste boş");
        }else {
            Dugum temp=bas;
            while (temp!=null){
                System.out.print(temp.icerik+"-->");
                temp=temp.ileri;
            }
            System.out.println(" ");
        }
    }
    public void bastansil(){
        if (bas==null){
            System.out.println("liste boş");
        }else{
            bas=bas.ileri;
            if (bas==null){
                son=null;
            }else {
                bas.geri=null;
            }
        }
    }
    public void sondansil(){
        if (son==null){
            System.out.println("liste boş");
        }else {
            son=son.geri;
            if (son==null){
                bas=null;
            }else {
                son.ileri=null;
            }
        }
    }

    public void aranansayı(int aranan){
        Dugum temp=bas;
        while(temp!=null){
            if (aranan== temp.icerik){
                System.out.println("Aranan sayı bulundu :"+temp.icerik);
                break;
            }
            temp=temp.ileri;
        }
        if (temp==null){
            System.out.println("aranan sayı bulunamadı");
        }
    }
    public void arayaekleme(int nereye,Dugum eklenecek){
        Dugum temp=bas;
        while(temp!=null){
            if (nereye==temp.icerik){
                eklenecek.ileri=temp.ileri;
                eklenecek.geri=temp;
                temp.ileri=eklenecek;
                eklenecek.ileri.geri=eklenecek;
                break;
            }
            temp=temp.ileri;
        }
        if (temp==null){
            System.out.println("girdiğiniz sayı listede bulunamadı");
        }
    }
    public void girilenElemaniSil(int aranan){
        Dugum temp=bas;
        Dugum once;
        while (temp!=null){
            if (temp.icerik==aranan){
                once=temp.geri;
                if (once==null){//bu durumda temp==bas olur o yüzden bştan sile uygulayacaz
                    bas=temp.ileri;
                    bas.geri=null;
                    //bastansil();
                    break;
                } else if (temp.ileri==null) {//bu durumda temp==son olur o yüzden sondan sil uygulayacaz
                    son=temp.geri;
                    son.ileri=null;
                    //sondansil();
                    break;
                }else {
                    once.ileri=temp.ileri;
                    temp.ileri.geri=once;
                    break;
                }

            }
            temp=temp.ileri;
        }
    }
}
