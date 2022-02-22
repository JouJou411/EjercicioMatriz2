package domain;

import java.util.Scanner;

/**
 *
 * @author Joabp
 */
public class Matriz {

    String grupo[];
    String mat[][];
    String alumno[][][];
    int cali[][][][];

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
                String nomGrup;
                System.out.println("Digite el nombre del grupo " + String.valueOf(i + 1) + "° : ");
                nomGrup = s.next();
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
                    System.out.println("¿Cuántas materias hay en el grupo " + grupo[i] + "?");
                    numMat = s.nextInt();
                } while (!numPositivos(numMat));
                mat[i] = new String[numMat];
                alumno[i] = new String[numMat][];
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
                    System.out.println("Digite el nombre de la materia " + String.valueOf(j + 1) + "° del grupo " + grupo[i]);
                    nomMat = s.next();
                    mat[i][j] = nomMat;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void alumnos() {
        try {
            for (int i = 0; i < cali.length; i++) {
                for (int j = 0; j < cali[i].length; j++) {
                    int numAlum = 0;
                    do {
                        System.out.println("¿Cuántos alumnos hay en el grupo " + grupo[i] + " en la materia "
                                + mat[i][j] + " ?");
                        numAlum = s.nextInt();
                    } while (!numPositivos(numAlum));
                    alumno[i][j] = new String[numAlum];
                    cali[i][j] = new int[numAlum][];
                }
            }
        } catch (Exception e) {
            System.out.println("No se ah podido crear los alumnos");
        }
    }
    
    public void nomAlumno(){
        try {
            for(int i = 0; i < alumno.length; i++){
                for(int j = 0; j < alumno[i].length; j++){
                    for(int k = 0; k < alumno[i][j].length; k++){
                        System.out.println("Digite el nombre del alumno del grupo " + grupo[i] +
                                " de la materia " + mat[i][j]);
                        String nomAlu = s.next();
                        alumno[i][j][k] = nomAlu;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
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
                            System.out.println("Digite la calificacion de la materia " + mat[i][j] + " del alumno " + alumno[i][j][k] 
                                    + " del grupo " + grupo[i]);
                            calificacion = s.nextInt();
                        } while (!numPositivos(calificacion, 100));
                        cali[i][j][k][0] = calificacion;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void mostrarMatriz() {
        try {
            for (int i = 0; i < cali.length; i++) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Grupo: " + grupo[i]);
                for (int j = 0; j < cali[i].length; j++) {
                    System.out.println("\tMateria: " + mat[i][j]);
                    for (int k = 0; k < cali[i][j].length; k++) {
                        System.out.println("\t\tNombre alumno \t\tCalificacion");
                        System.out.println("\t\t" + alumno[i][j][k] + "\t\t\t" + cali[i][j][k][0]);
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private boolean numPositivos(int x) {
        return x > 0;
    }

    private boolean numPositivos(int x, int y) {
        return x >= 0 && x <= y;
    }
}
