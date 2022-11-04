/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemones;

import DAOpokemones.DAOBatallas;

/**
 *
 * @author dafer
 */
public class BatallaController implements DAOBatallas{

    private static BatallaController instancia;

    private BatallaController() {
    }
    
    public static BatallaController getInstancia(){
        if(instancia==null){
            instancia=new BatallaController();
        }
        return instancia;
    }
    
    @Override
    public int Batalla(String[][] pokemones) {
        int ganador;
        if(Integer.parseInt(pokemones[5][0]) > Integer.parseInt(pokemones[5][1])){
            ganador=0;
        }else{
            ganador=1;
        }
        return ganador;
    }

    
    
}
