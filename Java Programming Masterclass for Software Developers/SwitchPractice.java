package switchPractice;

public class SwitchPractice {
	public static void main(String[] args) {
		int value = 3;
		
		if (value == 1) {
			System.out.println("Value was 1");
		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Was not 1 or 2");
		}
		
		int switchValue = 1;
		
		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
			
		case 2:
			System.out.println("Value was 2");
			break;
			
		case 3: case 4: case 5:
			System.out.println("was 3, or 4, or 5");
			System.out.println("Actually it was a " + switchValue);
			break;
			
		default:
			System.out.println("Was not 1 or 2");
			break;
		}

		char newSwitch ='A';
		switch(newSwitch)
		{
		case 'A':
			System.out.println('A');
			break;
		case 'B':
			System.out.println('B');
			break;
		case 'C':
			System.out.println('C');
			break;
		case 'D':
			System.out.println('D');
			break;
		case 'E':
			System.out.println('E');
			break;
		default:
			System.out.println("None of them founded.");
			break;
		}
		
		String month = "Januaray";
		switch(month.toLowerCase())
		{
		case "januaray":
			System.out.println("Jan");
			break;
		}
	}
}
