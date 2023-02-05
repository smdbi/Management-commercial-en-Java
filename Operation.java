import java.util.Date;

public interface Operation {
    public void Commanders(Date Date_Cd, String CodeArticle, int Qte);
    public void Prix_Commande(double PrixTTC, String PrixLettre);
}