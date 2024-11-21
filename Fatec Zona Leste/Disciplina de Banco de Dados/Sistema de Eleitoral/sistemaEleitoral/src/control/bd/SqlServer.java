package control.bd;

public class SqlServer {

    private String URL = "jdbc:sqlserver://localhost:1433;databaseName=NomeDoBanco";
    private String USER = "SA";
    private String PASS = "123456";
    
    public String getURL() {
        return this.URL;
    }
    
    public String getUSER() {
        return this.USER;
    }
    
    public String getPASS() {
        return this.PASS;
    }
}
