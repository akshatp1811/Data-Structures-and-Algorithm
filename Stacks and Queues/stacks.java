public class stacks {
    static int stack[] = new int[5];
    static int tos = -1;

    static void push(int val , int[] stack)
    {
        if(isFull(stack)) {
            System.out.println("Stack OverFLow");
            return;
        }
        tos++;
        stack[tos] = val;
    }

    static int pop(int[] stack)
    {
        if(isEmpty(stack)) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int value =stack[tos];
        tos--;
        return value;
        
    }
    static int peek(int[] stack) {
        if (isEmpty(stack)) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[tos];
    }

    static boolean isFull(int[] stack)
    {
        if (tos == stack.length - 1) {
            return true;
        }
        else return false;
    }
    static boolean isEmpty(int[] stack)
    {
        if (tos == -1) {
            return true;
        }
        else return false;
    }
    static void printStack(int[] stack) {
        if (isEmpty(stack)) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= tos; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        push(5 , stack);
        printStack(stack);
        push(4 , stack);
        printStack(stack);
        push(3 , stack);
        printStack(stack);
        push(2 , stack);
        printStack(stack);
        push(1 , stack);
        printStack(stack);
        System.out.println(pop(stack));
        printStack(stack);
        System.out.println(pop(stack));
        printStack(stack);
        System.out.println(pop(stack));
        printStack(stack);
        System.out.println(pop(stack));
        printStack(stack);
        System.out.println(pop(stack));
        printStack(stack);
        


        
    }
}