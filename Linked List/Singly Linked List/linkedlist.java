public class linkedlist {
    Node head ;
    Node tail;
    int size;

    public void insert(int val){
        Node node = new Node(val); // properly initialize the new node
        if (head == null) {
            head = node;  // if list is empty, new node is head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;  // move to the last node
            } 
            temp.next = node;  // insert at the end
        }
    }

    public void insert(int val , int n)//insert at N th Position
    {     
        Node node = new Node();
        node.val = val;
        Node temp = head;
        for (int i = 1; i < n; i++) {
            node.next = temp.next;
            temp.next = node;
        }
        
        // for (int i = 1; i < n; i++) {
        //     node.next = temp.next;
        //     temp.next = node;

        // }
    }
    
    
    public void display(){
        Node temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.val + "-->");
            }
            else
            System.out.print(temp.val);
            temp = temp.next;
            
        }
    }

    public class Node {
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
        Node() {
            this.val = 0;
            this.next = null;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    } 
    public linkedlist(){
        this.size = 0;
    }

    public int deleteFirst() {
        int value = head.val;
        if (head != null) {
            head = head.next;
        }
        return value;
    }

    public int deleteLast() {
        Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;  // move to the last node
            }
            int value = temp.next.val;
            temp.next = null;  // insert at the end
            return value;
        }
    
    
        public int deleteatN(int N) {
            Node temp = head;
            for (int i = 1; i < N-1; i++) {
                temp = temp.next;
                
            }
            int value = temp.val;
            temp.next = temp.next.next;
            return value;
        }
            // Node temp = head;
            //     while (temp.next.next != null) {
            //         temp = temp.next;  // move to the last node
            //     }
            //     int value = temp.next.val;
            //     temp.next = null;  // insert at the end
            //     return value;

        
    
    public static void main(String[] args) {
        linkedlist LL = new linkedlist();
        // LL.insertFirst(67);
        // LL.display();
        LL.insert(123);
        LL.display();
        System.out.println();

        LL.insert(145);
        LL.display();
        System.out.println();

        LL.insert(125);
        LL.display();
        System.out.println();

        LL.insert(178);
        LL.display();
        System.out.println();

        LL.insert(2, 2);
        
        LL.display();
        System.out.println();
        System.out.println("First" + LL.deleteFirst());
        System.out.println();
        LL.display();
        System.out.println();
        System.out.println("Last" + LL.deleteLast());
        LL.display();
        System.out.println();

        LL.insert(222, 2);
        LL.display();
        System.out.println();

        System.out.println("At index 2 " + LL.deleteatN(2));
        LL.display();

}
}
        


    
