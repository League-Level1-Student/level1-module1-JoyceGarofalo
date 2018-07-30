
public class PersonRunner {
	
	public static void main(String[] args) {
	Person person = new Person();
	person.setName("Billy");
	person.setSuperpower( "flight");
	Person person2 = new Person();
	person2.setName("James");
	person2.setSuperpower("invisibility");
	Person person3 = new Person();
	person3.setName("Mark");
	person3.setSuperpower("reading minds");
	System.out.println(person.toString());
	}
}
