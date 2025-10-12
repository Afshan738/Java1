// I have implemented the first solution using if-else condition for checking maximum number😁
public class DIY20 {
    public static void main(String[] args) {
        DIY20 myMaxNum = new DIY20();
        int getIntMaxNum = myMaxNum.maxNum(24, 12);
        System.out.println(" Integer Maximum Num is: " + getIntMaxNum);
        double getDoubleMaxNum = myMaxNum.maxNum(23.5, 78.6);
        System.out.println("Double Maximum Num is: " + getDoubleMaxNum);

    }

    public int maxNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public double maxNum(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

// SECOND METHOD FOR Solving The same problem👻
// here i have used the built-in max method for finding the maximum number

// public class DIY20 {
// public static void main(String[] args) {
// DIY20 myMaxNum = new DIY20();
// int getIntMaxNum = myMaxNum.maxNum(24, 12);
// System.out.println(" Integer Maximum Num is: " + getIntMaxNum);
// double getDoubleMaxNum = myMaxNum.maxNum(23.5, 78.6);
// System.out.println("Double Maximum Num is: " + getDoubleMaxNum);

// }

// public int maxNum(int num1, int num2) {
// int MaximumNum = Math.max(num1, num2);
// return MaximumNum;
// }

// public double maxNum(double num1, double num2) {
// double MaximumNumDouble = Math.max(num1, num2);
// return MaximumNumDouble;
// }
// }
