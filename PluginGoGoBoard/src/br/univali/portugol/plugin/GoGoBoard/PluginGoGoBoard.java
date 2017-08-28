package br.univali.portugol.plugin.GoGoBoard;

import br.univali.portugol.plugin.GoGoBoard.acoes.AcaoPersonalizadaEstatica;
import br.univali.ps.plugins.base.Plugin;
import br.univali.ps.plugins.base.UtilizadorPlugins;
import br.univali.ps.plugins.base.VisaoPlugin;

/**
 *
 * @author Ailton Cardoso Jr
 */
public final class PluginGoGoBoard extends Plugin {

    VisaoPlugin visaoPlugin = new VisaoPluginGoGoBoard(this);
    private UtilizadorPlugins utilizador;
    
    public PluginGoGoBoard() {
        
    }

    @Override
    protected void inicializar(UtilizadorPlugins utilizador) {
        this.utilizador = utilizador;
        this.utilizador.instalarAcaoPlugin(this, new AcaoPersonalizadaEstatica());
        super.inicializar(utilizador); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VisaoPlugin getVisao() {
        return visaoPlugin;
    }

    Object getUtilizador() {
        return utilizador;
    }
}
