public class Heap {
    Eleman [] dizi;
    int n;
    int tane;
    Heap(int n){
        this.n=n;
        dizi=new Eleman[n];
        tane=0;
    }

    boolean bosmu(){
        return tane==0;
    }
    boolean dolumu(){
        return  tane==n;
    }
    void ekle(Eleman yeni){
        tane++;
        dizi[tane-1]=yeni;
        yukariCik(tane-1);
    }
    void yukariCik(int no){
        int ustdal=(no-1)/2;
        while (ustdal>=0 && dizi[ustdal].sayi < dizi[no].sayi){
            Eleman ata=dizi[ustdal];
            dizi[ustdal]=dizi[no];
            dizi[no]=ata;
            no=ustdal;
            ustdal=(no-1)/2;
        }
    }

    void heapgoster(){
        for (int i=0;i<tane;i++){
            System.out.print(dizi[i].sayi+" ");
        }
    }

    Eleman azamiDondur(){
        Eleman tmp=dizi[0];
        dizi[0]=dizi[tane-1];
        asagiIn(0);
        tane--;
        return tmp;
    }
    void asagiIn(int no){
        int sol=2*no+1;
        int sag=2*no+2;
        while ((sol<tane && dizi[no].sayi<dizi[sol].sayi) ||(sag <tane && dizi[no].sayi>dizi[sag].sayi)){

            if (sag >=tane || dizi[sol].sayi>dizi[sag].sayi){

                Eleman tmp=dizi[sol];
                dizi[sol]=dizi[no];
                dizi[no]=tmp;
                no=sol;
            }else {
                Eleman tmp=dizi[sag];
                dizi[sag]=dizi[no];
                dizi[no]=tmp;
                no=sag;
            }

            sol=2*no+1;
            sag=2*no+2;
        }
    }
}
