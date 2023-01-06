Q3. Generalized classes:
		* A class with public access specifier without any non-access specifiers 
			which we can call as general class.

	Specialized classes:
		* A class which is abstrct or other access specifiers such as protected and 	default.

Q4.

a). An Abstract class can't be inherited. 

b). 

c).Implementation of Interface can be an alternative to inheritance.

Q5. Two type of Sorted collectons:-
	a. Comparable - 
		* single field sorted
		* package - java.lang;
	b. Comparator -
		* multiple fields can be sorted
		* package - java.util;

Q6. LinkedList:
		* It follow something called "nodes" to add/modify element.
		* Modification is faster than LinkedList.
		* 

	ArrayList :
		* It follow index based order to add/modify element.
		* Modification is slower because it update all later element in the list.
		* 
Q7. ListIterator :
		* It is special method in List to iterate elemets.
		* It gives index based iteration.

	Iterator :
		* It is a common method in collection to iterate elements.
		* It is used when you read the elements while modifying the elements.
		
Q8. Covariant method overloading:
		* This type of overloading basically follows same parameters in the methods overided.
		* Ex: void man(String name){}
			  void man(String name, int age){this(name);}
			  void man(String name, int age, long mobile){this(name,age);}
		* In above example, you can see method has repeating parameters	which are the same.
		
Q9.	Memory Leakage in Java:
		* 
		
Q10.Static Polymorphism:


	Dynamic Polymorphism:
	
Q11.* Make properties private 
	* Provide access using methods - getters & setters.
	* Encapsulation is achieved by using these.

	public PersonalInformation{
		private String name;
		private Int age;
	}

	
	