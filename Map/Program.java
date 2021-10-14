package Map;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String,String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "Maria@g");
		cookies.put("phone", "999999999");

		cookies.remove("email");
		cookies.put("phone", "999999900");
		System.out.println("Contains key 'phone'?: " + cookies.containsKey("phone"));
		System.out.println("Phone: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());

		System.out.println("All cookiles: ");
		
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
