
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de NetworkPointAddressPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkPointAddressPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Point" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Streets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkPointAddressPropertyOptions", propOrder = {
    "houseNumber",
    "locality",
    "point",
    "streets"
})
public class NetworkPointAddressPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "HouseNumber")
    protected Boolean houseNumber;
    @XmlElement(name = "Locality")
    protected Boolean locality;
    @XmlElement(name = "Point")
    protected Boolean point;
    @XmlElement(name = "Streets")
    protected Boolean streets;

    /**
     * Obtém o valor da propriedade houseNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHouseNumber() {
        return houseNumber;
    }

    /**
     * Define o valor da propriedade houseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHouseNumber(Boolean value) {
        this.houseNumber = value;
    }

    /**
     * Obtém o valor da propriedade locality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocality() {
        return locality;
    }

    /**
     * Define o valor da propriedade locality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocality(Boolean value) {
        this.locality = value;
    }

    /**
     * Obtém o valor da propriedade point.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoint() {
        return point;
    }

    /**
     * Define o valor da propriedade point.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoint(Boolean value) {
        this.point = value;
    }

    /**
     * Obtém o valor da propriedade streets.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreets() {
        return streets;
    }

    /**
     * Define o valor da propriedade streets.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreets(Boolean value) {
        this.streets = value;
    }

}
