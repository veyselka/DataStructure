public class Agac {
    Dugum kok;
    Agac(){
        kok=null;
    }

    void ekle(Dugum yeni){
        Dugum yer=null;
        Dugum x=kok;


        while (x!=null){
            yer=x;
            if (yeni.içerik<x.içerik){
                x=x.sol;
            }else if(yeni.içerik>x.içerik){
                x=x.sag;
            }else {
                System.out.println("eleman ağaçta zaten bulunuyor");
                break;
            }
        }

        if (yer==null){
            kok=yeni;
        }else if (yeni.içerik< yer.içerik){
            yer.sol=yeni;
        }else if (yeni.içerik>yer.içerik){
            yer.sag=yeni;
        }
    }

    //Inorder == sol-kok-sağ  sıralamasıyla ağacı yazdırır
    // Postorder == sol-sağ-kök  sıralamasıyla ağacı yazdırır
    //Preorder == kök-sol-sağ  sıralamasıyla ağacı yazdırır

    void preorder(Dugum dugum){
        if (dugum==null){
            return;
        }
        System.out.println(dugum.içerik+"");
        preorder(dugum.sol);
        preorder(dugum.sag);

    }
    void inorder (Dugum dugum){
        if (dugum==null){
            return;
        }
        inorder(dugum.sol);
        System.out.println(dugum.içerik);
        inorder(dugum.sag);

    }
    void postorder(Dugum dugum){
        if (dugum==null){
            return;
        }
        postorder(dugum.sol);
        postorder(dugum.sag);
        System.out.println(dugum.içerik);

    }
    Dugum enKüçük(){
        Dugum sonuc=kok;
        while (sonuc.sol!=null){
            sonuc=sonuc.sol;
        }
        return sonuc;
    }
    Dugum enBüyük(){
        Dugum sonuc=kok;
        while (sonuc.sag!=null){
            sonuc= sonuc.sag;
        }
        return sonuc;
    }
    Dugum arama(int aranan){
        Dugum d=kok;

        while (d!=null){
            if (aranan==d.içerik){
                System.out.println("eleman bulundu");
                return d;
            } else if (d.içerik<aranan) {
                d=d.sag;
            } else if (d.içerik>aranan) {
                d=d.sol;
            }
        }
        System.out.println("Eleman bulunamadı");
        return null;
    }

    public boolean yapraksil(int key){
        Dugum temp=kok;
        Dugum önceki=kok;
        boolean solDugum=true;
        while (temp.içerik!=key){
            önceki=temp;
            if (key<temp.içerik){
                solDugum=true;
                temp=temp.sol;
            }else {
                solDugum=false;
                temp=temp.sag;
            }
            if (temp==null){
                return false;
            }
        }
        if (temp.sol==null && temp.sag==null){
            if(temp==kok){
                kok=null;
            }else if (solDugum){
                önceki.sol=null;
            }else {
                önceki.sag=null;
            }
            return true;
        }else {
            return false;
        }
    }
    void seviye_göster(){
        Kuyruk k=new Kuyruk();
        Dugum temp=kok;
        if (temp!=null){
            k.sEkle(temp);
        }
        int i=0,j=0;
        int toplam=0;
        while (!k.bosMu()){
            temp=k.bSilme();
            toplam+=temp.içerik;
            if (temp.sol!=null){
                k.sEkle(temp.sol);
            }
            if (temp.sag!=null){
                k.sEkle(temp.sag);
            }
            System.out.println(temp.içerik+"\t");
            int us=(int)Math.pow(2,j);
            i++;
            if(i==us){
                j++;
                i=0;
                System.out.println(" ");
            }
        }
    }
}
