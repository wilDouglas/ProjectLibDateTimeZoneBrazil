/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myproject;

import br.com.myproject.helper.Data;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author William
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       LocalDate passado = LocalDate.of(2015, Month.JULY, 11);
       LocalDate presente = LocalDate.of(2015,Month.JULY,12);
       
        Period periodo = Period.between(passado, presente);
       
        System.out.println("Dias que se passaram: " + periodo.getDays());
        System.out.println(new Data("2015-7-12").dataFormatoBrasileiro());       
        System.out.println(new Data("12/07/2015").dataFormatoDataBase());  
        

    }
    
}
