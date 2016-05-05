import java.util.Scanner;
 
/*  Class Node  */
class Node<E>
{
    E data;
    protected Node<E> link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
    }    
    /*  Constructor  */
    public Node(E d,Node<E> n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node<E> n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(E d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Node<E> getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public E getData()
    {
        return data;
    }
}