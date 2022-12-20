public abstract class Progression<T> {
	protected T first;
	protected T curr;
	
	public Progression(T first) {
		this.first = first;
		this.curr = first;
	}
	
	//reset and return first value
	public T firstValue() {
		curr = first;
		return first;
	}
	
	public abstract T nextValue();
    
    public void printProgression(int n){
		String result = String.valueOf(firstValue());
		
		for(int i = 0; i < n-1; i++){
		    result += " " + String.valueOf(nextValue());
		}
		System.out.println(result);
    }
}