
public class Main {
    public static void main(String[] args) {
        Agac a=new Agac();
        a.ekle(new Dugum(8));
        a.ekle(new Dugum(5));
        a.ekle(new Dugum(12));
        a.ekle(new Dugum(31));
        a.ekle(new Dugum(2));
        System.out.println("----------------------");
        a.preorder(a.kok);
        System.out.println("----------------------");
        a.inorder(a.kok);
        System.out.println("----------------------");
        a.postorder(a.kok);
        System.out.println("----------------------");
        System.out.println("En küçük eleman :"+a.enKüçük().içerik);
        System.out.println("----------------------");
        System.out.println("En büyük eleman :"+a.enBüyük().içerik);
        a.arama(69);
        a.yapraksil(2);
        System.out.println("----------------------");
        a.preorder(a.kok);
    }
}