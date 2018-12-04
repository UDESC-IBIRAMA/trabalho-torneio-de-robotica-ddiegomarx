package br.udesc.cavi.eso.dsw.trabalhopratico;

import br.udesc.cavi.eso.dsw.trabalhopratico.Categoria;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-02T16:07:01")
@StaticMetamodel(Juiz.class)
public class Juiz_ { 

    public static volatile SingularAttribute<Juiz, Date> dataNasc;
    public static volatile SingularAttribute<Juiz, String> rg;
    public static volatile SingularAttribute<Juiz, Categoria> categoria;
    public static volatile SingularAttribute<Juiz, String> cpf;
    public static volatile SingularAttribute<Juiz, String> nome;
    public static volatile SingularAttribute<Juiz, Long> id;

}