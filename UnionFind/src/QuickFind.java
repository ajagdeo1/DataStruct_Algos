public class QuickFind {
    public QuickFind(int[] id){
        for(int p = 0; p < id.length; p++){
            for (int q = p+1; q < id.length; q++){
                if(id[p] == id[q]){
                    System.out.println(p + "," + q + " are connected");
                }
            }
        }
    }
}
