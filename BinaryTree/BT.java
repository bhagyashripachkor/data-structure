import java.util.ArrayList;

class BT
 {
     private BTNode root;
     static ArrayList<Integer> al = new ArrayList<Integer>();
     static int[] list;
     static int count = 0;
     int index = 0;
     public BT()
     {
         root = null;
     }
   
     public boolean isEmpty()
     {
         return root == null;
     }
     
     public void insert(int data)
     {
         count++;
         root = insert(root, data);
     }
     
     private BTNode insert(BTNode node, int data)
     {
         if (node == null)
             node = new BTNode(data);
         else
         {
             if (node.getRight() == null)
                 node.right = insert(node.right, data);
             else
                 node.left = insert(node.left, data);             
         }
         
         return node;
     }     
   
     
     public void inorder()
     {
         list = new int[count];
         inorder(root);
     }
     private void inorder(BTNode r)
     {
         if (r != null)
         {
             inorder(r.getLeft());
             System.out.print(r.getData() + " ");
             list[index] = r.getData();
             index++;
             al.add(r.getData());
             inorder(r.getRight());
         }
     }
    
     public static void print() {
       System.out.println("count " +count);
       System.out.println("list size" + list.length);
       int flag = 0;
       int temp = 0;
       for (int i = 0; i < list.length; i++) {
        if (list[i] != 0) {
         if (temp > list[i]) {
           System.out.println(temp);
           System.out.println(list[i]);
           flag = 1;
           break;
         } 
         } else
           temp = list[i];
       }
       if (flag == 0)
         System.out.println("true");
       else
         System.out.println("false");
     }
     
     
 }
