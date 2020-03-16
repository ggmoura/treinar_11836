
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SaveResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://roadnet.com/apex/DataContracts/}SaveErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="Object" type="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveResult", propOrder = {
    "entityKey",
    "error",
    "object"
})
public class SaveResult {

    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElementRef(name = "Error", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveErrorInfo> error;
    @XmlElementRef(name = "Object", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<AggregateRootEntity> object;

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityKey(Long value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade error.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveErrorInfo }{@code >}
     *     
     */
    public JAXBElement<SaveErrorInfo> getError() {
        return error;
    }

    /**
     * Define o valor da propriedade error.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveErrorInfo }{@code >}
     *     
     */
    public void setError(JAXBElement<SaveErrorInfo> value) {
        this.error = value;
    }

    /**
     * Obtém o valor da propriedade object.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AggregateRootEntity }{@code >}
     *     
     */
    public JAXBElement<AggregateRootEntity> getObject() {
        return object;
    }

    /**
     * Define o valor da propriedade object.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AggregateRootEntity }{@code >}
     *     
     */
    public void setObject(JAXBElement<AggregateRootEntity> value) {
        this.object = value;
    }

}
