package es.Studium.Operaciones2;

import java.util.Scanner;

public class Operaciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el primer número");
		a = teclado.nextInt();
		System.out.println("Introduzca el segundo número");
		b = teclado.nextInt();
		teclado.close();
		System.out.println( "La suma es " + FuncSuma(a,b));
		System.out.println( "La resta es " + FuncResta(a,b));
		System.out.println( "La multiplicacion es " + FuncMult(a,b));
	    if (b!=0)
	    {
	    	System.out.println("El cociente vale " + FuncDiv(a,b));
	    }
	    else
	    {
	    System.out.println( "El denominador no puede ser 0");
	    }
	}
	public static int FuncSuma(int a, int b)
	{
		return a+b;
	}
	public static int FuncResta(int a, int b)
	{
		return a-b;
	}
	public static int FuncMult(int a, int b)
	{
		return a*b;
	}
	public static double FuncDiv(int a, int b)
	{
		return (((double)(a))/((double)(b)));
	}
}
