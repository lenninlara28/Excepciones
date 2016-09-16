/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excepciones;

/**
 *
 * @author llara11
 */
public class NoFondosException extends Exception{

    public NoFondosException() {
        super("La Cuenta Tiene Fondos Insuficientes Para Realizar Ese Retiro");
    }
    
}
