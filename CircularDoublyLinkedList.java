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
        node.next=head;
        node.prev=tail;
        head.prev=node;
        tail.next=node;
        tail=node;
        
      }
      else{
        Node tempNode=head;
        for(int i=0;i<location-1;i++){
          tempNode=tempNode.next;
        }
        tempNode.next=node;
        node.next=tempNode.next;
        node.prev=tempNode;
        tempNode.next.prev=node;
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

  //reverse traverse CDLL
  public void reverseTraverse(){
    if(head==null){
      System.out.println("CDLL does not exist.");
      return;
    }
    Node tempNode=tail;
    for(int i=0;i<size;i++){
      System.out.print(tempNode.value);
      if(i!=size-1){
        System.out.print(" <- ");;
      }
      tempNode=tempNode.prev;
    }
    System.out.print("\n");
  }


  //searching of node
  public void searchNode(int nodeValue){
    if(head==null){
      System.out.println("CDLL does not exist.");
      return;
    }
    Node tempNode=head;
    for(int i=0;i<size;i++){
      if(tempNode.value==nodeValue){
        System.out.println("Badhai Ho! Node found at "+i+"th position.");
        return;
      }
      tempNode=tempNode.next;
    }
    System.out.println("Oops! Node not found.");
  }

  //delete node 
  public void deleteNode(int location){
    if(head==null){
      System.out.println("FIRST CREATE A CDLL!!");
      return;
    }
    else if(location==0){
      if(size==1){
        head.prev=null;
        head.next=null;
        head=null;
        tail=null;
        size--;
        return;
      }
      tail.next=head.next;
      head=head.next;
      head.prev=tail;
      size--;
      return;
    }
    else if(location>=size){
      tail=tail.prev;
      tail.next=head;
      head.prev=tail;
      size--;
      return;
    }
    else{
      Node tempNode=head;
      for(int i=0;i<location-1;i++){
        tempNode=tempNode.next;
      }
      tempNode.next=tempNode.next.next;
      tempNode.next.prev=tempNode;
      size--;
      return;
    }
  }
  //delete entire list
  public void deleteCDLL(){
    Node tempNode=head;
    for(int i=0;i<size;i++){
      tempNode.prev=null;
      tempNode=tempNode.next;
    }
    head=null;
    tail=null;
    System.out.println("Mission Successfull. CDLL terminated.");
  }
}