
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de PositionTextBuilderOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PositionTextBuilderOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShouldInterpolateHouseNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldPopulateAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldPopulateClosestCity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldPopulateNearbyPOIName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldPrioritizePOIAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionTextBuilderOptions", propOrder = {
    "shouldInterpolateHouseNumber",
    "shouldPopulateAddress",
    "shouldPopulateClosestCity",
    "shouldPopulateNearbyPOIName",
    "shouldPrioritizePOIAddress"
})
public class PositionTextBuilderOptions
    extends DataTransferObject
{

    @XmlElement(name = "ShouldInterpolateHouseNumber")
    protected Boolean shouldInterpolateHouseNumber;
    @XmlElement(name = "ShouldPopulateAddress")
    protected Boolean shouldPopulateAddress;
    @XmlElement(name = "ShouldPopulateClosestCity")
    protected Boolean shouldPopulateClosestCity;
    @XmlElement(name = "ShouldPopulateNearbyPOIName")
    protected Boolean shouldPopulateNearbyPOIName;
    @XmlElement(name = "ShouldPrioritizePOIAddress")
    protected Boolean shouldPrioritizePOIAddress;

    /**
     * Obtém o valor da propriedade shouldInterpolateHouseNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldInterpolateHouseNumber() {
        return shouldInterpolateHouseNumber;
    }

    /**
     * Define o valor da propriedade shouldInterpolateHouseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldInterpolateHouseNumber(Boolean value) {
        this.shouldInterpolateHouseNumber = value;
    }

    /**
     * Obtém o valor da propriedade shouldPopulateAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldPopulateAddress() {
        return shouldPopulateAddress;
    }

    /**
     * Define o valor da propriedade shouldPopulateAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldPopulateAddress(Boolean value) {
        this.shouldPopulateAddress = value;
    }

    /**
     * Obtém o valor da propriedade shouldPopulateClosestCity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldPopulateClosestCity() {
        return shouldPopulateClosestCity;
    }

    /**
     * Define o valor da propriedade shouldPopulateClosestCity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldPopulateClosestCity(Boolean value) {
        this.shouldPopulateClosestCity = value;
    }

    /**
     * Obtém o valor da propriedade shouldPopulateNearbyPOIName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldPopulateNearbyPOIName() {
        return shouldPopulateNearbyPOIName;
    }

    /**
     * Define o valor da propriedade shouldPopulateNearbyPOIName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldPopulateNearbyPOIName(Boolean value) {
        this.shouldPopulateNearbyPOIName = value;
    }

    /**
     * Obtém o valor da propriedade shouldPrioritizePOIAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldPrioritizePOIAddress() {
        return shouldPrioritizePOIAddress;
    }

    /**
     * Define o valor da propriedade shouldPrioritizePOIAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldPrioritizePOIAddress(Boolean value) {
        this.shouldPrioritizePOIAddress = value;
    }

}
