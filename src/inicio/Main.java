package inicio;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String nombre = teclado.next();
        System.out.println("Ingresa fecha de hoy");
        int fecha = teclado.nextInt();
        System.out.println("Ingresa fecha de hoy");
        boolean clima = teclado.nextBoolean();
        System.out.println("Hola  ,"+ nombre + "  ¿Como estas?");//Sout
        System.out.println("Fecha es:"+fecha);
        System.out.println("Clima  es:"+clima);
    }
}
