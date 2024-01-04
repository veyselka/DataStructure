
public class Main {
    static  boolean heapMi(int [] d,int n){
        for (int i=0;i<=(n-2)/2;i++){
            if (d[2*i+1]>d[i]){
                return false;
            }
            if (2*i+2<n && d[2*i+2]>d[i]) {
                return false;
            }
        }
        return true;
    }
    static  int [] heapSort(int []d){
        int [] s=new int[d.length];
        Heap h=new Heap(d.length);
        for (int i=0;i<s.length;i++){
            h.ekle(new Eleman(d[i]));
        }
        h.heapgoster();
        System.out.println(" ");
        for (int i=0;i<s.length;i++){
            s[i]=h.azamiDondur().sayi;
        }
        return s;
    }


    public static void main(String[] args) {
        Heap h=new Heap(20);
        h.ekle(new Eleman(3));
        h.ekle(new Eleman(2));
        h.ekle(new Eleman(1));
        h.ekle(new Eleman(15));
        h.ekle(new Eleman(4));
        h.ekle(new Eleman(45));
        h.heapgoster();
        int [] dizi={90,15,10,7,12,2,7,3};
        int n=dizi.length;
        if (heapMi(dizi,n)){
            System.out.println("bu dizi heap");
        }else {
            System.out.println("bu dizi heap değil");
        }

        int [] d={15,23,44,55,67,48,32,95,2,8};
        int [] s=heapSort(d);
        for (int i=0;i<s.length;i++){
            System.out.print(s[i] + " ");
        }
    }
}