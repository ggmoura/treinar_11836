
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ClientApplicationPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ClientApplicationPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientApplicationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UsesInternalEndpoints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VersionChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientApplicationPropertyOptions", propOrder = {
    "clientApplicationIdentifier",
    "name",
    "usesInternalEndpoints",
    "versionChecked"
})
public class ClientApplicationPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "ClientApplicationIdentifier")
    protected Boolean clientApplicationIdentifier;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "UsesInternalEndpoints")
    protected Boolean usesInternalEndpoints;
    @XmlElement(name = "VersionChecked")
    protected Boolean versionChecked;

    /**
     * Obtém o valor da propriedade clientApplicationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplicationIdentifier() {
        return clientApplicationIdentifier;
    }

    /**
     * Define o valor da propriedade clientApplicationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplicationIdentifier(Boolean value) {
        this.clientApplicationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade usesInternalEndpoints.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesInternalEndpoints() {
        return usesInternalEndpoints;
    }

    /**
     * Define o valor da propriedade usesInternalEndpoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesInternalEndpoints(Boolean value) {
        this.usesInternalEndpoints = value;
    }

    /**
     * Obtém o valor da propriedade versionChecked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVersionChecked() {
        return versionChecked;
    }

    /**
     * Define o valor da propriedade versionChecked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVersionChecked(Boolean value) {
        this.versionChecked = value;
    }

}
