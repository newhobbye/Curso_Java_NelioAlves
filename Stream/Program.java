package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> str1 = list.stream().map(z -> z *10);
		System.out.println(Arrays.toString(str1.toArray()));
		
		Stream<String> str2 = Stream.of("Maria", "Alex" , "Bob");
		System.out.println(Arrays.toString(str2.toArray()));
		
		Stream <Integer> str3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(str3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}
}
