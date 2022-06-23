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

  public void insertNode(int nodeValue){
    if(head==null){
      createNode(nodeValue);
    }
    else{
      Node node=new Node();
      node.value=nodeValue;
      Node tempNode=head;
      for(int i=0;i<size-1;i++){
        tempNode=tempNode.next;
      }
      tempNode.next=node;
      node.prev=tempNode;
      tail=node;
      tail.next=head;
      size+=1;
    }
  }

  public void traverseCDLL(){
    if(head==null){
      System.out.println("CDLL does not exist.");
      return;
    }
    else{
      Node tempNode=head;
      for(int i=0;i<size;i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print(" -> ");
        }
        tempNode=tempNode.next;
      }
      System.out.print("\n");
    }
  }
  
}