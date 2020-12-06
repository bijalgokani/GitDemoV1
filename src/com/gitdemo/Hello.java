package com.gitdemo;

import java.util.Arrays;
import java.util.List;

public class Hello {
	public static void main(String[] args) {
		List<String> names =Arrays.asList("sfsd","wer","fgh","uiy","yui");
		
		for(String name : names){
			System.out.println("name ::: " + name);
		}
	}	
}
