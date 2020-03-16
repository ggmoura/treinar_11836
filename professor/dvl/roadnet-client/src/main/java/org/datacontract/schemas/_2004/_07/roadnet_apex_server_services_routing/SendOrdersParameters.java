
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfDomainInstance;
import com.roadnet.apex.datacontracts.EntitySendOrderTemplate;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.CoordinateFormat;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * <p>Classe Java de SendOrdersParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SendOrdersParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Expression" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *         &lt;element name="IncludeFieldNamesAsFirstRow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeNonServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeOrdersThatWereNotImported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeOriginalOrderRecordsInOutput" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LatLongFormat" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}CoordinateFormat" minOccurs="0"/&gt;
 *         &lt;element name="LatLongPrecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LockOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Routes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="SendOrdersTimeZoneOption_TimeZoneOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopNumberFormat_AssignStopNumbersBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Template" type="{http://roadnet.com/apex/DataContracts/}EntitySendOrderTemplate" minOccurs="0"/&gt;
 *         &lt;element name="UseLatLonSuffix" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VariableServiceTimeFormat_ServiceTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendOrdersParameters", propOrder = {
    "expression",
    "includeFieldNamesAsFirstRow",
    "includeNonServiceableStops",
    "includeOrdersThatWereNotImported",
    "includeOriginalOrderRecordsInOutput",
    "latLongFormat",
    "latLongPrecision",
    "lockOrders",
    "routes",
    "sendOrdersTimeZoneOptionTimeZoneOption",
    "stopNumberFormatAssignStopNumbersBy",
    "template",
    "useLatLonSuffix",
    "variableServiceTimeFormatServiceTimeFormat",
    "worldTimeZoneTimeZone"
})
public class SendOrdersParameters {

