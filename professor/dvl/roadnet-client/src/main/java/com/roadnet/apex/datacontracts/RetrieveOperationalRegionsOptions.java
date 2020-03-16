
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveOperationalRegionsOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveOperationalRegionsOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RegionPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}RegionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ReturnSingleRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOperationalRegionsOptions", propOrder = {
    "regionEntityKey",
    "regionPropertyOptions",
    "returnSingleRegion",
    "workerEntityKey"
})
public class RetrieveOperationalRegionsOptions {

    @XmlElementRef(name = "RegionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> regionEntityKey;
    @XmlElementRef(name = "RegionPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionPropertyOptions> regionPropertyOptions;
    @XmlElement(name = "ReturnSingleRegion")
    protected Boolean returnSingleRegion;
    @XmlElementRef(name = "WorkerEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> workerEntityKey;

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRegionEntityKey(JAXBElement<Long> value) {
        this.regionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade regionPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RegionPropertyOptions> getRegionPropertyOptions() {
        return regionPropertyOptions;
    }

    /**
     * Define o valor da propriedade regionPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionPropertyOptions }{@code >}
     *     
     */
    public void setRegionPropertyOptions(JAXBElement<RegionPropertyOptions> value) {
        this.regionPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade returnSingleRegion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSingleRegion() {
        return returnSingleRegion;
    }

    /**
     * Define o valor da propriedade returnSingleRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSingleRegion(Boolean value) {
        this.returnSingleRegion = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setWorkerEntityKey(JAXBElement<Long> value) {
        this.workerEntityKey = value;
    }

}
