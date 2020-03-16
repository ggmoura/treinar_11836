
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}OrderBaseImportParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlterOrdersOnBuiltRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CombineWithExistingRoutes" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}OrderImportParameters.AddToRoute" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderImportParameters", propOrder = {
    "alterOrdersOnBuiltRoutes",
    "combineWithExistingRoutes",
    "managedByEntityKey",
    "sessionEntityKey"
})
public class OrderImportParameters
    extends OrderBaseImportParameters
{

    @XmlElement(name = "AlterOrdersOnBuiltRoutes")
    protected Boolean alterOrdersOnBuiltRoutes;
    @XmlList
    @XmlElement(name = "CombineWithExistingRoutes")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> combineWithExistingRoutes;
    @XmlElementRef(name = "ManagedByEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> managedByEntityKey;
    @XmlElementRef(name = "SessionEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sessionEntityKey;

    /**
     * Obtém o valor da propriedade alterOrdersOnBuiltRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlterOrdersOnBuiltRoutes() {
        return alterOrdersOnBuiltRoutes;
    }

    /**
     * Define o valor da propriedade alterOrdersOnBuiltRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlterOrdersOnBuiltRoutes(Boolean value) {
        this.alterOrdersOnBuiltRoutes = value;
    }

    /**
     * Gets the value of the combineWithExistingRoutes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combineWithExistingRoutes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombineWithExistingRoutes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCombineWithExistingRoutes() {
        if (combineWithExistingRoutes == null) {
            combineWithExistingRoutes = new ArrayList<String>();
        }
        return this.combineWithExistingRoutes;
    }

    /**
     * Obtém o valor da propriedade managedByEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getManagedByEntityKey() {
        return managedByEntityKey;
    }

    /**
     * Define o valor da propriedade managedByEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setManagedByEntityKey(JAXBElement<Long> value) {
        this.managedByEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSessionEntityKey(JAXBElement<Long> value) {
        this.sessionEntityKey = value;
    }

}
