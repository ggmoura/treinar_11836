
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ActiveAlertRecipientType.AdditionalField complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ActiveAlertRecipientType.AdditionalField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlertRecipientTypeAdditionalFieldType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomEntityPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveAlertRecipientType.AdditionalField", propOrder = {
    "activeAlertRecipientTypeAdditionalFieldTypeType",
    "customEntityPropertyName",
    "title"
})
public class ActiveAlertRecipientTypeAdditionalField
    extends DataTransferObject
{

    @XmlElementRef(name = "ActiveAlertRecipientTypeAdditionalFieldType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeAlertRecipientTypeAdditionalFieldTypeType;
    @XmlElementRef(name = "CustomEntityPropertyName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customEntityPropertyName;
    @XmlElementRef(name = "Title", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;

    /**
     * Obtém o valor da propriedade activeAlertRecipientTypeAdditionalFieldTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveAlertRecipientTypeAdditionalFieldTypeType() {
        return activeAlertRecipientTypeAdditionalFieldTypeType;
    }

    /**
     * Define o valor da propriedade activeAlertRecipientTypeAdditionalFieldTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveAlertRecipientTypeAdditionalFieldTypeType(JAXBElement<String> value) {
        this.activeAlertRecipientTypeAdditionalFieldTypeType = value;
    }

    /**
     * Obtém o valor da propriedade customEntityPropertyName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomEntityPropertyName() {
        return customEntityPropertyName;
    }

    /**
     * Define o valor da propriedade customEntityPropertyName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomEntityPropertyName(JAXBElement<String> value) {
        this.customEntityPropertyName = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

}
