package com.example.Store.helpers;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Component
public class EvaluarPatron {

    public EvaluarPatron() {
    }

    //metodo para evaluar patrones entre un String y un regex en java

    public boolean evaluarPatron(String cadena, String exprecion) {
        Pattern patron = Pattern.compile(exprecion);
        Matcher coincidencia=patron.matcher(cadena);

        if (coincidencia.matches()){
            //si se gustan
            return true;
        }else {
            return false;
        }
    }

}
