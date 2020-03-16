
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ImportResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportEntityResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfImportEntityResult" minOccurs="0"/&gt;
 *         &lt;element name="ImportResultDetail" type="{http://roadnet.com/apex/DataContracts/}ImportResultDetail" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RawRecords" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecordsAdded" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecordsDeleted" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecordsMarkedForAdd" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecordsMarkedForDelete" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecordsMarkedForUpdate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecordsUpdated" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalRecordsParsed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalRecordsSubmitted" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalRecordsTransferred" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportResult", propOrder = {
    "importEntityResults",
    "importResultDetail",
    "name",
    "rawRecords",
    "recordsAdded",
    "recordsDeleted",
    "recordsMarkedForAdd",
    "recordsMarkedForDelete",
    "recordsMarkedForUpdate",
    "recordsUpdated",
    "totalRecordsParsed",
    "totalRecordsSubmitted",
    "totalRecordsTransferred"
})
public class ImportResult
    extends DataTransferObject
{

    @XmlElementRef(name = "ImportEntityResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfImportEntityResult> importEntityResults;
    @XmlElementRef(name = "ImportResultDetail", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportResultDetail> importResultDetail;
    @XmlElementRef(name = "Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "RawRecords")
    protected Long rawRecords;
    @XmlElement(name = "RecordsAdded")
    protected Long recordsAdded;
    @XmlElement(name = "RecordsDeleted")
    protected Long recordsDeleted;
    @XmlElement(name = "RecordsMarkedForAdd")
    protected Long recordsMarkedForAdd;
    @XmlElement(name = "RecordsMarkedForDelete")
    protected Long recordsMarkedForDelete;
    @XmlElement(name = "RecordsMarkedForUpdate")
    protected Long recordsMarkedForUpdate;
    @XmlElement(name = "RecordsUpdated")
    protected Long recordsUpdated;
    @XmlElement(name = "TotalRecordsParsed")
    protected Long totalRecordsParsed;
    @XmlElement(name = "TotalRecordsSubmitted")
    protected Long totalRecordsSubmitted;
    @XmlElement(name = "TotalRecordsTransferred")
    protected Long totalRecordsTransferred;

    /**
     * Obtém o valor da propriedade importEntityResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImportEntityResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfImportEntityResult> getImportEntityResults() {
        return importEntityResults;
    }

    /**
     * Define o valor da propriedade importEntityResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImportEntityResult }{@code >}
     *     
     */
    public void setImportEntityResults(JAXBElement<ArrayOfImportEntityResult> value) {
        this.importEntityResults = value;
    }

    /**
     * Obtém o valor da propriedade importResultDetail.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportResultDetail }{@code >}
     *     
     */
    public JAXBElement<ImportResultDetail> getImportResultDetail() {
        return importResultDetail;
    }

    /**
     * Define o valor da propriedade importResultDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportResultDetail }{@code >}
     *     
     */
    public void setImportResultDetail(JAXBElement<ImportResultDetail> value) {
        this.importResultDetail = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade rawRecords.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRawRecords() {
        return rawRecords;
    }

    /**
     * Define o valor da propriedade rawRecords.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRawRecords(Long value) {
        this.rawRecords = value;
    }

    /**
     * Obtém o valor da propriedade recordsAdded.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordsAdded() {
        return recordsAdded;
    }

    /**
     * Define o valor da propriedade recordsAdded.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordsAdded(Long value) {
        this.recordsAdded = value;
    }

    /**
     * Obtém o valor da propriedade recordsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordsDeleted() {
        return recordsDeleted;
    }

    /**
     * Define o valor da propriedade recordsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordsDeleted(Long value) {
        this.recordsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade recordsMarkedForAdd.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordsMarkedForAdd() {
        return recordsMarkedForAdd;
    }

    /**
     * Define o valor da propriedade recordsMarkedForAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordsMarkedForAdd(Long value) {
        this.recordsMarkedForAdd = value;
    }

    /**
     * Obtém o valor da propriedade recordsMarkedForDelete.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordsMarkedForDelete() {
        return recordsMarkedForDelete;
    }

    /**
     * Define o valor da propriedade recordsMarkedForDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordsMarkedForDelete(Long value) {
        this.recordsMarkedForDelete = value;
    }

    /**
     * Obtém o valor da propriedade recordsMarkedForUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordsMarkedForUpdate() {
        return recordsMarkedForUpdate;
    }

    /**
     * Define o valor da propriedade recordsMarkedForUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordsMarkedForUpdate(Long value) {
        this.recordsMarkedForUpdate = value;
    }

    /**
     * Obtém o valor da propriedade recordsUpdated.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordsUpdated() {
        return recordsUpdated;
    }

    /**
     * Define o valor da propriedade recordsUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordsUpdated(Long value) {
        this.recordsUpdated = value;
    }

    /**
     * Obtém o valor da propriedade totalRecordsParsed.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRecordsParsed() {
        return totalRecordsParsed;
    }

    /**
     * Define o valor da propriedade totalRecordsParsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRecordsParsed(Long value) {
        this.totalRecordsParsed = value;
    }

    /**
     * Obtém o valor da propriedade totalRecordsSubmitted.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRecordsSubmitted() {
        return totalRecordsSubmitted;
    }

    /**
     * Define o valor da propriedade totalRecordsSubmitted.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRecordsSubmitted(Long value) {
        this.totalRecordsSubmitted = value;
    }

    /**
     * Obtém o valor da propriedade totalRecordsTransferred.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRecordsTransferred() {
        return totalRecordsTransferred;
    }

    /**
     * Define o valor da propriedade totalRecordsTransferred.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRecordsTransferred(Long value) {
        this.totalRecordsTransferred = value;
    }

}
