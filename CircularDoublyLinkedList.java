public class CircularDoublyLinkedList{
  public Node head;
  public Node tail;
  public int size;

  public void createNode(int nodeValue){
    Node node=new Node();
    node.value=nodeValue;
    head=node;
    tail=node;
    size=1;
  }

  
}