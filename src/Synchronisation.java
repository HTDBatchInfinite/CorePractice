import java.util.ArrayList;
import java.util.List;

public class Synchronisation {
	public static void main(String[] args) throws Exception {
		List<Integer> list = setData();
		for (int i : list) {
			list.remove(i);
		}
	}

	static List<Integer> setData() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		return list;

	}

}
