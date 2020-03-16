
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkRestrictedPathPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;


/**
 * <p>Classe Java de UpdateRestrictedPathOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateRestrictedPathOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkRestrictedPathPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ReturnUpdatedTravelPath" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRestrictedPathOptions", propOrder = {
    "propertyInclusionMode",
    "propertyOptions",
    "returnUpdatedTravelPath"
})
public class UpdateRestrictedPathOptions {

    @XmlElement(name = "PropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode propertyInclusionMode;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkRestrictedPathPropertyOptions> propertyOptions;
    @XmlElement(name = "ReturnUpdatedTravelPath")
    protected Boolean returnUpdatedTravelPath;

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
     *     {@link JAXBElement }{@code <}{@link NetworkRestrictedPathPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkRestrictedPathPropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkRestrictedPathPropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<NetworkRestrictedPathPropertyOptions> value) {
        this.propertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade returnUpdatedTravelPath.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnUpdatedTravelPath() {
        return returnUpdatedTravelPath;
    }

    /**
     * Define o valor da propriedade returnUpdatedTravelPath.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnUpdatedTravelPath(Boolean value) {
        this.returnUpdatedTravelPath = value;
    }

}
