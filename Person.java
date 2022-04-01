public class Person {

    //Attribute
    private String firstname; 
    private String lastname;
    private int age;

    // Konstruktor
    public Person (String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }
    // Getter und Setter der einzelnen Personen 
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setAge(int age){
        this.age = age;

    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public int getAge(){
        return age;
    }
    
   
    @Override
    public String toString() {
        return firstname  +  "\n" +  lastname + "\n" + age + "\n";
    }
    // warum Fehlerausgabe, wenn ich das "\n" wegnehme?
      

}



