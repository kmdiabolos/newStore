import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		String Text;
				
		System.out.print("Hello ");
		System.out.println("World");
		System.out.println("바보");
		System.out.println(" 암호화 하실 코드를 입력해주세요.! " );
		Text = scanf.nextLine();
		System.out.println(Text+"입니다.");
		System.out.println("자바했다가 c했다가 "+Text);
		System.out.println("자바했다가 c했다가 어려브다");
	}

}
