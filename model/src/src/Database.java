package model.src.src;

public class Database {
    private final String url = "jdbc:mysql://localhost:3306/deineDatenbank";
    private final String user = "user_1";
    private String password = "1234";
    protected String getUser(){
        return user;
    }
    protected String getPassword(){
        return password;
    }
    protected String getUrl(){
        return url;
    }
    protected void setPassword(String newPassword){
        this.password = newPassword;
    }
}
