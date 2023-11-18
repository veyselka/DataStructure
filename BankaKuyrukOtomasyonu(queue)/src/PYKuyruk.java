public class PYKuyruk {
    ParaYatirma bas,son;
    PYKuyruk(){
        bas=null;
        son=null;
    }

    boolean bosMu(){
        return bas==null;
    }
    void sEkle(ParaYatirma yeni){
        if (bosMu()){
            bas=yeni;
            son=yeni;
        }else {
            son.ileri=yeni;
            son=yeni;
        }
    }
    ParaYatirma bSilme(){
        ParaYatirma temp=bas;
        if (!bosMu()){
            bas=bas.ileri;
            if (bas==null){
                son=null;
            }
            return bas;
        }
        return null;
    }
    boolean listele(){
        ParaYatirma temp=bas;
        boolean doluMu=true;
        if (!bosMu()){
            doluMu=true;
            System.out.print("1.");
            while (temp!=null){
                System.out.print(temp.isim+"<--");
                temp=temp.ileri;
            }

        }
        doluMu=false;
        return  doluMu;
    }
}
