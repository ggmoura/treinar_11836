
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AlwaysOnAvailabilityGroup complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AlwaysOnAvailabilityGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}DatabaseServerGroup"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailabilityGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Listener" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryReplicaServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlwaysOnAvailabilityGroup", propOrder = {
    "availabilityGroup",
    "listener",
    "primaryReplicaServer"
})
public class AlwaysOnAvailabilityGroup
    extends DatabaseServerGroup
{

    @XmlElementRef(name = "AvailabilityGroup", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availabilityGroup;
    @XmlElementRef(name = "Listener", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> listener;
    @XmlElementRef(name = "PrimaryReplicaServer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryReplicaServer;

    /**
     * Obtém o valor da propriedade availabilityGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailabilityGroup() {
        return availabilityGroup;
    }

    /**
     * Define o valor da propriedade availabilityGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailabilityGroup(JAXBElement<String> value) {
        this.availabilityGroup = value;
    }

    /**
     * Obtém o valor da propriedade listener.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getListener() {
        return listener;
    }

    /**
     * Define o valor da propriedade listener.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setListener(JAXBElement<String> value) {
        this.listener = value;
    }

    /**
     * Obtém o valor da propriedade primaryReplicaServer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryReplicaServer() {
        return primaryReplicaServer;
    }

    /**
     * Define o valor da propriedade primaryReplicaServer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryReplicaServer(JAXBElement<String> value) {
        this.primaryReplicaServer = value;
    }

}
