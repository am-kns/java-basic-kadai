package kadai_028;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		String r= "r";
		String s="s";
		String p="p";
		
		if((input.equals(r))||(input.equals(s))||(input.equals(p))){
			
			return input;
			}else{throw new IllegalArgumentException("正しいじゃんけんの手ではありません");
			
			}
		

	}
	
	
	
	public String getRandom() {
		String[] janken =  {"r","s","p"};
		
		int i =(int) Math.floor(Math.random()*2);
		
		return janken[i];
		
	}
	
	
	public void playGame() {
		String myChoice = getMyChoice();
		String random = getRandom();
		
		HashMap<String,String> hashMap = new HashMap<String,String>();
		hashMap.put("r", "グー");
		hashMap.put("s", "チョキ");
		hashMap.put("p", "パー");
		System.out.println("自分の手は"+hashMap.get(myChoice)+",対戦相手の手は"+hashMap.get(random));
		
		if(hashMap.get(myChoice).equals(hashMap.get(random))){
			System.out.println("あいこです");
		}else if((hashMap.get(myChoice).equals("グー"))&&(hashMap.get(random).equals("チョキ"))||
				(hashMap.get(myChoice).equals("チョキ"))&&(hashMap.get(random).equals("パー"))||
				(hashMap.get(myChoice).equals("パー"))&&(hashMap.get(random).equals("グー"))) {
			System.out.println("自分の勝ちです");
		}else if((hashMap.get(myChoice).equals("グー"))&&(hashMap.get(random).equals("パー"))||
				(hashMap.get(myChoice).equals("チョキ"))&&(hashMap.get(random).equals("グー"))||
				(hashMap.get(myChoice).equals("パー"))&&(hashMap.get(random).equals("チョキ"))) {
			System.out.println("自分の負けです");
		}
		
	}
	
	

}
