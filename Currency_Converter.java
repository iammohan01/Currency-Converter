import java.text.DecimalFormat;
import java.util.*;

public class Currency_Converter {

  

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("###.##");

        System.out.println("Hey welcome to Currency Converter! \n Which Currency do you want to convert ? ");

        double inr , doller , euro , yen , pound , canadian_doller ;
       
        get_list1();
        System.out.println("Enter Input Here : ");
        byte get_input1 = input.nextByte();
        switch (get_input1) {
            case(7): System.out.println("We will add soon!")  ; 
        }  
             
        
        System.out.println("Which Currency do you want to convert to ?");
        System.out.println("Enter Input Here : ");
        byte get_input2 = input.nextByte();

        System.out.println("How Much Money Do You Want to Convert ? \n");
        double amount = input.nextDouble();




        switch(get_input1){
            case(1) : switch(get_input2) {  
                                case (1) : System.out.println(amount + " INR in INR = INR " + amount); break ;
                                case (2) : System.out.println(amount + " INR in US doller = USD " + amount / 74); break ;
                                case (3) : System.out.println(amount + " INR in EURO = EUR " + amount / 84); break ;
                                case (4) : System.out.println(amount + " INR in POUND = GBP " + amount / 101 ); break ;
                                case (5) : System.out.println(amount + " INR in Canadian DOller = CAD " + amount / 58); break ;
                                case (6) : System.out.println(amount + " INR in Kuwait Dinar = KWD " + amount / 247 ) ; } break ;

            case(2) : switch (get_input2){
                                case (1) : System.out.println(amount + " USD in INR = INR " + amount*74); break ;
                                case (2) : System.out.println(amount + " USD in US doller = USD " + amount); break ;
                                case (3) : System.out.println(amount + " USD in EURO = EUR " + amount * 0.88 ); break ;
                                case (4) : System.out.println(amount + " USD in POUND = GBP " + amount * 0.74 ); break ;
                                case (5) : System.out.println(amount + " USD in Canadian DOller = CAD " + amount * 1.27 ); break ;
                                case (6) : System.out.println(amount + " USD in Kuwait Dinar = KWD " + amount * 0.30 ) ; } break ;

            case(3) : switch (get_input2){
                                case (1) : System.out.println(amount + " EURO in INR = INR " + amount*84.27); break ;
                                case (2) : System.out.println(amount + " EURO in US doller = USD " + amount * 1.13); break ;
                                case (3) : System.out.println(amount + " EURO in EURO = EUR " + amount  ); break ;
                                case (4) : System.out.println(amount + " EURO in POUND = GBP " + amount * 0.83 ); break ;
                                case (5) : System.out.println(amount + " EURO in Canadian DOller = CAD " + amount * 1.43 ); break ;
                                case (6) : System.out.println(amount + " EURO in Kuwait Dinar = KWD " + amount * 0.34 ) ; } break ;
            
            case(4) : switch (get_input2){
                                case (1) : System.out.println(amount + " POUND in INR = INR " + amount*101.20); break ;
                                case (2) : System.out.println(amount + " POUND in US doller = USD " + amount * 1.35); break ;
                                case (3) : System.out.println(amount + " POUND in EURO = EUR " + amount*1.20  ); break ;
                                case (4) : System.out.println(amount + " POUND in POUND = GBP " + amount ); break ;
                                case (5) : System.out.println(amount + " POUND in Canadian DOller = CAD " + amount * 1.72 ); break ;
                                case (6) : System.out.println(amount + " POUND in Kuwait Dinar = KWD " + amount * 0.41 ) ; } break ;

            case(5) : switch (get_input2){
                                case (1) : System.out.println(amount + " CANADIAN DOLLER in INR = INR " + amount* 59.01); break ;
                                case (2) : System.out.println(amount + " CANADIAN DOLLER in US doller = USD " + amount *0.79); break ;
                                case (3) : System.out.println(amount + " CANADIAN DOLLER in EURO = EUR " + amount*0.70  ); break ;
                                case (4) : System.out.println(amount + " CANADIAN DOLLER in POUND = GBP " + amount*0.58 ); break ;
                                case (5) : System.out.println(amount + " CANADIAN DOLLER in Canadian DOller = CAD " + amount * 1 ); break ;
                                case (6) : System.out.println(amount + " CANADIAN DOLLER in Kuwait Dinar = KWD " + amount * 0.24 ) ; } break ;

            case(6) : switch (get_input2){
                                case (1) : System.out.println(amount + " KUWAIT DINAR in INR = INR " + amount* 247.39); break ;
                                case (2) : System.out.println(amount + " KUWAIT DINAR in US doller = USD " + amount * 3.31); break ;
                                case (3) : System.out.println(amount + " KUWAIT DINAR in EURO = EUR " + amount* 2.93  ); break ;
                                case (4) : System.out.println(amount + " KUWAIT DINAR in POUND = GBP " + amount * 2.44 ); break ;
                                case (5) : System.out.println(amount + " KUWAIT DINAR in Canadian DOller = CAD " + amount * 4.19 ); break ;
                                case (6) : System.out.println(amount + " KUWAIT DINAR in Kuwait Dinar = KWD " + amount * 1 ) ; } break ;

            
            }
                    
                               

        }
    

    
static void get_list1() {System.out.println("1.Indian Rupees \n2.US Doller \n3.Euro \n4.Pound \n5.Canadian Doller \n6.Kuwait Dinar \n7.More");}
     

        
    
}
