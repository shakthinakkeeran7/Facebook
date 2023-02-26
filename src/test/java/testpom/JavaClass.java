package testpom;

public class JavaClass {

	public static void main(String[] args) {

		PageObjectMode pom = new PageObjectMode();
		pom.b.Firstname.sendKeys(args);
		pom.b.Firstname.sendKeys(args);
	}
}
