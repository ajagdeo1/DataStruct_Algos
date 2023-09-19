import java.util.Arrays;

public class QuickFindUF {
    private int[] id;
    // initializes an array and sets value to itself
    public QuickFindUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    // checks if p and q are in the same component
    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        // changes all entries with id[p] to id[q]
        for(int i = 0; i < id.length; i++){
            if(id[p] == pid) id[p] = qid;
        }
    }

    public void printArray(){
        System.out.println( "Quick Find\n "+ Arrays.toString(id));
    }
}
