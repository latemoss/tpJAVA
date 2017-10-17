//programme permettant de lister les fichiers selon l'extension spécifié ici ".jpg"
import java.io.File;
import java.io.FilenameFilter;
public class ListDirectoryWithFilter {

    public static void main(String[] args) {

        //instanciation de l'objet
        File dir = new File(".");   // recherche dans le repertoire courant
        if (dir.isDirectory()) {
            // liste uniquement les fichiers avec les indications corespondantes

            String[] files = dir.list(new FilenameFilter() {
                public boolean accept(File dir, String file) {
                    return file.endsWith(".jpg");
                }
            });
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}