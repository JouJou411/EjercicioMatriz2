package domain;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joabp
 */
public class Matriz {

    Object matriz[][][][];

    public Matriz() {
    }

    public void grupos() {
        Scanner s = new Scanner(System.in);
        boolean bandera = false;
        int numGrup;
        try {
            do {
                System.out.println("¿Cuántos grupos hay?");
                numGrup = s.nextInt();
                if(numGrup > 0){
                    bandera = true;
                }
            } while (bandera);
            matriz = new Object[numGrup][][][];
        } catch (Exception e) {
            System.out.println("No se ah podido crear la matriz");
        }
    }

    public void materias() {

    }

}
