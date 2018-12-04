package br.udesc.cavi.eso.dsw.trabalhopratico;

import br.udesc.cavi.eso.dsw.trabalhopratico.Equipe;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-02T16:07:01")
@StaticMetamodel(Integrante.class)
public class Integrante_ { 

    public static volatile SingularAttribute<Integrante, Boolean> autorizacao;
    public static volatile SingularAttribute<Integrante, Date> dataNasc;
    public static volatile SingularAttribute<Integrante, String> rg;
    public static volatile SingularAttribute<Integrante, String> cpf;
    public static volatile SingularAttribute<Integrante, String> nomePai;
    public static volatile SingularAttribute<Integrante, String> nome;
    public static volatile SingularAttribute<Integrante, Long> id;
    public static volatile SingularAttribute<Integrante, Equipe> equipe;
    public static volatile SingularAttribute<Integrante, String> nomeMae;

}