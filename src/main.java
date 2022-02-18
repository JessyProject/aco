


import Afficheur.Afficheur;
import Capteur.Canal;
import Capteur.Capteur;
import Capteur.CapteurImpl;
import Strategies.*;
import Types.IntegerGType;

public class main {

	public static void main(String[] args) {
        Capteur capteur = new CapteurImpl(Type_Strategy.EPOQUE);
        Afficheur aff1 = new Afficheur("1");
        Afficheur aff2 = new Afficheur("2");
        
        Canal canal1 = new Canal("1", capteur, aff1);
        Canal canal2 = new Canal("2", capteur, aff2);
        
        capteur.attach(canal1);
        capteur.attach(canal2);
        
        
        
        Thread tTick = new Thread(() -> {
            capteur.tick();
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            capteur.tick();
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            capteur.tick();
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            capteur.tick();
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            capteur.tick();
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            capteur.tick();
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          });

          tTick.start();
          try {
			tTick.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

          //System.out.println("Capteur : " + capteur.getListValues());
          System.out.println("Afficheur 1 : " + aff1.getValues());
          System.out.println("Afficheur 2 : " + aff2.getValues());

        

        
        
        
        System.out.println("Done");	
	
	}

	
	
}
