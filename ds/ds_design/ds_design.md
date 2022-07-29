# Data Structure Design Challenge: PhoneBook

```java
public class PhoneBook{
	// implementation not shown
}
```

Each person in PhoneBook stored as:

```java
public class Person {
  private String lastName;
  private String firstName;
  private String phoneNumber;
  
  // other members not shown
}	
```

## Instance variables


## Constructors


## Methods

### add(String lastName, Person p)
Description: Adds new people in to the PhoneBook by lastName. 
Returns: void
Runtime: 

This operation should be optimized to be as fast as possible.

### find(String lastName)
Description: Find a person by lastName. For example, pb.find("Smith") would return the person in the phone book with last name "Smith". Assume that last names are unique. Find should return null if the person is not in the phone book. 
Returns: Person
Runtime: 
This operation should be optimized to be as fast as possible.

### remove(Person p)
Description: remove a person from the list based on lastName. This operation does not have to be optimized.
Returns: void
Runtime: 

### printList()
Description: prints out an entire phone book. This operation does not have to be optimized.
Returns: void
Runtime: 
 
## Implementation hints
Make sure to consider that you want add and find to operate as quickly as possible.

Note that you are finding (searching) based on last name. Last names are strings and you can access an individual letter via charAt. So, if `lastName`` is "Smith" then lastName.charAt(0) would be the char 'S'.

Also note that chars have numeric values. For example, the char 'a' has a value of 97, 'b' is 98 etc. 'A' is 65, 'B" is 66 etc. You can access these values by assigning a char to an int.

String s = "ABC";
int i = s.charAt(a); // i will now hold 65
You can use this char to int mapping to help in efficiently storing items.



## Additions (not required)
Reverse lookup
In addition to looking up people by last name, you might want to do a reverse lookup - that is look up someone by number.

Describe an algorithm that you could use to implement a revese lookup by number on your data structure. What is the runtime?

How might you augment the data structure to implement reverse lookup more quickly? What would the algorithm look like now? What is the new runtime?











