
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;


/**
 * <p>Classe Java de NavClientRoutePathDeviationDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavClientRoutePathDeviationDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviationDistanceThreshold" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EndDeviationPoint" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="EndDeviationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaxDeviatedDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TimeInDeviation" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavClientRoutePathDeviationDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "deviationDistanceThreshold",
    "endDeviationPoint",
    "endDeviationTimestamp",
    "maxDeviatedDistance",
    "timeInDeviation"
})
public class NavClientRoutePathDeviationDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElementRef(name = "DeviationDistanceThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> deviationDistanceThreshold;
    @XmlElementRef(name = "EndDeviationPoint", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> endDeviationPoint;
    @XmlElement(name = "EndDeviationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDeviationTimestamp;
    @XmlElementRef(name = "MaxDeviatedDistance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> maxDeviatedDistance;
    @XmlElement(name = "TimeInDeviation")
    protected Duration timeInDeviation;

    /**
     * Obtém o valor da propriedade deviationDistanceThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDeviationDistanceThreshold() {
        return deviationDistanceThreshold;
    }

    /**
     * Define o valor da propriedade deviationDistanceThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDeviationDistanceThreshold(JAXBElement<Distance> value) {
        this.deviationDistanceThreshold = value;
    }

    /**
     * Obtém o valor da propriedade endDeviationPoint.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getEndDeviationPoint() {
        return endDeviationPoint;
    }

    /**
     * Define o valor da propriedade endDeviationPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setEndDeviationPoint(JAXBElement<Coordinate> value) {
        this.endDeviationPoint = value;
    }

    /**
     * Obtém o valor da propriedade endDeviationTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDeviationTimestamp() {
        return endDeviationTimestamp;
    }

    /**
     * Define o valor da propriedade endDeviationTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDeviationTimestamp(XMLGregorianCalendar value) {
        this.endDeviationTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade maxDeviatedDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getMaxDeviatedDistance() {
        return maxDeviatedDistance;
    }

    /**
     * Define o valor da propriedade maxDeviatedDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setMaxDeviatedDistance(JAXBElement<Distance> value) {
        this.maxDeviatedDistance = value;
    }

    /**
     * Obtém o valor da propriedade timeInDeviation.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeInDeviation() {
        return timeInDeviation;
    }

    /**
     * Define o valor da propriedade timeInDeviation.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeInDeviation(Duration value) {
        this.timeInDeviation = value;
    }

}
