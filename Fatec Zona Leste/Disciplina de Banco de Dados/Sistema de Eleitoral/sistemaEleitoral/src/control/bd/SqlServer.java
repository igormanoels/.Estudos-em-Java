package control.bd;

public class SqlServer {

    private String URL = "jdbc:mariadb://localhost:3306/hospital?allowMultiQueries=true";
    //    private String URL = "jdbc:mariadb://localhost:3306/hospital";
    private String USER = "pooUser";
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
