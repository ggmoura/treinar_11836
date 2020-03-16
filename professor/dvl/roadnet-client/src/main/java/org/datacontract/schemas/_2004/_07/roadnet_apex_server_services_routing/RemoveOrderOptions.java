
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RemoveOrderOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RemoveOrderOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddToUnassigneds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantitiesOnVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemoveFromBuiltRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveOrderOptions", propOrder = {
    "addToUnassigneds",
    "deliveryQuantitiesOnVehicle",
    "removeFromBuiltRoute"
})
public class RemoveOrderOptions
    extends DataTransferObject
{

    @XmlElement(name = "AddToUnassigneds")
    protected Boolean addToUnassigneds;
    @XmlElement(name = "DeliveryQuantitiesOnVehicle")
    protected Boolean deliveryQuantitiesOnVehicle;
    @XmlElement(name = "RemoveFromBuiltRoute")
    protected Boolean removeFromBuiltRoute;

    /**
     * Obtém o valor da propriedade addToUnassigneds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddToUnassigneds() {
        return addToUnassigneds;
    }

    /**
     * Define o valor da propriedade addToUnassigneds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddToUnassigneds(Boolean value) {
        this.addToUnassigneds = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantitiesOnVehicle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryQuantitiesOnVehicle() {
        return deliveryQuantitiesOnVehicle;
    }

    /**
     * Define o valor da propriedade deliveryQuantitiesOnVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryQuantitiesOnVehicle(Boolean value) {
        this.deliveryQuantitiesOnVehicle = value;
    }

    /**
     * Obtém o valor da propriedade removeFromBuiltRoute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveFromBuiltRoute() {
        return removeFromBuiltRoute;
    }

    /**
     * Define o valor da propriedade removeFromBuiltRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveFromBuiltRoute(Boolean value) {
        this.removeFromBuiltRoute = value;
    }

}
