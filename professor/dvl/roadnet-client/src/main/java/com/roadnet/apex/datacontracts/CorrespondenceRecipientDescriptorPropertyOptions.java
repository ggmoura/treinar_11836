
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CorrespondenceRecipientDescriptorPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceRecipientDescriptorPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MailingListEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceRecipientDescriptorPropertyOptions", propOrder = {
    "activeOnly",
    "depotEntityKey",
    "mailingListEntityKey",
    "regionEntityKey",
    "routeEntityKey",
    "workerEntityKey"
})
public class CorrespondenceRecipientDescriptorPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "ActiveOnly")
    protected Boolean activeOnly;
    @XmlElement(name = "DepotEntityKey")
    protected Boolean depotEntityKey;
    @XmlElement(name = "MailingListEntityKey")
    protected Boolean mailingListEntityKey;
    @XmlElement(name = "RegionEntityKey")
    protected Boolean regionEntityKey;
    @XmlElement(name = "RouteEntityKey")
    protected Boolean routeEntityKey;
    @XmlElement(name = "WorkerEntityKey")
    protected Boolean workerEntityKey;

    /**
     * Obtém o valor da propriedade activeOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveOnly() {
        return activeOnly;
    }

    /**
     * Define o valor da propriedade activeOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveOnly(Boolean value) {
        this.activeOnly = value;
    }

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotEntityKey(Boolean value) {
        this.depotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mailingListEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMailingListEntityKey() {
        return mailingListEntityKey;
    }

    /**
     * Define o valor da propriedade mailingListEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailingListEntityKey(Boolean value) {
        this.mailingListEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionEntityKey(Boolean value) {
        this.regionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteEntityKey(Boolean value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerEntityKey(Boolean value) {
        this.workerEntityKey = value;
    }

}
