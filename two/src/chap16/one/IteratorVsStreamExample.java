package chap16.one;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍길동", "윤성연", "김자바");
		
		//Iterator
		Iterator<String> iterator = list.iterator()
;
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		//Stream
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name));
		
	}

}
