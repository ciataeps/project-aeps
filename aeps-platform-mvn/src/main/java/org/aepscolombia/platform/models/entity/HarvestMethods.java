package org.aepscolombia.platform.models.entity;
// Generated Jan 21, 2014 11:35:29 AM by Hibernate Tools 3.2.1.GA

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * HarvestMethods generated by hbm2java
 */
@Entity
@Table(name="harvest_methods"
    ,catalog="madr_bd11"
)
public class HarvestMethods  implements java.io.Serializable {


     private int idHarMet;
     private String nameHarMet;
     private Boolean statusHarMet;

    public HarvestMethods() {
    }

	
    public HarvestMethods(int idHarMet, String nameHarMet) {
        this.idHarMet = idHarMet;
        this.nameHarMet = nameHarMet;
    }
    public HarvestMethods(int idHarMet, String nameHarMet, Boolean statusHarMet) {
       this.idHarMet = idHarMet;
       this.nameHarMet = nameHarMet;
       this.statusHarMet = statusHarMet;
    }
   
     @Id 
    
    @Column(name="id_har_met", unique=true, nullable=false)
    public int getIdHarMet() {
        return this.idHarMet;
    }
    
    public void setIdHarMet(int idHarMet) {
        this.idHarMet = idHarMet;
    }
    
    @Column(name="name_har_met", nullable=false, length=45)
    public String getNameHarMet() {
        return this.nameHarMet;
    }
    
    public void setNameHarMet(String nameHarMet) {
        this.nameHarMet = nameHarMet;
    }
    
    @Column(name="status_har_met")
    public Boolean getStatusHarMet() {
        return this.statusHarMet;
    }
    
    public void setStatusHarMet(Boolean statusHarMet) {
        this.statusHarMet = statusHarMet;
    }

}


