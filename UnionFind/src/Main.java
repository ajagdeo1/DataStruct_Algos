public class Main {
    public static void main(String[] args) {
        int[] id;
        id = new int[]{0,1,1,8,8,0,0,1,8,8};
        QuickFind qf = new QuickFind(id);
        QuickFindUF union = new QuickFindUF(10);

        union.union(6,5);
        union.union(5, 0);
        union.union(2,1);
        union.union(7,2);
        union.union(6,1);
        union.union(3,4);
        union.union(3,8);
        union.union(9,4);
    }
}
