import java.util.*;
public class KeywordList {	
	private LinkedList<Keyword> lst;
	
	public KeywordList(){
		this.lst = new LinkedList<Keyword>();	
	}
	
	public void add(Keyword keyword){
		//add keyword to proper index base on its count. DECENDING SORT BY COUNT AND WEIGHT
		//printKeywordList(lst) : check if elements are sorted 
		for(int i = 0; i < lst.size(); i++){
			Keyword k = lst.get(i);	
			if(keyword.count <= k.count){ //if count is smaller than original, placed in the front; if same count then compare weight
				if(keyword.count < k.count) {
					lst.add(i,keyword);
					return;
				}
				else if(keyword.count == k.count && keyword.weight <= k.weight) { //if same count, smaller weight placed in the front
					lst.add(i,keyword);
					return;
				}	
			}	
		}
		lst.add(keyword);	
	}
	
	public void outputIndex(int i){
		if(i > lst.size()){
		    System.out.println("InvalidOperation");
		    return;
		}
		Keyword k = lst.get(i);	
		System.out.println(k);
	}
		
	public void outputCount(int c){
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i = 0; i < lst.size(); i++){
		    Keyword k = lst.get(i);
		    if(k.count == c){
		    	results.add(k);
		    }
		}
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}else{
		    printKeywordList(results);
		}
	}
	
	public void outputHas(String pattern){
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i = 0; i < lst.size(); i++){
		    Keyword k = lst.get(i);
		    if(k.name.contains(pattern)){
		    	results.add(k);
		    }
		}
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}else{
		    printKeywordList(results);
		}
	}
	
	public void outputName(String pattern){
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i = 0; i < lst.size(); i++){
		    Keyword k = lst.get(i);
		    if(k.name.equals(pattern)){
		    	results.add(k);
		    }
		}
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}else{
		    printKeywordList(results);
		}
	}
	
	public void outputFirstN(int n){
		if(n > lst.size()){
		    System.out.println("InvalidOperation");
		    return;
		}
		LinkedList<Keyword> found= new LinkedList<>();
		
		for(int i = 0; i < n; i++){
			Keyword k = lst.get(i);
			found.add(k);
		}		
		printKeywordList(found);		
	}
	
	public void outputScore(){
		float results = 0;
		// 1.To calculate all keyword's count*weight
	
		System.out.println(results);
	}
	
	public void deleteIndex(int i){		
		if(i >= lst.size()){
		    return;
		}			
		lst.remove(i);
	}

	public void deleteCount(int c){
		// 2. remove nodes that the count is equal to c
		LinkedList<Keyword> found= new LinkedList<>();		
		
		if(!found.isEmpty()){
			lst.removeAll(found);			
		}				
	}

	public void deleteHas(String pattern){
		// 3. remove nodes that the name contains input name	
			
	}
	
	public void deleteName(String name){
		// 4. remove nodes that the name is equal to input name	
	
	}
	
	public void deleteFirstN(int n){
		// 5. remove first n nodes	
		
	}
	
	public void deleteAll(){
		lst = new LinkedList<Keyword>();
	}
		
	private void printKeywordList(LinkedList<Keyword> kLst){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < kLst.size(); i++){
			Keyword k = kLst.get(i);
			if(i > 0)sb.append(" ");
			sb.append(k.toString());
		}
		System.out.println(sb.toString());
	}
}