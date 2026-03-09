package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice(){
		HashMap<String, String> janken = new HashMap<String, String>();
		
		janken.put("r", "グー");
		janken.put("s", "チョキ");
		janken.put("p", "パー");
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String input = scanner.next();
			
			if(janken.containsKey(input)) {
				return input;
			}else {
				System.out.println("入力が正しくありません");
			}
			
			scanner.close();
		}
	}
	public String getRandom() {
		String[] jankenArray = new String[3];
		
		jankenArray[0] = "r";
		jankenArray[1] = "s";
		jankenArray[2] = "p";
		
		int i = (int)Math.floor(Math.random() * 3);
		return jankenArray[i];
	}
	public void playGame(){
		HashMap<String, String> janken = new HashMap<String, String>();
		
		janken.put("r", "グー");
		janken.put("s", "チョキ");
		janken.put("p", "パー");
		
		String user = getMyChoice();
		String you = getRandom();
		
		System.out.println("自分の手は" + janken.get(user) + "," + "対戦相手の手は" + janken.get(you));
		
		if(user.equals("r") && you.equals("s") || user.equals("s") && you.equals("p") || user.equals("p") && you.equals("r")) {
			System.out.println("自分の勝ちです");
		}else if(user.equals(you)) {
			System.out.println("あいこです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}
