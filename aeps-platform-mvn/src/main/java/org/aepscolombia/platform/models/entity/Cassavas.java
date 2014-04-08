package org.aepscolombia.platform.models.entity;
// Generated Jan 21, 2014 11:35:29 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Cassavas generated by hbm2java
 */
@Entity
@Table(name="cassavas"
    ,catalog="madr_bd11"
)
public class Cassavas  implements java.io.Serializable {


     private Integer idCas;
     private ProductionEvents productionEvents;
     private String cuttingAngleCas;
     private Boolean seedStorageCas;
     private Integer seedStorageTimeCas;

    public Cassavas() {
    }

	
    public Cassavas(ProductionEvents productionEvents) {
        this.productionEvents = productionEvents;
    }
    public Cassavas(ProductionEvents productionEvents, String cuttingAngleCas, Boolean seedStorageCas, Integer seedStorageTimeCas) {
       this.productionEvents = productionEvents;
       this.cuttingAngleCas = cuttingAngleCas;
       this.seedStorageCas = seedStorageCas;
       this.seedStorageTimeCas = seedStorageTimeCas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_cas", unique=true, nullable=false)
    public Integer getIdCas() {
        return this.idCas;
    }
    
    public void setIdCas(Integer idCas) {
        this.idCas = idCas;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_production_event_cas", nullable=false)
    public ProductionEvents getProductionEvents() {
        return this.productionEvents;
    }
    
    public void setProductionEvents(ProductionEvents productionEvents) {
        this.productionEvents = productionEvents;
    }
    
    @Column(name="cutting_angle_cas", length=9)
    public String getCuttingAngleCas() {
        return this.cuttingAngleCas;
    }
    
    public void setCuttingAngleCas(String cuttingAngleCas) {
        this.cuttingAngleCas = cuttingAngleCas;
    }
    
    @Column(name="seed_storage_cas")
    public Boolean getSeedStorageCas() {
        return this.seedStorageCas;
    }
    
    public void setSeedStorageCas(Boolean seedStorageCas) {
        this.seedStorageCas = seedStorageCas;
    }
    
    @Column(name="seed_storage_time_cas")
    public Integer getSeedStorageTimeCas() {
        return this.seedStorageTimeCas;
    }
    
    public void setSeedStorageTimeCas(Integer seedStorageTimeCas) {
        this.seedStorageTimeCas = seedStorageTimeCas;
    }




}


