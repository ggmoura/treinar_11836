
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Locality;
import com.roadnet.apex.datacontracts.NetworkStreet;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de AddressCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AddressCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://roadnet.com/apex/DataContracts/}Locality" minOccurs="0"/&gt;
 *         &lt;element name="Street" type="{http://roadnet.com/apex/DataContracts/}NetworkStreet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCriteria", propOrder = {
    "houseNumber",
    "locality",
    "street"
})
public class AddressCriteria
    extends DataTransferObject
{

    @XmlElementRef(name = "HouseNumber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumber;
    @XmlElementRef(name = "Locality", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Locality> locality;
    @XmlElementRef(name = "Street", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkStreet> street;

    /**
     * Obtém o valor da propriedade houseNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseNumber() {
        return houseNumber;
    }

    /**
     * Define o valor da propriedade houseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseNumber(JAXBElement<String> value) {
        this.houseNumber = value;
    }

    /**
     * Obtém o valor da propriedade locality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locality }{@code >}
     *     
     */
    public JAXBElement<Locality> getLocality() {
        return locality;
    }

    /**
     * Define o valor da propriedade locality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locality }{@code >}
     *     
     */
    public void setLocality(JAXBElement<Locality> value) {
        this.locality = value;
    }

    /**
     * Obtém o valor da propriedade street.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkStreet }{@code >}
     *     
     */
    public JAXBElement<NetworkStreet> getStreet() {
        return street;
    }

    /**
     * Define o valor da propriedade street.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkStreet }{@code >}
     *     
     */
    public void setStreet(JAXBElement<NetworkStreet> value) {
        this.street = value;
    }

}
