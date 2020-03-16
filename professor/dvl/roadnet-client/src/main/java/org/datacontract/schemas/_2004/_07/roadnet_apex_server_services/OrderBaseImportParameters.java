
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderBaseImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderBaseImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}ImportParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlterManuallyEnteredOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ApplyLocationSubstitution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticallyPrintSummaryReportToDefaultPrinter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateFormat" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}CoordinateFormat" minOccurs="0"/&gt;
 *         &lt;element name="LineItemFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="RouteImportedOrderIgnoreFlags" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}OrderBaseImportParameters.PlaceImportedOrderIgnoreFlags" minOccurs="0"/&gt;
 *         &lt;element name="SaveOriginalOrderRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TreatSKUFieldsAsCumulative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TreatSelectorPAsPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBaseImportParameters", propOrder = {
    "alterManuallyEnteredOrders",
    "applyLocationSubstitution",
    "automaticallyPrintSummaryReportToDefaultPrinter",
    "coordinateFormat",
    "lineItemFile",
    "routeImportedOrderIgnoreFlags",
    "saveOriginalOrderRecords",
    "treatSKUFieldsAsCumulative",
    "treatSelectorPAsPickup"
})
@XmlSeeAlso({
    OrderImportParameters.class,
    RecurringOrderImportParameters.class
})
public class OrderBaseImportParameters
    extends ImportParameters
{

    @XmlElement(name = "AlterManuallyEnteredOrders")
    protected Boolean alterManuallyEnteredOrders;
    @XmlElement(name = "ApplyLocationSubstitution")
    protected Boolean applyLocationSubstitution;
    @XmlElement(name = "AutomaticallyPrintSummaryReportToDefaultPrinter")
    protected Boolean automaticallyPrintSummaryReportToDefaultPrinter;
    @XmlElement(name = "CoordinateFormat")
    @XmlSchemaType(name = "string")
    protected CoordinateFormat coordinateFormat;
    @XmlElementRef(name = "LineItemFile", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> lineItemFile;
    @XmlList
    @XmlElement(name = "RouteImportedOrderIgnoreFlags")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> routeImportedOrderIgnoreFlags;
    @XmlElement(name = "SaveOriginalOrderRecords")
    protected Boolean saveOriginalOrderRecords;
    @XmlElement(name = "TreatSKUFieldsAsCumulative")
    protected Boolean treatSKUFieldsAsCumulative;
    @XmlElement(name = "TreatSelectorPAsPickup")
    protected Boolean treatSelectorPAsPickup;

    /**
     * Obtém o valor da propriedade alterManuallyEnteredOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlterManuallyEnteredOrders() {
        return alterManuallyEnteredOrders;
    }

    /**
     * Define o valor da propriedade alterManuallyEnteredOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlterManuallyEnteredOrders(Boolean value) {
        this.alterManuallyEnteredOrders = value;
    }

    /**
     * Obtém o valor da propriedade applyLocationSubstitution.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyLocationSubstitution() {
        return applyLocationSubstitution;
    }

    /**
     * Define o valor da propriedade applyLocationSubstitution.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyLocationSubstitution(Boolean value) {
        this.applyLocationSubstitution = value;
    }

    /**
     * Obtém o valor da propriedade automaticallyPrintSummaryReportToDefaultPrinter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticallyPrintSummaryReportToDefaultPrinter() {
        return automaticallyPrintSummaryReportToDefaultPrinter;
    }

    /**
     * Define o valor da propriedade automaticallyPrintSummaryReportToDefaultPrinter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticallyPrintSummaryReportToDefaultPrinter(Boolean value) {
        this.automaticallyPrintSummaryReportToDefaultPrinter = value;
    }

    /**
     * Obtém o valor da propriedade coordinateFormat.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateFormat }
     *     
     */
    public CoordinateFormat getCoordinateFormat() {
        return coordinateFormat;
    }

    /**
     * Define o valor da propriedade coordinateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateFormat }
     *     
     */
    public void setCoordinateFormat(CoordinateFormat value) {
        this.coordinateFormat = value;
    }

    /**
     * Obtém o valor da propriedade lineItemFile.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getLineItemFile() {
        return lineItemFile;
    }

    /**
     * Define o valor da propriedade lineItemFile.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setLineItemFile(JAXBElement<byte[]> value) {
        this.lineItemFile = value;
    }

    /**
     * Gets the value of the routeImportedOrderIgnoreFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeImportedOrderIgnoreFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteImportedOrderIgnoreFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRouteImportedOrderIgnoreFlags() {
        if (routeImportedOrderIgnoreFlags == null) {
            routeImportedOrderIgnoreFlags = new ArrayList<String>();
        }
        return this.routeImportedOrderIgnoreFlags;
    }

    /**
     * Obtém o valor da propriedade saveOriginalOrderRecords.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveOriginalOrderRecords() {
        return saveOriginalOrderRecords;
    }

    /**
     * Define o valor da propriedade saveOriginalOrderRecords.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveOriginalOrderRecords(Boolean value) {
        this.saveOriginalOrderRecords = value;
    }

    /**
     * Obtém o valor da propriedade treatSKUFieldsAsCumulative.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTreatSKUFieldsAsCumulative() {
        return treatSKUFieldsAsCumulative;
    }

    /**
     * Define o valor da propriedade treatSKUFieldsAsCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTreatSKUFieldsAsCumulative(Boolean value) {
        this.treatSKUFieldsAsCumulative = value;
    }

    /**
     * Obtém o valor da propriedade treatSelectorPAsPickup.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTreatSelectorPAsPickup() {
        return treatSelectorPAsPickup;
    }

    /**
     * Define o valor da propriedade treatSelectorPAsPickup.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTreatSelectorPAsPickup(Boolean value) {
        this.treatSelectorPAsPickup = value;
    }

}
