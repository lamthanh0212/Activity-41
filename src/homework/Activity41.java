package homework;

public class Activity41 {
    public static void main(String[] args) {
        int n =153;
        int p ;
        p =n ;
        int r, s = 0 ;

        while(n>0){
            r = n % 10 ;
            n = n/10 ;
            s = s + r*r*r ;
        }
        if ( s ==p ){
            System.out.println( p + " la so Armstrong");
        }

    }



}
