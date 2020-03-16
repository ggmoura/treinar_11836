
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

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
 * <p>Classe Java de RetrieveMatrixResultsOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMatrixResultsOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuildStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ByDateRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLatest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMatrixResultsOptions", propOrder = {
    "buildStatus",
    "buildType",
    "byDateRange",
    "customerIdentifier",
    "endDate",
    "isTopLatest",
    "startDate"
})
public class RetrieveMatrixResultsOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "BuildStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildStatus;
    @XmlElementRef(name = "BuildType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildType;
    @XmlElement(name = "ByDateRange")
    protected Boolean byDateRange;
    @XmlElementRef(name = "CustomerIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerIdentifier;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "IsTopLatest")
    protected Boolean isTopLatest;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Obtém o valor da propriedade buildStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildStatus() {
        return buildStatus;
    }

    /**
     * Define o valor da propriedade buildStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildStatus(JAXBElement<String> value) {
        this.buildStatus = value;
    }

    /**
     * Obtém o valor da propriedade buildType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildType() {
        return buildType;
    }

    /**
     * Define o valor da propriedade buildType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildType(JAXBElement<String> value) {
        this.buildType = value;
    }

    /**
     * Obtém o valor da propriedade byDateRange.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByDateRange() {
        return byDateRange;
    }

    /**
     * Define o valor da propriedade byDateRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByDateRange(Boolean value) {
        this.byDateRange = value;
    }

    /**
     * Obtém o valor da propriedade customerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Define o valor da propriedade customerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerIdentifier(JAXBElement<String> value) {
        this.customerIdentifier = value;
    }

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
     * Obtém o valor da propriedade isTopLatest.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTopLatest() {
        return isTopLatest;
    }

    /**
     * Define o valor da propriedade isTopLatest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTopLatest(Boolean value) {
        this.isTopLatest = value;
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

}
