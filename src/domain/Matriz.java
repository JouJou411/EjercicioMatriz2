package domain;

import java.util.Scanner;

/**
 *
 * @author Joabp
 */
public class Matriz {

    int[][][][] cali;
    String grupo[];
    String mat[][];
    String alumno[][][];
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
            cali = new int[numGrup][][][];
            grupo = new String[numGrup];
            mat = new String[numGrup][];
            alumno = new String[numGrup][][];
        } catch (Exception e) {
            System.out.println("No se ah podido crear los Grupos");
        }
    }

    public void nombreGrupo() {
        try {
            for (int i = 0; i < grupo.length; i++) {
                System.out.println("Digite el nombre del grupo: ");
                String nomGrup = s.nextLine();
                grupo[i] = nomGrup;
            }
        } catch (Exception e) {
        }
    }

    public void materias() {
        try {
            for (int i = 0; i < cali.length; i++) {
                int numMat = 0;
                do {
                    System.out.println("¿Cuántas materias hay en el grupo " + i + "?");
                    numMat = s.nextInt();
                } while (!numPositivos(numMat));
                cali[i] = new int[numMat][][];
            }
        } catch (Exception e) {
            System.out.println("No se ah podido crear las materias");
        }
    }

    public void nomMaterias() {
        try {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    String nomMat;
                    System.out.println("Digite el nombre de la materia: ");
                    nomMat = s.nextLine();
                    mat[i][j] = nomMat;
                }
            }
        } catch (Exception e) {
        }
    }

    public void alumnos() {
        try {
            for (int i = 0; i < cali.length; i++) {
                for (int j = 0; j < cali[i].length; j++) {
                    int numAlum = 0;
                    do {
                        System.out.println("¿Cuántos alumnos hay en el grupo " + i + " en la materia "
                                + j + " ?");
                        numAlum = s.nextInt();
                    } while (!numPositivos(numAlum));
                    cali[i][j] = new int[numAlum][];
                }
            }
        } catch (Exception e) {
            System.out.println("No se ah podido crear los alumnos");
        }
    }

    public void cali() {
        try {
            for (int i = 0; i < cali.length; i++) {
                for (int j = 0; j < cali[i].length; j++) {
                    for (int k = 0; k < cali[i][j].length; k++) {
                        cali[i][j][k] = new int[1];
                        int calificacion = 0;
                        do {
                            System.out.println("Digite la calificacion de la materia " + k + " del alumno " + j + " del grupo " + i);
                            calificacion = s.nextInt();
                        } while (!numPositivos(calificacion, 100));
                        cali[i][j][k][0] = calificacion;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("No se ah podido crear las calificaciones");
        }
    }

    public void mostrarMatriz() {
        try {
            for (int i = 0; i < cali.length; i++) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Grupo: " + cali[i]);
                for (int j = 0; j < cali[i].length; j++) {
                    System.out.println("Materia: " + cali[i][j]);
                    for (int k = 0; k < cali[i][j].length; k++) {
                        System.out.println("  Alumno    Calificacion");
                        System.out.println("    " + cali[i][j][k] + "       " + cali[i][j][k][0]);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    private boolean numPositivos(int x) {
        return x > 0;
    }

    private boolean numPositivos(int x, int y) {
        return x >= 0 && x <= 10;
    }
}
