package assignment2.data;

import assignment2.exceptions.InvalidCourseException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course implements Serializable {
    private final List<String> selected = new ArrayList<>(Arrays.asList("A,B,C,D,E,F".split(",")));
    private String id;

    public Course(String id) {
        if (selected.indexOf(id) < 0) {
            throw new InvalidCourseException();
        }
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return id;
    }

   

  
}
