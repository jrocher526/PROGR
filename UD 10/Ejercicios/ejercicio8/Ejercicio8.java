package UD10.ejercicio8;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ejercicio8 {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/bancos";
        String usuario = "root";
        String password = "";

        try {

            Connection conexion = DriverManager.getConnection(url, usuario, password);

            System.out.println("Conexion exitosa");

            conexion.close();

        } catch (Exception e) {

            System.out.println("No se pudo conectar");

        }



    }
}
