public class TypeCasting {
    public static void main(String[] args) {
        //byte ranges -127 to 127
        byte a = 120;
        int b = (byte)a;
        System.out.println(b);

        // typecasyed from double to int
        double d = 10000;
        int c = (int)d;
        System.out.println(c);

        //typecasted from float to int
        float e = 109.7f;
        int f = (int)e;
        System.out.println("value of after type casting: "+f);

        byte g =127;
        int h = 256;
        g = (byte)h;
        System.out.println("value: " + g);

        float k = 178.998f;
        int j = (int)k;
        System.out.println("float: " +j);

        double l = 789.987;
        float m = (float)l;
        System.out.println("double covertion: "+m);

        byte i = 85;
        char v = (char)i;
        System.out.println("convertion: "+v);
        
        // convertion of bytes multiplication 
        int result = a * i;
        System.out.println("value of a "+result);
        


    }
    
}
