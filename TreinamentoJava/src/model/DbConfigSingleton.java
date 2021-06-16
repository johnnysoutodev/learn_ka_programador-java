/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Johnny Souto
 */
public final class DbConfigSingleton {
    
    private final String hostName;
    private final String dbName;
    
    private static final DbConfigSingleton instance = new DbConfigSingleton();
    
    private DbConfigSingleton(){
        hostName = "dbhost.example.com";
        dbName = "localhost";
    }
    
    public static DbConfigSingleton getIstance(){
        return instance;
    }
    
}
