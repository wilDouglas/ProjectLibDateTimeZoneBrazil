/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myproject.exceptions;

/**
 *
 * @author William
 */
public class DateFormatException extends RuntimeException{
    
    public DateFormatException(String message){
        super(message);
    }
}
