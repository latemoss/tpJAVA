import java.lang.String;
import java.util.Scanner;
import java. util. LinkedList;
import java. util. ListIterator;
import java.util.List;

public class Prog{



    private List<Employe> listEmployé;


    public static void main(String Args[]){
        System.out.println("menu");
        Scanner sc = new Scanner(System.in);
        int choixMenu = sc.nextInt();




        do {
            switch (choixMenu) {

                case 1 :
                    ajouterEmploye(); // création d'un nouvel employé
                    break;

                case 2 :
                    calculerSalaire();//calculer salaire
                    break;

            }
        } while (choixMenu == 3);
    }

    private static void calculerSalaire() {
    }

    public static void ajouterEmploye()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ajouter un nouvel employé");
        System.out.println(" ");

        System.out.println("entrez son nom : ");
        String nom = sc.nextLine();

        System.out.println("entrez son prenom : ");
        String prenom = sc.nextLine();


        System.out.println("entrez son age : ");
        int age = sc.nextInt();

        System.out.println("entrez son année d'entrée dans l'entreprise : ")
        String anneeEntre = sc.nextLine();


        Employe e = new Employe(nom, prenom, age, anneeEntre) {
            @Override
            public double calculerSalaire() {
                return 0;
            }

            @Override
            public String getPosition() {
                return null;
            }
        };

        Employe employes = new Employe(nom, prenom, age, anneeEntre) {
            @Override
            public double calculerSalaire() {
                return 0;
            }

            @Override
            public String getPosition() {
                return null;
            }
        };



    }
}
