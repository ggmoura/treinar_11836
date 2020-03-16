
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkTravelPolygon complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkTravelPolygon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}INetworkSpatial"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstanceID" type="{http://roadnet.com/apex/DataContracts/}NetworkInstanceID" minOccurs="0"/&gt;
 *         &lt;element name="Polygon" type="{http://roadnet.com/apex/DataContracts/}Polygon" minOccurs="0"/&gt;
 *         &lt;element name="Rules" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkTravelPolygonRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTravelPolygon", propOrder = {
    "description",
    "instanceID",
    "polygon",
    "rules"
})
public class NetworkTravelPolygon
    extends INetworkSpatial
{

    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "InstanceID", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkInstanceID> instanceID;
    @XmlElementRef(name = "Polygon", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Polygon> polygon;
    @XmlElementRef(name = "Rules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkTravelPolygonRule> rules;

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
     * Obtém o valor da propriedade polygon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     *     
     */
    public JAXBElement<Polygon> getPolygon() {
        return polygon;
    }

    /**
     * Define o valor da propriedade polygon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     *     
     */
    public void setPolygon(JAXBElement<Polygon> value) {
        this.polygon = value;
    }

    /**
     * Obtém o valor da propriedade rules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkTravelPolygonRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkTravelPolygonRule> getRules() {
        return rules;
    }

    /**
     * Define o valor da propriedade rules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkTravelPolygonRule }{@code >}
     *     
     */
    public void setRules(JAXBElement<ArrayOfNetworkTravelPolygonRule> value) {
        this.rules = value;
    }

}
