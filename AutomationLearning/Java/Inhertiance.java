
package inheritance;

class School {

private String name;

School(String name) {

this.name = name;

}

public String SchoolName() {

return this.name;

}

}

class Student {

private String name;

Student(String name) {

this.name = name;

}

public String StudentName() {

return this.name;

}

}

public class Drive {

public static void main(String[] args) {

School schl = new School("St.John's School");

Student candidate = new Student("Tobey Marshall");

System.out.println(candidate.StudentName() + " is an Ex-Student of " + schl.SchoolName());

}

}
