package org.aepscolombia.platform.models.entity;
// Generated Jan 21, 2014 11:35:29 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Harvests generated by hbm2java
 */
@Entity
@Table(name="harvests"
    ,catalog="madr_bd11"
)
public class Harvests  implements java.io.Serializable {


     private Integer idHar;
     private HarvestMethods harvestMethods;
     private ProductionEvents productionEvents;
     private Date dateHar;
     private String commentHar;

    public Harvests() {
    }

	
    public Harvests(ProductionEvents productionEvents, Date dateHar) {
        this.productionEvents = productionEvents;
        this.dateHar = dateHar;
    }
    public Harvests(HarvestMethods harvestMethods, ProductionEvents productionEvents, Date dateHar, String commentHar) {
       this.harvestMethods = harvestMethods;
       this.productionEvents = productionEvents;
       this.dateHar = dateHar;
       this.commentHar = commentHar;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_har", unique=true, nullable=false)
    public Integer getIdHar() {
        return this.idHar;
    }
    
    public void setIdHar(Integer idHar) {
        this.idHar = idHar;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="method_har")
    public HarvestMethods getHarvestMethods() {
        return this.harvestMethods;
    }
    
    public void setHarvestMethods(HarvestMethods harvestMethods) {
        this.harvestMethods = harvestMethods;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_production_event_har", nullable=false)
    public ProductionEvents getProductionEvents() {
        return this.productionEvents;
    }
    
    public void setProductionEvents(ProductionEvents productionEvents) {
        this.productionEvents = productionEvents;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_har", nullable=false, length=19)
    public Date getDateHar() {
        return this.dateHar;
    }
    
    public void setDateHar(Date dateHar) {
        this.dateHar = dateHar;
    }
    
    @Column(name="comment_har", length=65535)
    public String getCommentHar() {
        return this.commentHar;
    }
    
    public void setCommentHar(String commentHar) {
        this.commentHar = commentHar;
    }

}


