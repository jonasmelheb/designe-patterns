package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Configuration {

    private String url;
    private String user;
    private String password;

    private Configuration() {
        init();
    }

    private static class ConfigHolder {
        private final static Configuration instance = new Configuration();
    }

    public static Configuration getInstance() {
        return ConfigHolder.instance;
    }

    private void init() {
        ResourceBundle configuration = ResourceBundle.getBundle("configuration") ;
        url = configuration.getString("db.url");
        user = configuration.getString("db.user");
        password = configuration.getString("db.password");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
