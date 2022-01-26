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
public class Beverages extends Product{
    
    private double volume;
    private String container_type;

    @Override
    public void category_name() {
        System.out.println("Beverages");
    }

    /**
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * @return the container_type
     */
    public String getContainer_type() {
        return container_type;
    }

    /**
     * @param container_type the container_type to set
     */
    public void setContainer_type(String container_type) {
        this.container_type = container_type;
    }
    
}
