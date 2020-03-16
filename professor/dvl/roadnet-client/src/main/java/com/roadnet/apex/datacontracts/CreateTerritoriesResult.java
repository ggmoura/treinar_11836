
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CreateTerritoriesResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateTerritoriesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfOrdersNotRouted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrdersRouted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTerritoriesCreated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTerritoriesDeleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTerritoriesModified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_ConstraintsEncountered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTerritoriesResult", propOrder = {
    "numberOfOrdersNotRouted",
    "numberOfOrdersRouted",
    "numberOfTerritoriesCreated",
    "numberOfTerritoriesDeleted",
    "numberOfTerritoriesModified",
    "routeConstraintFlagsConstraintsEncountered"
})
public class CreateTerritoriesResult
    extends DataTransferObject
{

    @XmlElement(name = "NumberOfOrdersNotRouted")
    protected Integer numberOfOrdersNotRouted;
    @XmlElement(name = "NumberOfOrdersRouted")
    protected Integer numberOfOrdersRouted;
    @XmlElement(name = "NumberOfTerritoriesCreated")
    protected Integer numberOfTerritoriesCreated;
    @XmlElement(name = "NumberOfTerritoriesDeleted")
    protected Integer numberOfTerritoriesDeleted;
    @XmlElement(name = "NumberOfTerritoriesModified")
    protected Integer numberOfTerritoriesModified;
    @XmlElementRef(name = "RouteConstraintFlags_ConstraintsEncountered", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsConstraintsEncountered;

    /**
     * Obtém o valor da propriedade numberOfOrdersNotRouted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOrdersNotRouted() {
        return numberOfOrdersNotRouted;
    }

    /**
     * Define o valor da propriedade numberOfOrdersNotRouted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOrdersNotRouted(Integer value) {
        this.numberOfOrdersNotRouted = value;
    }

    /**
     * Obtém o valor da propriedade numberOfOrdersRouted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOrdersRouted() {
        return numberOfOrdersRouted;
    }

    /**
     * Define o valor da propriedade numberOfOrdersRouted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOrdersRouted(Integer value) {
        this.numberOfOrdersRouted = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTerritoriesCreated.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTerritoriesCreated() {
        return numberOfTerritoriesCreated;
    }

    /**
     * Define o valor da propriedade numberOfTerritoriesCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTerritoriesCreated(Integer value) {
        this.numberOfTerritoriesCreated = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTerritoriesDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTerritoriesDeleted() {
        return numberOfTerritoriesDeleted;
    }

    /**
     * Define o valor da propriedade numberOfTerritoriesDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTerritoriesDeleted(Integer value) {
        this.numberOfTerritoriesDeleted = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTerritoriesModified.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTerritoriesModified() {
        return numberOfTerritoriesModified;
    }

    /**
     * Define o valor da propriedade numberOfTerritoriesModified.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTerritoriesModified(Integer value) {
        this.numberOfTerritoriesModified = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsConstraintsEncountered() {
        return routeConstraintFlagsConstraintsEncountered;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsConstraintsEncountered(JAXBElement<String> value) {
        this.routeConstraintFlagsConstraintsEncountered = value;
    }

}
