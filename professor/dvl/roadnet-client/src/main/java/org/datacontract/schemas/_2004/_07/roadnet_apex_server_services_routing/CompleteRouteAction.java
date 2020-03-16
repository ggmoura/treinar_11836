
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.QualityPairedDateTime;
import com.roadnet.apex.datacontracts.QualityPairedDistance;


/**
 * <p>Classe Java de CompleteRouteAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompleteRouteAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompletionTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDestination" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDistance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteRouteAction", propOrder = {
    "completionTime",
    "distanceToDestination"
})
public class CompleteRouteAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "CompletionTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> completionTime;
    @XmlElementRef(name = "DistanceToDestination", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDistance> distanceToDestination;

    /**
     * Obtém o valor da propriedade completionTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getCompletionTime() {
        return completionTime;
    }

    /**
     * Define o valor da propriedade completionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setCompletionTime(JAXBElement<QualityPairedDateTime> value) {
        this.completionTime = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDistance> getDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Define o valor da propriedade distanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}
     *     
     */
    public void setDistanceToDestination(JAXBElement<QualityPairedDistance> value) {
        this.distanceToDestination = value;
    }

}
