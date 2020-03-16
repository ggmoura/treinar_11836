
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de BusinessUnit.DefaultSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnit.DefaultSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryISO3Abbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CultureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineItemType_LineItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnit.DefaultSettings", propOrder = {
    "countryISO3Abbr",
    "cultureName",
    "lineItemTypeLineItemType"
})
public class BusinessUnitDefaultSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "CountryISO3Abbr", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryISO3Abbr;
    @XmlElementRef(name = "CultureName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cultureName;
    @XmlElementRef(name = "LineItemType_LineItemType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineItemTypeLineItemType;

    /**
     * Obtém o valor da propriedade countryISO3Abbr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryISO3Abbr() {
        return countryISO3Abbr;
    }

    /**
     * Define o valor da propriedade countryISO3Abbr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryISO3Abbr(JAXBElement<String> value) {
        this.countryISO3Abbr = value;
    }

    /**
     * Obtém o valor da propriedade cultureName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCultureName() {
        return cultureName;
    }

    /**
     * Define o valor da propriedade cultureName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCultureName(JAXBElement<String> value) {
        this.cultureName = value;
    }

    /**
     * Obtém o valor da propriedade lineItemTypeLineItemType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineItemTypeLineItemType() {
        return lineItemTypeLineItemType;
    }

    /**
     * Define o valor da propriedade lineItemTypeLineItemType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineItemTypeLineItemType(JAXBElement<String> value) {
        this.lineItemTypeLineItemType = value;
    }

}
