public class TreeNode <T>{

    private T v;
    private TreeNode<T> l, r;

    public TreeNode(T v){
        this.v = v;
        l = r = null;

    }

    public T getV() {
        return v;
    }

    public void setV(T v) {
        this.v = v;
    }

    public TreeNode<T> getL() {
        return l;
    }

    public void setL(TreeNode<T> l) {
        this.l = l;
    }

    public TreeNode<T> getR() {
        return r;
    }

    public void setR(TreeNode<T> r) {
        this.r = r;
    }

    @Override
    public String toString(){
        return "Albero [v = " + v + "]"; 
    }

    


}
