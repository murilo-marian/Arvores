
import java.util.ArrayList;

public class BTree {
    Node root;
    float sizeLimit;
    int sizeLimitCeil;
    public int t;

    public BTree(float sizeLimit) {
        this.root = new Node();
        this.sizeLimit = sizeLimit / 2;
        this.t = (int) (sizeLimit / 2);
        this.sizeLimitCeil = (int) Math.ceil(this.sizeLimit);
    }


    public void insert(int key) {
        Node rootNode = root;
        if (rootNode.isFull()) {
            Node newRoot = new Node();
            newRoot.children.add(rootNode);
            splitChild(newRoot, 0);
            root = newRoot;
            insertNonFull(newRoot, key);
        } else {
            insertNonFull(rootNode, key);
        }
    }

    private void insertNonFull(Node node, int key) {
        int i = node.keys.size() - 1;
        if (node.isLeaf()) {
            node.keys.add(i + 1, key);
            node.sortKeys();
        } else {
            while (i >= 0 && key < node.keys.get(i)) {
                i--;
            }
            i++;
            Node child = node.children.get(i);
            if (child.isFull()) {
                splitChild(node, i);
                if (key > node.keys.get(i)) {
                    i++;
                }
            }
            insertNonFull(node.children.get(i), key);
        }
    }

    private void splitChild(Node parentNode, int childIndex) {
        Node childNode = parentNode.children.get(childIndex);
        Node newNode = new Node();

        parentNode.keys.add(childIndex, childNode.keys.get(t - 1));
        parentNode.children.add(childIndex + 1, newNode);

        //
        for (int i = 0; i < sizeLimitCeil - 1; i++) {
            newNode.keys.add(i, childNode.keys.get(i + t));
        }

        childNode.keys.subList(t - 1, childNode.keys.size()).clear();

        if (!childNode.isLeaf()) {
            for (int i = 0; i < t; i++) {
                newNode.children.add(i, childNode.children.get(i + t));
            }
            childNode.children.subList(t, childNode.children.size()).clear();

        }
    }

    public void show() {
        showAll(this.root);
    }

    private void showAll(Node raiz) {
        if (raiz != null) {
            System.out.println("Valores da raiz atual: " + raiz.keys);
            if (raiz.children != null) {
                System.out.println("Filhos: ");
                if (raiz.children.isEmpty()) {
                    System.out.println("Nenhum");
                } else {
                    for (Node child : raiz.children) {
                        System.out.println(child.keys);
                    }
                }
            }
            System.out.println("-");
            for (Node child : raiz.children) {
                showAll(child);
            }
        }
    }

    public boolean findValue(int value) {
        return find(root, value);
    }

    private boolean find(Node root, int value) {
        if (root.keys.contains(value)) {
            return true;
        }

        if (root.isLeaf()) {
            return false;
        }

        int i = 0;
        while (i < root.keys.size() && value > root.keys.get(i)) {
            i++;
        }

        return find(root.children.get(i), value);
    }


    private class Node {
        private ArrayList<Integer> keys;
        private ArrayList<Node> children;

        public Node() {
            keys = new ArrayList<>();
            children = new ArrayList<>();
        }

        public boolean isFull() {
            return keys.size() == 2 * sizeLimit - 1;
        }

        public boolean isLeaf() {
            return children.isEmpty();
        }

        public void sortKeys() {
            keys.sort(null);
        }

        public ArrayList<Integer> getKeys() {
            return keys;
        }

        public void setKeys(ArrayList<Integer> keys) {
            this.keys = keys;
        }

        public ArrayList<Node> getChildren() {
            return children;
        }

