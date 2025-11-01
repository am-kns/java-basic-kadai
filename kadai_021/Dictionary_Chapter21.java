package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dicMap = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
		dicMap.put("apple", "りんご");
		dicMap.put("peach", "桃");
		dicMap.put("banana", "バナナ");
		dicMap.put("lemon", "レモン");
		dicMap.put("pear", "梨");
		dicMap.put("kiwi", "キウイ");
		dicMap.put("strawberry", "いちご");
		dicMap.put("grape", "ぶどう");
		dicMap.put("muscat", "マスカット");
		dicMap.put("cherry", "さくらんぼ");
	}
		
	
	public void search(String[] searchWord) {
		for(int i=0; i<searchWord.length; i++) {
			if(dicMap.get(searchWord[i]) == null) {
				System.out.println(searchWord[i]+"は辞書に存在しません");
				
			 } else {System.out.println(searchWord[i]+"の意味は"+dicMap.get(searchWord[i]));

				 
			 }

			
				
			}
		
		}

}
