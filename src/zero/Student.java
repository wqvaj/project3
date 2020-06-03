package zero;

public class Student extends Person{
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Student(String name) {
	super();
	this.name = name;
}

public Student() {
	super();
}

}
