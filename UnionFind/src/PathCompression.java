public class PathCompression {
    private int[] id;
    private int[] sz;
    public PathCompression(int N){
        for(int i = 0; i < N; i++){
            id = new int[N];
            id[i] = i;
        }
    }
    private int root(int i){
        while (i!=id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
    public boolean connected(int p, int q){
        return p == q;
    }
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if(sz[i] < sz[j]){
            id[i] = j; sz[j] = sz[i];
        }
        else{
            id[j] = i; sz[i] = sz[j];
        }
    }
}
