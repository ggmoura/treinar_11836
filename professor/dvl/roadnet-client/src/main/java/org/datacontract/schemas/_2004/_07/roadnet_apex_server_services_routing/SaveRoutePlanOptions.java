
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de SaveRoutePlanOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveRoutePlanOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="ReturnPropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ShouldAutogenerateLocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldAutogenerateOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldIgnoreHeaderInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldIgnoreNotFoundEquipments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldIgnoreNotFoundWorkers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveRoutePlanOptions", propOrder = {
    "returnInclusionMode",
    "returnPropertyOptions",
    "shouldAutogenerateLocations",
    "shouldAutogenerateOrders",
    "shouldIgnoreHeaderInformation",
    "shouldIgnoreNotFoundEquipments",
    "shouldIgnoreNotFoundWorkers"
})
public class SaveRoutePlanOptions
    extends DataTransferObject
{

    @XmlElement(name = "ReturnInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode returnInclusionMode;
    @XmlElementRef(name = "ReturnPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyOptions> returnPropertyOptions;
    @XmlElement(name = "ShouldAutogenerateLocations")
    protected Boolean shouldAutogenerateLocations;
    @XmlElement(name = "ShouldAutogenerateOrders")
    protected Boolean shouldAutogenerateOrders;
    @XmlElement(name = "ShouldIgnoreHeaderInformation")
    protected Boolean shouldIgnoreHeaderInformation;
    @XmlElement(name = "ShouldIgnoreNotFoundEquipments")
    protected Boolean shouldIgnoreNotFoundEquipments;
    @XmlElement(name = "ShouldIgnoreNotFoundWorkers")
    protected Boolean shouldIgnoreNotFoundWorkers;

    /**
     * Obtém o valor da propriedade returnInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getReturnInclusionMode() {
        return returnInclusionMode;
    }

    /**
     * Define o valor da propriedade returnInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setReturnInclusionMode(PropertyInclusionMode value) {
        this.returnInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade returnPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public JAXBElement<PropertyOptions> getReturnPropertyOptions() {
        return returnPropertyOptions;
    }

    /**
     * Define o valor da propriedade returnPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public void setReturnPropertyOptions(JAXBElement<PropertyOptions> value) {
        this.returnPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade shouldAutogenerateLocations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldAutogenerateLocations() {
        return shouldAutogenerateLocations;
    }

    /**
     * Define o valor da propriedade shouldAutogenerateLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldAutogenerateLocations(Boolean value) {
        this.shouldAutogenerateLocations = value;
    }

    /**
     * Obtém o valor da propriedade shouldAutogenerateOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldAutogenerateOrders() {
        return shouldAutogenerateOrders;
    }

    /**
     * Define o valor da propriedade shouldAutogenerateOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldAutogenerateOrders(Boolean value) {
        this.shouldAutogenerateOrders = value;
    }

    /**
     * Obtém o valor da propriedade shouldIgnoreHeaderInformation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldIgnoreHeaderInformation() {
        return shouldIgnoreHeaderInformation;
    }

    /**
     * Define o valor da propriedade shouldIgnoreHeaderInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldIgnoreHeaderInformation(Boolean value) {
        this.shouldIgnoreHeaderInformation = value;
    }

    /**
     * Obtém o valor da propriedade shouldIgnoreNotFoundEquipments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldIgnoreNotFoundEquipments() {
        return shouldIgnoreNotFoundEquipments;
    }

    /**
     * Define o valor da propriedade shouldIgnoreNotFoundEquipments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldIgnoreNotFoundEquipments(Boolean value) {
        this.shouldIgnoreNotFoundEquipments = value;
    }

    /**
     * Obtém o valor da propriedade shouldIgnoreNotFoundWorkers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldIgnoreNotFoundWorkers() {
        return shouldIgnoreNotFoundWorkers;
    }

    /**
     * Define o valor da propriedade shouldIgnoreNotFoundWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldIgnoreNotFoundWorkers(Boolean value) {
        this.shouldIgnoreNotFoundWorkers = value;
    }

}
