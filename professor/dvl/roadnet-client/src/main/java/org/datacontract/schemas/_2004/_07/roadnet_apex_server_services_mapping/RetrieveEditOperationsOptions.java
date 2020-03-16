
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkEditOperationPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;


/**
 * <p>Classe Java de RetrieveEditOperationsOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEditOperationsOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxNumberOfEditOperations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkEditOperationPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEditOperationsOptions", propOrder = {
    "maxNumberOfEditOperations",
    "propertyInclusionMode",
    "propertyOptions"
})
public class RetrieveEditOperationsOptions {

    @XmlElement(name = "MaxNumberOfEditOperations")
    protected Integer maxNumberOfEditOperations;
    @XmlElement(name = "PropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode propertyInclusionMode;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkEditOperationPropertyOptions> propertyOptions;

    /**
     * Obtém o valor da propriedade maxNumberOfEditOperations.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfEditOperations() {
        return maxNumberOfEditOperations;
    }

    /**
     * Define o valor da propriedade maxNumberOfEditOperations.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfEditOperations(Integer value) {
        this.maxNumberOfEditOperations = value;
    }

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
     *     {@link JAXBElement }{@code <}{@link NetworkEditOperationPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkEditOperationPropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkEditOperationPropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<NetworkEditOperationPropertyOptions> value) {
        this.propertyOptions = value;
    }

}
