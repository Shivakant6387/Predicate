package com.BiPredicate.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicate2 {
    public static void main(String[] args) {
        List<Doman>domanList= Arrays.asList(new Doman("google.com",1),
                new Doman("mysql.com",2),
                new Doman("sql",3),
                new Doman("Aws",4));
        BiPredicate<String,Integer>biPredicate1=(doman,scope)->{
            return doman.equalsIgnoreCase("google.com")||scope==0;
        };
List<Doman>result=domain(domanList,biPredicate1);
        System.out.println(result);
//if scope ==0
        List<Doman>result2=domain(domanList,(doman,scope)->scope==1);
        System.out.println(result2);

        //Start with g or scope>4
        List<Doman>result3=domain(domanList,(domain,scope)->domain.startsWith("g")&&scope<4);
        System.out.println(result3);
//chaining with or
        List<Doman>result4=domain(domanList,biPredicate1.or((domain,x)->domain.equalsIgnoreCase("Aws")));
        System.out.println(result4);
    }
    public static <T extends Doman>List<T>domain(List<T>list,BiPredicate<String ,Integer>biPredicate){
        return list.stream().filter(x->biPredicate.test(x.getName(),x.getScope())).collect(Collectors.toList());
    }
}
