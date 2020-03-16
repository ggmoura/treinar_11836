
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OptimizeOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OptimizeOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IgnoreFlags_RouteExceptionsToIgnore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OptimizingGoal_Goal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptimizeOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", propOrder = {
    "ignoreFlagsRouteExceptionsToIgnore",
    "optimizingGoalGoal"
})
public class OptimizeOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "IgnoreFlags_RouteExceptionsToIgnore", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignoreFlagsRouteExceptionsToIgnore;
    @XmlElementRef(name = "OptimizingGoal_Goal", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optimizingGoalGoal;

    /**
     * Obtém o valor da propriedade ignoreFlagsRouteExceptionsToIgnore.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIgnoreFlagsRouteExceptionsToIgnore() {
        return ignoreFlagsRouteExceptionsToIgnore;
    }

    /**
     * Define o valor da propriedade ignoreFlagsRouteExceptionsToIgnore.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIgnoreFlagsRouteExceptionsToIgnore(JAXBElement<String> value) {
        this.ignoreFlagsRouteExceptionsToIgnore = value;
    }

    /**
     * Obtém o valor da propriedade optimizingGoalGoal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOptimizingGoalGoal() {
        return optimizingGoalGoal;
    }

    /**
     * Define o valor da propriedade optimizingGoalGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOptimizingGoalGoal(JAXBElement<String> value) {
        this.optimizingGoalGoal = value;
    }

}
