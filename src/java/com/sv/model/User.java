package com.sv.model;

/**
 *
 * @author Alexandra Gomez
 */
public class User {
    private String username;
    private String password;
    private int level;

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", level=" + level + '}';
    }

    public User() {
    }

    public User(String username, String password, int level) {
        this.username = username;
        this.password = password;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
}
