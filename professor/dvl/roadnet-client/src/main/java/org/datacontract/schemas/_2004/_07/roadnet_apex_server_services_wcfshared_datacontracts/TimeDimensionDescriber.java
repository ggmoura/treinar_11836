
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TimeDimensionDescriber complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeDimensionDescriber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDescriber"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SecondaryTimeUnitSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_SecondaryTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_TimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDimensionDescriber", propOrder = {
    "secondaryTimeUnitSpecified",
    "timeUnitSecondaryTimeUnit",
    "timeUnitTimeUnit"
})
public class TimeDimensionDescriber
    extends DimensionDescriber
{

    @XmlElement(name = "SecondaryTimeUnitSpecified")
    protected Boolean secondaryTimeUnitSpecified;
    @XmlElementRef(name = "TimeUnit_SecondaryTimeUnit", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeUnitSecondaryTimeUnit;
    @XmlElementRef(name = "TimeUnit_TimeUnit", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeUnitTimeUnit;

    /**
     * Obtém o valor da propriedade secondaryTimeUnitSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecondaryTimeUnitSpecified() {
        return secondaryTimeUnitSpecified;
    }

    /**
     * Define o valor da propriedade secondaryTimeUnitSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecondaryTimeUnitSpecified(Boolean value) {
        this.secondaryTimeUnitSpecified = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitSecondaryTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeUnitSecondaryTimeUnit() {
        return timeUnitSecondaryTimeUnit;
    }

    /**
     * Define o valor da propriedade timeUnitSecondaryTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeUnitSecondaryTimeUnit(JAXBElement<String> value) {
        this.timeUnitSecondaryTimeUnit = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeUnitTimeUnit() {
        return timeUnitTimeUnit;
    }

    /**
     * Define o valor da propriedade timeUnitTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeUnitTimeUnit(JAXBElement<String> value) {
        this.timeUnitTimeUnit = value;
    }

}
