class Main {
  public static void main(String[] args) {
    CircularDoublyLinkedList csll=new CircularDoublyLinkedList();
    csll.createNode(1);
    System.out.println(csll.head.value);
    csll.insertNode(2,1);
    csll.traverseCDLL();
    csll.insertNode(3,2);
    csll.traverseCDLL();
    csll.insertNode(4,3);
    csll.traverseCDLL();
    csll.insertNode(0,0);
    csll.traverseCDLL();
    csll.insertNode(5,8);
    csll.traverseCDLL();
  }
}