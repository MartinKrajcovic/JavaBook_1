package o1_lambda_vyrazy;

/**
 * Tato trieda sluzi na demonstracne ucely prikladov
 * @see o1_lambda_vyrazy.Lambda3
 * @see o1_lambda_vyrazy.Lambda4
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [" + firstName + " " + lastName + " " + age + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
