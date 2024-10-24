public class Casting {
    public static void main(String[] args) {
        //typecasting explicitly
        int x = (int)8.9;
        System.out.println(x);
        
        //explicitly converting float into integer
        float a = 89.9f;
        int b = (int)a;
        System.out.println(b);

        byte c = 127;
        int d = c;
        //if we want to assign int value to byte variable it won't work even though it is smaller value
        System.out.println(d);

        int e = 257;
        byte f = (byte)e;
        System.out.println("ff: "+ f);

        //type promotion
        byte g = 30;
        byte h = 60;
        int result = g*h; // here byte is promoting to int since bigger value 
        System.out.println(result);
    }
    
}
