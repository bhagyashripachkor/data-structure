
public class BT<E extends Comparable<E>> {
  Node<E> root;
    
   public void insert(E value) {
  
     Node<E> newNode = new Node<E>(value);
     Node<E> parent = null;
       if (root == null) {
         root = newNode;
        
       } else {
       Node<E> currentNode = root;
       
       while (true) {
          parent = currentNode;
          if (value.compareTo(currentNode.value) < 0) {
            currentNode = currentNode.leftChild;
            if (currentNode == null) {
              parent.leftChild = newNode;
            
              return; 
           }
        } else { 
           currentNode = currentNode.rightChild;
           if (currentNode == null) {
              parent.rightChild = newNode;
              
              return; 
          }
       }
//          System.out.print(root.value);
//          System.out.print(" " + parent.leftChild.value);
//          System.out.print(" " + parent.rightChild.value);
//          System.out.println("\n");
    }
    
   }
       
}

   public void inOrderTraverse(Node<E> currentNode) {
     if (currentNode != null) {
       inOrderTraverse(currentNode.leftChild);
       System.out.print(" " + currentNode.value);
       inOrderTraverse(currentNode.rightChild);
     }
   }
  
   public void preorderTraverse(Node<E> currentNode) {
    if (currentNode != null) {
       System.out.print(" " + currentNode.value);
       preorderTraverse(currentNode.leftChild);
       preorderTraverse(currentNode.rightChild);
    }
 }
    
  public void postOrderTraverse(Node<E> currentNode) {
    if (currentNode != null) {
     postOrderTraverse(currentNode.leftChild);
     postOrderTraverse(currentNode.rightChild);
     System.out.print(" " + currentNode.value);
   }
 }
       

}
