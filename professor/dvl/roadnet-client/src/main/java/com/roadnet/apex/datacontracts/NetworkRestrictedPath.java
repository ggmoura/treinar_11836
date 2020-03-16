
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkRestrictedPath complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkRestrictedPath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}INetworkSpatial"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArcEndpointIDs" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkArcEndpointID" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstanceID" type="{http://roadnet.com/apex/DataContracts/}NetworkInstanceID" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://roadnet.com/apex/DataContracts/}PointPath" minOccurs="0"/&gt;
 *         &lt;element name="Rules" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkRestrictedPathRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkRestrictedPath", propOrder = {
    "arcEndpointIDs",
    "description",
    "instanceID",
    "points",
    "rules"
})
public class NetworkRestrictedPath
    extends INetworkSpatial
{

    @XmlElementRef(name = "ArcEndpointIDs", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkArcEndpointID> arcEndpointIDs;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "InstanceID", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkInstanceID> instanceID;
    @XmlElementRef(name = "Points", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPath> points;
    @XmlElementRef(name = "Rules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkRestrictedPathRule> rules;

    /**
     * Obtém o valor da propriedade arcEndpointIDs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArcEndpointID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkArcEndpointID> getArcEndpointIDs() {
        return arcEndpointIDs;
    }

    /**
     * Define o valor da propriedade arcEndpointIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArcEndpointID }{@code >}
     *     
     */
    public void setArcEndpointIDs(JAXBElement<ArrayOfNetworkArcEndpointID> value) {
        this.arcEndpointIDs = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade instanceID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkInstanceID }{@code >}
     *     
     */
    public JAXBElement<NetworkInstanceID> getInstanceID() {
        return instanceID;
    }

    /**
     * Define o valor da propriedade instanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkInstanceID }{@code >}
     *     
     */
    public void setInstanceID(JAXBElement<NetworkInstanceID> value) {
        this.instanceID = value;
    }

    /**
     * Obtém o valor da propriedade points.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPath }{@code >}
     *     
     */
    public JAXBElement<PointPath> getPoints() {
        return points;
    }

    /**
     * Define o valor da propriedade points.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPath }{@code >}
     *     
     */
    public void setPoints(JAXBElement<PointPath> value) {
        this.points = value;
    }

    /**
     * Obtém o valor da propriedade rules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkRestrictedPathRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkRestrictedPathRule> getRules() {
        return rules;
    }

    /**
     * Define o valor da propriedade rules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkRestrictedPathRule }{@code >}
     *     
     */
    public void setRules(JAXBElement<ArrayOfNetworkRestrictedPathRule> value) {
        this.rules = value;
    }

}
