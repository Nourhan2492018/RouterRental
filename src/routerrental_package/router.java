/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;


public class router implements displayInf{
   final private  String serial_number;
   private String model;
   private char valid;
   private int number_of_ports;
   private reservation reservation1;
   private float priceRouter;
   public router(String serial_number) {
        this.serial_number = serial_number;
        this.reservation1 = null;
    }

    public router(String serial_number, String model, int number_of_ports, float price) {
        this.serial_number = serial_number;
        this.model = model;
        this.number_of_ports = number_of_ports;
        this.priceRouter=price;
        this.reservation1 = null;
        valid='n';
    }

    public router(String serial_number, String model, char valid, int number_of_ports, reservation reservation1, float priceRouter) {
        this.serial_number = serial_number;
        this.model = model;
        this.valid = valid;
        this.number_of_ports = number_of_ports;
        this.reservation1 = reservation1;
        this.priceRouter = priceRouter;
    }

    router(String string, String one, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial_number() {
        return serial_number;
    }
    
    public int getNumber_of_ports() {
        return number_of_ports;
    }

    public void setNumber_of_ports(int number_of_ports) {
        this.number_of_ports = number_of_ports;
    }

    public reservation getReservation1() {
        return reservation1;
    }

    public void setReservation1(reservation reservation1) {
        this.reservation1 = reservation1;
    }

    public float getPriceRouter() {
        return priceRouter;
    }

    public void setPriceRouter(float priceRouter) {
        this.priceRouter = priceRouter;
    }

    public char getValid() {
        return valid;
    }

    public void setValid(char valid) {
        this.valid = valid;
    }

    @Override
    public void display() {
        System.out.println("The Serial Number : "+this.serial_number);
        System.out.println("The Model : "+this.model);
        System.out.println("The price : "+this.priceRouter);
        System.out.println("The number of ports :"+this.number_of_ports);
        if(this.valid=='y')
        { 
        System.out.println("The validation : "+this.valid);
        System.out.println("Reservation....");
        System.out.println("***************");
        System.out.println("Reservation type : "+this.reservation1.getReservationtype());
        System.out.println("Reservation date : "+this.reservation1.getReservationdate());
        System.out.println("Reservation type : "+this.reservation1.getReservationtype());
        System.out.println("Number : "+this.reservation1.getNumber());
        System.out.println("Start_date : "+this.reservation1.getStart_date().getDate()+"/"
                        +this.reservation1.getStart_date().getMonth()+"/"+this.reservation1.getStart_date().getYear());
                System.out.println("End_date :"+this.reservation1.getEnd_date().getDate()+"/"
                        +this.reservation1.getEnd_date().getMonth()+"/"+
                      this.reservation1.getEnd_date().getYear());
        }
        else if(this.valid=='n')
        {
        System.out.println("The validation : "+this.valid);
        System.out.println("Not Reservation Yet ,, You Can Rent This Router !!!!!!!");
        }
    }
    
   
}
