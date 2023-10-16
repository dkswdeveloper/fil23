package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("ab", 23);
		map.put("cd", 123);
		map.put("ej", 243);
		map.put("uwabc", 223);
		map.put("abc", 283);
		map.put("lkdsj", 213);
		
		Stream<Entry<String, Integer>> stream2 = map.entrySet().stream();
		//find the person with max marks
		Optional<Entry<String, Integer>> maxOpt = 
				stream2.max((e1,e2) -> e1.getValue() - e2.getValue());
		System.out.println(maxOpt.get().getKey());
		//on demand data structure
		//can be used only once
		List<Integer> list = new ArrayList<>();
		list.add(23); list.add(94); list.add(23); list.add(85);
		list.add(235); list.add(94); list.add(223); list.add(805);
		boolean flag = true;
		for(int x : list)
		{
			if(x <= 50) { flag = false; break; }
		}
		System.out.println(flag);
		Stream<Integer> stream = list.stream();
		boolean allMatch = stream.allMatch( val -> val>50);
		System.out.println(allMatch);
		boolean anyMatch = list.stream().anyMatch(val -> val == 0);
		System.out.println(anyMatch);
		Optional<Integer> optMin = list.stream()
			.filter(val -> val>=50)
			.min((x,y) -> x-y);
		if(optMin.isPresent()) System.out.println("min"+ optMin.get());
		else System.out.println("all failed < 50");
		
		list.stream().count();
		list.stream().filter(t -> t<50).count();
		
		list.stream().distinct();
		list.stream().findFirst();
		list.stream().forEach(val -> System.out.println(val));
		list.stream().forEach(System.out::println);
		list.stream().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}});
		String[] ar = { "sdlfj", "dkj", "sdlkek", "dk3kdkd"};
		List<String> asList = Arrays.asList(ar);
		List<String> small = asList.stream().filter(str -> str.length()<6)
			.collect(Collectors.toList());
		System.out.println(small);
		
		list.stream().distinct().count();
		Arrays.stream(ar)
		.map(str -> str.length())
		.filter(len -> len%2==1)
		.mapToInt(x -> x)
		.forEach(System.out::println);
		
		Arrays.stream(ar).forEach(str -> System.out.println(str.charAt(0)));
		
		Arrays.stream(ar).map(str -> str.charAt(0))
			.forEach(System.out::println);
		
		Stream<String> strm = Stream.of("abc.txt", "abccopy.txt", "abc2.txt");
		strm.parallel()
			.forEach(name -> {
			File f = new File(name);
			System.out.println("Sleeping");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			to find the number of times System word comes
			System.out.println(f.length());
		});
		
		Stream strm2 = Stream.generate(() ->
			new Random().nextInt(30)).limit(10);
		strm2.forEach(System.out::println);
		
	
	//folder path provide list of all the files
	//in this folder
//	Supplier<File> supplier = ?
		
	Optional<Integer> reduce = list.stream().reduce((a,b) -> a+b);
	System.out.println(reduce.get());
	//3 special stream 
//	DoubleStream
//	LongStream
	
	IntStream istrm = Stream.of(23,34,3,45,43,45,56,54)
			.mapToInt(x -> x);
	
	list.stream().mapToInt(x -> x).max();
	list.stream().mapToInt(x -> x).min();
	IntSummaryStatistics stats = list.stream().mapToInt(x -> x).summaryStatistics();
	System.out.println(stats.getAverage());
	System.out.println(stats.getCount());
	System.out.println(stats.getSum());
	
	}

}
