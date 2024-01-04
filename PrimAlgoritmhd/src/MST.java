import javax.swing.text.StyledEditorKit;
import java.awt.desktop.PreferencesEvent;

public class MST {

    int V=9;

    int minAgirlikliDugum(int []agirlik, Boolean [] mstEklenen){
        int min=Integer.MAX_VALUE;

        int min_index=-1;

        for (int v = 0; v < V; v++) {
            if (mstEklenen[v]==false && agirlik[v]<min){
                min=agirlik[v];
                min_index=v;
            }
        }
        return min_index;
    }


    void primMST(int [][] graf){
        int [] MSTdizi=new int[V];
        int [] agirlik=new int[V];

        Boolean [] mstEklenen=new Boolean[V];
        for (int i=0;i<V;i++){
            agirlik[i]=Integer.MAX_VALUE;
            mstEklenen[i]=false;
        }
        agirlik[0]=0;
        MSTdizi[0]=-1;

        for (int c=0;c<V-1;c++){
            int u=minAgirlikliDugum(agirlik,mstEklenen);
            mstEklenen[u]=true;

            for (int v = 0; v < V; v++) {
                if (graf[u][v]!=0 && mstEklenen[v]==false && graf[u][v]<agirlik[v]){
                    MSTdizi[v]=u;
                    agirlik[v]= graf[u][v];
                }
            }
        }
        printMST(MSTdizi,graf);
    }

    void printMST(int [] MSTdizi,int [][] graf){
        System.out.println("Kenar \t Ağırlık");

        for (int i = 1; i < V; i++) {
            System.out.println(MSTdizi[i]+" - "+i+"\t"+graf[i][MSTdizi[i]]);

        }
    }
}