    @XmlElementRef(name = "Expression", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> expression;
    @XmlElement(name = "IncludeFieldNamesAsFirstRow")
    protected Boolean includeFieldNamesAsFirstRow;
    @XmlElement(name = "IncludeNonServiceableStops")
    protected Boolean includeNonServiceableStops;
    @XmlElement(name = "IncludeOrdersThatWereNotImported")
    protected Boolean includeOrdersThatWereNotImported;
    @XmlElement(name = "IncludeOriginalOrderRecordsInOutput")
    protected Boolean includeOriginalOrderRecordsInOutput;
    @XmlElement(name = "LatLongFormat")
    @XmlSchemaType(name = "string")
    protected CoordinateFormat latLongFormat;
    @XmlElementRef(name = "LatLongPrecision", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> latLongPrecision;
    @XmlElement(name = "LockOrders")
    protected Boolean lockOrders;
    @XmlElementRef(name = "Routes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDomainInstance> routes;
    @XmlElementRef(name = "SendOrdersTimeZoneOption_TimeZoneOption", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendOrdersTimeZoneOptionTimeZoneOption;
    @XmlElementRef(name = "StopNumberFormat_AssignStopNumbersBy", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopNumberFormatAssignStopNumbersBy;
    @XmlElementRef(name = "Template", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EntitySendOrderTemplate> template;
    @XmlElement(name = "UseLatLonSuffix")
    protected Boolean useLatLonSuffix;
    @XmlElementRef(name = "VariableServiceTimeFormat_ServiceTimeFormat", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> variableServiceTimeFormatServiceTimeFormat;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade expression.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getExpression() {
        return expression;
    }

    /**
     * Define o valor da propriedade expression.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setExpression(JAXBElement<SimpleExpressionBase> value) {
        this.expression = value;
    }

    /**
     * Obtém o valor da propriedade includeFieldNamesAsFirstRow.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFieldNamesAsFirstRow() {
        return includeFieldNamesAsFirstRow;
    }

    /**
     * Define o valor da propriedade includeFieldNamesAsFirstRow.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFieldNamesAsFirstRow(Boolean value) {
        this.includeFieldNamesAsFirstRow = value;
    }

    /**
     * Obtém o valor da propriedade includeNonServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNonServiceableStops() {
        return includeNonServiceableStops;
    }

    /**
     * Define o valor da propriedade includeNonServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNonServiceableStops(Boolean value) {
        this.includeNonServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade includeOrdersThatWereNotImported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOrdersThatWereNotImported() {
        return includeOrdersThatWereNotImported;
    }

    /**
     * Define o valor da propriedade includeOrdersThatWereNotImported.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOrdersThatWereNotImported(Boolean value) {
        this.includeOrdersThatWereNotImported = value;
    }

    /**
     * Obtém o valor da propriedade includeOriginalOrderRecordsInOutput.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOriginalOrderRecordsInOutput() {
        return includeOriginalOrderRecordsInOutput;
    }

    /**
     * Define o valor da propriedade includeOriginalOrderRecordsInOutput.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOriginalOrderRecordsInOutput(Boolean value) {
        this.includeOriginalOrderRecordsInOutput = value;
    }

    /**
     * Obtém o valor da propriedade latLongFormat.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateFormat }
     *     
     */
    public CoordinateFormat getLatLongFormat() {
        return latLongFormat;
    }

    /**
     * Define o valor da propriedade latLongFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateFormat }
     *     
     */
    public void setLatLongFormat(CoordinateFormat value) {
        this.latLongFormat = value;
    }

    /**
     * Obtém o valor da propriedade latLongPrecision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLatLongPrecision() {
        return latLongPrecision;
    }

    /**
     * Define o valor da propriedade latLongPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLatLongPrecision(JAXBElement<Integer> value) {
        this.latLongPrecision = value;
    }

    /**
     * Obtém o valor da propriedade lockOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockOrders() {
        return lockOrders;
    }

    /**
     * Define o valor da propriedade lockOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockOrders(Boolean value) {
        this.lockOrders = value;
    }

    /**
     * Obtém o valor da propriedade routes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDomainInstance> getRoutes() {
        return routes;
    }

    /**
     * Define o valor da propriedade routes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public void setRoutes(JAXBElement<ArrayOfDomainInstance> value) {
        this.routes = value;
    }

    /**
     * Obtém o valor da propriedade sendOrdersTimeZoneOptionTimeZoneOption.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendOrdersTimeZoneOptionTimeZoneOption() {
        return sendOrdersTimeZoneOptionTimeZoneOption;
    }

    /**
     * Define o valor da propriedade sendOrdersTimeZoneOptionTimeZoneOption.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendOrdersTimeZoneOptionTimeZoneOption(JAXBElement<String> value) {
        this.sendOrdersTimeZoneOptionTimeZoneOption = value;
    }

    /**
     * Obtém o valor da propriedade stopNumberFormatAssignStopNumbersBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopNumberFormatAssignStopNumbersBy() {
        return stopNumberFormatAssignStopNumbersBy;
    }

    /**
     * Define o valor da propriedade stopNumberFormatAssignStopNumbersBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopNumberFormatAssignStopNumbersBy(JAXBElement<String> value) {
        this.stopNumberFormatAssignStopNumbersBy = value;
    }

    /**
     * Obtém o valor da propriedade template.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntitySendOrderTemplate }{@code >}
     *     
     */
    public JAXBElement<EntitySendOrderTemplate> getTemplate() {
        return template;
    }

    /**
     * Define o valor da propriedade template.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntitySendOrderTemplate }{@code >}
     *     
     */
    public void setTemplate(JAXBElement<EntitySendOrderTemplate> value) {
        this.template = value;
    }

    /**
     * Obtém o valor da propriedade useLatLonSuffix.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLatLonSuffix() {
        return useLatLonSuffix;
    }

    /**
     * Define o valor da propriedade useLatLonSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLatLonSuffix(Boolean value) {
        this.useLatLonSuffix = value;
    }

    /**
     * Obtém o valor da propriedade variableServiceTimeFormatServiceTimeFormat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVariableServiceTimeFormatServiceTimeFormat() {
        return variableServiceTimeFormatServiceTimeFormat;
    }

    /**
     * Define o valor da propriedade variableServiceTimeFormatServiceTimeFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVariableServiceTimeFormatServiceTimeFormat(JAXBElement<String> value) {
        this.variableServiceTimeFormatServiceTimeFormat = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

}
