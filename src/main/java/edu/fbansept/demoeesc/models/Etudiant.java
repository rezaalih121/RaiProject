package edu.fbansept.demoeesc.models;

public class Etudiant extends Personne{

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, boolean estHomme, int age, String userName, String password) {
        super(nom, prenom, estHomme, age);
        this.userName = userName;
        this.setPassword(password);
    }

    public Etudiant(String userName, String password) {
        this.userName = userName;
        this.password = CryptPasswordWithMD5.cryptWithMD5(password);
    }

    String userName;
    String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean checkPassword(String password) {
        System.out.println(this.password +"=="+ CryptPasswordWithMD5.cryptWithMD5(password) + (this.password.equals(CryptPasswordWithMD5.cryptWithMD5(password))));
        if(this.password.equals(CryptPasswordWithMD5.cryptWithMD5(password)))
            return true;
        else
            return false;
    }

    public void setPassword(String password) {
        this.password = CryptPasswordWithMD5.cryptWithMD5(password);
    }
}
