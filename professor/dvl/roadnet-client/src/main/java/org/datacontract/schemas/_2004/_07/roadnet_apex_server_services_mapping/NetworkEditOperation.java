
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkDataStoreEntity;


/**
 * <p>Classe Java de NetworkEditOperation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkEditOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}NetworkDataStoreEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EditRecords" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfNetworkEditRecord" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsCommunityProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetworkArcPropertyFlags_ChangedProperties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkEditOperationStatus_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkEditOperation", propOrder = {
    "comment",
    "editRecords",
    "identifier",
    "isCommunityProvided",
    "networkArcPropertyFlagsChangedProperties",
    "networkEditOperationStatusStatus"
})
public class NetworkEditOperation
    extends NetworkDataStoreEntity
{

    @XmlElementRef(name = "Comment", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "EditRecords", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkEditRecord> editRecords;
    @XmlElement(name = "Identifier")
    protected Integer identifier;
    @XmlElement(name = "IsCommunityProvided")
    protected Boolean isCommunityProvided;
    @XmlElementRef(name = "NetworkArcPropertyFlags_ChangedProperties", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkArcPropertyFlagsChangedProperties;
    @XmlElementRef(name = "NetworkEditOperationStatus_Status", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkEditOperationStatusStatus;

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Obtém o valor da propriedade editRecords.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkEditRecord }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkEditRecord> getEditRecords() {
        return editRecords;
    }

    /**
     * Define o valor da propriedade editRecords.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkEditRecord }{@code >}
     *     
     */
    public void setEditRecords(JAXBElement<ArrayOfNetworkEditRecord> value) {
        this.editRecords = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdentifier(Integer value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isCommunityProvided.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommunityProvided() {
        return isCommunityProvided;
    }

    /**
     * Define o valor da propriedade isCommunityProvided.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommunityProvided(Boolean value) {
        this.isCommunityProvided = value;
    }

    /**
     * Obtém o valor da propriedade networkArcPropertyFlagsChangedProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkArcPropertyFlagsChangedProperties() {
        return networkArcPropertyFlagsChangedProperties;
    }

    /**
     * Define o valor da propriedade networkArcPropertyFlagsChangedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkArcPropertyFlagsChangedProperties(JAXBElement<String> value) {
        this.networkArcPropertyFlagsChangedProperties = value;
    }

    /**
     * Obtém o valor da propriedade networkEditOperationStatusStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkEditOperationStatusStatus() {
        return networkEditOperationStatusStatus;
    }

    /**
     * Define o valor da propriedade networkEditOperationStatusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkEditOperationStatusStatus(JAXBElement<String> value) {
        this.networkEditOperationStatusStatus = value;
    }

}
