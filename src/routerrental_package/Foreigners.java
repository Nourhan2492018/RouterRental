/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;


public class Foreigners extends customer{

    public Foreigners() {
    }

    public Foreigners(router customerRuoter) {
        super();
    }

    
    @Override
    public float calctotalPrice() {
        int i=0 ;
        float sum=0.0f ;
     
        while (i<super.getCustomerRuoter().size()); { 
            
            sum=super.getCustomerRuoter().get(i).getPriceRouter();
            i++;
        }
      return sum;
 }

    
}
