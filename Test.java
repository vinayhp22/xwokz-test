/* Java Test */

1. Collection is a framework, in java - collection is an interface. It is extended by throwable.
Throwable:
	-List(I) 
		+ArrayList(C)
		+LinkedList(C)
	-Set(I)
		+LinkedHashSet(C)
		+HashSet(C)
		-SortedSet(I)
			+TreeSet(C)
	-Queue(I)		
			List	
			>	List is index based.
			>	List allows duplicate elements.
			>	List give positional access.
			>	List is an insertion order.
			Set
			>	Set is non-index based.
			>	Set allows only unique elements.
			>	Set not give positional access.
			>	Set itself un-ordered.


2. Map(I) - syntax had generics - Map(K,V) -Keys, Values
	-HashMap
	-LinkedHashMap
	-Hashtable
	-TreeMap
	
3. 	HashSet:
		-It is a class implements Set.
		-Random Order sorting.
	TreeSet:
		-It is a class implements SortedSet.
		-Insertion Order sorting.
		
4. 	HashMap is implemented by something called Node for storing maps.
		- Uses overided hashcode() & equals() methods for get and put operations.
		

16.
package app;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountryAndCode {

	String country;
	Integer code;

	public static void main(String[] args) {

		/* DataStructure to add */
		Map<String, Integer> countries = new LinkedHashMap<String, Integer>();
		countries.put("India", 91);
		countries.put("USA", 1);
		countries.put("UK", 100);
		countries.put("Germany", 12);
		countries.put("Canada", 51);

		/* country name with code... */
		countries.entrySet().stream().forEach(e -> System.err.println(e.getKey() + " " + e.getValue()));
		
		/* search name by code... */
		Integer code = 91;
		countries.entrySet().stream().forEach(e -> {
			if (e.getValue().equals(code)) {
				System.out.println(e.getKey() +" searched country for code "+e.getValue());
			}
		});
	}

}		