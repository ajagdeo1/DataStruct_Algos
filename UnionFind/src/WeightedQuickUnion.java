import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class WeightedQuickUnion {
  private int [] parent;
  private int [] size; // number of elements in subtree rooted at i
  private int count;   // number of components

     public WeightedQuickUnion(int n){
        count = n;
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = i;
        }
         System.out.println(Arrays.toString(parent));
    }
    public int count(){
         return count;
    }
    public void validate(int p){
         int n = parent.length;
         if(p < 0 || p >= n){
             throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
         }
    }
    public int find(int p){
         validate(p);
         while (p!=parent[p]){
             p = parent[p];
         }
         return p;
    }
    public boolean connected(int p, int q){
         return find(p) == find(q);
    }
    public void union(int p, int q){
         int rootP = find(p);
         int rootQ = find(q);
         if(rootP == rootQ){
             return;
         }
         if(size[rootP] < size[rootQ]){
             parent[rootP] = rootQ;
             size[rootQ] += size[rootP];
         }
         else{
             parent[rootQ] = rootP;
             size[rootP] += rootQ;
         }
         count --;
        System.out.println(Arrays.toString(parent));
    }

    public static void main(String[] args){
        int n = StdIn.readInt();
        WeightedQuickUnion UF = new WeightedQuickUnion(n);
        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(UF.find(p) == UF.find(q)){
                continue;
            }
            UF.union(p,q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(UF.count() + " components");
    }
}
