
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DeleteTerritoriesResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeleteTerritoriesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeletedTerritoryKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="Errors" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDeleteTerritoriesResultError" minOccurs="0"/&gt;
 *         &lt;element name="TerritoriesFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TerritoriesProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TerritoriesTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteTerritoriesResult", propOrder = {
    "deletedTerritoryKeys",
    "errors",
    "territoriesFailed",
    "territoriesProcessed",
    "territoriesTotal"
})
public class DeleteTerritoriesResult
    extends DataTransferObject
{

    @XmlElementRef(name = "DeletedTerritoryKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> deletedTerritoryKeys;
    @XmlElementRef(name = "Errors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDeleteTerritoriesResultError> errors;
    @XmlElement(name = "TerritoriesFailed")
    protected Integer territoriesFailed;
    @XmlElement(name = "TerritoriesProcessed")
    protected Integer territoriesProcessed;
    @XmlElement(name = "TerritoriesTotal")
    protected Integer territoriesTotal;

    /**
     * Obtém o valor da propriedade deletedTerritoryKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getDeletedTerritoryKeys() {
        return deletedTerritoryKeys;
    }

    /**
     * Define o valor da propriedade deletedTerritoryKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setDeletedTerritoryKeys(JAXBElement<ArrayOflong> value) {
        this.deletedTerritoryKeys = value;
    }

    /**
     * Obtém o valor da propriedade errors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeleteTerritoriesResultError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDeleteTerritoriesResultError> getErrors() {
        return errors;
    }

    /**
     * Define o valor da propriedade errors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeleteTerritoriesResultError }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfDeleteTerritoriesResultError> value) {
        this.errors = value;
    }

    /**
     * Obtém o valor da propriedade territoriesFailed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerritoriesFailed() {
        return territoriesFailed;
    }

    /**
     * Define o valor da propriedade territoriesFailed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerritoriesFailed(Integer value) {
        this.territoriesFailed = value;
    }

    /**
     * Obtém o valor da propriedade territoriesProcessed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerritoriesProcessed() {
        return territoriesProcessed;
    }

    /**
     * Define o valor da propriedade territoriesProcessed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerritoriesProcessed(Integer value) {
        this.territoriesProcessed = value;
    }

    /**
     * Obtém o valor da propriedade territoriesTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerritoriesTotal() {
        return territoriesTotal;
    }

    /**
     * Define o valor da propriedade territoriesTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerritoriesTotal(Integer value) {
        this.territoriesTotal = value;
    }

}
