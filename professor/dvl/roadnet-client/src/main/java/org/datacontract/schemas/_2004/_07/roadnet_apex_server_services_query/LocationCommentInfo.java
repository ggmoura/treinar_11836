
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.LocationComment;
import com.roadnet.apex.datacontracts.WorldTimeZone;


/**
 * <p>Classe Java de LocationCommentInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocationCommentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationComment" type="{http://roadnet.com/apex/DataContracts/}LocationComment" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://roadnet.com/apex/DataContracts/}WorldTimeZone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCommentInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", propOrder = {
    "locationComment",
    "locationDescription",
    "locationIdentifier",
    "locationVersion",
    "timeZone"
})
public class LocationCommentInfo {

    @XmlElementRef(name = "LocationComment", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationComment> locationComment;
    @XmlElementRef(name = "LocationDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDescription;
    @XmlElementRef(name = "LocationIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationIdentifier;
    @XmlElement(name = "LocationVersion")
    protected Long locationVersion;
    @XmlElement(name = "TimeZone")
    @XmlSchemaType(name = "string")
    protected WorldTimeZone timeZone;

    /**
     * Obtém o valor da propriedade locationComment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationComment }{@code >}
     *     
     */
    public JAXBElement<LocationComment> getLocationComment() {
        return locationComment;
    }

    /**
     * Define o valor da propriedade locationComment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationComment }{@code >}
     *     
     */
    public void setLocationComment(JAXBElement<LocationComment> value) {
        this.locationComment = value;
    }

    /**
     * Obtém o valor da propriedade locationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDescription() {
        return locationDescription;
    }

    /**
     * Define o valor da propriedade locationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDescription(JAXBElement<String> value) {
        this.locationDescription = value;
    }

    /**
     * Obtém o valor da propriedade locationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Define o valor da propriedade locationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationIdentifier(JAXBElement<String> value) {
        this.locationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade locationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationVersion() {
        return locationVersion;
    }

    /**
     * Define o valor da propriedade locationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationVersion(Long value) {
        this.locationVersion = value;
    }

    /**
     * Obtém o valor da propriedade timeZone.
     * 
     * @return
     *     possible object is
     *     {@link WorldTimeZone }
     *     
     */
    public WorldTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Define o valor da propriedade timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link WorldTimeZone }
     *     
     */
    public void setTimeZone(WorldTimeZone value) {
        this.timeZone = value;
    }

}
