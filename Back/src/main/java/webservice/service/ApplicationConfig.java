/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Jorge
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.udesc.cavi.eso.dsw.trabalhopratico.ControleResource.class);
        resources.add(br.udesc.cavi.eso.dsw.trabalhopratico.ResultadosResource.class);
        resources.add(webservice.service.AlternativaFacadeREST.class);
        resources.add(webservice.service.ArenaFacadeREST.class);
        resources.add(webservice.service.Avaliacao_SalaFacadeREST.class);
        resources.add(webservice.service.CategoriaFacadeREST.class);
        resources.add(webservice.service.CompeticaoFacadeREST.class);
        resources.add(webservice.service.CriterioMissaoFacadeREST.class);
        resources.add(webservice.service.EquipeFacadeREST.class);
        resources.add(webservice.service.IntegranteFacadeREST.class);
        resources.add(webservice.service.JuizFacadeREST.class);
        resources.add(webservice.service.TemporadaFacadeREST.class);
    }
    
}
