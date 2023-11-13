public class ParantezKontrol {
    private String input;

    ParantezKontrol(String input){
        this.input=input;
    }

    void check(){
        int size=this.input.length();
        Stack stack=new Stack(size);
        boolean doğrumu=true;
        for (int i=0;i<size;i++){
            char ch=input.charAt(i);
            switch (ch){
                case '{','[','(':
                    stack.push(ch);
                    break;
                case '}',']',')':
                    if (!stack.bosMu()){
                        char ch2=stack.pop();
                        if ((ch=='}' && ch2=='{') ||(ch==']' && ch2=='[') ||(ch==')' && ch2=='(') ){

                        }else {
                            System.out.println("hata: "+ch+" parantezinde "+i+" indisinde");
                            doğrumu=false;
                            break;
                        }

                    }

                    break;
                default:

            }

        }
        if (!stack.bosMu()){
            System.out.println("ilk parantezde hata var");

        }else if (doğrumu){
            System.out.println("parantezlerde hata yok");
        }


    }
}
