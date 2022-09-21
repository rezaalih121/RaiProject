import edu.fbansept.demoeesc.models.*;


public class Prancipale {

    // main function
    public static void main(String[] args) {
        System.out.println("Hello Java its me again after 7 years !!");

//        DES TYPE PRIMITIVE
        byte monToutPetit = 127;

        short monPetit = 12;


//        4 octes d'espace me-6re
        int monNombre = 42;

        monNombre = 402;
//        1 octes d'espace
        boolean monBoleen = true;
//        8 octes d'espace
        double monDouble = 42.43;
//        4 octes d'espace
        float monPtitDecimal = 42.42f;

        float resultat = monNombre / 10;

        char lettre = 'A';
        char letterAscii = 45;

        float age1 = 15.5f;
        float age2 = 15;

        int moyenneAge = (int) ((age1 + age2) / 2);
        double monDouble2 = 123456.123456;


//       DES TYPE STATIC

        Integer monintergerClass = 42;
        Float monFloatClass = 42.42f;
        Double monDoubleClass = 42.43;
        Boolean monBoleenClass = true;

        String monText = monintergerClass.toString();


        System.out.println(myFirstFunction("RezaAli"));
        System.out.println(monFloatClass.toString());
        System.out.println("boolean \n");
        boolean estFemme = true;
        boolean estVip = false;
        boolean estMineur = true;

        //attention : && prioritaire sur ||
        //sinon utiliser des paraenthès pour pioriser des opération
        //comme 2 + 2 * 3 = 8 et non 12
        if ((estFemme || estMineur) && estVip) {
            System.out.println("Entrée gratuite");
        }
        System.out.println("while \n");
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }
        System.out.println("for \n");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("monTableauEntier \n");
        int[] monTableauEntier = {42, 402, 18, 115};
        int[] monAutreTableau = new int[4];
        monAutreTableau[0] = 42;
        monAutreTableau[1] = 404;
        monAutreTableau[2] = 67;
        monAutreTableau[3] = 21;

        int[] monDernierTablau = new int[4];
        monDernierTablau = monTableauEntier;

        for (int i = 0; i < monDernierTablau.length; i++) {
            System.out.println(monDernierTablau[i]);
        }
        System.out.println("Foreach in java \n");
// Foreach in java
        for (int monN : monAutreTableau) {
            System.out.println(monN);

        }
// byte
        System.out.println("byte  \n");

        byte[] monTableauEntierByte = {5, 2, 3};

// Class personne

        System.out.println("Class personne  \n");

        Personne reza = new Personne("IRANNEJAD", "Reza", true, 39);

        Personne sophie = new Personne();

        sophie.setAge(39);

        System.out.println("Class reza : " + reza);
        System.out.println("Class sophie : " + sophie);
        System.out.println(reza.donneAge());
        // sophie = reza;
        sophie.setEstHomme(false);
        sophie.setPrenom("Sophie");

        sophie.setNom("IR");
        sophie.setAge(29);

        System.out.println("Class sophie 2 : " + sophie);

        System.out.println(reza.donneNomCmplet());
        System.out.println(sophie.donneNomCmplet());
        System.out.println(sophie.isEstHomme());
        System.out.println(reza.donneAge());

        System.out.println(sophie.quiJeSuis() + " " + sophie.getPrenom() + " : " + sophie.infoGenre());
        System.out.println(reza.quiJeSuis() + " " + reza.getPrenom() + " : " + reza.infoGenre());
        String[] noms = {"Reza", "Ali"};
        System.out.println(reza.quiJeSuis(noms));

        Etudiant michel = new Etudiant("Michemiche", "Michel", false, 27, "michel27", "1234");

        System.out.println(michel.donneNomCmplet());
        System.out.println(michel.checkPassword("1k234"));
    }

    public static String myFirstFunction(String yourName) {

        String parol = "Hello " + yourName + " Ca va ";

        return parol;
    }

}