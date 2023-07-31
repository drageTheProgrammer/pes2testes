public class TDD{
	public static void main(String[] args){
		testMultiplication();
	}

	class Dollar {
       int amount = 10;
       Dollar(int amount) {}			
       void times(int multiplier) {}
		int amount;
		Dollar(int amount) {
		  this.amount= amount;
		}
		void times(int multiplier) {
		  amount= amount * multiplier;
		}
    }	

    public void testMultiplication() {
       Dollar five = new Dollar(5);
       five.times(2);
       assertEquals(10, five.amount);
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
    }

}