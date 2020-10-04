package pucrs.qp.distance;

public class Distance {
	public static int INVALID = -1;

	public static int getEstimatedTime(int km) {
		if (km < 0){
			return INVALID;
		}

		return km*2;
	}

}
