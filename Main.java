
import java.util.Random;
import java.lang.Math;

class Main {
  public static void main(String[] args) {

Random r = new Random();
		double a = r.nextInt(100);
    double b = r.nextInt(100);
    double c = r.nextInt(100);
    double d = r.nextInt(100);
    double e = r.nextInt(100);
System.out.println("Pierwsza"+a);

     double pierwsza = Math.pow(a, 2);
     double druga = Math.pow(b, 2);
     double trzecia = Math.pow(c, 2);
     double czwarta = Math.pow(d, 2);
     double piata = Math.pow(e, 2); 
    
  double suma = pierwsza+druga+trzecia+czwarta+piata;
  System.out.println("Wynik"+"="+suma);

    
double tablica [] = {a,b,c,d,e};
double value =0;
    
for(int i=0; i<5;i++){
 
  value = value + Math.pow(tablica[i],2); 
  
}
     System.out.println("Value"+"="+value);
     
  }
}