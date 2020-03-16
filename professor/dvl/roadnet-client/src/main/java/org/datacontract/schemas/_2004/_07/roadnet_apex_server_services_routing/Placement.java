
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.DomainInstance;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Placement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Placement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="TargetServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Placement", propOrder = {
    "routeInstance",
    "targetServicePatternEntityKey"
})
@XmlSeeAlso({
    OnStopPlacement.class,
    OnRoutePlacement.class,
    OnDeviceStopPlacement.class,
    OnRouteByIndicesPlacement.class,
    OnTerritoryPlacement.class,
    OnTerritoryAndRoutesPlacement.class
})
public class Placement
    extends DataTransferObject
{

    @XmlElementRef(name = "RouteInstance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> routeInstance;
    @XmlElementRef(name = "TargetServicePatternEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> targetServicePatternEntityKey;

    /**
     * Obtém o valor da propriedade routeInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getRouteInstance() {
        return routeInstance;
    }

    /**
     * Define o valor da propriedade routeInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setRouteInstance(JAXBElement<DomainInstance> value) {
        this.routeInstance = value;
    }

    /**
     * Obtém o valor da propriedade targetServicePatternEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTargetServicePatternEntityKey() {
        return targetServicePatternEntityKey;
    }

    /**
     * Define o valor da propriedade targetServicePatternEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTargetServicePatternEntityKey(JAXBElement<Long> value) {
        this.targetServicePatternEntityKey = value;
    }

}
