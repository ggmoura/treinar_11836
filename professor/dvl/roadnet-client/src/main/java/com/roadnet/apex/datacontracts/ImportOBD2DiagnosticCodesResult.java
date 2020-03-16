
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ImportOBD2DiagnosticCodesResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportOBD2DiagnosticCodesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportErrors" type="{http://roadnet.com/apex/DataContracts/}ArrayOfImportOBD2DiagnosticCodesError" minOccurs="0"/&gt;
 *         &lt;element name="RawRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecordsAdded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecordsDeleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecordsMarkedForAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecordsMarkedForDelete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecordsMarkedForUpdate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecordsUpdated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportOBD2DiagnosticCodesResult", propOrder = {
    "importErrors",
    "rawRecords",
    "recordsAdded",
    "recordsDeleted",
    "recordsMarkedForAdd",
    "recordsMarkedForDelete",
    "recordsMarkedForUpdate",
    "recordsUpdated"
})
public class ImportOBD2DiagnosticCodesResult
    extends DataTransferObject
{

    @XmlElementRef(name = "ImportErrors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfImportOBD2DiagnosticCodesError> importErrors;
    @XmlElement(name = "RawRecords")
    protected Integer rawRecords;
    @XmlElement(name = "RecordsAdded")
    protected Integer recordsAdded;
    @XmlElement(name = "RecordsDeleted")
    protected Integer recordsDeleted;
    @XmlElement(name = "RecordsMarkedForAdd")
    protected Integer recordsMarkedForAdd;
    @XmlElement(name = "RecordsMarkedForDelete")
    protected Integer recordsMarkedForDelete;
    @XmlElement(name = "RecordsMarkedForUpdate")
    protected Integer recordsMarkedForUpdate;
    @XmlElement(name = "RecordsUpdated")
    protected Integer recordsUpdated;

    /**
     * Obtém o valor da propriedade importErrors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImportOBD2DiagnosticCodesError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfImportOBD2DiagnosticCodesError> getImportErrors() {
        return importErrors;
    }

    /**
     * Define o valor da propriedade importErrors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImportOBD2DiagnosticCodesError }{@code >}
     *     
     */
    public void setImportErrors(JAXBElement<ArrayOfImportOBD2DiagnosticCodesError> value) {
        this.importErrors = value;
    }

    /**
     * Obtém o valor da propriedade rawRecords.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRawRecords() {
        return rawRecords;
    }

    /**
     * Define o valor da propriedade rawRecords.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRawRecords(Integer value) {
        this.rawRecords = value;
    }

    /**
     * Obtém o valor da propriedade recordsAdded.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordsAdded() {
        return recordsAdded;
    }

    /**
     * Define o valor da propriedade recordsAdded.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordsAdded(Integer value) {
        this.recordsAdded = value;
    }

    /**
     * Obtém o valor da propriedade recordsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordsDeleted() {
        return recordsDeleted;
    }

    /**
     * Define o valor da propriedade recordsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordsDeleted(Integer value) {
        this.recordsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade recordsMarkedForAdd.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordsMarkedForAdd() {
        return recordsMarkedForAdd;
    }

    /**
     * Define o valor da propriedade recordsMarkedForAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordsMarkedForAdd(Integer value) {
        this.recordsMarkedForAdd = value;
    }

    /**
     * Obtém o valor da propriedade recordsMarkedForDelete.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordsMarkedForDelete() {
        return recordsMarkedForDelete;
    }

    /**
     * Define o valor da propriedade recordsMarkedForDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordsMarkedForDelete(Integer value) {
        this.recordsMarkedForDelete = value;
    }

    /**
     * Obtém o valor da propriedade recordsMarkedForUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordsMarkedForUpdate() {
        return recordsMarkedForUpdate;
    }

    /**
     * Define o valor da propriedade recordsMarkedForUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordsMarkedForUpdate(Integer value) {
        this.recordsMarkedForUpdate = value;
    }

    /**
     * Obtém o valor da propriedade recordsUpdated.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordsUpdated() {
        return recordsUpdated;
    }

    /**
     * Define o valor da propriedade recordsUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordsUpdated(Integer value) {
        this.recordsUpdated = value;
    }

}
