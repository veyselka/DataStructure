public class Liste {
    Eleman ust;
    Liste(){
        ust=null;
    }


    Boolean bosMu(){
        return ust==null;
    }


    void push(Eleman yeni){
        yeni.ileri=ust;
        ust=yeni;
    }


    Eleman pop(){
        Eleman e =ust;
        if (!bosMu()){
            ust=ust.ileri;
        }
        return e;
    }


    void listele(){
        Eleman temp=ust;
        if (!bosMu()){
            while (temp!=null){
                System.out.print(temp.icerik+"-->");
                temp=temp.ileri;
            }
            System.out.println(" ");
            System.out.println("------------------------------------");
        }else {
            System.out.println("yığıy boş");
        }
    }


    void aranan(int aranan){
        Eleman temp=ust;
        int buldumu=0;
        if (!bosMu()){
            while (temp!=null){
                if (temp.icerik==aranan){
                    System.out.println("Aradığınız eleman bulundu: "+temp.icerik);
                    buldumu=1;
                    break;
                }
                temp=temp.ileri;
            }
            if (buldumu==0){
                System.out.println("Aradığınız Eleman bulunamadı");
            }
        }else {
            System.out.println("Yığıt boş");
        }
    }
}
