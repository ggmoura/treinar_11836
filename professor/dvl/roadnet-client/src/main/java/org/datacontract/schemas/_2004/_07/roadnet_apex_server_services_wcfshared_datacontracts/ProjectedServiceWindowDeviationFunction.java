
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de ProjectedServiceWindowDeviationFunction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProjectedServiceWindowDeviationFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionRuleFunction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EarlyServiceWindowBuffer" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreEarlyArrivals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LateServiceWindowBuffer" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedServiceWindowDeviationFunction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "earlyServiceWindowBuffer",
    "ignoreEarlyArrivals",
    "lateServiceWindowBuffer"
})
public class ProjectedServiceWindowDeviationFunction
    extends ResourceExceptionRuleFunction
{

    @XmlElement(name = "EarlyServiceWindowBuffer")
    protected Duration earlyServiceWindowBuffer;
    @XmlElement(name = "IgnoreEarlyArrivals")
    protected Boolean ignoreEarlyArrivals;
    @XmlElement(name = "LateServiceWindowBuffer")
    protected Duration lateServiceWindowBuffer;

    /**
     * Obtém o valor da propriedade earlyServiceWindowBuffer.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEarlyServiceWindowBuffer() {
        return earlyServiceWindowBuffer;
    }

    /**
     * Define o valor da propriedade earlyServiceWindowBuffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEarlyServiceWindowBuffer(Duration value) {
        this.earlyServiceWindowBuffer = value;
    }

    /**
     * Obtém o valor da propriedade ignoreEarlyArrivals.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreEarlyArrivals() {
        return ignoreEarlyArrivals;
    }

    /**
     * Define o valor da propriedade ignoreEarlyArrivals.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreEarlyArrivals(Boolean value) {
        this.ignoreEarlyArrivals = value;
    }

    /**
     * Obtém o valor da propriedade lateServiceWindowBuffer.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLateServiceWindowBuffer() {
        return lateServiceWindowBuffer;
    }

    /**
     * Define o valor da propriedade lateServiceWindowBuffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLateServiceWindowBuffer(Duration value) {
        this.lateServiceWindowBuffer = value;
    }

}
