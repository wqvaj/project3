package zero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
		public static void main(String[] args) {
				Set<String> set = new HashSet<String>();
				set.add("r");
				set.add("b");
				set.add("c");
				set.add("d");
				Iterator<String> it = set.iterator();
				for(String s:set){
					System.out.println(s);
				}
		}		
}
