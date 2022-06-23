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

  public void insertNode(int nodeValue,int location){
    if(head==null){
      createNode(nodeValue);  
    }
    else{
      Node node=new Node();
      node.value=nodeValue;
      //insertion at beginning
      if(location==0){
        node.next=head;
        head.prev=node;
        tail.next=node;
        node.prev=tail;
        head=node;
      
      }
      //for adding node at end
      else if(location>=size){
        tail.next=node;
        node.prev=tail;
        node.next=head;
        tail=node;
        
      }
      else{
        Node tempNode=head;
        for(int i=0;i<location-1;i++){
          tempNode=tempNode.next;
        }
        tempNode.next.prev=node;
        tempNode.next=node.next;
        node.prev=tempNode;
        tempNode.next=node;
      }
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