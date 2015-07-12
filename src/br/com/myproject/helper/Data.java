/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myproject.helper;

import br.com.myproject.exceptions.DateFormatException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author William
 */
public class Data {

    private static Data relogio;
    private String data;

    public Data(String data) {
        this.data = data;

    }

    public String dataFormatoBrasileiro() {

        try {
            
            String[] dataSeparada = data.split("-");
            String dataFormatada;

            LocalDate agora = LocalDate.of(Integer.parseInt(dataSeparada[0]), Integer.parseInt(dataSeparada[1]), Integer.parseInt(dataSeparada[2]));

            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dataFormatada = agora.format(formatador);

            return dataFormatada;
            
        } catch (Exception erro) {
            
            throw new DateFormatException("Data informada no formato errado");
            
        }
    }

    public String dataFormatoDataBase() {

        try {

            String[] dataSeparada = data.split("/");
            String dataFormatada;

            LocalDate agora = LocalDate.of(Integer.parseInt(dataSeparada[2]), Integer.parseInt(dataSeparada[1]), Integer.parseInt(dataSeparada[0]));

            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            dataFormatada = agora.format(formatador);

            return dataFormatada;

        } catch (Exception erro) {
            
            throw new DateFormatException("Data informada no formato errado");
            
        }
    }

    public String contagemTempoQueSePassou() {
        throw new UnsupportedOperationException("Método não implementado");
    }

}
