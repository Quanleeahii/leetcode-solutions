class MyCircularDeque {
    int[] a;
    int front;
    int rear;
    public MyCircularDeque(int k) {
        a = new int[k];
        front = -1;
        rear = -1;
    }
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(isEmpty()) front = rear = 0;
        else if(front == 0) front = a.length - 1;
        else --front;
        a[front] = value;
        return true;
    }

    public boolean insertLast(int value) {
        if(isFull()) return false;
        if(isEmpty()) front = rear = 0;
        else if(rear == a.length - 1) rear = 0;
        else ++rear;
        a[rear] = value;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(front == rear) front = rear = -1;
        else if(front == a.length - 1) front = 0;
        else front++;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(front == rear) front = rear = -1;
        else if(rear == 0) rear = a.length - 1;
        else rear--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : a[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : a[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == a.length - 1) || (rear == front - 1);
    }
}

/**
 * Your MyCircularDeque object will be i;eque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */