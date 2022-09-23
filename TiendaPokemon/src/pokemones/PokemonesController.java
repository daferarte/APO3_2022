/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemones;

import DAOpokemones.DAOpokemones;

/**
 *
 * @author dafer
 */
public class PokemonesController implements DAOpokemones{
    
    private static PokemonesController instancia;
    private String pokemones[];
    private int cPokemon;
    
    public static PokemonesController getInstance(){
        if(instancia == null)
            instancia = new PokemonesController();
        return instancia;
    }
    
    private PokemonesController(){
        this.pokemones=new String[100];
        this.cPokemon=0;
    }
    
    @Override
    public void GuardarPokemon(String pokemon){
        pokemones[cPokemon]=pokemon;
        cPokemon++;
    }

    @Override
    public void MostrarPokemones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ActualizarPokemon(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarPokemon(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
