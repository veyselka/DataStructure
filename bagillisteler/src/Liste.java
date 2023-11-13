public class Liste {
    Eleman baş;
    Eleman son;
    Liste(){
        baş=null;
        son=null;
    }


    public void başaEkle(Eleman yeni){
        if (baş==null){
            baş=yeni;
            son=yeni;
        }else {
            yeni.ileri=baş;
            baş=yeni;

        }
    }



    public void  sonaEkle(Eleman yeni){
        if(baş==null){
            baş=yeni;
            son=yeni;
        } else {
            son.ileri=yeni;
            son=yeni;
        }
    }


    public String Listele(){
        String S="";
        Eleman yedek=baş;
        while (yedek!=null){
            S=S+yedek.veri+"-->";
            yedek=yedek.ileri;
        }
        System.out.println(S);
        return S;
    }

    public Eleman baştanSil(){
        Eleman temp=baş;
        if (baş!=null){
            baş=baş.ileri;
        }else {
            System.out.println("liste boş");
            son=null;
            return null;
        }
        return temp;
    }

    public Eleman sondanSil(){
        Eleman tmp=baş,once=null;
        Eleman silinen =son;
        while (tmp!=son){
            once=tmp;
            tmp=tmp.ileri;
        }

        if (once==null){
            baş=null;
            son=null;
            return null;
        }else {
            once.ileri=null;
            son=once;
            return silinen;
        }

    }



    public int elemanArama(int aranacak){
        Eleman yedek=baş;
        while (yedek!=null){
            if (yedek.veri== aranacak){
                System.out.println("Eleman bulundu :"+aranacak);
                break;

            }
            yedek=yedek.ileri;
        }
         if (yedek==null){
            System.out.println("eleman bulunamadı");
        }
        return aranacak;

    }


}
