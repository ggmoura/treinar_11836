
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionBasedAggregateRootEntityPropertyOptions;


/**
 * <p>Classe Java de FileResultPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FileResultPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseFileType_FileType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FileUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileResultPropertyOptions", propOrder = {
    "dataWarehouseFileTypeFileType",
    "fileName",
    "fileSize",
    "fileUrl"
})
public class FileResultPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseFileType_FileType")
    protected Boolean dataWarehouseFileTypeFileType;
    @XmlElement(name = "FileName")
    protected Boolean fileName;
    @XmlElement(name = "FileSize")
    protected Boolean fileSize;
    @XmlElement(name = "FileUrl")
    protected Boolean fileUrl;

    /**
     * Obtém o valor da propriedade dataWarehouseFileTypeFileType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseFileTypeFileType() {
        return dataWarehouseFileTypeFileType;
    }

    /**
     * Define o valor da propriedade dataWarehouseFileTypeFileType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseFileTypeFileType(Boolean value) {
        this.dataWarehouseFileTypeFileType = value;
    }

    /**
     * Obtém o valor da propriedade fileName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileName() {
        return fileName;
    }

    /**
     * Define o valor da propriedade fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileName(Boolean value) {
        this.fileName = value;
    }

    /**
     * Obtém o valor da propriedade fileSize.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileSize() {
        return fileSize;
    }

    /**
     * Define o valor da propriedade fileSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileSize(Boolean value) {
        this.fileSize = value;
    }

    /**
     * Obtém o valor da propriedade fileUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileUrl() {
        return fileUrl;
    }

    /**
     * Define o valor da propriedade fileUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileUrl(Boolean value) {
        this.fileUrl = value;
    }

}
