/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author siriya_s
 */
@WebService(serviceName = "CircleService")
public class CircleService {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findArea")
    public Double findArea(@WebParam(name = "radius") double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findCircumference")
    public Double findCircumference(@WebParam(name = "radius") double radius) {
        return 2 * Math.PI * radius;
    }
}
