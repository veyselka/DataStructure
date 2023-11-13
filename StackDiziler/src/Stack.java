public class Stack {
    int size;
    int indis;
    int []dizi;
    Stack(int size){
        this.size=size;
        indis=-1;
        dizi=new int[size];
    }
    boolean bosMu(){
        return indis==-1;
    }
    boolean doluMu(){
        return size==indis-1;
    }
    void push(int yeni){
        if (!doluMu()){
            indis++;
            dizi[indis]=yeni;
        }else {
            System.out.println("Stack dolu");
        }
    }
    int pop(){
        int e =dizi[indis];
        if (!bosMu()){
            dizi[indis]=0;
            indis--;
        }else {
            System.out.println("Stack boş");
        }
        return e;
    }
    void listele(){
        if(!bosMu()){
            for (int i=0;i<size;i++){
                System.out.print(dizi[i]+"-->");
            }
            System.out.println(" ");
            System.out.println("------------------------");
        }
    }


}
