import java.util.PriorityQueue;

public class KeywordHeap {
	private PriorityQueue<Keyword> heap;
	
	public KeywordHeap(){
		this.heap = new PriorityQueue<Keyword>(10, new KeywordComparator());
	}
	
	public void add(Keyword k){
		heap.offer(k);
	}
	
	public void peek(){
		if(heap.peek() == null){
			System.out.println("InvalidOperation");
			return;
		}
		
		Keyword k = heap.peek();		
		System.out.println(k.toString());
	}
	
	public void removeMin(){
		//2. remove minimal element	and print it
		if(heap.peek() == null){
			System.out.println("InvalidOperation");
			return;
		}
		
		Keyword k = heap.poll();
		System.out.println(k.toString());		
	}
	
	public void output(){
		//3. print the output in order and remove all element
		if(heap.peek() == null){
			System.out.println("InvalidOperation");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		Keyword k;
		
		while((k = heap.poll()) != null){
			sb.append(k.toString());
			if(heap.peek() != null) sb.append("");
		}
		
		System.out.println(sb.toString());	
	}
}
