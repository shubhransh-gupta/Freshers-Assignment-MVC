package assignment2.data;

import java.io.Serializable;
import java.util.List;

public class User implements Comparable<User>, Serializable {
    private String name;
    private String address;
    private int age;   
    private int rollNumber;
    private List<Course> enrolledCourses;

    public User(String name, int age, String address, int rollNumber, List<Course> enrolledCourses) {
        this.name = name;
        this.address = address;
        this.rollNumber = rollNumber;
        this.age = age;       
        this.enrolledCourses = enrolledCourses;
    }

    public void display() {
        System.out.printf("%s\t\t%d\t\t%d\t\t%s\t\t%s\n\n", name, rollNumber, age, address, enrolledCourses);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public int compareTo(User o) {
        if (name.equals(o.name))
            return rollNumber - o.rollNumber;
        return name.compareTo(o.name);
    }
}