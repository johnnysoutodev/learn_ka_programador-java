/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

/**
 *
 * @author Johnny Souto
 */
public class EmployeeStockPlan {
    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public EmployeeStockPlan() {
    }
    
    public int grantStock(Employee emp){
        if(emp instanceof Director){
            return directorShares;
        } else {
            if(emp instanceof Manager){
                return managerShares;
            } else {
                return employeeShares;
            }
        }
    }
    
}
