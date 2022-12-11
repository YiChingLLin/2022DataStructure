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
			

		return 0; 
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
