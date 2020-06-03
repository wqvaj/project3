package zero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Test {
		public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("B");
		set.add("c");
		set.add("d");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		}		
}
