/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author jayden_jj22yahoo.com
 */
public class Can extends Product{
    
    private String expiration_date;

    @Override
    public void category_name() {
        System.out.println("Can/Jar");    
    }

    /**
     * @return the expiration_date
     */
    public String getExpiration_date() {
        return expiration_date;
    }

    /**
     * @param expiration_date the expiration_date to set
     */
    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }
    
   
}
