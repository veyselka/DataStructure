import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int nküp;
       int nkare;
       int n;
       int sabit;
       int N=1;
       int C;

       Scanner klavye=new Scanner(System.in);
        System.out.println("n^3 değerinizi varmı varsa katsayısını giriniz yoksa 0 giriniz");
        nküp=klavye.nextInt();
        System.out.println("n^2 değerinizi varmı varsa katsayısını giriniz yoksa 0 giriniz");
        nkare=klavye.nextInt();
        System.out.println("n değerinizi varmı varsa katsayısını giriniz yoksa 0 giriniz");
        n=klavye.nextInt();
        System.out.println("sabit değerinizi varmı varsa katsayısını giriniz yoksa 0 giriniz");
        sabit=klavye.nextInt();
        System.out.println("fonksiyonunuz :"+" "+nküp+"n^3"+"+"+nkare+"n^2"+"+"+n+"n"+"+"+sabit);
        C=nküp+nkare+n;
        while (true){
            int toplam=(nküp*(N^3))+(nkare*(N^2))+(n*N)+sabit;
            if (nküp==0){
                if (toplam<=C*(N^2)){
                    System.out.println("T(n):"+" "+"n^2 'dir ");
                    System.out.println("en uygun c değeri:"+C+" "+"için");
                    System.out.println("en uygun n değeri:"+N+" "+"olur");
                    break;
                }
            } else if (nkare==0) {
                if (toplam<=C*N){
                    System.out.println("T(n):"+" "+"n ' dir");
                    System.out.println("en uygun c değeri:"+C+" "+"için");
                    System.out.println("en uygun n değeri:"+N+" "+"olur");
                    break;
                }
            } else if (n==0) {
                System.out.println("n adıma bağlı herhangi bir değişken olmadığı için bu bir karmaşıklık değildir ");
                System.out.println("T(n):"+" "+sabit);
                break;
            }else if(nküp!=0){
                if (toplam<=C*(N^2)){
                    System.out.println("T(n):"+" "+"n^3 'tür ");
                    System.out.println("en uygun c değeri:"+C+" "+"için");
                    System.out.println("en uygun n değeri:"+N+" "+"olur");
                    break;
                }
            }else {
                N++;
            }



        }
    }
}