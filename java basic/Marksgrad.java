package basic;

public class Marksgrad {
public static void main(String[]args) {
	int marks = 71;
	if(marks>=91 && marks<=100) {
		System.out.println("grad A+");
	
	}
	else if (marks>=81 && marks<=100) {
		System.out.println("grad A");
	}
	else if (marks>=71 && marks<=100) {
		System.out.println("grad b+");
	}
	else if (marks>=61 && marks<=100) {
		System.out.println("grad b");
	}
	else if (marks>=51 && marks<=100) {
		System.out.println("grad c");
	}
	else if (marks>=41 && marks<=50) {
		System.out.println("grad d");
	}
	else if(marks>=0 && marks<=40) {
		System.out.println("student is fail");
	}
}   
}
