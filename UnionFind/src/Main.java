public class Main {
    public static void main(String[] args) {
        QuickFindUF find = new QuickFindUF(10);
        find.union(6,5);
        find.union(5, 0);
        find.union(2,1);
        find.union(7,2);
        find.union(6,1);
        find.union(3,4);
        find.union(3,8);
        find.union(9,4);
        find.printArray();
        System.out.println(find.connected(8,9));

        QuickUnionUF union = new QuickUnionUF(10);
        union.union(4,3);
        union.union(3,8);
        union.union(9,8);
        union.union(2,1);
        union.union(7,1);
        union.union(6,5);
        union.union(5,0);
        union.union(0,1);
        union.union(1,8);
        union.printArray();
        System.out.println(union.connect(8,4));
    }
}
