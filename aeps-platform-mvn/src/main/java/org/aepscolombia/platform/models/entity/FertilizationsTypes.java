package org.aepscolombia.platform.models.entity;
// Generated Jan 21, 2014 11:35:29 AM by Hibernate Tools 3.2.1.GA

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FertilizationsTypes generated by hbm2java
 */
@Entity
@Table(name="fertilizations_types"
    ,catalog="madr_bd11"
)
public class FertilizationsTypes  implements java.io.Serializable {


     private Integer idFerTyp;
     private String nameFerTyp;

    public FertilizationsTypes() {
    }

	
    public FertilizationsTypes(String nameFerTyp) {
        this.nameFerTyp = nameFerTyp;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_fer_typ", unique=true, nullable=false)
    public Integer getIdFerTyp() {
        return this.idFerTyp;
    }
    
    public void setIdFerTyp(Integer idFerTyp) {
        this.idFerTyp = idFerTyp;
    }
    
    @Column(name="name_fer_typ", nullable=false, length=45)
    public String getNameFerTyp() {
        return this.nameFerTyp;
    }
    
    public void setNameFerTyp(String nameFerTyp) {
        this.nameFerTyp = nameFerTyp;
    }

}


