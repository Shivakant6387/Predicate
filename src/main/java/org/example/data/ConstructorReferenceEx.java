package org.example.data;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceEx {
    public static Supplier<Student>studentsSupplier=Student::new;
    public static Supplier<Student>getStudentsSupplier2=()->{return new Student();};

    public static Function<String ,Student>studentFunction=Student::new;
        public static Function<Double,Student>studentFunction2=Student::new;

    public static void main(String[] args) {
        System.out.println(studentsSupplier.get());
        System.out.println(studentFunction.apply("Pramod"));
        System.out.println(studentFunction2.apply(4.0));
    }

}
