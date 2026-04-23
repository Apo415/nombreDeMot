//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totalMots = 0;

        try {
            // Utilisation du  lecteur de fichiers File Scanner
            File file = new File("expenses.txt");
            Scanner fileScanner = new Scanner(file);

            // Lecture chaque ligne dans un String
            while (fileScanner.hasNextLine()) {
                String ligne = fileScanner.nextLine();

                // Séparer avec l'espace comme délimiteur
                String[] mots = ligne.split(" ");

                // Additionner les mots avec la longueur du tableau
                totalMots += mots.length;
            }

            fileScanner.close();

            // Afficher le nombre total de mots
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : fichier introuvable !");
        }
    }
}