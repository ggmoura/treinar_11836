
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OptimizeTerritoriesResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OptimizeTerritoriesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfTerritoriesModified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_ConstraintsEncountered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptimizeTerritoriesResult", propOrder = {
    "numberOfTerritoriesModified",
    "routeConstraintFlagsConstraintsEncountered"
})
public class OptimizeTerritoriesResult
    extends DataTransferObject
{

    @XmlElement(name = "NumberOfTerritoriesModified")
    protected Integer numberOfTerritoriesModified;
    @XmlElementRef(name = "RouteConstraintFlags_ConstraintsEncountered", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsConstraintsEncountered;

    /**
     * Obtém o valor da propriedade numberOfTerritoriesModified.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTerritoriesModified() {
        return numberOfTerritoriesModified;
    }

    /**
     * Define o valor da propriedade numberOfTerritoriesModified.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTerritoriesModified(Integer value) {
        this.numberOfTerritoriesModified = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsConstraintsEncountered() {
        return routeConstraintFlagsConstraintsEncountered;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsConstraintsEncountered(JAXBElement<String> value) {
        this.routeConstraintFlagsConstraintsEncountered = value;
    }

}
