package question1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		TreeMap<Employee,Integer> tm=new TreeMap<>(new Employee());
		tm.put(new Employee(123,"mahesh","bihar"),30000);
		tm.put(new Employee(3454,"ramukaka","asam"),40000);
		tm.put(new Employee(4565,"Shiva","gujrat"),50000);
		
		Set<Map.Entry<Employee,Integer>> keyvalue=tm.entrySet();
		for(Map.Entry<Employee,Integer> item:keyvalue) {
			 Integer sal=item.getValue();
			Employee emp1=item.getKey();
			System.out.println(emp1.getName());
			System.out.println(emp1.getAddress());
			System.out.println(sal);
			
			System.out.println("=========");
		}
		
	}

}
