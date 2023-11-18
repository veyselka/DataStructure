import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        PYKuyruk pyk=new PYKuyruk();
        PCKuyruk pck=new PCKuyruk();
        KCKuyruk kck=new KCKuyruk();
        int muşteriSayısı=0;
        int şuAnkiMSayısı=0;
        while (true){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Bankamıza Hoşgeldiniz\n"+"Lütfen Yapmak İstediğiniz İşlemi seçiniz\n"+"1) Sıra Alma\n"+"2) Sıradan Çıkma\n");
            int tercih=klavye.nextInt();
            switch (tercih){
                case 1:
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi seçiniz\n"+"1) Para Yatırma\n"+"2) Para Çekme\n"+"3) Kredi Çekme");
                    int secim=klavye.nextInt();
                    switch (secim){
                        case 1:
                            System.out.println("Lütfen İsminizi Giriniz");
                            String isim=klavye.next();
                            pyk.sEkle(new ParaYatirma(isim));
                            muşteriSayısı++;
                            şuAnkiMSayısı++;
                            break;
                        case 2:
                            System.out.println("Lütfen İsminizi Giriniz");
                            String isim1=klavye.next();
                            pck.sEkle(new ParaCekme(isim1));
                            muşteriSayısı++;
                            şuAnkiMSayısı++;
                            break;
                        case 3:
                            System.out.println("Lütfen İsminizi Giriniz");
                            String isim2=klavye.next();
                            kck.sEkle(new KrediCekme(isim2));
                            muşteriSayısı++;
                            şuAnkiMSayısı++;
                            break;
                        default:
                            System.out.println("Yanlış seçim yaptınız lütfen tekrar deneyiniz!!!!");
                    }
                    break;
                case 2:
                    System.out.println("Yapılan işlem neydi\n"+"1) Para Yatırma\n"+"2) Para Çekme\n"+"3) Kredi Çekme");
                    int secim1=klavye.nextInt();

                    switch (secim1){
                        case 1:
                            ParaYatirma  ayrılan=pyk.bSilme();
                            System.out.println("Sayın  "+ayrılan.isim+"  Ayrıldınız");
                            System.out.println("Ayrıldığınız Kuyruk");
                            şuAnkiMSayısı--;
                            pyk.listele();
                            break;
                        case 2:
                            ParaCekme Ayrılan =pck.bSilme();
                            System.out.println("Sayın  "+Ayrılan.isim+"  Ayrıldınız");
                            System.out.println("Ayrıldığınız Kuyruk");
                            şuAnkiMSayısı--;
                            pck.listele();
                            break;
                        case 3:
                            KrediCekme Ayrılan1=kck.bSilme();
                            System.out.println("Sayın  "+Ayrılan1.isim+"  Ayrıldınız");
                            System.out.println("Ayrıldığınız Kuyruk");
                            şuAnkiMSayısı--;
                            kck.listele();
                            break;
                        default:
                            System.out.println("Yanlış seçim yaptınız lütfen tekrar deneyiniz!!!!");
                    }
                    break;
                default:
                    System.out.println("Yanlış seçim tekrar deneyiniz");
            }

            pyk.listele();
            pck.listele();
            kck.listele();
            System.out.println(" ");
            System.out.println("----------------------------------------");
            System.out.println("toplam Müşteri sayısı :"+ muşteriSayısı);
            System.out.println("Şu Anki Müşteri Sayısı :"+ şuAnkiMSayısı);

        }

    }
}