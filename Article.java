import java.util.Date;
import java.util.List;


public class Article {
    private String CodeArticle;
    private String Libelle;
    private int Qte;
    private double PrixHT;
    private double PrixTTC;
    private static final double TVA = 0.2;

    public Article(String codeArticle, String libelle, int qte, double prixHT) {
        this.CodeArticle = codeArticle;
        this.Libelle = libelle;
        this.Qte = qte;
        this.PrixHT = prixHT;
        PrixTTC = prixHT + (prixHT*TVA);

    }

    public String getCodeArticle() {
        return CodeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        CodeArticle = codeArticle;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public int getQte() {
        return Qte;
    }

    public void setQte(int qte) {
        Qte = qte;
    }

    public double getPrixHT() {
        return PrixHT;
    }

    public void setPrixHT(double prixHT) {
        PrixHT = prixHT;
        PrixTTC = prixHT + (prixHT*TVA);

    }
    
    public double getPrixTTC() {
        return PrixTTC;
    }

    public void setPrixTTC(double prixTTC) {
        PrixTTC = prixTTC;
    }


    public void Affiche_Article(String codeClient, Date date, List<Commande> commandes, List<Article> articles) {
        for (Commande commande : commandes) {
            if (commande.getCodeClient().equals(codeClient) && commande.getDateCmd().equals(date)) {
                for (Article article : articles) {
                    System.out.println("Libellé: " + article.getLibelle());
                    System.out.println("Qte commandée: " + article.getQte());
                    System.out.println("Total HT: " + article.getPrixHT());
                    System.out.println();
                }
            }
        }
    }

    public void setDateCmd(Date date_Cd) {
    }

}