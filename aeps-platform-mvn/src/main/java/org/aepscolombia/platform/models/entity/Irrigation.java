package org.aepscolombia.platform.models.entity;
// Generated Jan 21, 2014 11:35:29 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Irrigation generated by hbm2java
 */
@Entity
@Table(name="irrigation"
    ,catalog="madr_bd11"
)
public class Irrigation  implements java.io.Serializable {


     private Integer idIrr;
     private IrrigationsTypes irrigationsTypes;
     private ProductionEvents productionEvents;
     private WaterSourcesTypes waterSourcesTypes;
     private Date dateIrr;
     private Boolean useIrrigationIrr;
     private Double amountIrr;

    public Irrigation() {
    }

	
    public Irrigation(ProductionEvents productionEvents, Date dateIrr) {
        this.productionEvents = productionEvents;
        this.dateIrr = dateIrr;
    }
    public Irrigation(IrrigationsTypes irrigationsTypes, ProductionEvents productionEvents, WaterSourcesTypes waterSourcesTypes, Date dateIrr, Boolean useIrrigationIrr, Double amountIrr) {
       this.irrigationsTypes = irrigationsTypes;
       this.productionEvents = productionEvents;
       this.waterSourcesTypes = waterSourcesTypes;
       this.dateIrr = dateIrr;
       this.useIrrigationIrr = useIrrigationIrr;
       this.amountIrr = amountIrr;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_irr", unique=true, nullable=false)
    public Integer getIdIrr() {
        return this.idIrr;
    }
    
    public void setIdIrr(Integer idIrr) {
        this.idIrr = idIrr;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="irrigation_type_irr")
    public IrrigationsTypes getIrrigationsTypes() {
        return this.irrigationsTypes;
    }
    
    public void setIrrigationsTypes(IrrigationsTypes irrigationsTypes) {
        this.irrigationsTypes = irrigationsTypes;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_production_event_irr", nullable=false)
    public ProductionEvents getProductionEvents() {
        return this.productionEvents;
    }
    
    public void setProductionEvents(ProductionEvents productionEvents) {
        this.productionEvents = productionEvents;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="water_source_irr")
    public WaterSourcesTypes getWaterSourcesTypes() {
        return this.waterSourcesTypes;
    }
    
    public void setWaterSourcesTypes(WaterSourcesTypes waterSourcesTypes) {
        this.waterSourcesTypes = waterSourcesTypes;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_irr", nullable=false, length=19)
    public Date getDateIrr() {
        return this.dateIrr;
    }
    
    public void setDateIrr(Date dateIrr) {
        this.dateIrr = dateIrr;
    }
    
    @Column(name="use_irrigation_irr")
    public Boolean getUseIrrigationIrr() {
        return this.useIrrigationIrr;
    }
    
    public void setUseIrrigationIrr(Boolean useIrrigationIrr) {
        this.useIrrigationIrr = useIrrigationIrr;
    }
    
    @Column(name="amount_irr", precision=22, scale=0)
    public Double getAmountIrr() {
        return this.amountIrr;
    }
    
    public void setAmountIrr(Double amountIrr) {
        this.amountIrr = amountIrr;
    }




}


