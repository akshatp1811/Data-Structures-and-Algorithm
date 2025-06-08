

public class InsertRecursion {
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
    public InsertRecursion(){
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
            void insertRec(int val, Node head)
            {
                head = insertRec(val, index , head);
                

            }
            private Node insertRec(int val , int index , Node node)
            {
                if(index == 0){
                    Node temp = new Node(val, node);
                    return temp;
                }
                node.next = insertRec(val,index - 1 , node.next);
                return node;
            }


        
    
    public static void main(String[] args) {
        InsertRecursion LL = new InsertRecursion();
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
        LL.insertRec(78,- null);
        
}
}
        


    
