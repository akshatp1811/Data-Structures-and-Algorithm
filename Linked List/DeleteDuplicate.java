

 class linkedlist {
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
        public void DeleteDup(){
            Node temp = head;
            while (temp != null && temp.next != null) {
                if(temp.val == temp.next.val)
            {
                temp.next = temp.next.next;
            }
            else temp = temp.next;
            }
            
        }
}
public class DeleteDuplicate extends linkedlist {

    public static void main(String[] args) {
        linkedlist LL = new linkedlist();
        // LL.insertFirst(67);
            LL.display();
        System.out.println();

        LL.insert(145);
        LL.display();
        System.out.println();

        LL.insert(125);
        LL.display();
        System.out.println();


        LL.insert(2, 2);
        
        LL.display();
        System.out.println();
        

        LL.insert(2, 2);
        LL.display();
        System.out.println();

        LL.insert(2, 2);
        LL.display();
        System.out.println();

        LL.DeleteDup();
        LL.display();

}
}       


    
