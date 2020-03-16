
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de RetrieveDataFeedStatusResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveDataFeedStatusResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataFeedEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataFeedPaused" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataFeedPausedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveDataFeedStatusResult", propOrder = {
    "dataFeedEnabled",
    "dataFeedPaused",
    "dataFeedPausedTime"
})
public class RetrieveDataFeedStatusResult {

    @XmlElement(name = "DataFeedEnabled")
    protected Boolean dataFeedEnabled;
    @XmlElement(name = "DataFeedPaused")
    protected Boolean dataFeedPaused;
    @XmlElementRef(name = "DataFeedPausedTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataFeedPausedTime;

    /**
     * Obtém o valor da propriedade dataFeedEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataFeedEnabled() {
        return dataFeedEnabled;
    }

    /**
     * Define o valor da propriedade dataFeedEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataFeedEnabled(Boolean value) {
        this.dataFeedEnabled = value;
    }

    /**
     * Obtém o valor da propriedade dataFeedPaused.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataFeedPaused() {
        return dataFeedPaused;
    }

    /**
     * Define o valor da propriedade dataFeedPaused.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataFeedPaused(Boolean value) {
        this.dataFeedPaused = value;
    }

    /**
     * Obtém o valor da propriedade dataFeedPausedTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataFeedPausedTime() {
        return dataFeedPausedTime;
    }

    /**
     * Define o valor da propriedade dataFeedPausedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataFeedPausedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.dataFeedPausedTime = value;
    }

}
