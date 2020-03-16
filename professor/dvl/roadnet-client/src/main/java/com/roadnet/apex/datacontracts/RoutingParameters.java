
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
 * <p>Classe Java de RoutingParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutingParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsiderOnlyMyOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreFlags_IgnoreConstraints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreOrderUrgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="PassProcessingType_PassProcessingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnassignUnlockedStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingParameters", propOrder = {
    "considerOnlyMyOrders",
    "ignoreFlagsIgnoreConstraints",
    "ignoreOrderUrgency",
    "passEntityKeys",
    "passProcessingTypePassProcessingMode",
    "unassignUnlockedStops"
})
public class RoutingParameters
    extends DataTransferObject
{

    @XmlElement(name = "ConsiderOnlyMyOrders")
    protected Boolean considerOnlyMyOrders;
    @XmlElementRef(name = "IgnoreFlags_IgnoreConstraints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignoreFlagsIgnoreConstraints;
    @XmlElement(name = "IgnoreOrderUrgency")
    protected Boolean ignoreOrderUrgency;
    @XmlElementRef(name = "PassEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> passEntityKeys;
    @XmlElementRef(name = "PassProcessingType_PassProcessingMode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passProcessingTypePassProcessingMode;
    @XmlElement(name = "UnassignUnlockedStops")
    protected Boolean unassignUnlockedStops;

    /**
     * Obtém o valor da propriedade considerOnlyMyOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderOnlyMyOrders() {
        return considerOnlyMyOrders;
    }

    /**
     * Define o valor da propriedade considerOnlyMyOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderOnlyMyOrders(Boolean value) {
        this.considerOnlyMyOrders = value;
    }

    /**
     * Obtém o valor da propriedade ignoreFlagsIgnoreConstraints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIgnoreFlagsIgnoreConstraints() {
        return ignoreFlagsIgnoreConstraints;
    }

    /**
     * Define o valor da propriedade ignoreFlagsIgnoreConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIgnoreFlagsIgnoreConstraints(JAXBElement<String> value) {
        this.ignoreFlagsIgnoreConstraints = value;
    }

    /**
     * Obtém o valor da propriedade ignoreOrderUrgency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreOrderUrgency() {
        return ignoreOrderUrgency;
    }

    /**
     * Define o valor da propriedade ignoreOrderUrgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreOrderUrgency(Boolean value) {
        this.ignoreOrderUrgency = value;
    }

    /**
     * Obtém o valor da propriedade passEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getPassEntityKeys() {
        return passEntityKeys;
    }

    /**
     * Define o valor da propriedade passEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setPassEntityKeys(JAXBElement<ArrayOflong> value) {
        this.passEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade passProcessingTypePassProcessingMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassProcessingTypePassProcessingMode() {
        return passProcessingTypePassProcessingMode;
    }

    /**
     * Define o valor da propriedade passProcessingTypePassProcessingMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassProcessingTypePassProcessingMode(JAXBElement<String> value) {
        this.passProcessingTypePassProcessingMode = value;
    }

    /**
     * Obtém o valor da propriedade unassignUnlockedStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnassignUnlockedStops() {
        return unassignUnlockedStops;
    }

    /**
     * Define o valor da propriedade unassignUnlockedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnassignUnlockedStops(Boolean value) {
        this.unassignUnlockedStops = value;
    }

}
