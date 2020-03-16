
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Country complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Country"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdminDivisionCityIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdminDivisionLabels" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="BasePostalCodeWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DetailPostalCodeWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HasPostalCodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ISO2Abbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISO3Abbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISOCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCodeLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country", propOrder = {
    "adminDivisionCityIndex",
    "adminDivisionLabels",
    "basePostalCodeWidth",
    "detailPostalCodeWidth",
    "hasPostalCodes",
    "iso2Abbr",
    "iso3Abbr",
    "isoCode",
    "name",
    "nameLabel",
    "postalCodeLabel"
})
public class Country
    extends DataTransferObject
{

    @XmlElement(name = "AdminDivisionCityIndex")
    protected Integer adminDivisionCityIndex;
    @XmlElementRef(name = "AdminDivisionLabels", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> adminDivisionLabels;
    @XmlElement(name = "BasePostalCodeWidth")
    protected Integer basePostalCodeWidth;
    @XmlElement(name = "DetailPostalCodeWidth")
    protected Integer detailPostalCodeWidth;
    @XmlElement(name = "HasPostalCodes")
    protected Boolean hasPostalCodes;
    @XmlElementRef(name = "ISO2Abbr", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iso2Abbr;
    @XmlElementRef(name = "ISO3Abbr", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iso3Abbr;
    @XmlElement(name = "ISOCode")
    protected Integer isoCode;
    @XmlElementRef(name = "Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "NameLabel", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameLabel;
    @XmlElementRef(name = "PostalCodeLabel", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCodeLabel;

    /**
     * Obtém o valor da propriedade adminDivisionCityIndex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdminDivisionCityIndex() {
        return adminDivisionCityIndex;
    }

    /**
     * Define o valor da propriedade adminDivisionCityIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdminDivisionCityIndex(Integer value) {
        this.adminDivisionCityIndex = value;
    }

    /**
     * Obtém o valor da propriedade adminDivisionLabels.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getAdminDivisionLabels() {
        return adminDivisionLabels;
    }

    /**
     * Define o valor da propriedade adminDivisionLabels.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setAdminDivisionLabels(JAXBElement<ArrayOfstring> value) {
        this.adminDivisionLabels = value;
    }

    /**
     * Obtém o valor da propriedade basePostalCodeWidth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBasePostalCodeWidth() {
        return basePostalCodeWidth;
    }

    /**
     * Define o valor da propriedade basePostalCodeWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBasePostalCodeWidth(Integer value) {
        this.basePostalCodeWidth = value;
    }

    /**
     * Obtém o valor da propriedade detailPostalCodeWidth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDetailPostalCodeWidth() {
        return detailPostalCodeWidth;
    }

    /**
     * Define o valor da propriedade detailPostalCodeWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDetailPostalCodeWidth(Integer value) {
        this.detailPostalCodeWidth = value;
    }

    /**
     * Obtém o valor da propriedade hasPostalCodes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPostalCodes() {
        return hasPostalCodes;
    }

    /**
     * Define o valor da propriedade hasPostalCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPostalCodes(Boolean value) {
        this.hasPostalCodes = value;
    }

    /**
     * Obtém o valor da propriedade iso2Abbr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISO2Abbr() {
        return iso2Abbr;
    }

    /**
     * Define o valor da propriedade iso2Abbr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISO2Abbr(JAXBElement<String> value) {
        this.iso2Abbr = value;
    }

    /**
     * Obtém o valor da propriedade iso3Abbr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISO3Abbr() {
        return iso3Abbr;
    }

    /**
     * Define o valor da propriedade iso3Abbr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISO3Abbr(JAXBElement<String> value) {
        this.iso3Abbr = value;
    }

    /**
     * Obtém o valor da propriedade isoCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getISOCode() {
        return isoCode;
    }

    /**
     * Define o valor da propriedade isoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setISOCode(Integer value) {
        this.isoCode = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade nameLabel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameLabel() {
        return nameLabel;
    }

    /**
     * Define o valor da propriedade nameLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameLabel(JAXBElement<String> value) {
        this.nameLabel = value;
    }

    /**
     * Obtém o valor da propriedade postalCodeLabel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCodeLabel() {
        return postalCodeLabel;
    }

    /**
     * Define o valor da propriedade postalCodeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCodeLabel(JAXBElement<String> value) {
        this.postalCodeLabel = value;
    }

}
