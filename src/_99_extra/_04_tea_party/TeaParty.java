package _99_extra._04_tea_party;
	import static org.junit.Assert.assertEquals;
	import org.junit.Test;

	public class TeaParty {
		public void welcome(String name, boolean isWoman, boolean isKnighted) {   
			if(isWoman == true && isKnighted == true) {
				System.out.println("Hello lady "+name);
			}	
			else if(isWoman == false && isKnighted == true) {
				System.out.println("Hello sir "+name);
			}
			else if(isWoman == true && isKnighted == false) {
				System.out.println("Hello Ms. "+name);
			}
			else if(isWoman == false && isKnighted == false) {
				System.out.println("Hello Mr. "+name);
			}
		}
	}
	
