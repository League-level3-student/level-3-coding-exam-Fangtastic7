import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int same = 0;
		
		//System.out.println(hashmap1.get(0));
			for(String key : hashmap1.keySet()) {
				if(hashmap2.containsKey(key)) {
					if(hashmap2.get(key).equals(hashmap1.get(key))) {
						same = same +1;
					}
				}
			}
		
		return same;
	}

}
