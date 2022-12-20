import java.util.ArrayList;

public class KeywordList {
	private ArrayList<Keyword> lst;
	
	public KeywordList(){
		this.lst = new ArrayList<Keyword>();
    }
	
	public void add(Keyword keyword){
		lst.add(keyword);
    }
	
	public void find(String s){
		int maxValue = -1;
		int maxIndex = -1;
		
		for(int i = 0; i < lst.size(); i++){
			int lcs = findLCS(lst.get(i).name, s);
			
			if(lcs > maxValue){
				maxValue = lcs;
				maxIndex = i;
			}
		}
		System.out.println(s + ": " + lst.get(maxIndex).toString());
	}
	
	public int findLCS(String x, String y){
		//1. Implement the LCS algorithm
		int len1 = x.length();  
	    int len2 = y.length();  
	    int c[][] = new int[len1+1][len2+1];  
	    
	    for (int i = 0; i <= len1; i++) {  
	        for( int j = 0; j <= len2; j++) {  
	            if(i == 0 || j == 0) {  
	                c[i][j] = 0;  
	            } else if (x.charAt(i-1) == y.charAt(j-1)) {  
	                c[i][j] = c[i-1][j-1] + 1;  
	            } else {  
	                c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);  
	            }  
	        }  
	    }  
	    
	    return c[len1][len2];  	
	}
	
	private void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
				if(j == matrix[0].length - 1) System.out.print("\n");
			}
		}
	}
}