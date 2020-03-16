
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de TravelPathResultPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TravelPathResultPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArcIDs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPathErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPointIndices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Directions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPathResultPropertyOptions", propOrder = {
    "arcIDs",
    "cost",
    "destinationPathErrors",
    "destinationPointIndices",
    "directions",
    "path"
})
public class TravelPathResultPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "ArcIDs")
    protected Boolean arcIDs;
    @XmlElement(name = "Cost")
    protected Boolean cost;
    @XmlElement(name = "DestinationPathErrors")
    protected Boolean destinationPathErrors;
    @XmlElement(name = "DestinationPointIndices")
    protected Boolean destinationPointIndices;
    @XmlElement(name = "Directions")
    protected Boolean directions;
    @XmlElement(name = "Path")
    protected Boolean path;

    /**
     * Obtém o valor da propriedade arcIDs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArcIDs() {
        return arcIDs;
    }

    /**
     * Define o valor da propriedade arcIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArcIDs(Boolean value) {
        this.arcIDs = value;
    }

    /**
     * Obtém o valor da propriedade cost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCost() {
        return cost;
    }

    /**
     * Define o valor da propriedade cost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCost(Boolean value) {
        this.cost = value;
    }

    /**
     * Obtém o valor da propriedade destinationPathErrors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationPathErrors() {
        return destinationPathErrors;
    }

    /**
     * Define o valor da propriedade destinationPathErrors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationPathErrors(Boolean value) {
        this.destinationPathErrors = value;
    }

    /**
     * Obtém o valor da propriedade destinationPointIndices.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationPointIndices() {
        return destinationPointIndices;
    }

    /**
     * Define o valor da propriedade destinationPointIndices.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationPointIndices(Boolean value) {
        this.destinationPointIndices = value;
    }

    /**
     * Obtém o valor da propriedade directions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirections() {
        return directions;
    }

    /**
     * Define o valor da propriedade directions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirections(Boolean value) {
        this.directions = value;
    }

    /**
     * Obtém o valor da propriedade path.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPath() {
        return path;
    }

    /**
     * Define o valor da propriedade path.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPath(Boolean value) {
        this.path = value;
    }

}
