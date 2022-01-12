package com.collection;

import java.util.ArrayList;

public class Test6 {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(10);
	ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
	a2.add(200);
	System.out.println(a2);
	ArrayList<Integer> b1 = new ArrayList<Integer>();
	b1.add(100);
	ArrayList<Integer> b2 = new ArrayList<Integer>();
	b2.add(200);
	ArrayList<Integer> b3 = new ArrayList<Integer>();
	b3.add(300);
	b1.addAll(b3);
	b1.addAll(b2);
	System.out.println(b1);
}
}
