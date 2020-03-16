
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkArcPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;


/**
 * <p>Classe Java de ApplyArcUpdatesOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ApplyArcUpdatesOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkArcPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArcsPropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArcsPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkArcPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ReturnUpdatedArcs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyArcUpdatesOptions", propOrder = {
    "propertyInclusionMode",
    "propertyOptions",
    "returnArcsPropertyInclusionMode",
    "returnArcsPropertyOptions",
    "returnUpdatedArcs"
})
public class ApplyArcUpdatesOptions {

    @XmlElement(name = "PropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode propertyInclusionMode;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArcPropertyOptions> propertyOptions;
    @XmlElement(name = "ReturnArcsPropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode returnArcsPropertyInclusionMode;
    @XmlElementRef(name = "ReturnArcsPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArcPropertyOptions> returnArcsPropertyOptions;
    @XmlElement(name = "ReturnUpdatedArcs")
    protected Boolean returnUpdatedArcs;

    /**
     * Obtém o valor da propriedade propertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getPropertyInclusionMode() {
        return propertyInclusionMode;
    }

    /**
     * Define o valor da propriedade propertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setPropertyInclusionMode(PropertyInclusionMode value) {
        this.propertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkArcPropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<NetworkArcPropertyOptions> value) {
        this.propertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade returnArcsPropertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getReturnArcsPropertyInclusionMode() {
        return returnArcsPropertyInclusionMode;
    }

    /**
     * Define o valor da propriedade returnArcsPropertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setReturnArcsPropertyInclusionMode(PropertyInclusionMode value) {
        this.returnArcsPropertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade returnArcsPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkArcPropertyOptions> getReturnArcsPropertyOptions() {
        return returnArcsPropertyOptions;
    }

    /**
     * Define o valor da propriedade returnArcsPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}
     *     
     */
    public void setReturnArcsPropertyOptions(JAXBElement<NetworkArcPropertyOptions> value) {
        this.returnArcsPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade returnUpdatedArcs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnUpdatedArcs() {
        return returnUpdatedArcs;
    }

    /**
     * Define o valor da propriedade returnUpdatedArcs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnUpdatedArcs(Boolean value) {
        this.returnUpdatedArcs = value;
    }

}
