public class Operators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;
        float result = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1*num2;
        float result4 = num1/num2;
        System.out.println("add "+ result +", minus :"+ result2 +", multi :"+ result3 +", div :"+ result4);

        //increment
        int num3 = 10;
        int num4 = num3 + 2;
        System.out.println("ans : "+num4);
        num3 += 8;
        System.out.println(num3);
        // num3++
        // ++num3
        //num3--
        //--num3
        System.out.println("num3 value :"+num3);

        int x = 9;
        int y = 10;
        boolean result7 = x < y;
        boolean result8 = x > y;
        System.out.println(result7 +"  "+ result8);

    }
    
}
