import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class EcrireFichier {
    // Création du scanner qui permet de scanner les entrées de l'utilisateur dans la console
    public static Scanner scan = new Scanner(System.in);

    public static void main (String args[]){
        // Création du fichier texte pour le programme
        File fichierTexte = new File (".\\texte.txt");
        // Création de "l'écrivain"
        FileWriter ecrireFichier;
        // Création du "lecteur"
        FileReader lireFichier;

        // Demande de la phrase
        System.out.println("Veuillez entrer une petite phrase");
        // Enregistrement de la phrase
        String petitePhrase =scan.nextLine();

        try{
            // Instanciation de l'objet lireFichier qui va lire dans fichier Texte.txt
            lireFichier = new FileReader(".\\texte.txt");
            String ligne = "";
            int i = 0;
            // Boucle permettant de parcourir tout le fichier
            while((i = lireFichier.read()) != -1){
                ligne += (char)i;
            }

            System.out.println(ligne);

            // Instanciation de l'objet ecrireFichier qui va écrire dans fichierTexte.txt
            ecrireFichier = new FileWriter("c:\\projet\\texte.txt");
            // Écriture d'une chaîne de caractères dans le fichier texte
            ecrireFichier.write(ligne + "\n" + petitePhrase); // ajout du \n pour ajouter un retour à la ligne entre la dernière entrée et la nouvelle entrée
            // "Fermeture" du FileWriter
            ecrireFichier.close();


        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}