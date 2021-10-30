/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Cliente;
import br.edu.ifnmg.LogicaAplicacao.Raca;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;
import br.edu.ifnmg.LogicaAplicacao.RacaRepo;

/**
 *
 * @author Denilson
 */
public class RacaDAO extends DataAccessObject<Raca> 
        implements RacaRepo{
    
    public RacaDAO(){
        super(Raca.class);
    }

    @Override
    public List<Raca> Buscar(Raca obj) {
        String jpql = "select r from Raca r";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
            if(obj != null){

                if(obj.getRaca() != null & !obj.getRaca().isEmpty())
                    parametros.put("raca", obj.getRaca());
                if(obj.getId()> 0)
                    parametros.put("id", obj.getId());
            }
            /*
            if(obj.getEspecie().length() > 0){
            String filtros = "";
            filtros += "r.especie like :especie";
            parametros.put("especie", obj.getEspecie() + "%");
            }
        */
         if(!parametros.isEmpty()){
                String filtros = "";
                jpql += " where ";
                for(String campo : parametros.keySet()){
                    if(!filtros.isEmpty())
                        filtros += " and ";
                    jpql += "r." + campo + " =:" + campo;
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
