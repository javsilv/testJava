/*
Hecho por Javier Alejandro Lopez Silva
Fecha 09/03/2023
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        PerfilArea empleado1 = new PerfilArea("jorge","jorge@sistemas.mx","sistema");
        PerfilArea empleado2 = new PerfilArea("santos","sntos@reboot.mx","admin");
        PerfilArea empleado3 = new PerfilArea("oscar","oscar!@o.utok.com","operador");
        PerfilArea empleado4 = new PerfilArea("francisco","fran@sistemas.mx","sistema");


        System.out.println("Ingrese un usuario:");
        String usuario=teclado.nextLine();

        if(usuario.equals("jorge")){
            empleado1.imprimir();
            empleado1.validarAdmin(empleado1.getPerfilUsuario());
            empleado1.validarCorreo(empleado1.getcorreoElectronico());
        }
        if(usuario.equals("santos")){
            empleado2.imprimir();
            empleado2.validarAdmin(empleado2.getPerfilUsuario());
            empleado2.validarCorreo(empleado2.getcorreoElectronico());
        }
        if(usuario.equals("oscar")){
            empleado3.imprimir();
            empleado3.validarAdmin(empleado3.getPerfilUsuario());
            empleado3.validarCorreo(empleado3.getcorreoElectronico());
        }
        if(usuario.equals("francisco")){
            empleado4.imprimir();
            empleado4.validarAdmin(empleado4.getPerfilUsuario());
            empleado4.validarCorreo(empleado4.getcorreoElectronico());
        }

    }
}