class Main {
  public static void main(String[] args) {
    CircularDoublyLinkedList cdll=new CircularDoublyLinkedList();
    cdll.createNode(1);
    System.out.println(cdll.head.value);
    
    cdll.insertNode(2,1);
    cdll.traverseCDLL();
    
    cdll.insertNode(3,2);
    cdll.traverseCDLL();
    
    cdll.insertNode(4,3);
    cdll.traverseCDLL();
    
    cdll.insertNode(0,0);
    cdll.traverseCDLL();
    
    cdll.insertNode(5,8);
    cdll.traverseCDLL();

    cdll.reverseTraverse();;
  }
}