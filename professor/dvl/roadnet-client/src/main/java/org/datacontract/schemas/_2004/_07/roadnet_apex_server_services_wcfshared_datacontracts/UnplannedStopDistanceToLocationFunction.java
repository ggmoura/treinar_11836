
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.roadnet.apex.datacontracts.Distance;


/**
 * <p>Classe Java de UnplannedStopDistanceToLocationFunction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UnplannedStopDistanceToLocationFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionRuleFunction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimit" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ViolationRadius" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnplannedStopDistanceToLocationFunction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "locationEntityKeys",
    "timeLimit",
    "violationRadius"
})
public class UnplannedStopDistanceToLocationFunction
    extends ResourceExceptionRuleFunction
{

    @XmlElementRef(name = "LocationEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> locationEntityKeys;
    @XmlElement(name = "TimeLimit")
    protected Duration timeLimit;
    @XmlElementRef(name = "ViolationRadius", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> violationRadius;

    /**
     * Obtém o valor da propriedade locationEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getLocationEntityKeys() {
        return locationEntityKeys;
    }

    /**
     * Define o valor da propriedade locationEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setLocationEntityKeys(JAXBElement<ArrayOflong> value) {
        this.locationEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade timeLimit.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLimit() {
        return timeLimit;
    }

    /**
     * Define o valor da propriedade timeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLimit(Duration value) {
        this.timeLimit = value;
    }

    /**
     * Obtém o valor da propriedade violationRadius.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getViolationRadius() {
        return violationRadius;
    }

    /**
     * Define o valor da propriedade violationRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setViolationRadius(JAXBElement<Distance> value) {
        this.violationRadius = value;
    }

}
