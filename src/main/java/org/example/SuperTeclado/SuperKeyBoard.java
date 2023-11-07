package org.example.SuperTeclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperKeyBoard {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static Integer readNumber() {
        int number = 0;
        try {
            number = Integer.parseInt(reader.readLine());
        }
        //Number                                                     //IO
        //  cuando se intenta convertir una cadena en un número, |  errores relacionados con la entrada/salida (I/O). Esto incluye problemas como la lectura o escritura
        catch (NumberFormatException | IOException e) {
            if (e instanceof NumberFormatException) {
                System.out.println("El numero que digitaste es incorrecto, intenta nuevamente:");
            } else {
                System.out.println("El valor que ingresaste no fue leido, intenta nuevamente:");
            }
            number = readNumber();
        }
        return number;

    }

    public static String readText() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("El valor que ingresaste no fue leido, intenta nuevamente");
            return readText();
        }
    }

    public static Double readDecimalNumber() {
        double number = 0;
        try {
            number = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            // validar el tipo de excepcion
            if (e instanceof NumberFormatException) {
                System.out.println("El numero que digitaste es incorrecto, intenta nuevamente:");
            } else {
                System.out.println("El valor que ingresaste no fue leido, intenta nuevamente:");
            }
            number = readDecimalNumber();
        }
        return number;
    }

}

