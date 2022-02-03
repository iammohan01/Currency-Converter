import java.util.Scanner;

public class Currency_V2 { 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Welcome to Currency Converter !"); // Welcome Message 
        get_list1();                                                  // list of currencies


        System.out.println("Which currency do you want to convert ?");//  print statement for first input
        byte input1 = scan.nextByte();                                // getting first input from user 
       // if (0>input1 && input1 > 6) {break ;}

        System.out.println("Which currency do you want to convert to ?"); // print statment for second input 
        byte input2 = scan.nextByte();                                     // getting second input 


        System.out.println("Enter the amount : ");                          //
        long amount = scan.nextLong();


        double x = convertToUSD(input1,amount);
        double y = USDToUser(input2,x);
        System.out.print("Converted Amount : ");
        System.out.printf("%.2f",y );
    
        scan.close();
    }

    static void get_list1() {System.out.println("1.Indian Rupees \n2.US Doller \n3.Euro \n4.Pound \n5.Canadian Doller \n6.Kuwait Dinar ");}

    static double convertToUSD(byte a,long b){ // conveting to usd 
           // byte c = a ; long d = b;
       if (a==1) {return b / 74.78 ; } //inr 
       if (a==2) {return b         ; } //usd 
       if (a==3) {return b * 01.13 ; } //euro 
       if (a==4) {return b * 01.36 ; } //pound
       if (a==5) {return b * 00.79 ; } //canadian doller
       if (a==6) {return b * 03.31 ; } //kuwait dinar
            else {return b;}
        }
    static double USDToUser(byte a ,double b){

        if(a==1) {return b * 74.78 ;}
        if(a==2) {return b         ;}
        if(a==3) {return b / 01.13 ;}
        if(a==4) {return b / 01.36 ;}
        if(a==5) {return b / 00.79 ;}
        if(a==6) {return b / 03.31 ;}
        else {return 000 ;} 
    }
    
}
