
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de MoveRecurringOrderOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MoveRecurringOrderOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlacementMethodType_OrderPlacementMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequiredTimeUnitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveRecurringOrderOptions", propOrder = {
    "placementMethodTypeOrderPlacementMethod",
    "requiredTimeUnitNumber"
})
public class MoveRecurringOrderOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "PlacementMethodType_OrderPlacementMethod", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placementMethodTypeOrderPlacementMethod;
    @XmlElementRef(name = "RequiredTimeUnitNumber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> requiredTimeUnitNumber;

    /**
     * Obtém o valor da propriedade placementMethodTypeOrderPlacementMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlacementMethodTypeOrderPlacementMethod() {
        return placementMethodTypeOrderPlacementMethod;
    }

    /**
     * Define o valor da propriedade placementMethodTypeOrderPlacementMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlacementMethodTypeOrderPlacementMethod(JAXBElement<String> value) {
        this.placementMethodTypeOrderPlacementMethod = value;
    }

    /**
     * Obtém o valor da propriedade requiredTimeUnitNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRequiredTimeUnitNumber() {
        return requiredTimeUnitNumber;
    }

    /**
     * Define o valor da propriedade requiredTimeUnitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRequiredTimeUnitNumber(JAXBElement<Integer> value) {
        this.requiredTimeUnitNumber = value;
    }

}
