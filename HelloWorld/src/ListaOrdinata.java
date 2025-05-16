

public class ListaOrdinata <T extends Comparable <T>> extends Lista<T>{
    @Override
    public void add(T v){
        Nodo<T> n = new Nodo<>(v);
        if(root == null){
            root = n;
            return;
        }
        Nodo<T> temp = root;
        if (root.getValore().compareTo(v) > 0){
            n.setSucc(root);
            root = n;
        }
           
        while(temp.getValore().compareTo(v)>0 && temp.getSucc()!=null) temp=temp.getSucc();
        n.setSucc(temp.getSucc());
        temp.setSucc(n);
    }
    
    
}
