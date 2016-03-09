import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeLesson {
	public static void main(String[] args) {
 		Map<String, Integer> hm = new TreeMap<>();
 		if (!hm.containsKey("paper")) {
 			hm.put("paper", 100);
 		}
 		Integer count  = hm.get("paper");
 		if (count == null) {
 			// "paper" в hm нет
 		} else {
 			System.out.println(count);
 		}
 		for (Map.Entry<String, Integer> e : hm.entrySet()) {
 			System.out.println(e.getKey() + ": " + e.getValue());
 		}
	}
}
