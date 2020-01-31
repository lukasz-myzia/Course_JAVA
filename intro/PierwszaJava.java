package pierwszajava;


public class PierwszaJava {

 
    public static void main(String[] args) {
       
        int x = 10, x2 = 76;
        int y = 3;
        long x1=12345678912L;// L - na końcu
        double z = 7; // nakwiększy zakres
        float y1 = 1.456f; // f - na końcu, tracimy precyzje
        
        char znak = 's';
        String imie ="Łukasz";
        String nazwisko ="Myzia";
        
        System.out.println(imie.length());
        
        // String. ...
        System.out.println(znak);
        System.out.println((double) x/y);
        System.out.println(imie + " " + nazwisko);
        System.out.println(x/(double)x2);
        
        
        
       
    }
    
}
