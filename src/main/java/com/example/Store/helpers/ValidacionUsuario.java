package com.example.Store.helpers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ValidacionUsuario {
    private EvaluarPatron evaluarPatron=new EvaluarPatron();

    public boolean validarNombres(String nombres)throws Exception{
        String regex = "^[a-zA-Z\\s]{1,50}$";
        if (!this.evaluarPatron.evaluarPatron(nombres,regex)){
            throw new Exception("Reviza el nombre");
        }
        return true;
    }

    public boolean validarCedula(String cedula)throws Exception{
        String regex = "^[0-9]+$";
        if (!this.evaluarPatron.evaluarPatron(cedula,regex)){
            throw new Exception("Reviza el costo");
        }
        return true;
    }

    public boolean validarCorreo(String correo)throws Exception{
        String regex = "^[a-zA-Z\\s.,'-@]{1,255}$";
        if (!this.evaluarPatron.evaluarPatron(correo,regex)){
            throw new Exception("Reviza el correo");
        }
        return true;
    }

    public boolean validarSexo(String sexo)throws Exception{
        String regex = "^[a-zA-Z\\s]{1,15}$";
        if (!this.evaluarPatron.evaluarPatron(sexo,regex)){
            throw new Exception("Reviza el sexo");
        }
        return true;
    }

    public boolean validarCodigoPostal(String codigoPostal)throws Exception{
        String regex = "^[0-9]+$";
        if (!this.evaluarPatron.evaluarPatron(codigoPostal,regex)){
            throw new Exception("Reviza el codigo postal");
        }
        return true;
    }

}
