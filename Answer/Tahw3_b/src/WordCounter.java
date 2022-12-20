import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

public class WordCounter {
	private String urlStr;
    private String content;
    
    public WordCounter(String urlStr){
    	this.urlStr = urlStr;
    }
    
    private String fetchContent() throws IOException{
    	this.urlStr = URLDecoder.decode(this.urlStr , "utf-8");
    	URL url = new URL(this.urlStr);
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
	
		String retVal = "";
	
		String line = null;
		
		while ((line = br.readLine()) != null){
		    retVal = retVal + line + "\n";
		}
		return retVal;
    }
    
    public int BoyerMoore(String T, String P){
        int i = P.length() -1;
        int j = P.length() -1;
        
        do{
            if (P.charAt(j) == T.charAt(i)){
                if (j == 0){
                	return i; // match!
                }
                else{
                    i--;
                    j--;
                }
            }
            else{
                i = i + P.length() - min(j, 1+last(T.charAt(i), P));    
                j = P.length()-1;
            }
        } while(i <= T.length()-1);

        return -1;
    }

    public int last(char c, String P){
        for (int i = P.length()-1; i >= 0; i--){
            if (P.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    public int min(int a, int b){
        if (a < b)
            return a;
        else if (b < a)
            return b;
        else 
            return a;
    }
    
    public int countKeyword(String keyword) throws IOException{
		if (content == null){
		    content = fetchContent();
		}
		
		//To do a case-insensitive search, we turn the whole content and keyword into upper-case:
		content = content.toUpperCase();
		keyword = keyword.toUpperCase();
		
		int retVal = 0;
		int fromIdx = 0;
		int found = -1;
		int total_length = content.length();
		
		while ((found = BoyerMoore(content.substring(fromIdx, total_length), keyword)) != -1){
		   retVal++; 
		   fromIdx = fromIdx + found + keyword.length();
		}
		return retVal;
    }
}

//https://gist.github.com/LeafieTutoring/14bb41329f21eecf0dff886ddbbdf6f3
