
public class Client {
    private String CodeClient;
    private String Rs;
    private String Adresse;
    private String Telephone;

    public Client(String codeClient, String rs, String adresse, String telephone) {
        this.CodeClient = codeClient;
        this.Rs = rs;
        this.Adresse = adresse;
        this.Telephone = telephone;
    }

    public String getCodeClient() {
        return CodeClient;
    }

    public void setCodeClient(String codeClient) {
        CodeClient = codeClient;
    }

    public String getRs() {
        return Rs;
    }

    public void setRs(String rs) {
        Rs = rs;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }
}





