
public class equalsvsoperator {
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("bhimesh");
		
		Employee e2 = new Employee();
		e2.setId(101);
		e2.setName("bhimesh");
		
		System.out.println("Shallow comparision " + (e1==e2));
		System.out.println("Deep comaparision " + (e1.equals(e2))); //getting as false because By default, equals() in Java behaves like ==
	//	If you did not override the equals() method in Employee, it uses the default implementation from Object class:
		//default implementation:
		/**
		 * public boolean equls (Object o)
		 * {
			return(this==obj)
		}
		 */
		//This means it checks if both references point to the same object (same as ==).
		//e1 and e2 have different memory addresses, even though their fields (id and name) are the same
		//to fix we need to over ride equals method
		
		Employee e3 = new Employee();
		e1.setId(101);
		e1.setName("bhimesh");
		
		Employee e4 = new Employee();
		e2.setId(101);
		e2.setName("bhimesh");
		
		System.out.println("Shallow comparision after override " + (e3==e4));
		System.out.println("Deep comaparision after override  " + (e3.equals(e4)));
		System.out.println("e3 hash code " + e3.hashCode());
		System.out.println(" e4 hash code " + e4.hashCode());
		
		/*
		 * eqals and hash code contract
		 * if two objects are eqaul according to equals(Object obj) method then hashcode must be same for the both object
		 * if is not necessary that if you have same hashcode for 2 objects means those two objects are equal. this is collision, better hash function prevent this if e1 and e2 have same hashcodes dosnt mean e1 and e2 are same logically
		 * whether it is invoked on the same object more than once during the execution od a java applocation the java hash cide method should consistency return the same integer 
		 * 
		 */
	}

}
