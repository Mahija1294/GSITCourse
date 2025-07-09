package myfirstpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UnderstandingArrayList {

	public static void main(String[] args) {
		
			ArrayList<String> list = new ArrayList<>();
			list.add("Abhilash");
			list.add("Akshada");
			list.add("Ankush");
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
			
			for(String i : list)
			{
				System.out.println(i);
			}
			
			ListIterator<String> lit = list.listIterator();
			while(lit.hasNext())
			{
				String var = lit.next();
				System.out.println(var);
			}
			
			while(lit.hasPrevious())
			{
				System.out.println(lit.previous());
			}
			
			list.add(1, "Anagha");
		
			System.out.println(list.get(2));
		
			list.set(1, "Julien");
			System.out.println(list.get(1));
		
			list.remove(1);
				
			System.out.println(list.contains("akshada"));
			
			System.out.println(list.isEmpty());
			list.clear();
			System.out.println(list.isEmpty());
			
			
			
			List<Integer> list2 = new ArrayList<>();
			
			list2.add(1);
			list2.add(2);
			list2.add(3);
			Collections.addAll(list2, 4,5,6,7,8,10);
			
			Iterator<Integer> it = list2.iterator();
			while(it.hasNext())
			{
				int var = it.next();
				System.out.println(var);
				if(var == 3)
				{
					System.out.println("break reached");
					break;
				}
			}
			System.out.println(it.next());
			
			it = list2.iterator(); //0
			System.out.println(it.hasNext());
			System.out.println(it.next());
			
			it = list2.listIterator(4);
			System.out.println(it.next());
			

		

	}

}