        public void setChildren(ArrayList<Node> children) {
            this.children = children;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Node{");
            sb.append("keys=").append(keys);
            sb.append("\n").append(keys);
            sb.append(", children=").append(children);
            sb.append('}');
            return sb.toString();
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public float getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BTree{");
        sb.append("root=").append(root);
        sb.append('}');
        return sb.toString();
    }


    //EU NÃO SEI.
    public void delete(int key) {
        delete(root, key);
        if (root.keys.isEmpty()) {
            root = root.children.get(0);
        }
    }

    private void delete(Node node, int key) {
        int index = findKeyIndex(node, key);

        if (index != -1) {
            // Caso 1: Chave encontrada em um nó folha
            System.out.println("Chave encontrada em um nó folha");
            if (node.isLeaf()) {
                node.keys.remove(index);
            } else {
                // Caso 2: Chave encontrada em um nó interno
                System.out.println("Chave encontrada em um nó interno");
                Node predecessor = getPredecessor(node, index);
                int predecessorKey = predecessor.keys.get(predecessor.keys.size() - 1);
                node.keys.set(index, predecessorKey);
                delete(predecessor, predecessorKey);
            }
        } else {
            // Caso 3: A chave não está no nó atual
            if (node.isLeaf()) {
                // A chave não está na árvore
                return;
            }
            int childIndex = findChildIndex(node, key);
            Node childNode = node.children.get(childIndex);
            if (childNode.keys.size() >= sizeLimitCeil) {
                // Caso 4: Filho possui chaves suficientes, continuamos nele
                delete(childNode, key);
            } else {
                // Caso 5: Filho possui chaves insuficientes
                if (childIndex > 0 && node.children.get(childIndex - 1).keys.size() >= sizeLimitCeil) {
                    // Caso 5a: Roubar chave do filho à esquerda
                    borrowFromLeftSibling(node, childIndex);
                    delete(node.children.get(childIndex), key);
                } else if (childIndex < node.children.size() - 1 && node.children.get(childIndex + 1).keys.size() >= sizeLimitCeil) {
                    // Caso 5b: Roubar chave do filho à direita
                    borrowFromRightSibling(node, childIndex);
                    delete(node.children.get(childIndex), key);
                } else {
                    // Caso 5c: Fusão com o filho à esquerda, se disponível
                    if (childIndex > 0) {
                        mergeWithLeftSibling(node, childIndex);
                        delete(node.children.get(childIndex), key);
                    }
                    // Note que não há necessidade de fusão com o filho à direita, pois já verificamos Caso 5b.
                }
            }
        }
    }

    private int findKeyIndex(Node node, int key) {
        for (int i = 0; i < node.keys.size(); i++) {
            if (key == node.keys.get(i)) {
                return i;
            }
        }
        return -1;
    }

    private int findChildIndex(Node node, int key) {
        int index = 0;
        while (index < node.keys.size() && key > node.keys.get(index)) {
            index++;
        }
        return index;
    }

    private Node getPredecessor(Node node, int index) {
        Node current = node.children.get(index);
        while (!current.isLeaf()) {
            current = current.children.get(current.keys.size());
        }
        return current;
    }

    private void borrowFromLeftSibling(Node node, int childIndex) {
        Node child = node.children.get(childIndex);
        Node leftSibling = node.children.get(childIndex - 1);

        int borrowedKey = leftSibling.keys.remove(leftSibling.keys.size() - 1);
        int parentKey = node.keys.get(childIndex - 1);

        child.keys.add(0, parentKey);
        node.keys.set(childIndex - 1, borrowedKey);
    }

    private void borrowFromRightSibling(Node node, int childIndex) {
        Node child = node.children.get(childIndex);
        Node rightSibling = node.children.get(childIndex + 1);

        int borrowedKey = rightSibling.keys.remove(0);
        int parentKey = node.keys.get(childIndex);

        child.keys.add(parentKey);
        node.keys.set(childIndex, borrowedKey);
    }

    private void mergeWithLeftSibling(Node node, int leftSiblingIndex) {
        Node child = node.children.get(leftSiblingIndex);
        Node leftSibling = node.children.get(leftSiblingIndex);

        int parentKey = node.keys.remove(leftSiblingIndex);
        leftSibling.keys.add(parentKey);
        leftSibling.keys.addAll(child.keys);
        leftSibling.children.addAll(child.children);
        node.children.remove(leftSiblingIndex);
    }

    private void mergeWithRightSibling(Node node, int childIndex) {
        Node child = node.children.get(childIndex);
        Node rightSibling = node.children.get(childIndex + 1);

        int parentKey = node.keys.remove(childIndex);
        child.keys.add(parentKey);
        child.keys.addAll(rightSibling.keys);
        child.children.addAll(rightSibling.children);
        node.children.remove(childIndex + 1);
    }
}

