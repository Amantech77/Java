package in.co.rays;

public class Heloname_ifcondition {
	public static void main(String[] args) {
		if(args.length == 3){
			System.out.println("Hello "
					+ ""+args[2]);
		}else {
			System.out.println("parameter name is requried");
		}
	}

}
