package com.beetle.bauhinia.db;

/**
 * Created by houxh on 15/3/21.
 * FileGroupMessageDB vs SQLGroupMessageDB
 */
public class GroupMessageDB extends SQLGroupMessageDB {
    public static final boolean SQL_ENGINE_DB = true;

    private static GroupMessageDB instance = new GroupMessageDB();

    public static GroupMessageDB getInstance() {
        return instance;
    }
}
