
public class pin1 {
    public static int getPin(int input1, int input2, int input3) {
        // Pin positions: 3210
        int pin = 0;

        // setting 0th position
        int ip1 = input1 % 10;
        int ip2 = input2 % 10;
        int ip3 = input3 % 10;

        if (ip1 <= ip2 && ip1 <= ip3) {
            pin = ip1;
        } else if (ip2 <= ip3) {
            pin = ip2;
        } else {
            pin = ip3;
        }

        // setting 1st position
        input1 /= 10;
        input2 /= 10;
        input3 /= 10;

        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;

        if (ip1 <= ip2 && ip1 <= ip3) {
            pin = ip1 * 10 + pin;
        } else if (ip2 <= ip3) {
            pin = ip2 * 10 + pin;
        } else {
            pin = ip3 * 10 + pin;
        }

        // setting 2nd position
        input1 /= 10;
        input2 /= 10;
        input3 /= 10;

        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;

        if (ip1 <= ip2 && ip1 <= ip3) {
            pin = ip1 * 100 + pin;
        } else if (ip2 <= ip3) {
            pin = ip2 * 100 + pin;
        } else {
            pin = ip3 * 100 + pin;
        }

        // setting 3rd position
        int maxOfAll = Math.max(input1, Math.max(input2, input3));
        pin = maxOfAll * 1000 + pin;
        System.out.println(maxOfAll);
        return pin;
    }

    public static void main(String[] args) {
    	
        System.out.println(getPin(123, 852, 175));
    }
}
