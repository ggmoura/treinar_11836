
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
 * <p>Classe Java de Scorecard complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Scorecard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentScores" type="{http://roadnet.com/apex/DataContracts/}ArrayOfScorecardEquipmentScore" minOccurs="0"/&gt;
 *         &lt;element name="ScorecardTemplateEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ScorecardType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WorkerScores" type="{http://roadnet.com/apex/DataContracts/}ArrayOfScorecardWorkerScore" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scorecard", propOrder = {
    "endDate",
    "equipmentScores",
    "scorecardTemplateEntityKey",
    "scorecardTypeType",
    "startDate",
    "workerScores"
})
public class Scorecard
    extends DataTransferObject
{

    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElementRef(name = "EquipmentScores", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfScorecardEquipmentScore> equipmentScores;
    @XmlElement(name = "ScorecardTemplateEntityKey")
    protected Long scorecardTemplateEntityKey;
    @XmlElementRef(name = "ScorecardType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scorecardTypeType;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "WorkerScores", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfScorecardWorkerScore> workerScores;

    /**
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade equipmentScores.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardEquipmentScore }{@code >}
     *     
     */
    public JAXBElement<ArrayOfScorecardEquipmentScore> getEquipmentScores() {
        return equipmentScores;
    }

    /**
     * Define o valor da propriedade equipmentScores.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardEquipmentScore }{@code >}
     *     
     */
    public void setEquipmentScores(JAXBElement<ArrayOfScorecardEquipmentScore> value) {
        this.equipmentScores = value;
    }

    /**
     * Obtém o valor da propriedade scorecardTemplateEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScorecardTemplateEntityKey() {
        return scorecardTemplateEntityKey;
    }

    /**
     * Define o valor da propriedade scorecardTemplateEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScorecardTemplateEntityKey(Long value) {
        this.scorecardTemplateEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade scorecardTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScorecardTypeType() {
        return scorecardTypeType;
    }

    /**
     * Define o valor da propriedade scorecardTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScorecardTypeType(JAXBElement<String> value) {
        this.scorecardTypeType = value;
    }

    /**
     * Obtém o valor da propriedade startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define o valor da propriedade startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtém o valor da propriedade workerScores.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardWorkerScore }{@code >}
     *     
     */
    public JAXBElement<ArrayOfScorecardWorkerScore> getWorkerScores() {
        return workerScores;
    }

    /**
     * Define o valor da propriedade workerScores.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardWorkerScore }{@code >}
     *     
     */
    public void setWorkerScores(JAXBElement<ArrayOfScorecardWorkerScore> value) {
        this.workerScores = value;
    }

}
