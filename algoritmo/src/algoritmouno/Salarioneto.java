package algoritmouno;

import java.util.Scanner;

public class Salarioneto {
     final static double Insspatronal = 0.225; 
     
     static Scanner lector = new Scanner(System.in);
     static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		//Declaracion de variables
		double MontoInss, MontoIr,MontoAfiliacion,salario;
		double IngresoNeto,IngresoTotal,Deducciones,IngresosAntiguedad;
		double DeduccInss,DeduccIr,DeducEmpresa;
		
		System.out.println("Ingrese su salario : C$");
		salario=entrada.nextInt();
		
		//Datos de entrada
		MontoInss= 0.07;
		MontoIr = 0.156;
		MontoAfiliacion = 0.01 * salario;
		IngresosAntiguedad = 0.015 * salario; 
		IngresoTotal = salario + IngresosAntiguedad;
		DeduccInss = IngresoTotal * MontoInss;
		DeduccIr = IngresoTotal * MontoIr;
		Deducciones = DeduccIr + DeduccInss + MontoAfiliacion;
		IngresoNeto = IngresoTotal - Deducciones;
		DeducEmpresa= Insspatronal * IngresoTotal;
		System.out.println("Deduccion Inss  :"  + String.format("%.2f"), DeduccInss);
		System.out.println("Deduccion Ir  :"  + String.format("%.2f"), DeduccIr);
		System.out.println(" SS:"   );
		System.out.println(" :"   );
	}

}
