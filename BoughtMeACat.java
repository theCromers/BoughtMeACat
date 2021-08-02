/* CS1301 Lab4 BoughtMeACAt
 * Kayla Wagner
 */
public class BoughtMeACat {
	public static void main(String args[]) {
		String[] animalArr = new String[] {"hen","duck", "goose", "sheep"};
		for(int i=0;i<animalArr.length;i++) {
			fiddle(animalArr[i]);
		}
		
	}
	public static void fiddle(String animal) {
		System.out.println("Bought me a "+animal+" and the "+animal+" pleased me,");
		System.out.println("I fed my "+animal+" under yonder tree.");
		if(animal.contentEquals("cat")) {
			System.out.println("Cat goes fiddle-i-fee.");
		}
		if(animal.contentEquals("hen")) {
			System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
			System.out.println("Cat goes fiddle-i-fee.");
		}
		if(animal.contentEquals("duck")) {
			System.out.println("Duck goes quack, quack,");
			System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
			System.out.println("Cat goes fiddle-i-fee.");
		}
		if(animal.contentEquals("goose")) {
			System.out.println("Goose goes hissy, hissy,");
			System.out.println("Duck goes quack, quack,");
			System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
			System.out.println("Cat goes fiddle-i-fee.");
		}
		if(animal.contentEquals("sheep")) {
			System.out.println("Sheep goes baa, baa,");
			System.out.println("Goose goes hissy, hissy,");
			System.out.println("Duck goes quack, quack,");
			System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
			System.out.println("Cat goes fiddle-i-fee.");
		}
		System.out.println();
	}
}
