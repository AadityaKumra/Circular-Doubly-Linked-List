class Main {
  public static void main(String[] args) {
    CircularDoublyLinkedList csll=new CircularDoublyLinkedList();
    csll.createNode(1);
    System.out.println(csll.head.value);
    csll.insertNode(2);
    csll.insertNode(3);
    csll.insertNode(4);
    csll.traverseCDLL();
  }
}