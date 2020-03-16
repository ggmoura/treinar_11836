
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de UpdateRouteFromPointsArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateRouteFromPointsArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="ReturnPropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SaveStopFromPointArgsList" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfSaveStopFromPointArgs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRouteFromPointsArgs", propOrder = {
    "returnInclusionMode",
    "returnPropertyOptions",
    "routeEntityKey",
    "saveStopFromPointArgsList"
})
public class UpdateRouteFromPointsArgs
    extends DataTransferObject
{

    @XmlElement(name = "ReturnInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode returnInclusionMode;
    @XmlElementRef(name = "ReturnPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyOptions> returnPropertyOptions;
    @XmlElement(name = "RouteEntityKey")
    protected Long routeEntityKey;
    @XmlElementRef(name = "SaveStopFromPointArgsList", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveStopFromPointArgs> saveStopFromPointArgsList;

    /**
     * Obtém o valor da propriedade returnInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getReturnInclusionMode() {
        return returnInclusionMode;
    }

    /**
     * Define o valor da propriedade returnInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setReturnInclusionMode(PropertyInclusionMode value) {
        this.returnInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade returnPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public JAXBElement<PropertyOptions> getReturnPropertyOptions() {
        return returnPropertyOptions;
    }

    /**
     * Define o valor da propriedade returnPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public void setReturnPropertyOptions(JAXBElement<PropertyOptions> value) {
        this.returnPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouteEntityKey(Long value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade saveStopFromPointArgsList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveStopFromPointArgs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveStopFromPointArgs> getSaveStopFromPointArgsList() {
        return saveStopFromPointArgsList;
    }

    /**
     * Define o valor da propriedade saveStopFromPointArgsList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveStopFromPointArgs }{@code >}
     *     
     */
    public void setSaveStopFromPointArgsList(JAXBElement<ArrayOfSaveStopFromPointArgs> value) {
        this.saveStopFromPointArgsList = value;
    }

}
