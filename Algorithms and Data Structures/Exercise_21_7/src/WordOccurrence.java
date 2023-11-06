
public class WordOccurrence implements Comparable<WordOccurrence> {
	
	String word;
	Integer count;

	WordOccurrence(String key, int value){
		word = key;
		count = value;
	}

	@Override
	public int compareTo(WordOccurrence o) {
		return o.count.compareTo(count);
	}

}
