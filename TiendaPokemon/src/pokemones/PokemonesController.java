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
    private String pokemones[][];
    private int cPokemon;
    
    public static PokemonesController getInstance(){
        if(instancia == null)
            instancia = new PokemonesController();
        return instancia;
    }
    
    private PokemonesController(){
        this.pokemones=new String[5][100];
        this.cPokemon=0;
    }
    
    @Override
    public void GuardarPokemon(String cpokemon,String npokemon, String tpokemon, String spokemon, String vpokemon, String epokemon){
        pokemones[0][cPokemon]=cpokemon;
        pokemones[1][cPokemon]=npokemon;
        pokemones[2][cPokemon]=tpokemon;
        pokemones[3][cPokemon]=spokemon;
        pokemones[4][cPokemon]=vpokemon;
        pokemones[5][cPokemon]=epokemon;
        cPokemon++;
    }

    @Override
    public void MostrarPokemones() {
        for(int i=0;i<cPokemon;i++){
            System.out.println("pokemon "+(i+1)+": "+pokemones[i]);
        }
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
