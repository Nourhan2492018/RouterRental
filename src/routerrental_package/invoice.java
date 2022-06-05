/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;

import java.util.ArrayList;


public class invoice implements displayInf{
    private ArrayList<router> routersList;
    private float totalPrice;

    public invoice() {
    }
    public invoice(ArrayList<router> routersList) {
        this.routersList = routersList;
      
    }
    public invoice(ArrayList<router> routersList, float totalPrice) {
        this.routersList = routersList;
        this.totalPrice = totalPrice;
    }

    public ArrayList<router> getRoutersList() {
        return routersList;
    }

    public void setRoutersList(ArrayList<router> routersList) {
        this.routersList = routersList;
    }
    
    @Override
    public void display() {
        
        if(!routersList.isEmpty())
        {
            System.out.println("routers of customer");
            System.out.println("**********************");
            for (int i = 0; i < routersList.size(); i++) {
                
                System.out.println("Router"+(i+1));
                System.out.println("===================");
                System.out.println("Serial_numbe :"+routersList.get(i).getSerial_number());
                System.out.println("Model :"+routersList.get(i).getModel());
                System.out.println("Number_of_ports : "+routersList.get(i).getNumber_of_ports());
                System.out.println("PriceRouter :"+routersList.get(i).getPriceRouter());
                System.out.println("Reservation date : "+routersList.get(i).getReservation1().getReservationdate());
                System.out.println("Reservation Number : "+routersList.get(i).getReservation1().getNumber());
                System.out.println("Start_date : "+routersList.get(i).getReservation1().getStart_date().getDate()+"/"
                        +routersList.get(i).getReservation1().getStart_date().getMonth()+"/"+routersList.get(i).getReservation1().getStart_date().getYear());
                System.out.println("End_date :"+routersList.get(i).getReservation1().getEnd_date().getDate()+"/"
                        +routersList.get(i).getReservation1().getEnd_date().getMonth()+"/"+
                        routersList.get(i).getReservation1().getEnd_date().getYear());
                System.out.println("Reservation type : "+routersList.get(i).getReservation1().getReservationtype());
                System.out.println("******************************************************");
            }
        }
         else
        {
            System.out.println("not Router Yet");
        }
        System.out.println("Total price of Customer : " + totalPrice+"$");
        
    }
    
}
