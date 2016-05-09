
public class Node {
  private int data;
  private Node address;
  
  public Node() {
    data = 0;
    address = null;
  }
  
  public Node(int data, Node address) {
    this.data = data;
    this.address = address;
    
  }
  
  public void setData(int data) {
    this.data = data;
  }
  
  public void setAddress(Node address) {
    this.address = address;
  }
  
  public int getData() {
    return this.data;
  }
  
  public Node getAddress() {
    return this.address;
  }
}
