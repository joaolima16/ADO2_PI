
package com.mycompany.lojainformatica;

import com.mycompany.lojainformatica.Dbconnection.ConnectionDB;

public class LojaInformatica {

    public static void main(String[] args) {
        ConnectionDB connDb = new ConnectionDB();
        connDb.createTables();
    }
}
