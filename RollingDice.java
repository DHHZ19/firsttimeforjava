
public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die run = new Die();
		int i = 0;
		int result = 0;
		int currentPoint = 0;
		
		while(i < 100) {
			int die1 = 0;
			int die2 = 0;
			die1 = run.roll();
			die2 = run.roll();
			 currentPoint = die1 + die2;
			if(currentPoint == 7 || currentPoint == 11) {
				System.out.println("You Win!");
				result++;
			}else if(currentPoint == 2 || currentPoint == 3 || currentPoint == 12){
				System.out.println("You lose");
			}else {
				int die3 = run.roll();
				int die4 = run.roll();
				int sum = die3 + die4;
				while(currentPoint != sum) {
					die3 = run.roll();
					die4 = run.roll();
					sum = die3 + die4;
				}
				if(currentPoint == sum) {
					System.out.println("You win");
					result++;
				}
			}
	
			i++;
		}
		System.out.println("You won this amount of times: " + result );
	}

}
