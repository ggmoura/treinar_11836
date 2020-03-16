
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfShareableEntityAccessor;
import com.roadnet.apex.datacontracts.EntityType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shareableEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="shareableType" type="{http://roadnet.com/apex/DataContracts/}EntityType" minOccurs="0"/&gt;
 *         &lt;element name="shareableEntityAccessors" type="{http://roadnet.com/apex/DataContracts/}ArrayOfShareableEntityAccessor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shareableEntityKey",
    "shareableType",
    "shareableEntityAccessors"
})
@XmlRootElement(name = "CreateAndUpdateSharedEntityAccess")
public class CreateAndUpdateSharedEntityAccess {

    protected Long shareableEntityKey;
    @XmlSchemaType(name = "string")
    protected EntityType shareableType;
    @XmlElementRef(name = "shareableEntityAccessors", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfShareableEntityAccessor> shareableEntityAccessors;

    /**
     * Obtém o valor da propriedade shareableEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShareableEntityKey() {
        return shareableEntityKey;
    }

    /**
     * Define o valor da propriedade shareableEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShareableEntityKey(Long value) {
        this.shareableEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade shareableType.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getShareableType() {
        return shareableType;
    }

    /**
     * Define o valor da propriedade shareableType.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setShareableType(EntityType value) {
        this.shareableType = value;
    }

    /**
     * Obtém o valor da propriedade shareableEntityAccessors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShareableEntityAccessor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfShareableEntityAccessor> getShareableEntityAccessors() {
        return shareableEntityAccessors;
    }

    /**
     * Define o valor da propriedade shareableEntityAccessors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShareableEntityAccessor }{@code >}
     *     
     */
    public void setShareableEntityAccessors(JAXBElement<ArrayOfShareableEntityAccessor> value) {
        this.shareableEntityAccessors = value;
    }

}
