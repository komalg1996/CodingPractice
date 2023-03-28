//2114. Maximum Number of Words Found in Sentences

package Strings;

public class MaxWords {

	public int mostWordsFound(String[] sentences) {
		int max=0;
		for(int i=0;i<sentences.length;i++) {
			max = Math.max(max, sentences[i].split(" ").length);
		}
	return max;
        
    }
	public static void main(String[] args) {
		MaxWords m = new MaxWords();
		String[] sentence= {"please wait", "continue to fight", "continue to win komal"};
		int x = m.mostWordsFound(sentence);
		System.out.println("Max words in sentence is:"+ x);
	}

}
