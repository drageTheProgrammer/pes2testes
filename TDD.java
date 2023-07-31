public class TDD{
	public static void main(String[] args){
		//testMultiplication();
		testEquality();
	}
	
	class Money  {
		protected int amount;

		public boolean equals(Object object)  {
			Money money = (Money) object;
			return amount == money.amount;
		}  

		public boolean equals(Object object) {
			Money money = (Money) object;
			return amount == money.amount && getClass().equals(money.getClass());
		}
		static Dollar dollar(int amount)  {
			return new Dollar(amount);
		}

		abstract Money times(int multiplier);
		
		static Money dollar(int amount)  {
			return new Dollar(amount);
		}

		static Money franc(int amount) {
			return new Franc(amount);
		}				
	}
	
	class Dollar extends Money{
		private int amount;
		Dollar(int amount) {
		  this.amount= amount;
		}
		Money times(int multiplier) {
			return new Dollar(amount * multiplier);
		}
    }
	
		class Franc extends Money{   
		private int amount;					
			Franc(int amount) {      
			this.amount= amount;
		}					
			Money times(int multiplier)  {      
			return new Franc(amount * multiplier);					
		}					
	}

    public void testMultiplication() {
		Money five = Money.Dollar(5);
		assertEquals(Money.Dollar(10), five.times(2));
		assertEquals(Money.Dollar(15), five.times(3));
    }
	
	public void testEquality() {
		assertTrue(Money.Dollar(5).equals(Money.Dollar(5)));
		assertFalse(Money.Dollar(5).equals(Money.Dollar(6)));
		assertTrue(Money.Franc(5).equals(Money.Franc(5)));
		assertFalse(Money.Franc(5).equals(Money.Franc(6)));
		assertFalse(Money.Franc(5).equals(Money.Dollar(5)));
	}
	
	public void testFrancMultiplication() {
		Money five = Money.Franc(5);
		assertEquals(Money.Franc(10), five.times(2));
		assertEquals(Money.Franc(15), five.times(3));
	}
}