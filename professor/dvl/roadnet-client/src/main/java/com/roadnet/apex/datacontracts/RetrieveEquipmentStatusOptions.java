
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de RetrieveEquipmentStatusOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEquipmentStatusOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepotEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveActiveEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveEquipmentWithSecurityAlertsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveInactiveEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveInactiveForLessThan24Hours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveInactiveForMoreThan24Hours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveInsideDepotServiceAreas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveOutsideDepotServiceAreas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetrievePowerUnitsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEquipmentStatusOptions", propOrder = {
    "depotEntityKeys",
    "retrieveActiveEquipment",
    "retrieveEquipmentWithSecurityAlertsOnly",
    "retrieveInactiveEquipment",
    "retrieveInactiveForLessThan24Hours",
    "retrieveInactiveForMoreThan24Hours",
    "retrieveInsideDepotServiceAreas",
    "retrieveOutsideDepotServiceAreas",
    "retrievePowerUnitsOnly"
})
@XmlSeeAlso({
    RetrieveEquipmentStatusDetailsOptions.class
})
public class RetrieveEquipmentStatusOptions {

    @XmlElementRef(name = "DepotEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> depotEntityKeys;
    @XmlElement(name = "RetrieveActiveEquipment")
    protected Boolean retrieveActiveEquipment;
    @XmlElement(name = "RetrieveEquipmentWithSecurityAlertsOnly")
    protected Boolean retrieveEquipmentWithSecurityAlertsOnly;
    @XmlElement(name = "RetrieveInactiveEquipment")
    protected Boolean retrieveInactiveEquipment;
    @XmlElement(name = "RetrieveInactiveForLessThan24Hours")
    protected Boolean retrieveInactiveForLessThan24Hours;
    @XmlElement(name = "RetrieveInactiveForMoreThan24Hours")
    protected Boolean retrieveInactiveForMoreThan24Hours;
    @XmlElement(name = "RetrieveInsideDepotServiceAreas")
    protected Boolean retrieveInsideDepotServiceAreas;
    @XmlElement(name = "RetrieveOutsideDepotServiceAreas")
    protected Boolean retrieveOutsideDepotServiceAreas;
    @XmlElement(name = "RetrievePowerUnitsOnly")
    protected Boolean retrievePowerUnitsOnly;

    /**
     * Obtém o valor da propriedade depotEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getDepotEntityKeys() {
        return depotEntityKeys;
    }

    /**
     * Define o valor da propriedade depotEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setDepotEntityKeys(JAXBElement<ArrayOflong> value) {
        this.depotEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade retrieveActiveEquipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveActiveEquipment() {
        return retrieveActiveEquipment;
    }

    /**
     * Define o valor da propriedade retrieveActiveEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveActiveEquipment(Boolean value) {
        this.retrieveActiveEquipment = value;
    }

    /**
     * Obtém o valor da propriedade retrieveEquipmentWithSecurityAlertsOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveEquipmentWithSecurityAlertsOnly() {
        return retrieveEquipmentWithSecurityAlertsOnly;
    }

    /**
     * Define o valor da propriedade retrieveEquipmentWithSecurityAlertsOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveEquipmentWithSecurityAlertsOnly(Boolean value) {
        this.retrieveEquipmentWithSecurityAlertsOnly = value;
    }

    /**
     * Obtém o valor da propriedade retrieveInactiveEquipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveInactiveEquipment() {
        return retrieveInactiveEquipment;
    }

    /**
     * Define o valor da propriedade retrieveInactiveEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveInactiveEquipment(Boolean value) {
        this.retrieveInactiveEquipment = value;
    }

    /**
     * Obtém o valor da propriedade retrieveInactiveForLessThan24Hours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveInactiveForLessThan24Hours() {
        return retrieveInactiveForLessThan24Hours;
    }

    /**
     * Define o valor da propriedade retrieveInactiveForLessThan24Hours.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveInactiveForLessThan24Hours(Boolean value) {
        this.retrieveInactiveForLessThan24Hours = value;
    }

    /**
     * Obtém o valor da propriedade retrieveInactiveForMoreThan24Hours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveInactiveForMoreThan24Hours() {
        return retrieveInactiveForMoreThan24Hours;
    }

    /**
     * Define o valor da propriedade retrieveInactiveForMoreThan24Hours.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveInactiveForMoreThan24Hours(Boolean value) {
        this.retrieveInactiveForMoreThan24Hours = value;
    }

    /**
     * Obtém o valor da propriedade retrieveInsideDepotServiceAreas.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveInsideDepotServiceAreas() {
        return retrieveInsideDepotServiceAreas;
    }

    /**
     * Define o valor da propriedade retrieveInsideDepotServiceAreas.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveInsideDepotServiceAreas(Boolean value) {
        this.retrieveInsideDepotServiceAreas = value;
    }

    /**
     * Obtém o valor da propriedade retrieveOutsideDepotServiceAreas.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveOutsideDepotServiceAreas() {
        return retrieveOutsideDepotServiceAreas;
    }

    /**
     * Define o valor da propriedade retrieveOutsideDepotServiceAreas.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveOutsideDepotServiceAreas(Boolean value) {
        this.retrieveOutsideDepotServiceAreas = value;
    }

    /**
     * Obtém o valor da propriedade retrievePowerUnitsOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrievePowerUnitsOnly() {
        return retrievePowerUnitsOnly;
    }

    /**
     * Define o valor da propriedade retrievePowerUnitsOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrievePowerUnitsOnly(Boolean value) {
        this.retrievePowerUnitsOnly = value;
    }

}
