package kadai_021;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void search(ArrayList<String> fruit) {
		HashMap<String, String> english = new HashMap<String, String>();
		
		english.put("apple", "りんご");
		english.put("peach", "桃");
		english.put("banana", "バナナ");
		english.put("lemon", "レモン");
		english.put("pear", "梨");
		english.put("kiwi", "キウィ");
		english.put("strawberry", "いちご");
		english.put("grape", "ぶどう");
		english.put("muscat", "マスカット");
		english.put("cherry", "さくらんぼ");
		
		for(int i = 0; i < fruit.size(); i++) {
			String word = fruit.get(i);
			
			if(english.containsKey(word)) {
				System.out.println(fruit.get(i) + "の意味は" + english.get(fruit.get(i)));
			}else {
				System.out.println(fruit.get(i) + "は辞書に存在しません");
			}
		}
		
	}

}
