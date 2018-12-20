/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clases.cConectar;
import java.sql.Connection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Isaac Torres
 */
@WebService(serviceName = "FractalesWS")
public class FractalesWS {

   cConectar con;
    
    @WebMethod(operationName = "hello_Isaac")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello Isaac" + txt + " !";
    }
    
    @WebMethod(operationName = "conectar")
    public String Conectar(@WebParam(name = "name") String txt) {
       return "Hello Isaac" + txt + " !";
    }
}
