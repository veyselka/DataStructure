public class graf {
    private  boolean adjMatris [][];
    private int numVerticase;
    graf(int numVerticase){
        this.numVerticase=numVerticase;
        adjMatris=new boolean[numVerticase][numVerticase];
    }

    void addEdge(int i,int j){
        adjMatris[i][j]=true;
        adjMatris[j][i]=true;
    }

    void removeEdge(int i,int j){
        adjMatris[i][j]=false;
        adjMatris[j][i]=false;
    }
    String tostring(){
        String a="";
        for (int i=0;i<numVerticase;i++){
            a=a+i+" ";
            for (boolean j:adjMatris[i]){
                if (j){
                    a=a+" "+1;
                }else {
                    a=a+" "+0;
                }

            }
            a=a+"\n";
        }
        return a;
    }
    boolean yonsuzMu(){
        boolean y=true;
        for (int i=0;i<numVerticase;i++){
            for (int j=0;j<numVerticase;j++){
                if (adjMatris[i][j]!=adjMatris[j][i]){
                    y=false;
                    break;
                }
                if (y==false){
                    break;
                }
            }
        }
        return y;
    }
}
