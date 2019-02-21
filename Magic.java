public class Magic {
	public static void main(String[] args) {

	int myNumber = 289;
	//myNumber is the original number
    	int stepOne = myNumber*myNumber;
    	int stepTwo = stepOne + myNumber;
    	int stepThree = stepTwo/myNumber;
    	int stepFour = stepThree + 17;
    	int stepFive = stepFour - myNumber;
    	int stepSix = stepFive / 6;
    	System.out.println(stepSix);
    
	}
}

//3 is the result no matter what integer you choose as the origianl number.

