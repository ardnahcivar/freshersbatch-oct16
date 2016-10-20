package com.mypackage;

import java.util.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;




class Stud{
	private int id ;
	private String name;
	
	public Stud(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Getter(get="id",value=21)
	public int getId() {
		return id;
	}
	
	@Getter(get = "dsds",value=23)
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}


public class Annot {
	public static List<Method> getMethodsAnnotatedWithMethodXY(final Class<?> type){
	    final List<Method> methods = new ArrayList<Method>();
	    Class<?> klass = type;
	    while (klass != Object.class) { // need to iterated thought hierarchy in order to retrieve methods from above the current instance
	        // iterate though the list of methods declared in the class represented by klass variable, and add those annotated with the specified annotation
	        final List<Method> allMethods = new ArrayList<Method>(Arrays.asList(klass.getDeclaredMethods()));
	        for (final Method method : allMethods) {
	            if (method.isAnnotationPresent(Getter.class)) {
	                Getter annotInstance = method.getAnnotation(Getter.class);
	                    
	                    methods.add(method);
	              
	            }
	        }
	        // move to the upper class in the hierarchy in search for more methods
	        klass = klass.getSuperclass();
	    }
	    return methods;
	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Stud ob = new Stud(1, "ravi");
		/*Method m = ob.getClass( ).getMethod("getId");		
		Annotation[] annos = m.getAnnotations();

		
		for(Annotation a : annos)
		      System.out.println(a);*/
		List<Method> method = new ArrayList<Method>();
		 method = getMethodsAnnotatedWithMethodXY(ob.getClass());
		
		String sf  = method.get(0).toString();
		
		for(Method l :method)
			System.out.println(l);
			
	}

}
