/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.OrdemServico;
import br.edu.ifnmg.LogicaAplicacao.OrdemServicoRepo;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author DENILSON
 */
public class OrdemServicoDAO extends DataAccessObject<OrdemServico> 
        implements OrdemServicoRepo{
    
    public OrdemServicoDAO(){
        super(OrdemServico.class);
    }

    @Override
    public List<OrdemServico> Buscar(OrdemServico obj) {
        String jpql = "select os from OrdemServico os";
        
        HashMap<String, Object> parametros = new HashMap<>();
        
           if(obj != null){

                if(obj.getItens() != null & !obj.getItens().isEmpty())
                    parametros.put("itens", obj.getItens());
                if(obj.getId()>0)
                    parametros.put("id", obj.getId());
            }
            

        if(!parametros.isEmpty()){
            String filtros = "";
            jpql += " where ";
            for(String campo : parametros.keySet()){
                if(!filtros.isEmpty())
                    filtros += " and ";
                jpql += "os." + campo + " =:" + campo;
            }
            jpql += filtros;
        }

            
            
            Query sql = this.manager.createQuery(jpql);
            
            
            if(!parametros.isEmpty())
                for(String campo: parametros.keySet())
                    sql.setParameter(campo, parametros.get(campo));
            
            return sql.getResultList();
            
        }    
}
