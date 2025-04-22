
public class TestCodeForOurQueue 
{
	 public static void main(String[] args)
	 {
		CircularQueue queue = new CircularQueue();
		// NOTE: Initial version of circular queue does not have a way of increasing capacity.
		
		System.out.println("Is queue empty? " + queue.isEmpty()); // should be true
		    
		queue.dequeue(); // Test dequeuing an empty queue. Nothing should happen.
		
		queue.enqueue("I");
		queue.enqueue("am");
		queue.enqueue("not");

		queue.dequeue();
		queue.enqueue("fine");

		String x = queue.peek();  // should be "am"

		queue.enqueue("how");
		queue.enqueue("are");
		queue.dequeue();
		queue.enqueue("you");

		String y = queue.dequeue(); // should be "not"

		System.out.println("x = " + x + " y = " + y);

		System.out.println(queue); // Should be "fine" "how" "are" "you"

		System.out.println("Is queue empty? "+ queue.isEmpty()); //should be false
		
		int largeTest = 100;
		
		 //Test if repeatedly filling the queue works.
		 for (int count = 1; count <= largeTest; count++)
		 {
			 queue.enqueue("Q" + count);
			 if ((count % 5) == 0) queue.dequeue();
		 }
		 
		 System.out.println(queue); 
		 System.out.println("Queue done");
		 
		 // Should be "Q17", "Q18", "Q19", .... "Q100"
	 }
}
