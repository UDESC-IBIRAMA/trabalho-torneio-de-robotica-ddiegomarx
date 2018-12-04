package br.udesc.cavi.eso.dsw.trabalhopratico;

import br.udesc.cavi.eso.dsw.trabalhopratico.Competicao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-02T16:07:01")
@StaticMetamodel(Temporada.class)
public class Temporada_ { 

    public static volatile SingularAttribute<Temporada, String> nome;
    public static volatile SingularAttribute<Temporada, Long> id;
    public static volatile SingularAttribute<Temporada, Competicao> competicao;
    public static volatile SingularAttribute<Temporada, String> descricao;

}