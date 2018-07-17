import java.util.Map;
import java.util.HashMap;

public class Problem14 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Map<Long, Integer> map = new HashMap<>();
		int length = 0;
		long num = -1;
		for(long i = 2; i <= 1000000; i++) {
			long cur = i;
			int len = 0;
			do {
				if(map.containsKey(cur)) {
					len = len + map.get(cur);
					break;
				}
				if(cur % 2 == 0) {
					cur = cur / 2;
				}
				else {
					cur = 3 * cur + 1;
				}
				len++;
			}while(cur > 1l);
			if(!map.containsKey(i)) {
				map.put(i, len);
			}
			if(length < len) {
				num = i;
				length = len;
			}
		}
		long endTime = System.nanoTime();
		long diffTime = (endTime - startTime) / 1000000;
		System.out.println("Starting number: " + num + ", Length: " + length);
		System.out.println("Time taken: " + diffTime + " ms.");
	}

}
