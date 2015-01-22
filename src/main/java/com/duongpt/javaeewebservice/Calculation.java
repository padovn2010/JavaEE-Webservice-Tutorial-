/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duongpt.javaeewebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Pado
 * Create Web-service class
 */
@WebService
public class Calculation {
    
    @WebMethod
    public int sum(int para1, int para2){
        return para1 + para2;
    }
    @WebMethod
    public  int subtract(int para1, int para2){
        return para1 - para2;
    }
}
