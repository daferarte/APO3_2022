/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOpokemones;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dafer
 */
public interface DAOpokemones {
    public boolean GuardarPokemon(String cpokemon,String npokemon, String tpokemon, String spokemon, String vpokemon, String epokemon);
    public boolean GuardarPokemon(String[] pokemon);
    public DefaultTableModel MostrarPokemones();
    public boolean ActualizarPokemon(String[] pokemon);
    public void EliminarPokemon(int codigo);
}
