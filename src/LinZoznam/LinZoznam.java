package LinZoznam;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcel
 */
public class LinZoznam {
   private Polozka zac;
  private Polozka kon;
 private int pocet=0;
  public  LinZoznam()
  {
      
  }
  /**
   * metoda ktora vrati pocet prvkov v zozname
   * @return 
   */
  public int getPocet()
  {
  return pocet;
  }
  /**
   * metoda ktora vlozi na zac prvok 
   * @param paData 
   */
  public void vlozNaZac(Osoba paData)
  {
      Polozka pomPolozka=new Polozka(paData);
      if(zac!=null)
      {
          pomPolozka.setNas(zac);
      }
      else
      {
      kon=pomPolozka;
      }
      zac=pomPolozka;
      pocet++;
      
  }
  /**
   * metoda ktora vlozi na koniec prvok
   * @param paData 
   */
  public void vlozNaKon(Osoba paData)
  {
     Polozka pomPolozka =new Polozka(paData);
     if(zac!=null)
            {
            kon.setNas(pomPolozka);
      }
        else
        {
            zac=pomPolozka;
        }
            kon=pomPolozka;
            pocet++;
    }
  /**
   * metoda ktora odoberie prvok zo zaciatku
   * @return
   * @throws Exception 
   */
  public Object odoberZoZac() throws Exception
  {
      if(zac==null)
      {
      throw new Exception ("Prazdny zoznam!!!");
      }
      Object data=zac.getData();
      zac=zac.getNas();
      if(zac==null) {
          kon=null;
      }
      pocet--;
  return data;
  }
  
   /**
    * odobratie prvku z istej pozicie
    * @param miesto
    * @throws Exception 
    */
  
  public void removeToPosicion(int miesto) throws Exception
{
if(miesto == 1){
    odoberZoZac();
}
else{
Polozka pom = null;
Polozka p1 = this.zac;
Polozka p2 = p1.getNas();
for (int i = 1; i < miesto-1; i++)
{
p1 = p2;
p2 = p1.getNas();
}
pom = p2.getNas();
p1.setNas(pom);

this.pocet--;
}
}
 
  /**
   * vratenie pola s prvkami typu object
   * @return 
   */
 public Object[] toArray()
 {
    Object pomPole[]=new Object[pocet];
    Polozka pom=zac;
    for(int i=0;i<pocet;i++){
    pomPole[i]=pom.getData();
    pom=pom.getNas();
 
 }
 return pomPole;
 }
 /**
  * Vypis prvkov zoznamu
  * @return 
  */
   @Override
 public String toString(){
     Polozka pom=zac;
  String pomStr = " Pocet prvkov:"+pocet+"\n ----------------------------- \n";    
    for(int i=0;i<pocet;i++){
        
    pomStr+=(i+1)+" -> "+pom.getData();
    pom=pom.getNas();
    if(zac != null)
    pomStr +=" \n ";
        }
    return pomStr ;
 }
   /**
    * metoda ktora zisti ci dany prvok je v zozname
    * @param paData
    * @return 
    */
 public boolean obsahuje(Object paData)
 {
 
 Polozka pom=zac;
 while(pom!=null){
 if(pom.getData().equals(paData)) {
     
         return true;
     }
 pom=pom.getNas();
 }
 return false;
         
         }
 /**
  * metoda ktora zisti ci sa dany prvok nachadza v zozname
  * @param pMeno
  * @return
  * @throws Exception 
  */
 public boolean najdi(String pMeno) throws Exception{
 if(zac==null){
 throw new  Exception("Prazdny zoznam!!!");
 }
     Polozka pom=zac;
     while (pom!=null){
         if((pom.getData().toString().equals(pMeno))){
         JOptionPane.showMessageDialog(null,"Nasiel som!!!");
         break;
         }
         else{
         pom=pom.getNas();
         
         }
         return false;
     }
       return true;
 }
     /**
     * bubbleSort - bezparametricka a beznavratova
     *metoda sluziaca na zoradenie veku pri osobe
     */
    public void bubleSort() throws Exception {
     if(zac==null || kon==null) {
            throw new Exception("Chyba");
        }
        boolean utriedilo = true;
        Polozka temp;
        Osoba p1;
        Osoba p2;
        Object k;
        while(utriedilo==true) {
            utriedilo=false;
            temp = zac;
            p1 = (Osoba)temp.getData();
            p2 = (Osoba)temp.getNas().getData();
            for(int i=0; i<pocet-1; i++) {
                //if(p1.compareTo( p2 )>0  ) {
                if(p1.getVek()>p2.getVek()) {
                    k=temp.getData();
                    temp.setData(  temp.getNas().getData() );
                    temp.getNas().setData(k);
                    utriedilo=true;
                }
                try{
                    temp = temp.getNas();                                                
                    p1 = (Osoba)temp.getData();                    
                    p2 = (Osoba)temp.getNas().getData();                                            
                }
                catch(NullPointerException e){}
            }            
        }        
    }
                


 
        }

        


