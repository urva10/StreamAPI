

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static <object> void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
        System.out.println(li);

        List<Integer> collect=li.stream().filter(i->i>20).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1=li.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(collect1);

        //TerminalOperation
        //toArray()
        Stream<Integer> s= Stream.of(1,2,3,4,5);
        object[] array= (object[]) s.toArray();
        for(object a:array)
        {
            System.out.print(a+" ");
        }
        System.out.println();
//count
        Stream<Integer> s1=Stream.of(1,2,3,4,5);
        long count=s1.count();
        System.out.println(count);

        //foreach
        Stream<Integer> s2=Stream.of(1,2,3,4,5);
        s2.forEach(ele-> System.out.print(ele+" "));

        //min max

        Stream <Integer> s3=Stream.of(1,2,3,4,5);
        Stream<Integer> s4=Stream.of(1,2,3,4,5);
        Optional<Integer> min=s3.min(((o1, o2) -> o1.compareTo(o2)));
        Optional<Integer> max=s4.max(((o1, o2) -> o1.compareTo(o2)));

        System.out.println("min " +min.get());
        System.out.println("max " +max.get());

        //anymatch
        List<Integer> ls=new ArrayList(Arrays.asList(44,33,65,89));
        boolean anyMatch=ls.stream().anyMatch(i -> i==23);
        System.out.println(anyMatch);
//allmatch

        List<Integer> np=new ArrayList(Arrays.asList(2,5,7,3));
        boolean allMatch=np.stream().allMatch(i-> i%2==0);
        System.out.println(allMatch);
    }
}