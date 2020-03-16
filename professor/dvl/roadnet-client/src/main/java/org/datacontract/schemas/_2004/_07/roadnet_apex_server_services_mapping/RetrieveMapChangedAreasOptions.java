
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
 * <p>Classe Java de RetrieveMapChangedAreasOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMapChangedAreasOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForceEditsRefresh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxNumberOfArcEdits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkArcPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMapChangedAreasOptions", propOrder = {
    "forceEditsRefresh",
    "maxNumberOfArcEdits",
    "propertyInclusionMode",
    "propertyOptions"
})
public class RetrieveMapChangedAreasOptions {

    @XmlElement(name = "ForceEditsRefresh")
    protected Boolean forceEditsRefresh;
    @XmlElement(name = "MaxNumberOfArcEdits")
    protected Integer maxNumberOfArcEdits;
    @XmlElement(name = "PropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode propertyInclusionMode;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArcPropertyOptions> propertyOptions;

    /**
     * Obtém o valor da propriedade forceEditsRefresh.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceEditsRefresh() {
        return forceEditsRefresh;
    }

    /**
     * Define o valor da propriedade forceEditsRefresh.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceEditsRefresh(Boolean value) {
        this.forceEditsRefresh = value;
    }

    /**
     * Obtém o valor da propriedade maxNumberOfArcEdits.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfArcEdits() {
        return maxNumberOfArcEdits;
    }

    /**
     * Define o valor da propriedade maxNumberOfArcEdits.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfArcEdits(Integer value) {
        this.maxNumberOfArcEdits = value;
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

}
