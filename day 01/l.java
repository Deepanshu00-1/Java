public class l {
    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    class LinkedList {
        Node head;
    
        public void append(int data) {
            Node newNode = new Node(data);
    
            if (head == null) {
                head = newNode;
                return;
            }
    
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
    
            current.next = newNode;
        }
    
        public void delete(int data) {
            if (head == null) {
                System.out.println("List is empty!");
            }
    
            if (head.data == data) {
                head = head.next;
                return;
            }
    
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
    
            if (current.next != null) {
                current.next = current.next.next;
            } else {
                System.out.println("Data not found");
            }
    
        }
    
        public void print() {
            if (head == null) {
                System.out.println("List is empty!");
            }
    
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "-");
                current = current.next;
            }
            System.out.println("end");
        }
    }
    
    
    
    
    public class Main {
        public static void main(String[] args) {
    
            LinkedList list = new LinkedList();
    
            list.append(5);
            list.append(9);
            list.append(4);
    
            list.print();
    
            list.delete(9);
            
            list.print();
    
        }
    }
}
