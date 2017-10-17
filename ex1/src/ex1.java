import java.io.*;

//ce programme permet de verifier l'existence d'un fichier ou d'un dossier

public class ex1 {

    public static void main(String args[]) {

        //instanciation de l'objet
        File f = new File(".\\texte.txt");// /indication du fichier rechercher


        //test structure if...else permettant de verifier l'existence d'un fichier ou d'un dossier avec un retour
        if(f.exists() && f.isDirectory()){
            System.out.println("File existed and it's directory");
        }else if(f.exists() && f.isFile()) {
            System.out.println("file existed and it' file");
        }else{
            System.out.println("there is no file");
        }
    }

}