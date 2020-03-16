
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de SaveMidRouteDepotStopArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveMidRouteDepotStopArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}SaveStopArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction" type="{http://roadnet.com/apex/DataContracts/}LoadAction" minOccurs="0"/&gt;
 *         &lt;element name="ReloadTimeOverride" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveMidRouteDepotStopArgs", propOrder = {
    "depotEntityKey",
    "entityKey",
    "loadAction",
    "reloadTimeOverride"
})
public class SaveMidRouteDepotStopArgs
    extends SaveStopArgs
{

    @XmlElement(name = "DepotEntityKey")
    protected Long depotEntityKey;
    @XmlElementRef(name = "EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> entityKey;
    @XmlElementRef(name = "LoadAction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoadAction> loadAction;
    @XmlElementRef(name = "ReloadTimeOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> reloadTimeOverride;

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepotEntityKey(Long value) {
        this.depotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEntityKey(JAXBElement<Long> value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade loadAction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoadAction }{@code >}
     *     
     */
    public JAXBElement<LoadAction> getLoadAction() {
        return loadAction;
    }

    /**
     * Define o valor da propriedade loadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoadAction }{@code >}
     *     
     */
    public void setLoadAction(JAXBElement<LoadAction> value) {
        this.loadAction = value;
    }

    /**
     * Obtém o valor da propriedade reloadTimeOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getReloadTimeOverride() {
        return reloadTimeOverride;
    }

    /**
     * Define o valor da propriedade reloadTimeOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setReloadTimeOverride(JAXBElement<Duration> value) {
        this.reloadTimeOverride = value;
    }

}
