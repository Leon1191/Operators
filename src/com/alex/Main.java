package com.alex;

public class Main {

    public static void main(String[] args) {
	double first = 20;
	double second = 80;
	double third = (first+second)*25;
	double forth = third % 40;
		System.out.println(forth);
	if (forth <= 20)
        System.out.println("Total was over the limit");
    }
}
