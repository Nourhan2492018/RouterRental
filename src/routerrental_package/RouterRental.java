/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class RouterRental implements displayInf{
       static ArrayList<router> routers_customer=new ArrayList<>();
       static ArrayList<reservation> reserve_router = new ArrayList<>();
       static ArrayList<router>list_routers = new ArrayList<>();
       static ArrayList<customer> Customers_List= new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner input = new Scanner(System.in);
        /// Start Dayes And End Dayes Of Routers Reservation
        Date ds1= new Date(2020, 8, 2);
        Date ds2= new Date(2020, 8, 11);
        Date ds3= new Date(2020, 8, 15);
        Date ds4= new Date(2020, 9, 15);
        Date ds5= new Date(2020, 9, 25);
        Date ds6= new Date(2020, 10, 1);
        
        Date dE1= new Date(2020, 9, 1);
        Date dE2= new Date(2020, 9, 11);
        Date dE3= new Date(2020, 9, 15);
        Date dE4= new Date(2020, 10, 15);
        Date dE5= new Date(2020, 10, 25);
        Date dE6= new Date(2020, 11, 1);
        reservation res1= new reservation(1, ds1, dE1, new Date(), "weeks");
        reservation res2= new reservation(1, ds2, dE2, new Date(), "month");
        reservation res3= new reservation(1, ds3, dE3, new Date(), "month");
        reservation res4= new reservation(1, ds4, dE4, new Date(), "weeks");
        reservation res5= new reservation(1, ds5, dE5, new Date(), "month");
        reservation res6= new reservation(1, ds6, dE6, new Date(), "weeks");
        // Rounters In System
        router router1 = new router("1111","Etsalate", 'y', 4,res1,100.30f);
        router router2= new  router("2222","Orange", 'y', 4,res2,80.10f);
        router router3 = new router("3333","Vodafon", 'y', 9,res3,300.8f);  
        router router4 = new router ("4444","We", 'y', 3,res4,120.30f);
        router router5 = new router("5555","TeData", 'y', 5,res5,220.30f);
        router router6= new router ("6666","Etsalate", 'y', 4,res6,500.30f);
        router router7= new router ("7777","TeData", 'n', 6,null,500.30f);
        router router8= new router ("8888","Orange", 'n', 4,null,700.30f);
        router router9 = new router("9999","Vodafon", 'n', 9,null,300.8f);  
        router router10 = new router ("1010","We", 'n', 3,null,120.30f);
        
        
      
      
      
       Foreigners f=new Foreigners();
       f.setR(router1);
       f.setR(router2);
       f.setR(router3);
       invoice invoiceForgien= new invoice(f.getCustomerRuoter(),f.calctotalPrice());
       
       Residents r=new Residents();
       r.setR(router4);
       r.setR(router5);
       r.setR(router6);
       invoice invoiceResidents= new invoice(r.getCustomerRuoter(),r.calctotalPrice());

       routers_customer.add(router6);
       routers_customer.add(router5);
       routers_customer.add(router4);
       routers_customer.add(router3);
       routers_customer.add(router2);
       routers_customer.add(router1);
       
        list_routers.add(router1);
        list_routers.add(router2);
        list_routers.add(router3);
        list_routers.add(router4);
        list_routers.add(router5);
        list_routers.add(router6);
        list_routers.add(router7);
        list_routers.add(router8);
        list_routers.add(router9);     
        list_routers.add(router10);
        
        
        String s;
        System.out.println("");
        System.out.println();
        System.out.println("                                       Hello I n Routers Application :)");
        System.out.println("                                 ###########################################");
        System.out.println("");
        System.out.println();
        System.out.println("Now Information Of All The Routers in Application.......");
        System.out.println("------------------------------------------------------------------");
        System.out.println("");
          for (int i = 0; i < list_routers.size(); i++) {
            System.out.println("Router"+(i+1)+"......");
            System.out.println("====================");
            list_routers.get(i).display();
            System.out.println("********************************************************");
        }
        System.out.print("If Foreigners Enter f if Residents Enter r  :");
        char c =input.next().charAt(0);
        System.out.println("---------------------------------------------------");
        if (c=='f'||c=='F') {
        System.out.println();
        System.out.println("Now Information Of All The Routers Frogin");
        System.out.println("------------------------------------------");
        f.display();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter (1) for Rent Router ");
         System.out.println("Enter (2) for cansel Router "); 
         System.out.println("Enter (3) for Rent Extand Router ");
          System.out.println("Enter (4) for Rent Change Model Router ");
            System.out.println("Enter (5) To Display Total Price");
         char w= input.next().charAt(0);
         switch(w)
         {
             case'1':
                 System.out.print("Enter Serise number of Router wont Rant :");
                 list_routers=f.Renrouter(list_routers);
                 System.out.println("");
                 System.out.println("Now Information Of All The Routers in Application After Rent ....");
                 System.out.println("*******************************************************************");
                  for (int i = 0; i < list_routers.size(); i++) {
                    System.out.println("Router"+(i+1)+"......");
                    System.out.println("====================");
                    list_routers.get(i).display();
                    System.out.println("********************************************************");  
                }
                   System.out.println("Now Information Of All The Routers Frogin After Rent ");
                   System.out.println("------------------------------------------");
                   f.display();
                   System.out.println("------------------------------------------------------------------");
                 break;
             case'2':
                 System.out.println("Enter Serise number of Router wont Cancel : " );
                 System.out.println("-----------------------------------------");
                 f.Cancelrouter();
                 System.out.println("");
                 System.out.println("Now Information Of All The Routers Frogin After Cancel");
                 System.out.println("------------------------------------------------------");
                 f.display();
                 System.out.println("------------------------------------------------------------------");
                 break;
            case'3':
                 System.out.print("Enter Serise number of Router wont Extand Duration: " );
                 System.out.println("-----------------------------------------");
                 f.ExtandDuration();
                 System.out.println("");
                 System.out.println("Now Information Of All The Routers Frogin After Cancel");
                 System.out.println("------------------------------------------------------");
                 invoiceForgien.display();
                 System.out.println("------------------------------------------------------------------");
                 break;
            case'4':
                 System.out.println("Enter Model  of Router wont change : ");
                 System.out.println("---------------------------------");
                 f.ChangModel();
                 System.out.println("");
                 System.out.println("Now Information Of All The Routers Frogin After Change model");
                 System.out.println("-------------------------------------------------------------");
                   f.display();
                 System.out.println("------------------------------------------------------------------");
                     break;
             case'5':
                 System.out.println("-------------------------------------------------------------");
                   System.out.println("Tatal Price "+f.calctotalPrice()+"$");
                 System.out.println("------------------------------------------------------------------");
                 break;
            default:
                System.out.println("Not Operation of Choise"+c);
                    break;
                    
         }
          System.out.println("  ");
          System.out.println("please Frogin Enter any assiue or Report of Router Application");
          System.out.println("================================== ===========================");
          f.setReport(input.next());
          System.out.println("================================== ===========================");
        } 
        else if(c=='r'||c=='R')
        {
        
        System.out.println();
        System.out.println("Now Information Of All The Routers Resident");
        System.out.println("------------------------------------------");
         r.display();
        System.out.println("------------------------------------------------------------------");
      
        System.out.println("Enter (1) for Rent Router ");
        System.out.println("Enter (2) for cansel Router "); 
        System.out.println("Enter (3) for Rent Extand Router ");
        System.out.println("Enter (4) for Rent Change Model Router ");
        System.out.println("Enter (5) To Display Total Price");
         char w= input.next().charAt(0);
          switch(w)
         {
             case'1':
                 System.out.print("Enter Serise number of Router wont Rant :");
                 list_routers=r.Renrouter(list_routers);
                 System.out.println("");
                 System.out.println("Now Information Of All The Routers in Application After Rent ....");
                 System.out.println("*******************************************************************");
                  for (int i = 0; i < list_routers.size(); i++) {
                    System.out.println("Router"+(i+1)+"......");
                    System.out.println("====================");
                    list_routers.get(i).display();
                    System.out.println("********************************************************");  
                }
                   System.out.println("Now Information Of All The Routers Frogin");
                   System.out.println("------------------------------------------");
                   r.display();
                   System.out.println("------------------------------------------------------------------");
                 break;
             case'2':
                 System.out.println("Enter Serise number of Router wont Cancel : " );
                 System.out.println("-----------------------------------------");
                 r.Cancelrouter();
                 System.out.println("");
                 System.out.println("Now Information Of All The Routers Resident After Cancel");
                 System.out.println("------------------------------------------------------");
                 r.display();
                 System.out.println("------------------------------------------------------------------");
                 break;                 
            case'3':
                 System.out.print("Enter Serise number  of Router wont Extand Duration : " );
                 System.out.println("-----------------------------------------");
                 f.ExtandDuration();
                 System.out.println("");
                 System.out.println("Now Information Of All The Routers Frogin After Cancel");
                 System.out.println("------------------------------------------------------");
                 f.display();
                 System.out.println("------------------------------------------------------------------");
                 break;
            case'4':
                 System.out.print("Enter Model  of Router wont change : ");
                 System.out.println("Enter Model  of Router wont change : ");
                 System.out.println("---------------------------------");
                 f.ChangModel();
                 System.out.println("");
                 System.out.println("Now Information Of All The Routers Resident After Change moder");
                 System.out.println("-------------------------------------------------------------");
                 f.display();
                 System.out.println("------------------------------------------------------------------");
                     break;
            case'5':
                 System.out.println("-----------------------------------------------------------------------");
                 System.out.println("you have Discount 25% And Tatal Price After Discount equal "+r.calctotalPrice()+"$");
                 System.out.println("------------------------------------------------------------------------");
                 break;
            default:
                System.out.println("Not Operation of Choise "+c);
                    break;
                    
         }
          System.out.println("  ");
          System.out.println("please Resident Enter any assiue or Report of Router Application");
          System.out.println("================================== ===========================");
          r.setReport(input.next());
          System.out.println("================================== ===========================");

        }
        else 
        {
                System.out.println("NOT Option Input"+c);
        }
       
       
        System.out.println("");
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("................... Thanks You .................");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        
    }

    @Override
    public void display() {
        for (int i = 0; i < list_routers.size(); i++) {
            System.out.println("Router"+(1+1)+"......");
            System.out.println("====================");
            list_routers.get(i).display();
            System.out.println("********************************************************");
        }
    }
    
}
