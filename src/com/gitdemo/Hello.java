package com.gitdemo;

import java.util.Arrays;
import java.util.List;

public class Hello {
	public static void main(String[] args) {
		List<String> names =Arrays.asList("sfsd","wer","fgh","uiy","yui","abc","xyz");

		//Print names of developer using references 
		names.forEach(System.out::println);
	}	
}
