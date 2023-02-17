
import java.util.Scanner;
public class Main {

 public static void main(String []args) {
  Scanner sint= new Scanner(System.in);
  Scanner sdouble= new Scanner(System.in);
  Scanner str= new Scanner(System.in);
  String r="si";
  ContoCorrente c= new ContoCorrente ();
while(0==0) {
  if(r.toLowerCase().equals("si")) {
   
   if(c.getSaldo()>0) {
    System.out.println("Inserisci il numero del dado su cui vuoi scommettere:");
    int n=sint.nextInt();
    System.out.println("Inserisci la tua puntata:");
    double p=sdouble.nextDouble();
    c.Dado(n, p);
    System.out.println("Vuoi rigiocare? inserisci si o no)");
    r=str.nextLine();
   }else {
    System.out.println("Il tuo saldo è pari a 0");
    break;
   }
 }else {
  System.out.println("Te ne vai con "+c.getSaldo()+"€ \nTORNA PRESTO!");
  break;
 }
}}
}