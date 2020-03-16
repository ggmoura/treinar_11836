
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentDataHistoryResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDataHistoryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bookmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDataHistories" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentDataHistory" minOccurs="0"/&gt;
 *         &lt;element name="HasMoreData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LatestReceivedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NextAsofDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDataHistoryResult", propOrder = {
    "bookmark",
    "equipmentDataHistories",
    "hasMoreData",
    "latestReceivedTimestamp",
    "nextAsofDateTime"
})
public class EquipmentDataHistoryResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Bookmark", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookmark;
    @XmlElementRef(name = "EquipmentDataHistories", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentDataHistory> equipmentDataHistories;
    @XmlElement(name = "HasMoreData")
    protected Boolean hasMoreData;
    @XmlElement(name = "LatestReceivedTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestReceivedTimestamp;
    @XmlElement(name = "NextAsofDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextAsofDateTime;

    /**
     * Obtém o valor da propriedade bookmark.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookmark() {
        return bookmark;
    }

    /**
     * Define o valor da propriedade bookmark.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookmark(JAXBElement<String> value) {
        this.bookmark = value;
    }

    /**
     * Obtém o valor da propriedade equipmentDataHistories.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataHistory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentDataHistory> getEquipmentDataHistories() {
        return equipmentDataHistories;
    }

    /**
     * Define o valor da propriedade equipmentDataHistories.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataHistory }{@code >}
     *     
     */
    public void setEquipmentDataHistories(JAXBElement<ArrayOfEquipmentDataHistory> value) {
        this.equipmentDataHistories = value;
    }

    /**
     * Obtém o valor da propriedade hasMoreData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreData() {
        return hasMoreData;
    }

    /**
     * Define o valor da propriedade hasMoreData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreData(Boolean value) {
        this.hasMoreData = value;
    }

    /**
     * Obtém o valor da propriedade latestReceivedTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestReceivedTimestamp() {
        return latestReceivedTimestamp;
    }

    /**
     * Define o valor da propriedade latestReceivedTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestReceivedTimestamp(XMLGregorianCalendar value) {
        this.latestReceivedTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade nextAsofDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextAsofDateTime() {
        return nextAsofDateTime;
    }

    /**
     * Define o valor da propriedade nextAsofDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextAsofDateTime(XMLGregorianCalendar value) {
        this.nextAsofDateTime = value;
    }

}
