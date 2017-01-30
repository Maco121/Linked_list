/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinZoznam;

/**
 *
 * @author Marcel
 */
public class Polozka {
    private Object  data;
   private Polozka nas;
   public Polozka(Object paData){
   data=paData;
   }

    /**
     * vrati object typu data
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * nastavy Object data
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * vrati nsledovnika
     * @return the nas
     */
    public Polozka getNas() {
        return nas;
    }

    /**
     * nastavi dalsi prvok
     * @param nas the nas to set
     */
    public void setNas(Polozka nas) {
        this.nas = nas;
    }
   
    
}
