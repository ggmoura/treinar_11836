
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.DomainInstance;
import com.roadnet.apex.datacontracts.RegionContext;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://roadnet.com/apex/DataContracts/}RegionContext" minOccurs="0"/&gt;
 *         &lt;element name="groupInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "groupInstance",
    "coordinate"
})
@XmlRootElement(name = "OverrideCoordinateForUnassignedOrderGroup")
public class OverrideCoordinateForUnassignedOrderGroup {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "groupInstance", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> groupInstance;
    @XmlElementRef(name = "coordinate", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;

    /**
     * Obtém o valor da propriedade context.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public JAXBElement<RegionContext> getContext() {
        return context;
    }

    /**
     * Define o valor da propriedade context.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public void setContext(JAXBElement<RegionContext> value) {
        this.context = value;
    }

    /**
     * Obtém o valor da propriedade groupInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getGroupInstance() {
        return groupInstance;
    }

    /**
     * Define o valor da propriedade groupInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setGroupInstance(JAXBElement<DomainInstance> value) {
        this.groupInstance = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

}
