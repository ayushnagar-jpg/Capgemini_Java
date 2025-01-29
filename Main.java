class Main {
    int a;
    double b;
    boolean c;
    char d;
    String e;
    byte f;
    long g;
    short h;
    
    public static void main(String[] args) {
       Main obj = new Main();
        int myNum = 5;              
        float myFloatNum = 5.99f;   
        char myLetter = 'D';         
        boolean myBool = true;       
        String myText = "Hello";
        byte mybyte =126;
        long mylong = 4565656;
        short myshort = 646;
        
    
        System.out.println(obj.a+" "+obj.b+" "+obj.c+" "+obj.d+" "+obj.e+" "+obj.f+" "+obj.g+" "+obj.h);
        System.out.println(myNum + " " + myFloatNum + " " + myLetter + " " + myBool + " " + myText + " " +mybyte);
    }
}