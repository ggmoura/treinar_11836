
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LocationImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocationImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}ImportParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoordinateFormat" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}CoordinateFormat" minOccurs="0"/&gt;
 *         &lt;element name="DeleteRecordsWithOnlyIdSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DoNotGeocode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdateExistingServiceLocationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationImportParameters", propOrder = {
    "coordinateFormat",
    "deleteRecordsWithOnlyIdSpecified",
    "doNotGeocode",
    "updateExistingServiceLocationOnly"
})
@XmlSeeAlso({
    DepotImportParameters.class,
    ServiceLocationImportParameters.class,
    LayoverLocationImportParameters.class
})
public class LocationImportParameters
    extends ImportParameters
{

    @XmlElement(name = "CoordinateFormat")
    @XmlSchemaType(name = "string")
    protected CoordinateFormat coordinateFormat;
    @XmlElement(name = "DeleteRecordsWithOnlyIdSpecified")
    protected Boolean deleteRecordsWithOnlyIdSpecified;
    @XmlElement(name = "DoNotGeocode")
    protected Boolean doNotGeocode;
    @XmlElement(name = "UpdateExistingServiceLocationOnly")
    protected Boolean updateExistingServiceLocationOnly;

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
     * Obtém o valor da propriedade deleteRecordsWithOnlyIdSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteRecordsWithOnlyIdSpecified() {
        return deleteRecordsWithOnlyIdSpecified;
    }

    /**
     * Define o valor da propriedade deleteRecordsWithOnlyIdSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteRecordsWithOnlyIdSpecified(Boolean value) {
        this.deleteRecordsWithOnlyIdSpecified = value;
    }

    /**
     * Obtém o valor da propriedade doNotGeocode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotGeocode() {
        return doNotGeocode;
    }

    /**
     * Define o valor da propriedade doNotGeocode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotGeocode(Boolean value) {
        this.doNotGeocode = value;
    }

    /**
     * Obtém o valor da propriedade updateExistingServiceLocationOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateExistingServiceLocationOnly() {
        return updateExistingServiceLocationOnly;
    }

    /**
     * Define o valor da propriedade updateExistingServiceLocationOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateExistingServiceLocationOnly(Boolean value) {
        this.updateExistingServiceLocationOnly = value;
    }

}
