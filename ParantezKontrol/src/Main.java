public class Main {
    public static void main(String[] args) {
        String a="(a{b[c]d}e)";
        ParantezKontrol parantezKontrol=new ParantezKontrol(a);
        parantezKontrol.check();
    }
}