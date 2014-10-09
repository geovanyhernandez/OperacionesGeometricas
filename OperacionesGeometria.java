import java.util.Scanner;
import com.zubiri.geometria.*;  
//import com.zubiri.geometria.Circulo; 
//import com.zubiri.geometria.Rectangulo;

//CLASSPATH=:/home/zubiri/ProyectosJava; export CLASSPATH //clase en el bashrc//

public class OperacionesGeometria{

public static void main (String args []) {

String  elegir;

	   Scanner sc = new Scanner (System.in);
	   System.out.println("\nelige figura geometrica: circulo/rectangulo");
           elegir  = sc.next();
       

 if (elegir.equalsIgnoreCase("circulo") ==  true) 
{
float radio, resultadoarea, resultadocircunferencia;
 
            Circulo operaciones = new Circulo();          
            System.out.print("\ningresa el radio: ");
            radio = sc.nextFloat();
		
	    operaciones.setArea(radio);
	    operaciones.setCircunferencia(radio);	

            resultadoarea = operaciones.getArea();
            System.out.println("\nel radio del circulo es: " + resultadoarea);
            
            resultadocircunferencia = operaciones.getCircunferencia();
            System.out.println("\nel resultado de la circunferencia es " + resultadocircunferencia);	
      	
}
 else if (elegir.equalsIgnoreCase("rectangulo") ==  true) 
{

            double base;
            double altura; 
            Rectangulo operaciones = new Rectangulo();

            System.out.print("\ningresa la altura del rectangulo: ");
            altura = sc.nextDouble();


            System.out.print("\ningresa la base del rectangulo: ");
            base = sc.nextDouble();


            operaciones.setBase(base);
            operaciones.setAltura(altura);

	    System.out.println("\nla area es : " + operaciones.superficie());
	    System.out.println("\nel perimetro es : " + operaciones.perimetro()); 
            
  }
}
}
