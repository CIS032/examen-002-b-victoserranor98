/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author VICTOR SERRANO
 */
public class Banco {
    static ArrayList<Cuenta> listaCuenta = new ArrayList<Cuenta>();
    static String archivo = "asd.csv";

    public static void agregar(Cuenta cuenta) {
        listaCuenta.add(cuenta);
    }
    
//    public  void grabar() throws IOException {
//        String x = JOptionPane.showInputDialog(null,"","C:\\Users\\");
//        FileWriter fw = new FileWriter(new File(x+".csv"));
//        try {
//         for (Cuenta cuenta : listaCuenta) {
//            fw.write(cuenta.getCliente()+";"+cuenta.getTipoCliente()+";"+cuenta.getBalance()+";"+cuenta.getTasaInteres());
//        }
//            fw.close();
//        } catch (IOException e) {
//        }
//    }
//    public void leer(){
//        String cadena;
//        FileReader f = new FileReader(new File(""));
//        BufferedReader b = new BufferedReader(f);
//        while((cadena = b.readLine())!=null) {
//            System.out.println(cadena);
//        }
//        b.close();
//    }
//    public Cuenta depositar(String n){
//        for (Cuenta cuenta : listaCuenta) {
//            if (n.equalsIgnoreCase(cuenta.getCliente())) {
//                int d = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad a depositar"));
//                cuenta.setBalance(cuenta.getBalance()+d);
//                return cuenta;
//            }
//        }
//        return null;
//    }
//    public Cuenta retirar(String n){
//        for (Cuenta cuenta : listaCuenta) {
//            if (n.equalsIgnoreCase(cuenta.getCliente())) {
//                int d = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad a retirar"));
//                cuenta.setBalance(cuenta.getBalance()-d);
//                return cuenta;
//            }
//        }
//        return null;
//    }
    public static Cuenta buscarCuentaAhorro() {
        String nombre = (JOptionPane.showInputDialog(null, "Ingrese nombre", "Verificar Cuenta", JOptionPane.INFORMATION_MESSAGE));
        CuentaAhorro cuentaAH = new CuentaAhorro(nombre);
        Cuenta c=(Cuenta)cuentaAH;
        if (listaCuenta.contains(c)) {
            return listaCuenta.get(listaCuenta.indexOf(c));
        }
        return null;
    }
    public  Cuenta buscarCuentaHipoteca() {
        String nombre = (JOptionPane.showInputDialog(null, "Ingrese nombre", "Verificar Cuenta", JOptionPane.INFORMATION_MESSAGE));
        CuentaHipoteca cuentaAH = new CuentaHipoteca(nombre);
        Cuenta c=(Cuenta)cuentaAH;
        if (listaCuenta.contains(c)) {
            return listaCuenta.get(listaCuenta.indexOf(c));
        }
        return null;
    }
    public  void presentar(){
        String linea = "";
        for (Cuenta cuenta : listaCuenta) {
            linea = linea +cuenta.toString()+"\n";
        }
        JOptionPane.showMessageDialog(null, linea);
    }

   
}
