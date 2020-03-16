
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReportGroupPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportGroupPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollateReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportGroupMembers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportGroupMembersOptions" type="{http://roadnet.com/apex/DataContracts/}ReportGroupMemberPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGroupPropertyOptions", propOrder = {
    "collateReports",
    "description",
    "identifier",
    "name",
    "reportEntityKeys",
    "reportGroupMembers",
    "reportGroupMembersOptions"
})
public class ReportGroupPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "CollateReports")
    protected Boolean collateReports;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "ReportEntityKeys")
    protected Boolean reportEntityKeys;
    @XmlElement(name = "ReportGroupMembers")
    protected Boolean reportGroupMembers;
    @XmlElementRef(name = "ReportGroupMembersOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportGroupMemberPropertyOptions> reportGroupMembersOptions;

    /**
     * Obtém o valor da propriedade collateReports.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollateReports() {
        return collateReports;
    }

    /**
     * Define o valor da propriedade collateReports.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollateReports(Boolean value) {
        this.collateReports = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade reportEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportEntityKeys() {
        return reportEntityKeys;
    }

    /**
     * Define o valor da propriedade reportEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportEntityKeys(Boolean value) {
        this.reportEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade reportGroupMembers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportGroupMembers() {
        return reportGroupMembers;
    }

    /**
     * Define o valor da propriedade reportGroupMembers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportGroupMembers(Boolean value) {
        this.reportGroupMembers = value;
    }

    /**
     * Obtém o valor da propriedade reportGroupMembersOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportGroupMemberPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ReportGroupMemberPropertyOptions> getReportGroupMembersOptions() {
        return reportGroupMembersOptions;
    }

    /**
     * Define o valor da propriedade reportGroupMembersOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportGroupMemberPropertyOptions }{@code >}
     *     
     */
    public void setReportGroupMembersOptions(JAXBElement<ReportGroupMemberPropertyOptions> value) {
        this.reportGroupMembersOptions = value;
    }

}
