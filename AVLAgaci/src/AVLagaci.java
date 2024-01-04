public class AVLagaci {
    Dugum kök;
    int height(Dugum N){
        if (N==null){
            return 0;
        }
        return N.yükseklik;
    }
    int max(int a,int b){
        return (a>b) ? a:b;
    }

    Dugum sagaDondur(Dugum y){
        Dugum x=y.sol;
        Dugum T2=x.sağ;

        x.sağ=y;
        y.sol=T2;

        y.yükseklik=max(height(y.sol),height(y.sağ))+1;
        x.yükseklik=max(height(x.sol),height(x.sağ))+1;

        return x;
    }
    Dugum solaDondur(Dugum x){
        Dugum y=x.sağ;
        Dugum T2=y.sol;

        y.sol=x;
        x.sağ=T2;

        y.yükseklik=max(height(y.sol),height(y.sağ))+1;
        x.yükseklik=max(height(x.sol),height(x.sağ))+1;

        return y;
    }
    int getBalance(Dugum N){
        if (N==null){
            return 0;
        }
        return height(N.sol)-height(N.sağ);
    }

    Dugum insert(Dugum node,int içerik){
        if (node==null){
            return (new Dugum(içerik));
        }

        if (içerik<node.içerik){
            node.sol=insert(node.sol,içerik);
        }else if (içerik>node.içerik){
            node.sağ=insert(node.sağ,içerik);
        }else {
            return node;
        }

        node.yükseklik=1+max(height(node.sol),height(node.sağ));

        int balance=getBalance(node);
        //sol sol dengesizliği
        if (balance>1 && içerik<node.sol.içerik){
            return sagaDondur(node);
        }
        //sağ sağ dengesizliği
        if (balance<-1 &&  içerik>node.sağ.içerik){
            return solaDondur(node);
        }
        //sol sağ dengesizliği
        if (balance>1 && içerik>node.sol.içerik){
            node.sol=solaDondur(node.sol);
            return sagaDondur(kök);
        }
        //sağ sol dengesizliği
        if (balance<-1 && içerik<node.sağ.içerik){
            node.sağ=sagaDondur(node.sağ);
            return solaDondur(node);
        }
        return node;
    }

    void preorder(Dugum node){
        if (node==null){
            return;
        }
        System.out.println(node.içerik+"");
        preorder(node.sol);
        preorder(node.sağ);
    }


    Dugum arama(int aranan){
        Dugum d=kök;

        while (d!=null){
            if (aranan==d.içerik){
                System.out.println("eleman bulundu");
                preorder(d);
                return d;
            } else if (d.içerik<aranan) {
                d=d.sağ;
            } else if (d.içerik>aranan) {
                d=d.sol;
            }
        }
        System.out.println("Eleman bulunamadı");
        return null;
    }

}
