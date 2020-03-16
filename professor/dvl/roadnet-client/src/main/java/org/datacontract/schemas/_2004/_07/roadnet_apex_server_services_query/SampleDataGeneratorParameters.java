
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SampleDataGeneratorParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SampleDataGeneratorParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClearDataWarehouse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GenerateDepotLessRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoutesPerDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StagedRoutesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="StopsPerRoute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UseOperationalHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleDataGeneratorParameters", propOrder = {
    "clearDataWarehouse",
    "generateDepotLessRoutes",
    "numberOfDays",
    "routesPerDay",
    "stagedRoutesOnly",
    "startDate",
    "stopsPerRoute",
    "useOperationalHierarchy"
})
public class SampleDataGeneratorParameters {

    @XmlElement(name = "ClearDataWarehouse")
    protected Boolean clearDataWarehouse;
    @XmlElement(name = "GenerateDepotLessRoutes")
    protected Boolean generateDepotLessRoutes;
    @XmlElement(name = "NumberOfDays")
    protected Integer numberOfDays;
    @XmlElement(name = "RoutesPerDay")
    protected Integer routesPerDay;
    @XmlElement(name = "StagedRoutesOnly")
    protected Boolean stagedRoutesOnly;
    @XmlElementRef(name = "StartDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElement(name = "StopsPerRoute")
    protected Integer stopsPerRoute;
    @XmlElement(name = "UseOperationalHierarchy")
    protected Boolean useOperationalHierarchy;

    /**
     * Obtém o valor da propriedade clearDataWarehouse.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClearDataWarehouse() {
        return clearDataWarehouse;
    }

    /**
     * Define o valor da propriedade clearDataWarehouse.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearDataWarehouse(Boolean value) {
        this.clearDataWarehouse = value;
    }

    /**
     * Obtém o valor da propriedade generateDepotLessRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateDepotLessRoutes() {
        return generateDepotLessRoutes;
    }

    /**
     * Define o valor da propriedade generateDepotLessRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateDepotLessRoutes(Boolean value) {
        this.generateDepotLessRoutes = value;
    }

    /**
     * Obtém o valor da propriedade numberOfDays.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Define o valor da propriedade numberOfDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDays(Integer value) {
        this.numberOfDays = value;
    }

    /**
     * Obtém o valor da propriedade routesPerDay.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoutesPerDay() {
        return routesPerDay;
    }

    /**
     * Define o valor da propriedade routesPerDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoutesPerDay(Integer value) {
        this.routesPerDay = value;
    }

    /**
     * Obtém o valor da propriedade stagedRoutesOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStagedRoutesOnly() {
        return stagedRoutesOnly;
    }

    /**
     * Define o valor da propriedade stagedRoutesOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStagedRoutesOnly(Boolean value) {
        this.stagedRoutesOnly = value;
    }

    /**
     * Obtém o valor da propriedade startDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Define o valor da propriedade startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
    }

    /**
     * Obtém o valor da propriedade stopsPerRoute.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStopsPerRoute() {
        return stopsPerRoute;
    }

    /**
     * Define o valor da propriedade stopsPerRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStopsPerRoute(Integer value) {
        this.stopsPerRoute = value;
    }

    /**
     * Obtém o valor da propriedade useOperationalHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOperationalHierarchy() {
        return useOperationalHierarchy;
    }

    /**
     * Define o valor da propriedade useOperationalHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOperationalHierarchy(Boolean value) {
        this.useOperationalHierarchy = value;
    }

}
