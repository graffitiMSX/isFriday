/** 
 * @author Locaweb
 */ 
public class Carneirinho{
  
  public static void contar(){
    int i = 1;
    String a = " carneirinho",
      b = " pulando a cerca.",
      c = "s";
    
    for(i=1; i<=100; i++){
      if(i==1){
        System.out.println( i + a + b );
      } else {
        System.out.println( i + a + c + b );
      }
    } 
  }
}//Carneirinho
