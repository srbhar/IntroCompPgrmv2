package practice;

public class NumberSystems {
	
	public static String decimalToHexa(int decimal) { //47 -> 2F
		
        if (decimal == 0) {
        	return "0";
        }

        String hexa = "";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (decimal > 0) {
            int rem = decimal % 16;
            hexa = hexChars[rem] + hexa;
            decimal /= 16;
        }
        
        return hexa;
	}
	
	public static int hexaToDecimal(String hexa) { //2F -> 47
		
		int decimal = 0;
		int count = 0;
		
		char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f'};
		String[] val = {"10", "11", "12", "13", "14", "15", "10", "11", "12", "13", "14", "15"};
		for (int i = hexa.length()-1; i >= 0; i--) {
			char ch = hexa.charAt(i);
			if (Character.isDigit(ch)) {
				decimal += Character.getNumericValue(ch) * Math.pow(16, count);
			}
			else {
				for (int k = 0; k < arr.length; k++) {
					if (arr[k] == ch) {
						decimal += Integer.parseInt(val[k]) * Math.pow(16, count);
						break;
					}
				}
			}
			count++;
	}
		return decimal;
	}
	
	public static String decimalToOctal(int decimal) { //10 -> 12
		
        if (decimal == 0) {
        	return "0";
        }

        String octal = "";
        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }
        return octal;
        
	}
	
	public static int octalToDecimal(String octal) { // 12 -> 10
		
        int decimal = 0;
        int power = 1;

        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0';
            decimal += digit * power;
            power *= 8;
        }
        
        return decimal;
	}
	
	public static String decimalToBinary(int decimal) {// 3 -> 11
		
        if (decimal == 0) {
        	return "0";
        }

        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        
        return binary;
        
	}
	
	public static int binaryToDecimal(String binary) { // 11 -> 3
		
        int decimal = 0;
        int power = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * power;
            power *= 2;
        }
        
        return decimal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Decimal to Hex String for 47: " + decimalToHexa(47));
		System.out.println("Hex String to Decimal for 2F: " + hexaToDecimal("2F"));
		System.out.println("Decimal to Octal for 10: " + decimalToOctal(10));
		System.out.println("Octal to Decimal for 12: " + octalToDecimal("12"));
		System.out.println("Decimal to Binary for 3: " + decimalToBinary(3));
		System.out.println("Binary to Decimal for 11: " + binaryToDecimal("11"));

	}

}
