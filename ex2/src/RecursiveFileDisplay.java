import java.io.File;
import java.io.IOException;

//programme permettant d'afficher la liste de tous les fichiers dans un dossier spécifié

public class RecursiveFileDisplay {
    //creation de la class contenant le programme

    public static void main(String[] args) {

        File currentDir = new File("."); // instanciation de l'objet currentDir
        displayDirectoryContents(currentDir); // appelle de la fonction "afficher les contenues des dossiers
    }

    public static void displayDirectoryContents(File dir) { //création de la fonction avec pour parametre le dossier
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                //verification qu'il s'agit bien d'un dossier
                if (file.isDirectory()) {
                    System.out.println("directory:" + file.getCanonicalPath());
                    //renvoie les fichiers contenur dans le répertoire
                    displayDirectoryContents(file);


                } else {
                    //s'il s'agit juste d'un fichier retourne le fichier
                    System.out.println("     file:" + file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}