
public class ContoCorrente {

 double saldo, montepremi;

 public ContoCorrente() {
  super();
  this.saldo = 1000.00;
  this.montepremi = 100000.00;
 }
 
 double getSaldo() {
  return saldo;
 }
 
 void stampaSaldo() {
  System.out.println("Il tuo saldo attuale: "+saldo+" €");
 }
 
 double getMontepremi() {
  return montepremi;
 }
 
 void stampaMontepremi() {
  System.out.println("Il montepremi del casinò attuale: "+montepremi+" €");
 }
 
 void Dado (int n, double puntata) {
  if(n>=0&&n<=6) {
   if(puntata<=saldo) {
    if(puntata*5<montepremi) {
     int es=0;
     while(es>6||es<1) {
      es=(int)(Math.random()*10);
     }
     
     System.out.println("L'esito del dado è "+es);
     if(n==es) {
      saldo=saldo+(puntata*5);
      montepremi=montepremi-(puntata*5);
      System.out.println("Complimenti, hai vinto "+puntata*5+" €");
      System.out.println("Il tuo saldo attuale: "+saldo+" €");
     }else {
      saldo=saldo-puntata;
      montepremi=montepremi+puntata;
      System.out.println("Peccato, hai perso "+puntata+" €");
      System.out.println("Il tuo saldo attuale: "+saldo+" €");
     }
    }else {
     System.out.println("IMPOSSIBILE: il montepremi del casinò non è sufficiente!");
    }
   }else {
    System.out.println("IMPOSSIBILE: il tuo saldo non è sufficiente!");
   }
  }else {
   System.out.println("IMPOSSIBILE: il numero giocato non è presente sul dado");
  }
 }
}