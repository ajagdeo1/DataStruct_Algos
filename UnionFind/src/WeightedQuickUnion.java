public class WeightedQuickUnion {
    private int[] id;
    private int[] sz;

    public WeightedQuickUnion(int N){
        for (int i = 0; i < N; i++){
            id = new int[N];
            id[i] = i;
        }
    }
    private int root(int i){
        while(id[i]!=i) i = id[i];
        return i;
    }
    public boolean find(int p, int q){
        return root(p) == root(q);
    }
    public void weightedUnion(int p, int q){
        int i = root(p);
        int j = root(q);
        if(i == j) return;
        if(sz[i] < sz[j]){
            id[i] = j; sz[j] += sz[i];
        }
        else{
            id[j] = i; sz[i] += sz[j];
        }
    }
}
