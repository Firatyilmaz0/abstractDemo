/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractdemo;

/**
 *
 * @author memet
 */
public class AbstractDemo {

    public static void main(String[] args) {
       CustomerManager customerManager= new CustomerManager();
       customerManager.databaseManager=new MySqlDatabaseManager();
       customerManager.getCustomers();
    }
}
