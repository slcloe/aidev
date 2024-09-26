package kr.co.shinhands.edu.aidev;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;
    // setter, getter
    // constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void incrementAge() {
        this.age++;
    }
    
    public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
