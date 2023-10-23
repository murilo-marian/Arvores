public class Teste {
    public static void main(String[] args) {
        BTree bTree = new BTree(4);
        int[] vetor = Util.geraArray(100);
        int[] ale = Util.aleatorizaArray(vetor.clone());
        for (int i : vetor) {
            bTree.insert(i);
        }


        bTree.show();
        System.out.println("-------");

        for (int i : ale) {
            System.out.println("delete: " + i);
            bTree.delete(i);

        }
        System.out.println("last");
            bTree.show();
            System.out.println("------------------------");

    }
}
