/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOpokemones;

/**
 *
 * @author dafer
 */
public interface DAOpokemones {
    public void GuardarPokemon(String cpokemon,String npokemon, String tpokemon, String spokemon, String vpokemon, String epokemon);
    public void MostrarPokemones();
    public void ActualizarPokemon(int codigo);
    public void EliminarPokemon(int codigo);
}
