/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;

import java.util.Date;


public class reservation {
    private int number;
    private Date start_date,end_date ,reservationdate;
    private String reservationtype;

    public reservation(int number, Date start_date, Date end_date, Date reservationdate, String reservationtype) {
        this.number = number;
        this.start_date = start_date;
        this.end_date = end_date;
        this.reservationdate = reservationdate;
        this.reservationtype = reservationtype;
    }

    public reservation() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Date getReservationdate() {
        return reservationdate;
    }

    public void setReservationdate(Date reservationdate) {
        this.reservationdate = reservationdate;
    }

    public String getReservationtype() {
        return reservationtype;
    }

    public void setReservationtype(String reservationtype) {
        this.reservationtype = reservationtype;
    }
    
}
