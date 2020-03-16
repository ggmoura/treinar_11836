
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de ServiceableStopServiceTimeDeviationDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceableStopServiceTimeDeviationDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPlannedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTimeVariance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceableStopServiceTimeDeviationDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "totalPlannedServiceTime",
    "totalServiceTime",
    "totalServiceTimeVariance"
})
public class ServiceableStopServiceTimeDeviationDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElement(name = "TotalPlannedServiceTime")
    protected Duration totalPlannedServiceTime;
    @XmlElement(name = "TotalServiceTime")
    protected Duration totalServiceTime;
    @XmlElement(name = "TotalServiceTimeVariance")
    protected Duration totalServiceTimeVariance;

    /**
     * Obtém o valor da propriedade totalPlannedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalPlannedServiceTime() {
        return totalPlannedServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalPlannedServiceTime(Duration value) {
        this.totalPlannedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalServiceTime() {
        return totalServiceTime;
    }

    /**
     * Define o valor da propriedade totalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalServiceTime(Duration value) {
        this.totalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTimeVariance.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalServiceTimeVariance() {
        return totalServiceTimeVariance;
    }

    /**
     * Define o valor da propriedade totalServiceTimeVariance.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalServiceTimeVariance(Duration value) {
        this.totalServiceTimeVariance = value;
    }

}
