
package lmcpointofsalessystem;

/**
 *
 * @author JohnReinel
 */
public class GetterSetter {
    private String username;
    private String password;
    
    public void setUser(String user){
        this.username = user;
    }
    
    public void setPass(String pass){
        this.password = pass;
    }
    
    public String getUser(){
        return username;
    }
    
    public String getPass(){
        return password;
    }
}
