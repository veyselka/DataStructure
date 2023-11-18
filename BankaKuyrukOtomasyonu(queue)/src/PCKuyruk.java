public class PCKuyruk {
    ParaCekme bas,son;
    PCKuyruk(){
        bas=null;
        son=null;
    }

    boolean bosMu(){
        return bas==null;
    }
    void sEkle(ParaCekme yeni){
        if (bosMu()){
            bas=yeni;
            son=yeni;
        }else {
            son.ileri=yeni;
            son=yeni;
        }
    }
    ParaCekme bSilme(){
        ParaCekme temp=bas;
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
        ParaCekme temp=bas;
        boolean doluMu=true;
        if (!bosMu()){
            doluMu=true;
            System.out.print("2.");
            while (temp!=null){
                System.out.print(temp.isim+"<--");
                temp=temp.ileri;
            }

        }
        doluMu=false;
        return  doluMu;
    }
}
