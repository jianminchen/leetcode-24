import java.util.*;
class MinStack {
    Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> minData = new Stack<Integer>();
    public MinStack() {}

    public void push(int x) {
        data.push(x);
        if (minData.isEmpty() || x <= getMin()) {
            minData.push(x);
        }
    }

    public int pop() {
        if (!data.isEmpty()) {
            int v = data.pop();
            if (v == getMin()) {
                minData.pop();
            }
            return v;
        }
        return -1;
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return minData.peek();
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-1);
        ms.push(-2);
        ms.push(0);
        System.out.format("%d\n", ms.getMin());
        ms.pop();
        System.out.format("%d\n", ms.getMin());
        ms.pop();
        System.out.format("%d\n", ms.getMin());
    }
}
