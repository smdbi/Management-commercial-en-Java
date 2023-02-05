import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Commande implements Operation {
    private String NumCmd;
    private Date DateCmd;
    private double TotalHT;
    private double TotalTTC;
    private String CodeClient;
    private List<Article> articles;
    private List<Commande> commandes = new ArrayList<Commande>();
    public List<Commande> getCommandesByClientAndDate(String codeClient, Date dateCmd) {
        List<Commande> commandes = new ArrayList<Commande>();
        for (Commande cmd : this.commandes) {
            if (cmd.getCodeClient().equals(codeClient) && cmd.getDateCmd().equals(dateCmd)) {
                commandes.add(cmd);
            }
        }
        return commandes;
    }
    
    public Commande(String numCmd, Date dateCmd, double totalHT, double totalTTC, String codeClient) {
        NumCmd = numCmd;
        DateCmd = dateCmd;
        TotalHT = totalHT;
        TotalTTC = totalTTC;
        CodeClient = codeClient;
        articles = new ArrayList<Article>();
    }

    // ... les getters and setters de la classe ...
    public String getNumCmd() {
        return NumCmd;
    }

    public void setNumCmd(String numCmd) {
        NumCmd = numCmd;
    }

    public Date getDateCmd() {
        return DateCmd;
    }

    public void setDateCmd(Date dateCmd) {
        DateCmd = dateCmd;
    }

    public double getTotalHT() {
        return TotalHT;
    }

    public void setTotalHT(double totalHT) {
        TotalHT = totalHT;
    }

    public double getTotalTTC() {
        return TotalTTC;
    }

    public void setTotalTTC(double totalTTC) {
        TotalTTC = totalTTC;
    }

    public String getCodeClient() {
        return CodeClient;
    }

    public void setCodeClient(String codeClient) {
        CodeClient = codeClient;
    }
    
    public void Commanders(Date Date_Cd, String CodeArticle, int Qte) {
        // Rechercher l'article correspondant au code donné
        Article article = new Article(CodeArticle, CodeArticle, Qte, TotalHT);

        if (article != null) {
            // Mettre à jour la quantité de l'article
            article.setQte(article.getQte() + Qte);
            // Mettre à jour la date de commande de l'article
            article.setDateCmd(Date_Cd);
            // Mettre à jour le prix de la commande
            TotalHT += article.getPrixHT() * Qte;
            TotalTTC += article.getPrixTTC() * Qte;
        }
    }       

    public void Prix_Commande(double PrixTTC, String PrixLettre) {
        // code pour calculer le prix de la commande.
        // Mettre à jour le prix total TTC de la commande
        this.TotalTTC = PrixTTC;
    }


    public double calculerTotalTTC() {
        double totalTTC = 0;
        for (Article article : articles) {
            totalTTC += article.getPrixTTC() * article.getQte();
        }
        return totalTTC;
    }
    public double calculerTotalHT() {
        double totalHT = 0;
        for (Article article : articles) {
            totalHT += article.getPrixHT() * article.getQte();
        }
        return totalHT;
    }
    
    

    public void Affiche_Commande(String codeClient, List<Commande> commandes) {
        for (Commande commande : commandes) {
            if (commande.getCodeClient().equals(codeClient)) {
                System.out.println("Numéro de commande: " + commande.getNumCmd());
                System.out.println("Date de la commande: " + commande.getDateCmd());
                System.out.println("Total TTC: " + commande.getTotalTTC());
                System.out.println();
            }
        }
    }

    
}
        

