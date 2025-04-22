import java.util.Arrays;
public class CircularQueue {
	  // Implementation of queue using circular array; dequeue operation does NOT require moving many elements.
	   // However careful track has to be kept of where in the array the front (or head) and back (or rear) of the queue are.
		
		private String[] elements;
		private int head;
		private int rear;
		private int size;
		private static final int DEFAULT_CAPACITY = 10;

		public CircularQueue() 
		{ 
			elements = new String[DEFAULT_CAPACITY];
			head = 0;
			rear = 0;
			size = 0;
		}

		public void enqueue(String element) 
		{
			if (size == elements.length)
			{
				increaseCapacity();
			}
						
			elements[rear] = element;

			if (rear < elements.length - 1) 
			{
				rear++;
			}
			else 
			{
				rear = 0;	
			}
			
			size++;
		}  
		
		
		public void increaseCapacity()
		{
			String[] fullerCapacity = new String[elements.length * 2];
			System.arraycopy(elements, 0, fullerCapacity, elements.length - head, head);
			System.arraycopy(elements, head, fullerCapacity, 0, elements.length - head);
			
			rear = elements.length;
			head = 0;
			elements = fullerCapacity;
		}

		public String dequeue() 
		{
			String errorMessage = "Error! Queue is empty!";
			
			if (!isEmpty()) // make sure queue is not-empty
			{
				String firstElement = elements[head];
				
				if (head < elements.length - 1) head++;
				else head = 0;
				
				size--;
				return firstElement;
			} 
			else return errorMessage;
		}

		public String peek() 
		{   
			return elements[head]; 
		}

		public boolean isEmpty() 
		{ 
			return size == 0; 
		}
		
		public String toString() 
		{   // Don't use Arrays.toString(elements) because it will show null elements.
			
			String string = "";
			int position = head;

			for (int count = 0; count < size; count++)
			{
				string += elements[position] + " ";
				if (position < elements.length - 1) position++;
				else position = 0;
			}

			return string;
		}	
}

