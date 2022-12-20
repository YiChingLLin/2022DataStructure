public class GeomProgression<T extends Number> extends Progression<T>{

	private T base;
	public GeomProgression(T first, T base) {
		super(first);
		this.base = base;
	}
	
	private T multiply(T a, T b) {
		if(a instanceof Integer){
		    Integer erasedValue = a.intValue() * b.intValue();
		    return (T)erasedValue;
		}
		else if(a instanceof Long){
		    Long erasedValue = a.longValue() * b.longValue();
		    return (T)erasedValue;
		}
		else if(a instanceof Float){
		    Float erasedValue = a.floatValue() * b.floatValue();
		    return (T)erasedValue;
		}
		else if(a instanceof Double){
			Double erasedValue = a.doubleValue() * b.doubleValue();
		    return (T)erasedValue;
		}
		else{
			return null;
		}		
	}
	
	public T nextValue() {
		curr = multiply(curr, base);
		return curr;
	}
	
}