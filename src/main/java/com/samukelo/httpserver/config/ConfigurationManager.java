package com.samukelo.httpserver.config;

public class ConfigurationManager {
    private static ConfigurationManager myConfigurationManager; //Just need one configuration manager that will be shared across the prj
    private static Configuration myCurrentConfiguration;

    private ConfigurationManager(){

    }
    //If there is no instance of a configuration manager just create a new one
    public static ConfigurationManager getInstance(){
        if (myConfigurationManager == null){
            myConfigurationManager = new ConfigurationManager();
        }
        return myConfigurationManager;
    }
    //Used to load config file by given path
    public void loadConfigurationFile(String filePath){

    }
    //Returns current loaded configuration
    public void getCurrentConfiguration(){

    }
}
