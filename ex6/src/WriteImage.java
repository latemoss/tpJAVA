import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class WriteImage
{
    public static void main( String[] args )
    {
        BufferedImage image = null;

        //instanciation objet image
        try {
            //Instanciation de l'objet url, spécification de la route emprunté
            URL url = new URL("https://cdn.pixabay.com/photo/2017/10/06/17/46/seemed-2823949_960_720.jpg");
            image = ImageIO.read(url);

            //choix des différentes sorties
            ImageIO.write(image, "jpg",new File(".\\out.jpg"));
            ImageIO.write(image, "gif",new File(".\\out.gif"));
            ImageIO.write(image, "png",new File(".\\out.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        //confirmation fin du processus
        System.out.println("Done");
    }
}
