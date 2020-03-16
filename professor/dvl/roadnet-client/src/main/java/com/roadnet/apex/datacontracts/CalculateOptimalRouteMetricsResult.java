
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CalculateOptimalRouteMetricsResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CalculateOptimalRouteMetricsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCalculateOptimalRouteMetricsResult.CalculateOptimalResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateOptimalRouteMetricsResult", propOrder = {
    "routeResults"
})
public class CalculateOptimalRouteMetricsResult
    extends DataTransferObject
{

    @XmlElementRef(name = "RouteResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCalculateOptimalRouteMetricsResultCalculateOptimalResult> routeResults;

    /**
     * Obtém o valor da propriedade routeResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCalculateOptimalRouteMetricsResultCalculateOptimalResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCalculateOptimalRouteMetricsResultCalculateOptimalResult> getRouteResults() {
        return routeResults;
    }

    /**
     * Define o valor da propriedade routeResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCalculateOptimalRouteMetricsResultCalculateOptimalResult }{@code >}
     *     
     */
    public void setRouteResults(JAXBElement<ArrayOfCalculateOptimalRouteMetricsResultCalculateOptimalResult> value) {
        this.routeResults = value;
    }

}
