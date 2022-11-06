package com.questionSet;

import java.util.HashMap;
import java.util.Map;

public class Logic {
	public static void logicMethod() {
		Questions que1= new Questions(" Which exception is thrown when java is out of memory?",
				"a) MemoryError",
				"b) OutOfMemoryError",
				"c) MemoryOutOfBoundsException",
				"d) MemoryFullException");
		Questions que2=new Questions(
				" Who invented Java Programming?",
						"a) Guido van Rossum",
						"b) James Gosling",
						"c) Dennis Ritchie",
						"d) Bjarne Stroustrup"
				);
		Questions que3=new Questions(
				 "Which statement is true about Java?",
						" a) Java is a sequence-dependent programming language",
						 "b) Java is a code dependent programming language",
						 "c) Java is a platform-dependent programming language",
						 "d) Java is a platform-independent programming language"
				);
		Questions que4=new Questions(

                        " Which one of the following is not a Java feature?",
                         "a) Object-oriented",
                         " b) Use of pointers",
                          "c) Portable",
                          "d) Dynamic and Extensible"
				);
		Questions que5=new Questions(
				 "What is the extension of java code files?",
						" a) .js",
						 "b) .txt",
						 "c) .class",
						 "d) .java"
				);
		Questions que6=new Questions(
				"Which of the following is not an OOPS concept in Java?",
						"a) Polymorphism",
						"b) Inheritance",
						"c) Compilation",
						"d) Encapsulation"
				);
		Questions que7=new Questions(
				"Which of the following is a type of polymorphism in Java Programming?",
						"a) Multiple polymorphism",
						"b) Compile time polymorphism",
						"c) Multilevel polymorphism",
						"d) Execution time polymorphism"
				);
		
		Questions que8=new Questions(
				"Which of the following is a superclass of every class in Java?",
						"a) ArrayList",
						"b) Abstract class",
						"c) Object class",
						"d) String"
				);
		Questions que9=new Questions(
				"Which one of the following is not an access modifier?",
						"a) Protected",
						"b) Void",
						"c) Public",
						"d) Private"

				);
		 Questions que10=new Questions(
				 "Which of these keywords are used for the block to be examined for exceptions?",
						 "a) check",
						 "b) throw",
						 "c) catch",
						 "d) try"
				 );
		 
		 Map<Questions, Character> map=new HashMap<Questions, Character>();
		 map.put(que1, 'b');
		 map.put(que2, 'b');
		 map.put(que3, 'd');
		 map.put(que4, 'b');
		 map.put(que5, 'd');
		 map.put(que6, 'c');
		 map.put(que7, 'b');
		 map.put(que8, 'c');
		 map.put(que9, 'b');
		 map.put(que10, 'd');
		 
		 
	}

}
