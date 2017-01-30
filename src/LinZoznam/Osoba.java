package LinZoznam;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcel
 */
public class Osoba {
 private String meno;
 private int vek;
 /**
  * konstruktor
  * @param paMeno
  * @param paVek 
  */
 public Osoba(String paMeno,int paVek)
 {
 meno=paMeno;
vek=paVek;
 }
 public Osoba(int cislo){
 vek=cislo;
 }

    /**
     * metoda ktora varti meno
     * @return the meno
     */
    public String getMeno() {
        return meno;
    }

    /**
     * metoda ktora nastavi meno
     * @param meno the meno to set
     */
    public void setMeno(String meno) {
        this.meno = meno;
    }

    /**
     * metoda ktora vrati vek
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * metoda ktora nastavi vek
     *
     * @param vek the vek to set
     */
    public void setVek(int vek) {
        this.vek = vek;
    }
    /**
     * vypis prvkov
     * @return 
     */
    public String toString(){
    return meno+" "+vek;
    }
 
         }
