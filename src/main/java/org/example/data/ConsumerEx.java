package org.example.data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConsumerEx {
    public static void main(String[] args) {
        List<Student>getAllStudent=StudentDataBase.getAllStudents();
        Consumer<Student>studentConsumer=student -> {
            System.out.println("Name"+student.getName());
            System.out.println("GradeLeve"+student.getGradeLevel());
            System.out.println("Gender"+student.getGender());
            System.out.println("Gpa"+student.getGpa());
            System.out.println("Activities"+student.getActivities());

        };


       // studentConsumer.access(getAllStudent.get(0));

        //filter grater than 3
        getAllStudent.stream().filter(student -> student.getGpa()>3 ).toList().forEach(n->{System.out.println(n);
          //List convert map
            Map<String,List<String>>listMap=getAllStudent.stream().collect(Collectors.toMap(Student::getGender,Student::getActivities,(oldValue,newValue)->oldValue, LinkedHashMap::new));
            System.out.println(listMap);
            //list to set
           Set<Student>students=getAllStudent.stream().collect(Collectors.toSet());
           students.forEach(System.out::println);

        });
    }
}
