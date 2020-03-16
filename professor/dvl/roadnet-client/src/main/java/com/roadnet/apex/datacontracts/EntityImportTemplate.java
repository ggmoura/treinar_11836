
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntityImportTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntityImportTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}EntityTransferTemplate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeleteErrorLogAfter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreFirstLines" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreLastLines" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ImportErrorMode_ErrorMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementOptions" type="{http://roadnet.com/apex/DataContracts/}MeasurementOptions" minOccurs="0"/&gt;
 *         &lt;element name="SheetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityImportTemplate", propOrder = {
    "deleteErrorLogAfter",
    "ignoreFirstLines",
    "ignoreLastLines",
    "importErrorModeErrorMode",
    "measurementOptions",
    "sheetName",
    "worldTimeZoneTimeZone"
})
public class EntityImportTemplate
    extends EntityTransferTemplate
{

    @XmlElement(name = "DeleteErrorLogAfter")
    protected Integer deleteErrorLogAfter;
    @XmlElement(name = "IgnoreFirstLines")
    protected Integer ignoreFirstLines;
    @XmlElement(name = "IgnoreLastLines")
    protected Integer ignoreLastLines;
    @XmlElementRef(name = "ImportErrorMode_ErrorMode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importErrorModeErrorMode;
    @XmlElementRef(name = "MeasurementOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasurementOptions> measurementOptions;
    @XmlElementRef(name = "SheetName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sheetName;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade deleteErrorLogAfter.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeleteErrorLogAfter() {
        return deleteErrorLogAfter;
    }

    /**
     * Define o valor da propriedade deleteErrorLogAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeleteErrorLogAfter(Integer value) {
        this.deleteErrorLogAfter = value;
    }

    /**
     * Obtém o valor da propriedade ignoreFirstLines.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnoreFirstLines() {
        return ignoreFirstLines;
    }

    /**
     * Define o valor da propriedade ignoreFirstLines.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnoreFirstLines(Integer value) {
        this.ignoreFirstLines = value;
    }

    /**
     * Obtém o valor da propriedade ignoreLastLines.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnoreLastLines() {
        return ignoreLastLines;
    }

    /**
     * Define o valor da propriedade ignoreLastLines.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnoreLastLines(Integer value) {
        this.ignoreLastLines = value;
    }

    /**
     * Obtém o valor da propriedade importErrorModeErrorMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportErrorModeErrorMode() {
        return importErrorModeErrorMode;
    }

    /**
     * Define o valor da propriedade importErrorModeErrorMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportErrorModeErrorMode(JAXBElement<String> value) {
        this.importErrorModeErrorMode = value;
    }

    /**
     * Obtém o valor da propriedade measurementOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasurementOptions }{@code >}
     *     
     */
    public JAXBElement<MeasurementOptions> getMeasurementOptions() {
        return measurementOptions;
    }

    /**
     * Define o valor da propriedade measurementOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasurementOptions }{@code >}
     *     
     */
    public void setMeasurementOptions(JAXBElement<MeasurementOptions> value) {
        this.measurementOptions = value;
    }

    /**
     * Obtém o valor da propriedade sheetName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSheetName() {
        return sheetName;
    }

    /**
     * Define o valor da propriedade sheetName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSheetName(JAXBElement<String> value) {
        this.sheetName = value;
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
