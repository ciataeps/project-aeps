package org.aepscolombia.platform.models.entity;
// Generated Nov 13, 2015 9:48:26 AM by Hibernate Tools 3.6.0


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
 * ProductsControls generated by hbm2java
 */
@Entity
@Table(name="products_controls")
public class ProductsControls  implements java.io.Serializable {


    private Integer idProCon;
    private Controls controls;
    private OrganicControls organicControls;
    private DoseUnits doseUnits;
    private Diseases diseases;
    private ChemicalsControls chemicalsControls;
    private TargetsTypes targetsTypes;
    private Pests pests;
    private Weeds weeds;
    private ControlsTypes controlsTypes;
    private Double dosisProCon;
    private String otherPestProCon;
    private String otherDiseaseProCon;
    private String otroWeedProCon;
    private String otherChemicalProductProCon;
    private String otherOrganicProductProCon;
    private Boolean status;
    private Integer createdBy;

    public ProductsControls() {
    }
	
    public ProductsControls(Controls controls, ControlsTypes controlsTypes) {
        this.controls = controls;
        this.controlsTypes = controlsTypes;
    }
    
    public ProductsControls(Controls controls, OrganicControls organicControls, DoseUnits doseUnits, Diseases diseases, ChemicalsControls chemicalsControls, TargetsTypes targetsTypes, Pests pests, Weeds weeds, ControlsTypes controlsTypes, Double dosisProCon, String otherPestProCon, String otherDiseaseProCon, String otroWeedProCon, String otherChemicalProductProCon, String otherOrganicProductProCon, Boolean status, Integer createdBy) {
       this.controls = controls;
       this.organicControls = organicControls;
       this.doseUnits = doseUnits;
       this.diseases = diseases;
       this.chemicalsControls = chemicalsControls;
       this.targetsTypes = targetsTypes;
       this.pests = pests;
       this.weeds = weeds;
       this.controlsTypes = controlsTypes;
       this.dosisProCon = dosisProCon;
       this.otherPestProCon = otherPestProCon;
       this.otherDiseaseProCon = otherDiseaseProCon;
       this.otroWeedProCon = otroWeedProCon;
       this.otherChemicalProductProCon = otherChemicalProductProCon;
       this.otherOrganicProductProCon = otherOrganicProductProCon;
       this.status = status;
       this.createdBy = createdBy;
    }
    
    @Id @GeneratedValue(strategy=IDENTITY)    
    @Column(name="id_pro_con", unique=true, nullable=false)
    public Integer getIdProCon() {
        return this.idProCon;
    }
    
    public void setIdProCon(Integer idProCon) {
        this.idProCon = idProCon;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_control_pro_con", nullable=false)
    public Controls getControls() {
        return this.controls;
    }
    
    public void setControls(Controls controls) {
        this.controls = controls;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="organic_product_used_pro_con")
    public OrganicControls getOrganicControls() {
        return this.organicControls;
    }
    
    public void setOrganicControls(OrganicControls organicControls) {
        this.organicControls = organicControls;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="dose_units_pro_con")
    public DoseUnits getDoseUnits() {
        return this.doseUnits;
    }
    
    public void setDoseUnits(DoseUnits doseUnits) {
        this.doseUnits = doseUnits;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_disease_pro_con")
    public Diseases getDiseases() {
        return this.diseases;
    }
    
    public void setDiseases(Diseases diseases) {
        this.diseases = diseases;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="chemical_product_used_pro_con")
    public ChemicalsControls getChemicalsControls() {
        return this.chemicalsControls;
    }
    
    public void setChemicalsControls(ChemicalsControls chemicalsControls) {
        this.chemicalsControls = chemicalsControls;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="target_type_pro_con")
    public TargetsTypes getTargetsTypes() {
        return this.targetsTypes;
    }
    
    public void setTargetsTypes(TargetsTypes targetsTypes) {
        this.targetsTypes = targetsTypes;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_pest_pro_con")
    public Pests getPests() {
        return this.pests;
    }
    
    public void setPests(Pests pests) {
        this.pests = pests;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_weed_pro_con")
    public Weeds getWeeds() {
        return this.weeds;
    }
    
    public void setWeeds(Weeds weeds) {
        this.weeds = weeds;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="control_type_pro_con", nullable=false)
    public ControlsTypes getControlsTypes() {
        return this.controlsTypes;
    }
    
    public void setControlsTypes(ControlsTypes controlsTypes) {
        this.controlsTypes = controlsTypes;
    }

    
    @Column(name="dosis_pro_con", precision=22, scale=0)
    public Double getDosisProCon() {
        return this.dosisProCon;
    }
    
    public void setDosisProCon(Double dosisProCon) {
        this.dosisProCon = dosisProCon;
    }

    
    @Column(name="other_pest_pro_con", length=65535)
    public String getOtherPestProCon() {
        return this.otherPestProCon;
    }
    
    public void setOtherPestProCon(String otherPestProCon) {
        this.otherPestProCon = otherPestProCon;
    }

    
    @Column(name="other_disease_pro_con", length=65535)
    public String getOtherDiseaseProCon() {
        return this.otherDiseaseProCon;
    }
    
    public void setOtherDiseaseProCon(String otherDiseaseProCon) {
        this.otherDiseaseProCon = otherDiseaseProCon;
    }

    
    @Column(name="otro_weed_pro_con", length=65535)
    public String getOtroWeedProCon() {
        return this.otroWeedProCon;
    }
    
    public void setOtroWeedProCon(String otroWeedProCon) {
        this.otroWeedProCon = otroWeedProCon;
    }

    
    @Column(name="other_chemical_product_pro_con", length=65535)
    public String getOtherChemicalProductProCon() {
        return this.otherChemicalProductProCon;
    }
    
    public void setOtherChemicalProductProCon(String otherChemicalProductProCon) {
        this.otherChemicalProductProCon = otherChemicalProductProCon;
    }

    
    @Column(name="other_organic_product_pro_con", length=65535)
    public String getOtherOrganicProductProCon() {
        return this.otherOrganicProductProCon;
    }
    
    public void setOtherOrganicProductProCon(String otherOrganicProductProCon) {
        this.otherOrganicProductProCon = otherOrganicProductProCon;
    }

    
    @Column(name="status")
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }

    
    @Column(name="created_by")
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

}


