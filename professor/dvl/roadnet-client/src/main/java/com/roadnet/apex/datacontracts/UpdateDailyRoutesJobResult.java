
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de UpdateDailyRoutesJobResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateDailyRoutesJobResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Errors" type="{http://roadnet.com/apex/DataContracts/}ArrayOfUpdateDailyRoutesJobError" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RoutesFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoutesProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoutesTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDailyRoutesJobResult", propOrder = {
    "errors",
    "percentComplete",
    "routesFailed",
    "routesProcessed",
    "routesTotal"
})
public class UpdateDailyRoutesJobResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Errors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUpdateDailyRoutesJobError> errors;
    @XmlElement(name = "PercentComplete")
    protected Double percentComplete;
    @XmlElement(name = "RoutesFailed")
    protected Integer routesFailed;
    @XmlElement(name = "RoutesProcessed")
    protected Integer routesProcessed;
    @XmlElement(name = "RoutesTotal")
    protected Integer routesTotal;

    /**
     * Obtém o valor da propriedade errors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdateDailyRoutesJobError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUpdateDailyRoutesJobError> getErrors() {
        return errors;
    }

    /**
     * Define o valor da propriedade errors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdateDailyRoutesJobError }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfUpdateDailyRoutesJobError> value) {
        this.errors = value;
    }

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade routesFailed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoutesFailed() {
        return routesFailed;
    }

    /**
     * Define o valor da propriedade routesFailed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoutesFailed(Integer value) {
        this.routesFailed = value;
    }

    /**
     * Obtém o valor da propriedade routesProcessed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoutesProcessed() {
        return routesProcessed;
    }

    /**
     * Define o valor da propriedade routesProcessed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoutesProcessed(Integer value) {
        this.routesProcessed = value;
    }

    /**
     * Obtém o valor da propriedade routesTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoutesTotal() {
        return routesTotal;
    }

    /**
     * Define o valor da propriedade routesTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoutesTotal(Integer value) {
        this.routesTotal = value;
    }

}
