
public class Die {
	private final int max = 6;
	private int faceValue;

	// constructor
	public Die() {
		faceValue = 1;
	}
	
	// rolls the dice returns the result
	public int roll() {
	faceValue = (int)(Math.random() * max + 1);
	return faceValue;		
	}
	public int setFaceValue(int value) {
		faceValue = value;
		return faceValue;
	}
	public int getFaceValue() {
		return faceValue;
	}
	public String toString() {
		String result = Integer.toString(faceValue);
		return result;
	}
	

}
