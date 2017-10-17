import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile
{
    public static void main(String[] args)
    {
        //création de l'entré
        FileInputStream instream = null;
        //création de la sortie
        FileOutputStream outstream = null;

        try{
            //instanciation des objets qui permettront pour le premier lire dans la destination spécifié
            //pour le second copier dans la destination spécifier
            File infile =new File(".\\texte.txt");
            File outfile =new File(".\\texte1.txt");

            //les fichiers spécifier doivent exister sinon erreur java, le programme n'a pas etait fait pour creer les fichiers non existant

            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];

            int length;
    	    //boucle permettant de copier l'intégral de l'instream, et de coller l'integrale de l'outstream
            while ((length = instream.read(buffer)) > 0){
                outstream.write(buffer, 0, length);
            }

            //Closing the input/output file streams
            instream.close();
            outstream.close();

            //comfirmation copie fichier
            System.out.println("File copied successfully!!");

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}