package in.co.rays;

public class Forloop_args2 {
	public static void main(String[] args) {
		int size= args.length;
			if (size==0) {
			System.out.println("Hello All n1 n2 n3");
		} else {
			for(int i=1 ;i<size;i++) {
				System.out.println(i+ " hello "+ args[i]);
			}
		}
	}

}
