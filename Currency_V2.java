import java.util.Scanner;

public class Currency_V2 { 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Welcome to Currency Converter !"); // Welcome Message 
        get_list1();                                                  // list of currencies


        System.out.println("Which currency do you want to convert ?");//  print statement for first input
        byte input1 = scan.nextByte();                                // getting first input from user 
    

        System.out.println("Which currency do you want to convert to ?"); // print statment for second input 
        byte input2 = scan.nextByte();                                     // getting second input 


        System.out.println("Enter the amount : ");                          //
        double amount = scan.nextDouble();


        double x = convertToUSD(input1,amount);
        double y = USDToUser(input2,x);
        String currency1 = currencyInput(input1);
        String currency2 = currencyOutput(input2);
      
        System.out.print( amount + " " + currency1 + " in " + currency2 + " = " );
        System.out.printf("%.2f",y ); 
    
        scan.close();
    }

    static void get_list1() {System.out.println("1.Indian Rupees \n2.US Doller \n3.Euro \n4.Pound \n5.Canadian Doller \n6.Kuwait Dinar \n7.South Korean Won \n8.Singapore Doller ");}

    static String currencyInput(byte input1){
        byte i = input1 ;
        String []currency = {"Indian Rupees" , "USD" , "Euro" , "Pound", "Canadian doller", "Kuwait Dinar", "South Korean Won ", "Singapore Doller" } ;
        return currency[--i] ; }

    static String currencyOutput(byte input2){
        byte i = input2 ;
        String []currency = {"Indian Rupees" , "USD" , "Euro" , "Pound", "Canadian doller", "Kuwait Dinar", "South Korean Won ", "Singapore Doller" } ;
        return currency[--i] ;
    }
    static double convertToUSD(byte a,double b){ // conveting to usd 
           // byte c = a ; long d = b;
       if (a==1) {return b / 74.78 ; } //inr 
       if (a==2) {return b         ; } //usd 
       if (a==3) {return b * 01.13 ; } //euro 
       if (a==4) {return b * 01.36 ; } //pound
       if (a==5) {return b * 00.79 ; } //canadian doller
       if (a==6) {return b * 03.31 ; } //kuwait dinar
       if (a==7) {return b / 1199.67;} //korean won
       if (a==8) {return b * 00.74 ; } //singapore doller
            else {return 000;}
        }
    static double USDToUser(byte a ,double b){

        if(a==1) {return b * 74.78 ;}
        if(a==2) {return b         ;}
        if(a==3) {return b / 01.13 ;}
        if(a==4) {return b / 01.36 ;}
        if(a==5) {return b / 00.79 ;}
        if(a==6) {return b / 03.31 ;}
        if(a==7) {return b * 1199.67;}
        if(a==8) {return b / 00.74 ;} 
        else {return 000 ;} 
    }
    
}
