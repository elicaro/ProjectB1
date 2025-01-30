package Demo1;

public class DemoTest1 {
	
public static void main (String args []) {
		
		int examOne = 85;
		int examTwo = 90;
		
		
		
		if (examOne > examTwo) {
			System.out.println("examOne score is higher");
		}else if (examOne < examTwo) {
			System.out.println("examTwo score is higher");
		} else if ( examOne == examTwo) {
			System.out.println("Both exam score is same");	
		}	
	
}

char setGender = 'M';
		String getGender = "";

		switch (setGender) {
		case 'M':
		case 'm':
			getGender = "MALE";
			break;
		case 'F':
		case 'f':
			getGender = "FEMALE";;
			break;
		default:
			getGender = "OTHERS";
		}
		System.out.println(getGender);
	}


	
	}



