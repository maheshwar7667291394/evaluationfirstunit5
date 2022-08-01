package question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mobile {
	public String addMobile(String company, String model) {
		
		
		return "Mobile added successfully";
	}
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
		ArrayList<String> model=new ArrayList<>();
		model.add("no1");
		model.add("no2");
		model.add("no3");
		
		Scanner input=new Scanner(System.in);
		 System.out.println("Enter the company name");
		 String name=input.next();
		 System.out.println("Enter the model");
		 String mode=input.next();
		 
		mobiles.put("samsum",model);
//		mobiles.put(name, model);
		Set<String> kye=mobiles.keySet();
		 for(String item:kye) {
			 if(item.compareTo(name)==0) {
				 System.out.println(mob.addMobile(name, mode));;
				 
			 }
		 }
	
		
		
	}

}
