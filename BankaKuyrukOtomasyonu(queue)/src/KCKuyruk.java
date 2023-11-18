public class KCKuyruk{
    KrediCekme bas,son;
    KCKuyruk(){
        bas=null;
        son=null;
    }


    boolean bosMu(){
        return bas==null;
    }
    void sEkle(KrediCekme yeni){
        if (bosMu()){
            bas=yeni;
            son=yeni;
        }else {
            son.ileri=yeni;
            son=yeni;
        }
    }
    KrediCekme bSilme(){
        KrediCekme temp=bas;
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
        KrediCekme temp=bas;
        boolean doluMu=true;
        if (!bosMu()){
            doluMu=true;
            System.out.print("3.");
            while (temp!=null){
                System.out.print(temp.isim+"<--");
                temp=temp.ileri;
            }

        }
        doluMu=false;
        return  doluMu;
    }
}
