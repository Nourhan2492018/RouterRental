/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class customer implements displayInf{
    Scanner s = new Scanner(System.in);
    private invoice inv1;
    private ArrayList <router> customerRuoter;
    private  float total_price;
    private router r;
    static final float discount=0.25f;
   private String Report;
    
    public customer() {
        customerRuoter=new ArrayList<>();
    }

    public router getR() {
        return r;
    }

    public void setR(router r) {
        this.r = r;
        this.customerRuoter.add( r);

    }   

    public String getReport() {
        return Report;
    }

    public void setReport(String Report) {
        this.Report = Report;
    }
    
    public customer(invoice v) {
        this.inv1 = v;
       customerRuoter=new ArrayList<>();
    }

    public ArrayList<router> getCustomerRuoter() {
        return customerRuoter;
    }

    public void setCustomerRuoter(ArrayList<router> customerRuoter) {
        this.customerRuoter = customerRuoter;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public invoice getInv1() {
        return inv1;
    }

    public void setInv1(invoice inv1) {
        this.inv1 = inv1;
    }
    
    public ArrayList<router> Renrouter(ArrayList<router> arrayListRonters)
    {
       System.out.println("---------------");
      
       String in,in1;
       int y = 0,y1 = 0,y2 = 0;
       Date d1=new Date();
       Date d2=new Date();
       Date d3=new Date();
       reservation v=new reservation();
//       System.out.print("Enter Number of Rent router wont you : ");
//       int n=s.nextInt();
       boolean t=false; 
            System.out.print("Enter SeriseNumber : ");
               in=s.next();
           for (int i = 0; i < arrayListRonters.size(); i++) {
              
              
               if(arrayListRonters.get(i).getSerial_number().equals(in))
               {
                   if  (arrayListRonters.get(i).getValid()=='n')
                   {arrayListRonters.get(i).setValid('y');
                   System.out.print("Enter Start date :");
                     try {  y=s.nextInt();
                     }catch(InputMismatchException e){
                         System.out.println("Input Must Be Interger Number");}
                   System.out.print("Enter end date :");
                    try {     y1=s.nextInt();
                     }catch(InputMismatchException e){
                         System.out.println("Input Must Be Interger Number");}
                   System.out.print("Enter type reservation :");
                   in1=s.next();
                   System.out.print("Enter num reservation :");
                     try {  y2=s.nextInt();
                     }catch(InputMismatchException e){
                         System.out.println("Input Must Be Interger Number");}     
                   v.setNumber(y2);
                   d2.setDate(y);
                   v.setStart_date(d2);
                   d3.setDate(y1);
                   v.setEnd_date(d3);
                   v.setReservationdate(d1);
                   v.setReservationtype(in1);
                   arrayListRonters.get(i).setReservation1(v);
                   System.out.println("");
                   System.out.println("\t Done.................");
                   System.out.println("");
                   customerRuoter.add(arrayListRonters.get(i));
                   t=true;
                   break;
                   }
               if(arrayListRonters.get(i).getValid()=='y')
               {
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("you can't rant Becouse This Router Not Valid TO Rent...........");
                    System.out.println("---------------------------------------------------------------");

                    break;
               }
            }
               
           }
       if(t=false)
       {
           System.out.println("------------------------------");
           System.out.println(" you can't rant ..............");
           System.out.println("----------------------------");
       }
     return arrayListRonters;
    }
public void ExtandDuration()
{      
    
    System.out.print("Enter SeriseNumber : ");
    String serial=s.next();
    System.out.println("-------------------------------");
         Date date1 =new Date();
         int month = 0,day = 0;
         boolean check=false;
         int l=0;
            while(customerRuoter.size()>l)
            {
            if(customerRuoter.get(l).getSerial_number().equals(serial))
            { 
              System.out.print("Enter Month For Extand :");
             try {   month=s.nextInt();
                     }catch(InputMismatchException e){
                         System.out.println("Input Must Be Interger Number");}    
              System.out.print("Enter Day For Extand :");
               try {  day=s.nextInt();  
                     }catch(InputMismatchException e){
                         System.out.println("Input Must Be Interger Number");}                  
              System.out.println();
              System.out.println("----------------------------------");
              Date date =new Date(2020, month, day);
              customerRuoter.get(l).getReservation1().setEnd_date(date);
            System.out.println("------------------------------");
           System.out.println(" Done Extand Duratio .........");
           System.out.println("----------------------------");
                 check=true;
                    break;
            }
            l++;
         }
        if(check==false)
        {
            System.out.println("-----------------------------");
            System.out.println("Error Not Found This router");
            System.out.println("------------------------------");
        }
}
public void Cancelrouter ( )
{
    System.out.print("Enter SeriseNumber : ");
    String serial=s.next();
    System.out.println("-------------------------------");
    Date date = new Date();
    boolean chrck=false;
    int l=0;
   // System.out.println(customerRuoter.size());
            while(l<customerRuoter.size()) {
                
             if (customerRuoter.get(l).getSerial_number().equals(serial))  
             {  
                if(date.getMonth()== customerRuoter.get(l).getReservation1().getStart_date().getMonth())
                {  int d=(date.getDate()-(customerRuoter.get(l).getReservation1().getStart_date().getDate()));       
                if (d>=2)
                {
                    customerRuoter.remove(customerRuoter.get(l));
                    System.out.println("-------------------------");
                    System.out.println("Done Cancel router ");
                    System.out.println("-------------------------");
                }
                else
                {
                    System.out.println("-------------------------");
                    System.out.println("Sorry You Can't Cancel");
                    System.out.println("-------------------------");
                }
                }
                else if(date.getMonth()<customerRuoter.get(l).getReservation1().getStart_date().getMonth()) 
                {
                 if (customerRuoter.get(l).getReservation1().getStart_date().getDate() <= date.getDate()+2)
                {
                    customerRuoter.remove(customerRuoter.get(l));
                    System.out.println("-------------------------");
                    System.out.println("Done Cancel router ");
                    System.out.println("-------------------------");
                }
                else
                {
                    System.out.println("-------------------------");
                    System.out.println("Sorry You Can't Cancel");
                    System.out.println("-------------------------");
                }
                }
                else if(date.getMonth()>customerRuoter.get(l).getReservation1().getStart_date().getMonth()) 
                {
                    System.out.println("-------------------------");
                    System.out.println("Sorry You Can't Cancel");
                    System.out.println("-------------------------");
                }
                  chrck=true;
                  break;
               
             }
            l++;
         }
        if(chrck==false)
        {
            System.out.println("---------------------------");
            System.out.println("Error Not Found This router");
            System.out.println("---------------------------");
        }

}
public void ChangModel()
{
    int i=0;
    String serise;
    boolean t=false;
    System.out.print("Enter SeriseNumber : ");
    serise=s.next();
    System.out.println("-------------------------------");
    while (i<customerRuoter.size()){  
  
        if(customerRuoter.get(i).getSerial_number().equals(serise))
        {
          
            System.out.print("enter New Model To chane : ");
            String s1=s.next();
            customerRuoter.get(i).setModel(s1);
            System.out.println("------------------------------------");
            System.out.println("..............Done.................. ");
            System.out.println("------------------------------------");
            t=true;
            break;
        }    
          i++;  
       }
       if (t==false)
        {
            System.out.println("------------------------------------");
            System.out.println("not found router in customer list ");
            System.out.println("------------------------------------");

        }
    
}
    @Override
    public void display() {
        
        
        if(!customerRuoter.isEmpty())
        {
            System.out.println("routers of customer");
            System.out.println("**********************");
            for (int i = 0; i < customerRuoter.size(); i++) {
                
                System.out.println("Router"+(i+1));
                System.out.println("===================");
                System.out.println("Serial_numbe :"+customerRuoter.get(i).getSerial_number());
                System.out.println("Model :"+customerRuoter.get(i).getModel());
                System.out.println("Number_of_ports : "+customerRuoter.get(i).getNumber_of_ports());
                System.out.println("PriceRouter :"+customerRuoter.get(i).getPriceRouter());
                System.out.println("Reservation date : "+customerRuoter.get(i).getReservation1().getReservationdate());
                System.out.println("Reservation Number : "+customerRuoter.get(i).getReservation1().getNumber());
                System.out.println("Start_date : "+customerRuoter.get(i).getReservation1().getStart_date().getDate()+"/"
                        +customerRuoter.get(i).getReservation1().getStart_date().getMonth()+"/"+customerRuoter.get(i).getReservation1().getStart_date().getYear());
                System.out.println("End_date :"+customerRuoter.get(i).getReservation1().getEnd_date().getDate()+"/"
                        +customerRuoter.get(i).getReservation1().getEnd_date().getMonth()+"/"+
                        customerRuoter.get(i).getReservation1().getEnd_date().getYear());
                System.out.println("Reservation type :"+customerRuoter.get(i).getReservation1().getReservationtype());
                System.out.println("******************************************************");
            }
        }
         else
        {
            System.out.println("not Router Yet");
        }
        System.out.println("Total price of Customer : " + calctotalPrice()+"$");
    }
   
  abstract public float calctotalPrice();
    
}
