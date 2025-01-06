/* 35.Write a program for Java Generics and Collections Sorting operations:
	1. Sorting a list according to natural ordering of elements
	2. Reversing sort order
	3. Sorting a list whose elements of a custom type
	4. Sorting a list using a Comparator
   
*/
package bsr;
import java.text.*;
import java.util.*;
public class Ex35  
{

	public static void main(String[] args) {
		System.out.println("SORTING STRINGS__________________________________");
	
		List<String> listStrings = Arrays.asList("Mamad", "Dipak", "Vipul", "Amit", "Karshan", "Bipin");
		
		System.out.println("Before sorting: " + listStrings);
		
		Collections.sort(listStrings);
		
		System.out.println("After sorting : " + listStrings);
		
		
		System.out.println("\nSORTING CHARACTERS__________________________________");
		
		List<Character> listCharacters = Arrays.asList('F', 'C', 'A', 'B', 'Z', 'E', 'K', 'P');
		
		System.out.println("Before sorting: " + listCharacters);
		
		Collections.sort(listCharacters);
		
		System.out.println("After sorting : " + listCharacters);
		

		System.out.println("\nSORTING INTEGERS__________________________________");
		
		List<Integer> listIntegers = Arrays.asList(1, 6, 9, 3, 2, 0, 8, 4, 7, 5);
		
		System.out.println("Before sorting: " + listIntegers);
		
		Collections.sort(listIntegers);
		
		System.out.println("After sorting : " + listIntegers);
		
		
		System.out.println("\nSORTING A LIST OF DATES__________________________________");
		List<Date> listDates = new ArrayList<>();
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			listDates.add(dateFormatter.parse("2018-10-29"));
			listDates.add(dateFormatter.parse("2018-08-04"));
			listDates.add(dateFormatter.parse("2018-12-31"));
		} catch (ParseException ex) {
			System.err.print(ex);
		}
		
		System.out.println("Before sorting: " + listDates);
		
		Collections.sort(listDates);
		
		System.out.println("After sorting : " + listDates);
		

		System.out.println("\nREVERSING SORT ORDER__________________________________");
		
		System.out.println("Before sorting : " + listIntegers);
		
		Collections.sort(listIntegers);
		
		System.out.println("After sorting  : " + listIntegers);		
		
		Collections.reverse(listIntegers);
		
		System.out.println("After reversing: " + listIntegers);
		
		
		
		System.out.println("\nSORTING CUSTOM TYPES__________________________________");
		
		List<Employee> listEmployees = new ArrayList<>();
		
		listEmployees.add(new Employee("Dipak", 45, 80000));
		listEmployees.add(new Employee("Amit", 56, 75000));
		listEmployees.add(new Employee("Vipul", 30, 120000));
		listEmployees.add(new Employee("Karshan", 25, 60000));
		listEmployees.add(new Employee("Mamad", 26, 82000));
		listEmployees.add(new Employee("Bipin", 34, 88000));
		
		System.out.println("Before sorting: " + listEmployees);
		
		Collections.sort(listEmployees);
		
		System.out.println("After sorting : " + listEmployees);
		
		System.out.println("\nSORTING A LIST USING A COMPARATOR__________________________________");
		
		Collections.sort(listEmployees, new EmployeeAgeComparator());
		
		System.out.println("After sorting : " + listEmployees);
		
	}
}