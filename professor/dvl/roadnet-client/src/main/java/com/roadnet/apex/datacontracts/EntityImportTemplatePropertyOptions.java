
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntityImportTemplatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntityImportTemplatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}EntityTransferTemplatePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeleteErrorLogAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreFirstLines" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreLastLines" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ImportErrorMode_ErrorMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PropertiesOptions" type="{http://roadnet.com/apex/DataContracts/}PropertyImportTemplatePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SheetName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityImportTemplatePropertyOptions", propOrder = {
    "deleteErrorLogAfter",
    "ignoreFirstLines",
    "ignoreLastLines",
    "importErrorModeErrorMode",
    "measurementOptions",
    "propertiesOptions",
    "sheetName",
    "worldTimeZoneTimeZone"
})
public class EntityImportTemplatePropertyOptions
    extends EntityTransferTemplatePropertyOptions
{

    @XmlElement(name = "DeleteErrorLogAfter")
    protected Boolean deleteErrorLogAfter;
    @XmlElement(name = "IgnoreFirstLines")
    protected Boolean ignoreFirstLines;
    @XmlElement(name = "IgnoreLastLines")
    protected Boolean ignoreLastLines;
    @XmlElement(name = "ImportErrorMode_ErrorMode")
    protected Boolean importErrorModeErrorMode;
    @XmlElement(name = "MeasurementOptions")
    protected Boolean measurementOptions;
    @XmlElementRef(name = "PropertiesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyImportTemplatePropertyOptions> propertiesOptions;
    @XmlElement(name = "SheetName")
    protected Boolean sheetName;
    @XmlElement(name = "WorldTimeZone_TimeZone")
    protected Boolean worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade deleteErrorLogAfter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteErrorLogAfter() {
        return deleteErrorLogAfter;
    }

    /**
     * Define o valor da propriedade deleteErrorLogAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteErrorLogAfter(Boolean value) {
        this.deleteErrorLogAfter = value;
    }

    /**
     * Obtém o valor da propriedade ignoreFirstLines.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreFirstLines() {
        return ignoreFirstLines;
    }

    /**
     * Define o valor da propriedade ignoreFirstLines.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreFirstLines(Boolean value) {
        this.ignoreFirstLines = value;
    }

    /**
     * Obtém o valor da propriedade ignoreLastLines.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreLastLines() {
        return ignoreLastLines;
    }

    /**
     * Define o valor da propriedade ignoreLastLines.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreLastLines(Boolean value) {
        this.ignoreLastLines = value;
    }

    /**
     * Obtém o valor da propriedade importErrorModeErrorMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportErrorModeErrorMode() {
        return importErrorModeErrorMode;
    }

    /**
     * Define o valor da propriedade importErrorModeErrorMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportErrorModeErrorMode(Boolean value) {
        this.importErrorModeErrorMode = value;
    }

    /**
     * Obtém o valor da propriedade measurementOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasurementOptions() {
        return measurementOptions;
    }

    /**
     * Define o valor da propriedade measurementOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasurementOptions(Boolean value) {
        this.measurementOptions = value;
    }

    /**
     * Obtém o valor da propriedade propertiesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyImportTemplatePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<PropertyImportTemplatePropertyOptions> getPropertiesOptions() {
        return propertiesOptions;
    }

    /**
     * Define o valor da propriedade propertiesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyImportTemplatePropertyOptions }{@code >}
     *     
     */
    public void setPropertiesOptions(JAXBElement<PropertyImportTemplatePropertyOptions> value) {
        this.propertiesOptions = value;
    }

    /**
     * Obtém o valor da propriedade sheetName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSheetName() {
        return sheetName;
    }

    /**
     * Define o valor da propriedade sheetName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSheetName(Boolean value) {
        this.sheetName = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneTimeZone(Boolean value) {
        this.worldTimeZoneTimeZone = value;
    }

}
