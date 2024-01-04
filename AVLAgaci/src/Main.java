
public class Main {
    public static void main(String[] args) {
        AVLagaci tree=new AVLagaci();
        tree.kök=tree.insert(tree.kök,10);
        tree.kök=tree.insert(tree.kök,20);
        tree.kök=tree.insert(tree.kök,30);
        tree.kök=tree.insert(tree.kök,40);
        tree.kök=tree.insert(tree.kök,50);
        tree.kök=tree.insert(tree.kök,25);
        tree.preorder(tree.kök);
        tree.arama(40);

    }
}