
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de PositionExtendedInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PositionExtendedInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Heading" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HorizontalDilutionOfPrecision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfSatelitesInView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfSatelitesUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionExtendedInfoPropertyOptions", propOrder = {
    "altitude",
    "heading",
    "horizontalDilutionOfPrecision",
    "numberOfSatelitesInView",
    "numberOfSatelitesUsed"
})
public class PositionExtendedInfoPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "Altitude")
    protected Boolean altitude;
    @XmlElement(name = "Heading")
    protected Boolean heading;
    @XmlElement(name = "HorizontalDilutionOfPrecision")
    protected Boolean horizontalDilutionOfPrecision;
    @XmlElement(name = "NumberOfSatelitesInView")
    protected Boolean numberOfSatelitesInView;
    @XmlElement(name = "NumberOfSatelitesUsed")
    protected Boolean numberOfSatelitesUsed;

    /**
     * Obtém o valor da propriedade altitude.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAltitude() {
        return altitude;
    }

    /**
     * Define o valor da propriedade altitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAltitude(Boolean value) {
        this.altitude = value;
    }

    /**
     * Obtém o valor da propriedade heading.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeading() {
        return heading;
    }

    /**
     * Define o valor da propriedade heading.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeading(Boolean value) {
        this.heading = value;
    }

    /**
     * Obtém o valor da propriedade horizontalDilutionOfPrecision.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHorizontalDilutionOfPrecision() {
        return horizontalDilutionOfPrecision;
    }

    /**
     * Define o valor da propriedade horizontalDilutionOfPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHorizontalDilutionOfPrecision(Boolean value) {
        this.horizontalDilutionOfPrecision = value;
    }

    /**
     * Obtém o valor da propriedade numberOfSatelitesInView.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfSatelitesInView() {
        return numberOfSatelitesInView;
    }

    /**
     * Define o valor da propriedade numberOfSatelitesInView.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfSatelitesInView(Boolean value) {
        this.numberOfSatelitesInView = value;
    }

    /**
     * Obtém o valor da propriedade numberOfSatelitesUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfSatelitesUsed() {
        return numberOfSatelitesUsed;
    }

    /**
     * Define o valor da propriedade numberOfSatelitesUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfSatelitesUsed(Boolean value) {
        this.numberOfSatelitesUsed = value;
    }

}
