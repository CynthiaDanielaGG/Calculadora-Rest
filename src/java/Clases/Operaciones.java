package Clases;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/Operaciones")
public class Operaciones {

    @GET
    @Path("/Resta")
    public float resta(@QueryParam("num1") float num1, @QueryParam("num2") float num2) {
        return num1 - num2;
    }

    @GET
    @Path("/Suma")
    public float Suma(@QueryParam("num1") float num1, @QueryParam("num2") float num2) {
        return num1 + num2;
    }

    @GET
    @Path("/Multiplicacion")
    public float Multiplicacion(@QueryParam("num1") float num1, @QueryParam("num2") float num2) {
        return num1 * num2;
    }

    @GET
    @Path("/Division")
    public float Division(@QueryParam("num1") float num1, @QueryParam("num2") float num2) {
        return num1 / num2;
    }

    @GET
    @Path("/Porciento")
    public float Porciento(@QueryParam("num1") float num1, @QueryParam("num2") float num2) {
        return (num1 * num2) / 100;
    }

    @GET
    @Path("/Potencia")
    public float Potencia(@QueryParam("num1") float num1, @QueryParam("num2") float num2) {
        return (float) Math.pow(num1, num2);
    }

    @GET
    @Path("/Coseno")
    public float Coseno(@QueryParam("num1") float num1) {
        return (float) Math.cos(num1);
    }

    @GET
    @Path("/Tangente")
    public float Tangente(@QueryParam("num1") float num1) {
        return (float) Math.tan(num1);
    }

    @GET
    @Path("/RaizCuadrada")
    public float RaizCuadrada(@QueryParam("num1") float num1) {
        return (float) Math.sqrt(num1);
    }

    @GET
    @Path("/Factorial")
    public float Factorial(@QueryParam("num1") float num1) {
        float resultado;
        int suma = 1;
        for (int i = 1; i <= num1; i++) {
            suma = suma * i;
        }
        resultado = suma;
        return  (resultado);
    }


}
