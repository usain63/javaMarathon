package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        
        int[] nodeValues = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        
        for (int i = 0; i < nodeValues.length; i++) {
            addNewNode(nodeValues[i], root);
        }
        
        dfs(root);
    }
    
    public static void addNewNode(int valueNode, Node rootNode) {
        if (valueNode == rootNode.getValue()){
            System.out.println("Значение " + valueNode + " уже добавлено в древо");
            return;
        }
        
        if (valueNode < rootNode.getValue()){
            if (rootNode.getLeftSon() == null){
                rootNode.setLeftSon(new Node(valueNode));
            }else 
                addNewNode(valueNode, rootNode.getLeftSon());
        }

        if (valueNode > rootNode.getValue()){
            if (rootNode.getRightSon() == null){
                rootNode.setRightSon(new Node(valueNode));
            }else
                addNewNode(valueNode, rootNode.getRightSon());
        }
    }
    
    public static void dfs(Node root) {
        if (root == null)
            return;
        
        if (root.getLeftSon() != null){
            dfs(root.getLeftSon());
        }
        System.out.print(root.getValue() + " ");
        if (root.getRightSon() != null){
            dfs(root.getRightSon());
        }
    }
}
