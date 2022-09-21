package edu.fbansept.demoeesc.models;

public class Personne {
    public Personne(String nom, String prenom, boolean estHomme, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.estHomme = estHomme;
        this.age = age;
    }

    public Personne(){}


    private String nom;
    private String prenom;
    private boolean estHomme;
    private int age = 0;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEstHomme() {
        return estHomme;
    }

    public void setEstHomme(boolean estHomme) {
        this.estHomme = estHomme;
    }

    public String donneNomCmplet(){
        return nom+ "  " + prenom +" est "+ (estHomme ?" un homme ! ": " une femme ! ");
    }

    public String donneAge(){
        return nom+ "  " + prenom + " a "+ age + " ans";
    }

    public String infoGenre(){
        if(estHomme){
            return "Je suis un homme ! ";
        }else
            return "Je suis une femme ! ";
    }

    public String quiJeSuis(){
        return "Je m'applle " + (estHomme ? "Monsieur" : "Madame");
    }

    public String quiJeSuis (String[] noms){
        String civilite = estHomme ? "Monsieur" : "Madame";
        String phrase = "Je m'applle  " + civilite;

        for (String nom : noms){
            phrase += nom + "-";
        }
        return phrase;

    }



}
