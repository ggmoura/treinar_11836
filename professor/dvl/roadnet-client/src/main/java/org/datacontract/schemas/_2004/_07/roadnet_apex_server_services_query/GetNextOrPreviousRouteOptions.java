
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RoutePropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;


/**
 * <p>Classe Java de GetNextOrPreviousRouteOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetNextOrPreviousRouteOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReturnInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="ReturnPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}RoutePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNextOrPreviousRouteOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", propOrder = {
    "equipmentEntityKey",
    "returnInclusionMode",
    "returnPropertyOptions",
    "routeEntityKey",
    "workerEntityKey"
})
public class GetNextOrPreviousRouteOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "EquipmentEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentEntityKey;
    @XmlElement(name = "ReturnInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode returnInclusionMode;
    @XmlElementRef(name = "ReturnPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyOptions> returnPropertyOptions;
    @XmlElement(name = "RouteEntityKey")
    protected Long routeEntityKey;
    @XmlElementRef(name = "WorkerEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> workerEntityKey;

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentEntityKey(JAXBElement<Long> value) {
        this.equipmentEntityKey = value;
    }

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
     *     {@link JAXBElement }{@code <}{@link RoutePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RoutePropertyOptions> getReturnPropertyOptions() {
        return returnPropertyOptions;
    }

    /**
     * Define o valor da propriedade returnPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyOptions }{@code >}
     *     
     */
    public void setReturnPropertyOptions(JAXBElement<RoutePropertyOptions> value) {
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
