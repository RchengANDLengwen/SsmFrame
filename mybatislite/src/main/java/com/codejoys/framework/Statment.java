package com.codejoys.framework;

public class Statment {
    public String id;
    public String sql;
    public String resultType;

    public Statment(String id, String sql, String resultType) {
        this.id = id;
        this.sql = sql;
        this.resultType = resultType;
    }
}
