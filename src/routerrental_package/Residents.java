/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;


public class Residents extends customer{

    public Residents() {
    }

    public Residents(router customerRuoter) {
       super();
    }
    
    @Override
    public float calctotalPrice() {
        
        int i=0 ;
        float  sum=0f ;
        while (this.getCustomerRuoter().size()>i) { 
            
            sum=this.getCustomerRuoter().get(i).getPriceRouter();
            i++;
        }
        // static final discount
        //(sum-(sum*customer.discount)) 
       return sum-sum*customer.discount;
        
    }


    
}
