package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("grape");
		fruit.add("orange");
		
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		dic.search(fruit);
	}

}
