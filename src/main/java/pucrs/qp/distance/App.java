package pucrs.qp.distance;

/**
 * 
 * @author joao.davila@edu.pucrs.br
 * @author patryck.flores@edu.pucrs.br
 * 
 */
public class App {

	/**
	 * 
	 * @param km
	 * @return (int) estimated time
	 */
	public static int calcDistance(int km) {
		return Distance.getEstimatedTime(km);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Distance calculations!");
		System.out.println(calcDistance(20));
		System.out.println(calcDistance(40));
		System.out.println(calcDistance(1190));
		System.out.println(calcDistance(-20));
	}
}








