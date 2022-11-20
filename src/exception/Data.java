package exception;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;


    public boolean check () {
        try {
            this.checkCredentials();
        } catch (LoginException e){
            System.out.println("Login is incorrect");
        } catch (PasswordException e) {
            System.out.println("Password is incorrect");
        }
        return true;
    }
    public boolean checkCredentials () throws LoginException, PasswordException {
            if (this.getLogin().matches("[a-zA-Z0-9_]{1,20}") && this.getPassword().matches("[a-zA-Z0-9_]{1,20}")){
                return true;
            } else if (!this.getLogin().matches("[a-zA-Z0-9_]{1,20}")){
                throw new LoginException ("Wrong password");
            } else if (!this.getPassword().matches("[a-zA-Z0-9_]{1,20}")) {
                throw new PasswordException("Wrong password");
            }
            return false;
    }

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
