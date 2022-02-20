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

    float matriz[][][][];
    Scanner s = new Scanner(System.in);

    public Matriz() {
    }

    public void grupos() {
        int numGrup = 0;
        try {
            do {
                System.out.println("¿Cuántos grupos hay?");
                numGrup = s.nextInt();
            } while (!numPositivos(numGrup));
            matriz = new float[numGrup][][][];
        } catch (Exception e) {
            System.out.println("No se ah podido crear los Grupos");
        }
    }

    public void materias() {
        try {
            for (int i = 0; i < matriz.length; i++) {
                int numMat = 0;
                do {
                    System.out.println("¿Cuántas materias hay en el grupo " + i + "?");
                    numMat = s.nextInt();
                } while (!numPositivos(numMat));
                matriz[i] = new float[numMat][][];
            }
        } catch (Exception e) {
            System.out.println("No se ah podido crear las materias");
        }
    }

    public void alumnos() {
        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    int numAlum = 0;
                    do {
                        System.out.println("¿Cuántos alumnos hay en el grupo " + i + " en la materia "
                                + j + " ?");
                        numAlum = s.nextInt();
                    } while (!numPositivos(numAlum));
                    matriz[i][j] = new float[numAlum][];
                }
            }
        } catch (Exception e) {
            System.out.println("No se ah podido crear los alumnos");
        }
    }

    public void cali() {
        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    for (int k = 0; k < matriz[i][j].length; k++) {
                        matriz[i][j][k] = new float[1];
                        float calificacion = 0;
                        do {
                            System.out.println("Digite la calificacion de la materia " + k + " del alumno " + j + " del grupo " + i);
                            calificacion = s.nextFloat();
                        } while (!numPositivos(calificacion, 10.1f));
                        matriz[i][j][k][0] = calificacion;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("No se ah podido crear las calificaciones");
        }
    }

    public void mostrarMatriz() {
        try {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Grupo: " + i);
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Materia: " + j);
                    for (int k = 0; k < matriz[i][j].length; k++) {
                        System.out.println("  Alumno    Calificacion");
                        System.out.println("    " + k + "       " + matriz[i][j][k][0]);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    private boolean numPositivos(int x) {
        return x > 0;
    }

    private boolean numPositivos(float x) {
        return x > 0;
    }

    private boolean numPositivos(float x, float y) {
        return x >= 0 && x <= 10;
    }
}
