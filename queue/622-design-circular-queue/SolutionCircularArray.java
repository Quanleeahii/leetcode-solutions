class MyCircularQueue {
    private int[] a;
    private int front;
    private int rear;
    public MyCircularQueue(int k) {
        a = new int[k];
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()) front = rear = 0;
        else if(rear == a.length - 1) rear = 0;
        else ++rear;
        a[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        if(front == rear){
            rear = front = -1;
        }else{
            front++;
            if(front == a.length){
                front = 0;
            }
        }
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : a[front];
    }

    public int Rear() {
        return isEmpty() ? -1 : a[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == a.length - 1) || (front == rear + 1);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */