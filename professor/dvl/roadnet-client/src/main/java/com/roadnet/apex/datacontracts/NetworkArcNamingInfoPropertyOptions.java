
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de NetworkArcNamingInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkArcNamingInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndLeftAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndRightAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftLocality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RightLocality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartLeftAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartRightAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "NetworkArcNamingInfoPropertyOptions", propOrder = {
    "endLeftAddressNumber",
    "endRightAddressNumber",
    "leftLocality",
    "rightLocality",
    "startLeftAddressNumber",
    "startRightAddressNumber",
    "streets"
})
public class NetworkArcNamingInfoPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "EndLeftAddressNumber")
    protected Boolean endLeftAddressNumber;
    @XmlElement(name = "EndRightAddressNumber")
    protected Boolean endRightAddressNumber;
    @XmlElement(name = "LeftLocality")
    protected Boolean leftLocality;
    @XmlElement(name = "RightLocality")
    protected Boolean rightLocality;
    @XmlElement(name = "StartLeftAddressNumber")
    protected Boolean startLeftAddressNumber;
    @XmlElement(name = "StartRightAddressNumber")
    protected Boolean startRightAddressNumber;
    @XmlElement(name = "Streets")
    protected Boolean streets;

    /**
     * Obtém o valor da propriedade endLeftAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndLeftAddressNumber() {
        return endLeftAddressNumber;
    }

    /**
     * Define o valor da propriedade endLeftAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndLeftAddressNumber(Boolean value) {
        this.endLeftAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade endRightAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndRightAddressNumber() {
        return endRightAddressNumber;
    }

    /**
     * Define o valor da propriedade endRightAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndRightAddressNumber(Boolean value) {
        this.endRightAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade leftLocality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftLocality() {
        return leftLocality;
    }

    /**
     * Define o valor da propriedade leftLocality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftLocality(Boolean value) {
        this.leftLocality = value;
    }

    /**
     * Obtém o valor da propriedade rightLocality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightLocality() {
        return rightLocality;
    }

    /**
     * Define o valor da propriedade rightLocality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightLocality(Boolean value) {
        this.rightLocality = value;
    }

    /**
     * Obtém o valor da propriedade startLeftAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartLeftAddressNumber() {
        return startLeftAddressNumber;
    }

    /**
     * Define o valor da propriedade startLeftAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartLeftAddressNumber(Boolean value) {
        this.startLeftAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade startRightAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartRightAddressNumber() {
        return startRightAddressNumber;
    }

    /**
     * Define o valor da propriedade startRightAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartRightAddressNumber(Boolean value) {
        this.startRightAddressNumber = value;
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
