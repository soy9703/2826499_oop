package co.sena.edu.oop;
import java.util.Scanner;
public class App {
 public static void main(String[] args){
     Scanner src = new Scanner(System.in);
     double numero1 = 0;
     double numero2 = 0;
     double numero3 = 0;
     int menu;

     Data data =new Data();


     System.out.println("Miselanea de Ejjercicios OOP Java");
     System.out.println("----------------------------------");
     System.out.println("Menu Principal");
     System.out.println("1.Operadores");
     System.out.println("2.Condicionales");
     System.out.println("3.Ciclos");
     System.out.println("4.Arreglos");
     System.out.println("99. Salir");
     System.out.println("Digite su opcion");
     menu = src.nextInt();
     System.out.println(


     // Sub menu Operadores
     System.out.println("Categoria Operadores");
     System.out.println("1.Calcular área triángulo");
     System.out.println("2.Sumar dos números");


     System.out.println("--------------------");
     System.out.println("Calcular el área de un triángulo");
     System.out.println("Ingrese la base");
     numero1 = src.nextDouble();
     System.out.println("Ingrese la altura");
     numero2 = src.nextDouble();
     System.out.println("El área del triángulo es:" + data.areaTriangulo(numero1, numero2));

     // Sub menu Suma
     System.out.println("--------------------");
     System.out.println("Sumar dos números");
     System.out.println("1.Ingrese el primer número");
     System.out.println("2.Ingrese el segundo numero");


     numero1 = src.nextDouble();
     System.out.println("");





 }



}
