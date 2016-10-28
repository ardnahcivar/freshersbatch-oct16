package com.stream;
import java.nio.file.attribute.GroupPrincipal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fruitData = TestData.getAllFruits();
		
		List<Fruit> res1 = fruitData.stream().filter(p ->p.calories<100 ? true:false).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
		/*for(Fruit f : res1)
			System.out.println(f.getName());
		*/
		
		Map<String,List<Fruit>> res2 = fruitData.stream().collect(Collectors.groupingBy(Fruit::getColor));
		
	/*	for(Map.Entry m :res2.entrySet() ){
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		
		List<Fruit> res3  =fruitData.stream().filter(p -> p.getColor().equalsIgnoreCase("red") ? true:false).sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
		/*for(Fruit f : res3)
			System.out.println(f);
		*/
		
		List<News> newsData = TestData.getAllNews();
		Map<Integer,Long> res4  = newsData.stream()
				.collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));
	for(Map.Entry m :res4.entrySet() )
			System.out.println(m.getKey()+" "+m.getValue());
	
		
		long res5 = newsData.stream().filter( n -> n.getComment().contains("budget")).count();
		//System.out.println(res5);
			
		Map<String,Long>res6 = newsData.stream().map(News::getCommentByUser,Collectors.counting());
		List<Transaction> transactionData = TestData.getAllTransactions();
		List<Transaction> res7 = transactionData.stream().filter(p -> p.getYear() == 2011 ?true:false).sorted(Comparator.comparing(Transaction::getYear)).collect(Collectors.toList());
		for(Transaction l : res7)
			System.out.println(l);
	
	
		
		
		
	
	
	

	}
	
	

}
