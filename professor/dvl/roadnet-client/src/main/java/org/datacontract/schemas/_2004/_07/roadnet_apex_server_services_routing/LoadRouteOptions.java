
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentDescriptor;
import com.roadnet.apex.datacontracts.ArrayOfWorkerDescriptor;
import com.roadnet.apex.datacontracts.DomainInstance;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de LoadRouteOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LoadRouteOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentList" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="InclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RouteDescriptor" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}RouteDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="RouteInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="UnplannedOriginLocation" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}UnplannedOriginParameters" minOccurs="0"/&gt;
 *         &lt;element name="WorkerList" type="{http://roadnet.com/apex/DataContracts/}ArrayOfWorkerDescriptor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadRouteOptions", propOrder = {
    "equipmentList",
    "inclusionMode",
    "mobileDeviceEntityKey",
    "propertyOptions",
    "routeDescriptor",
    "routeInstance",
    "unplannedOriginLocation",
    "workerList"
})
public class LoadRouteOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "EquipmentList", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentDescriptor> equipmentList;
    @XmlElement(name = "InclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode inclusionMode;
    @XmlElement(name = "MobileDeviceEntityKey")
    protected Long mobileDeviceEntityKey;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyOptions> propertyOptions;
    @XmlElementRef(name = "RouteDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteDescriptor> routeDescriptor;
    @XmlElementRef(name = "RouteInstance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> routeInstance;
    @XmlElementRef(name = "UnplannedOriginLocation", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UnplannedOriginParameters> unplannedOriginLocation;
    @XmlElementRef(name = "WorkerList", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkerDescriptor> workerList;

    /**
     * Obtém o valor da propriedade equipmentList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDescriptor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentDescriptor> getEquipmentList() {
        return equipmentList;
    }

    /**
     * Define o valor da propriedade equipmentList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDescriptor }{@code >}
     *     
     */
    public void setEquipmentList(JAXBElement<ArrayOfEquipmentDescriptor> value) {
        this.equipmentList = value;
    }

    /**
     * Obtém o valor da propriedade inclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getInclusionMode() {
        return inclusionMode;
    }

    /**
     * Define o valor da propriedade inclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setInclusionMode(PropertyInclusionMode value) {
        this.inclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobileDeviceEntityKey(Long value) {
        this.mobileDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public JAXBElement<PropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<PropertyOptions> value) {
        this.propertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade routeDescriptor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteDescriptor }{@code >}
     *     
     */
    public JAXBElement<RouteDescriptor> getRouteDescriptor() {
        return routeDescriptor;
    }

    /**
     * Define o valor da propriedade routeDescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteDescriptor }{@code >}
     *     
     */
    public void setRouteDescriptor(JAXBElement<RouteDescriptor> value) {
        this.routeDescriptor = value;
    }

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
     * Obtém o valor da propriedade unplannedOriginLocation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnplannedOriginParameters }{@code >}
     *     
     */
    public JAXBElement<UnplannedOriginParameters> getUnplannedOriginLocation() {
        return unplannedOriginLocation;
    }

    /**
     * Define o valor da propriedade unplannedOriginLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnplannedOriginParameters }{@code >}
     *     
     */
    public void setUnplannedOriginLocation(JAXBElement<UnplannedOriginParameters> value) {
        this.unplannedOriginLocation = value;
    }

    /**
     * Obtém o valor da propriedade workerList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerDescriptor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkerDescriptor> getWorkerList() {
        return workerList;
    }

    /**
     * Define o valor da propriedade workerList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerDescriptor }{@code >}
     *     
     */
    public void setWorkerList(JAXBElement<ArrayOfWorkerDescriptor> value) {
        this.workerList = value;
    }

}
