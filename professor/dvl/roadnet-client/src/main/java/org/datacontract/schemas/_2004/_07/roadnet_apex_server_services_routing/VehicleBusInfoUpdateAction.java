
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleBusInfoUpdateAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleBusInfoUpdateAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleBusComponents" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfVehicleBusComponent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleBusInfoUpdateAction", propOrder = {
    "vehicleBusComponents"
})
public class VehicleBusInfoUpdateAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "VehicleBusComponents", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVehicleBusComponent> vehicleBusComponents;

    /**
     * Obtém o valor da propriedade vehicleBusComponents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehicleBusComponent }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVehicleBusComponent> getVehicleBusComponents() {
        return vehicleBusComponents;
    }

    /**
     * Define o valor da propriedade vehicleBusComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehicleBusComponent }{@code >}
     *     
     */
    public void setVehicleBusComponents(JAXBElement<ArrayOfVehicleBusComponent> value) {
        this.vehicleBusComponents = value;
    }

}
