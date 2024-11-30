public class LinearLL{

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList{
        Node head;
        public void append(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        public void delete(int data){
            if(head == null){
                System.out.println("List is empty");
            }
            Node current = head;
            if(current.next != null && current.next.data != data){
                current.next = current.next.next;
            }else{
                System.out.println("Data not found");
            }
        }
        public void print(){
            if(head == null){
                System.out.println("List is empty");
            }
            Node current = head;
            while(current != null){
                System.out.println(current.data + "-");
                current = current.next;
            }
            System.out.println("End");
        }
    }

    public static void main(String[] args){
        LinkedList list = LinkedList();
                list.append(1);
                list.append(2);
                list.print();
                list.delete(2);
                list.print();
            }
        
            private static LinearLL.LinkedList LinkedList() {

                throw new UnsupportedOperationException("Unimplemented method 'LinkedList'");
            }
}