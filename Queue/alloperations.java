package queue;

public class QueueArray {
	int front = -1;
	int rear;
	int[] array;
	int maxsize;
	public QueueArray(int maxsize){
		this.maxsize = maxsize;
		array = new int[maxsize];
	}
	
	void enqueue(int data){
		if(front == -1){
			array[++front]= data;
			rear = front;
		}else{
			if(rear == maxsize-1){
				System.out.println("queue overflow!!! cannot insert - "+data);
			}else
				array[++rear] = data;
		}
	}
	
	void dequeue(){
		if(front == maxsize)
			System.out.println("queue is empty");
		else
			System.out.println(array[front++]);
	}
	int getfront(){
		if(front != -1)
			return array[front];
		else
			return -1;
	}
	int getrear(){
		if(front != -1)
			return array[rear];
		else
			return -1;
	}
	void isFull(){
		if(maxsize == front)
			System.out.println("Queue is full");
	}
	void isEmpty(){
		if(front == -1)
			System.out.println("Queue is empty");
	}
	void print(){
		for(int i = 0; i < maxsize; i++)
			System.out.print(array[i]+" ");
	}
	public static void main(String[] args){
		QueueArray a = new QueueArray(5);
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		a.enqueue(5);
		a.print();
		System.out.println();
		System.out.println("front is "+a.getfront());
		System.out.println("rear is "+a.getrear());
		a.enqueue(6);
		System.out.println("dequeue");
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.dequeue();
		System.out.println("front is"+a.getfront());
		System.out.println("rear is"+a.getrear());
	
	}
}
