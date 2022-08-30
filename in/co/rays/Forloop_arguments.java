package in.co.rays;

public class Forloop_arguments { 
	public static void main(String[] args) {
		for (int i=1; i<args.length;i++) {
			System.out.println(i+" Hello "+args[i]);
		}
	}

}
