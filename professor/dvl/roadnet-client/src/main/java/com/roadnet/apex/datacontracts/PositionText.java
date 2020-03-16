
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de PositionText complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PositionText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="NearbyPOI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelativePositionDetail" type="{http://roadnet.com/apex/DataContracts/}RelativePositionDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionText", propOrder = {
    "address",
    "nearbyPOI",
    "relativePositionDetail"
})
public class PositionText
    extends DataTransferObject
{

    @XmlElementRef(name = "Address", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "NearbyPOI", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nearbyPOI;
    @XmlElementRef(name = "RelativePositionDetail", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RelativePositionDetail> relativePositionDetail;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<Address> value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade nearbyPOI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNearbyPOI() {
        return nearbyPOI;
    }

    /**
     * Define o valor da propriedade nearbyPOI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNearbyPOI(JAXBElement<String> value) {
        this.nearbyPOI = value;
    }

    /**
     * Obtém o valor da propriedade relativePositionDetail.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelativePositionDetail }{@code >}
     *     
     */
    public JAXBElement<RelativePositionDetail> getRelativePositionDetail() {
        return relativePositionDetail;
    }

    /**
     * Define o valor da propriedade relativePositionDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelativePositionDetail }{@code >}
     *     
     */
    public void setRelativePositionDetail(JAXBElement<RelativePositionDetail> value) {
        this.relativePositionDetail = value;
    }

}
