
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.AutonomousOptimizationSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.AutonomousOptimizationSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignOrdersGoal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AssignOrdersIgnoreConstraints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AssignOrdersMinTravelTimeBeforeNextStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.AutonomousOptimizationSettings", propOrder = {
    "assignOrdersGoal",
    "assignOrdersIgnoreConstraints",
    "assignOrdersMinTravelTimeBeforeNextStop"
})
public class OverridableRegionPropertiesAutonomousOptimizationSettings
    extends DataTransferObject
{

    @XmlElement(name = "AssignOrdersGoal")
    protected Boolean assignOrdersGoal;
    @XmlElement(name = "AssignOrdersIgnoreConstraints")
    protected Boolean assignOrdersIgnoreConstraints;
    @XmlElement(name = "AssignOrdersMinTravelTimeBeforeNextStop")
    protected Boolean assignOrdersMinTravelTimeBeforeNextStop;

    /**
     * Obtém o valor da propriedade assignOrdersGoal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignOrdersGoal() {
        return assignOrdersGoal;
    }

    /**
     * Define o valor da propriedade assignOrdersGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignOrdersGoal(Boolean value) {
        this.assignOrdersGoal = value;
    }

    /**
     * Obtém o valor da propriedade assignOrdersIgnoreConstraints.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignOrdersIgnoreConstraints() {
        return assignOrdersIgnoreConstraints;
    }

    /**
     * Define o valor da propriedade assignOrdersIgnoreConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignOrdersIgnoreConstraints(Boolean value) {
        this.assignOrdersIgnoreConstraints = value;
    }

    /**
     * Obtém o valor da propriedade assignOrdersMinTravelTimeBeforeNextStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignOrdersMinTravelTimeBeforeNextStop() {
        return assignOrdersMinTravelTimeBeforeNextStop;
    }

    /**
     * Define o valor da propriedade assignOrdersMinTravelTimeBeforeNextStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignOrdersMinTravelTimeBeforeNextStop(Boolean value) {
        this.assignOrdersMinTravelTimeBeforeNextStop = value;
    }

}
