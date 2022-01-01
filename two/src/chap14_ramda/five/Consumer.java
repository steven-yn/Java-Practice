package chap14_ramda.five;

import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		consumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		consumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		consumer.accept("java", 8);
	}

}
