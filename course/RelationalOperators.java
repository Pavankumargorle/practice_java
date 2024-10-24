public class RelationalOperators {
    public static void main(String[] args) {
        
        int x =6;
        int y =6;
        boolean result = x<y;
        boolean result2 = x>y;
        boolean result3 = x<=y;
        boolean result4 = x!=y;
        boolean result5 = x==y;
        System.out.println(result +"  "+ result2+ " "+result3+"  "+result4+ " "+result5);

        float a = 67.07f;
        int e = (int)a;
        int b = (int)a;
        boolean result6=  e== b;
        //implict type converyion

        System.out.println("value of: "+result6);
        int c = 67;
        float d =  c;
        System.out.println(d);



    }
    
}
