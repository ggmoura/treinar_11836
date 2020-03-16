
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfSaveTerritoryArgs;
import com.roadnet.apex.datacontracts.RegionContext;
import com.roadnet.apex.datacontracts.TerritoryPropertyOptions;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://roadnet.com/apex/DataContracts/}RegionContext" minOccurs="0"/&gt;
 *         &lt;element name="territoryArgsList" type="{http://roadnet.com/apex/DataContracts/}ArrayOfSaveTerritoryArgs" minOccurs="0"/&gt;
 *         &lt;element name="propertyOptions" type="{http://roadnet.com/apex/DataContracts/}TerritoryPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "territoryArgsList",
    "propertyOptions"
})
@XmlRootElement(name = "UpdateTerritories")
public class UpdateTerritories {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "territoryArgsList", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveTerritoryArgs> territoryArgsList;
    @XmlElementRef(name = "propertyOptions", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<TerritoryPropertyOptions> propertyOptions;

    /**
     * Obtém o valor da propriedade context.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public JAXBElement<RegionContext> getContext() {
        return context;
    }

    /**
     * Define o valor da propriedade context.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public void setContext(JAXBElement<RegionContext> value) {
        this.context = value;
    }

    /**
     * Obtém o valor da propriedade territoryArgsList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveTerritoryArgs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveTerritoryArgs> getTerritoryArgsList() {
        return territoryArgsList;
    }

    /**
     * Define o valor da propriedade territoryArgsList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveTerritoryArgs }{@code >}
     *     
     */
    public void setTerritoryArgsList(JAXBElement<ArrayOfSaveTerritoryArgs> value) {
        this.territoryArgsList = value;
    }

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerritoryPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TerritoryPropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerritoryPropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<TerritoryPropertyOptions> value) {
        this.propertyOptions = value;
    }

}
