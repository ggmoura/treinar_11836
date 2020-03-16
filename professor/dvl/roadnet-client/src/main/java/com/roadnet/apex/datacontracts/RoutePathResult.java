
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RoutePathResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutePathResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FullPath" type="{http://roadnet.com/apex/DataContracts/}TravelPathResult" minOccurs="0"/&gt;
 *         &lt;element name="RemainingPath" type="{http://roadnet.com/apex/DataContracts/}TravelPathResult" minOccurs="0"/&gt;
 *         &lt;element name="ResourceEventSet" type="{http://roadnet.com/apex/DataContracts/}ResourceEventSet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePathResult", propOrder = {
    "fullPath",
    "remainingPath",
    "resourceEventSet"
})
public class RoutePathResult
    extends DataTransferObject
{

    @XmlElementRef(name = "FullPath", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathResult> fullPath;
    @XmlElementRef(name = "RemainingPath", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathResult> remainingPath;
    @XmlElementRef(name = "ResourceEventSet", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventSet> resourceEventSet;

    /**
     * Obtém o valor da propriedade fullPath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}
     *     
     */
    public JAXBElement<TravelPathResult> getFullPath() {
        return fullPath;
    }

    /**
     * Define o valor da propriedade fullPath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}
     *     
     */
    public void setFullPath(JAXBElement<TravelPathResult> value) {
        this.fullPath = value;
    }

    /**
     * Obtém o valor da propriedade remainingPath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}
     *     
     */
    public JAXBElement<TravelPathResult> getRemainingPath() {
        return remainingPath;
    }

    /**
     * Define o valor da propriedade remainingPath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}
     *     
     */
    public void setRemainingPath(JAXBElement<TravelPathResult> value) {
        this.remainingPath = value;
    }

    /**
     * Obtém o valor da propriedade resourceEventSet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventSet }{@code >}
     *     
     */
    public JAXBElement<ResourceEventSet> getResourceEventSet() {
        return resourceEventSet;
    }

    /**
     * Define o valor da propriedade resourceEventSet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventSet }{@code >}
     *     
     */
    public void setResourceEventSet(JAXBElement<ResourceEventSet> value) {
        this.resourceEventSet = value;
    }

}
