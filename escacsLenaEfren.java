package taulerescac;

import java.util.Scanner;

import Teclat.*;
import static java.lang.Byte.SIZE;

public class Tauler {

    public static void main(String[] args) {
        Scanner Teclat = new Scanner(System.in);
        int files, columnes;
        char BUIT = '_';

        // Demanar les dimensions del tauler
        System.out.print("Introduceix les files del tauler (entre 5 i 9): ");
        files = Teclat.nextInt();
        while (files < 5 || files > 9) {
            System.out.print("Les files han de ser entre 5 i 9. Torna a introduir-les: ");
            files = Teclat.nextInt();
        }
        System.out.print("Introduceix les columnes del tauler (entre 5 i 9): ");
        columnes = Teclat.nextInt();
        while (columnes < 5 || columnes > 9) {
            System.out.print("Les columnes han de ser entre 5 i 9. Torna a introduir-les: ");
            columnes = Teclat.nextInt();
        }

        // Inicialitzar el tauler
        char[][] tauler = new char[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                tauler[i][j] = BUIT;
            }
        }

        // Bucle principal
        int opcio;
        do {
            // Mostrar el tauler
            System.out.println();
            System.out.print("   ");
            for (int i = 0; i < columnes; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < files; i++) {
                System.out.print(i + " |");
                for (int j = 0; j < columnes; j++) {
                    System.out.print(tauler[i][j] + "|");
                }
                System.out.println();
            }

            // Mostrar el menú
            System.out.println();
            System.out.println("1- Posar una peça");
            System.out.println("2- Mostrar els moviments d'una peça");
            System.out.println("3- Esborrar moviments");
            System.out.println("4- Esborrar tauler");
            System.out.println("5- Eixir");

            //Preguntar número d'opció
            System.out.print("Introduceix una opció: ");
            opcio = Teclat.nextInt();

        } // Executar l'opció
        while (opcio != 5);
        if (opcio == 1) {
            System.out.print("Tipus de peça (Torre, Alfil, Dama, Rei o Cavall): ");
            String peça = Teclat.next();
            System.out.print("Coordenadas (fila columna): ");
            int row = Teclat.nextInt();
            int col = Teclat.nextInt();
            char peçaChar;
            switch (peça) {
                case "Torre":
                    peçaChar = 'R';
                    break;
                case "Alfil":
                    peçaChar = 'B';
                    break;
                case "Dama":
                    peçaChar = 'Q';
                    break;
                case "Rei":
                    peçaChar = 'K';
                    break;
                case "Cavall":
                    peçaChar = 'N';
                    break;
                default:
                    peçaChar = ' ';
            }
            tauler[row][col] = peçaChar;
            System.out.println("Peça posada en (" + row + ", " + col + ")");
            
            if (opcio == 2)
            MenejarPeça();
            private static void MenejarPeça() {
            String[][] tauler = null;
            int col = 0;
            int row = 0;
            String peça = tauler[row][col];
            }
            
            // Moviments possibles de la peça.
            System.out.println("Moviments possibles de la peça " + peça + " a les coordenades (" + row + ", " + col + ")");
            
            
            if (opcio == 3) {
            EsborrarMoviments();              
            static void EsborrarMoviments() {
            int moviments = 0;
            System.out.println("S'han esborrat " + moviments + " moviments");
             }
            
            if (opcio == 4){
            EsborrarTauler();
            }
            static void EsborrarTauler() {
            char[][] tauler = new char[SIZE][SIZE];
            
            
  }
    
}
