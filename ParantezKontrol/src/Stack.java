public class Stack {
    int size;
    int indis;
    char []dizi;
    Stack(int size){
        this.size=size;
        indis=-1;
        dizi=new char[size];
    }

    boolean bosMu(){
        return indis==-1;
    }

    boolean doluMu(){
        return indis==size-1;
    }

    void push(char yeni){
        if (!doluMu()){
            indis++;
            dizi[indis]=yeni;
        }else {
            System.out.println("Stack dolu");
        }
    }
    char pop(){
        char temp=dizi[indis];
        if (!bosMu()){
            indis--;
        }else {
            System.out.println("Dizi boş");
        }
        return temp;
    }
}
