
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfCoordinate;
import com.roadnet.apex.datacontracts.TravelPathCalculatorOptions;
import com.roadnet.apex.datacontracts.TravelPathOptions;


/**
 * <p>Classe Java de GenerateTravelPathOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GenerateTravelPathOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}TravelPathOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculatorOptions" type="{http://roadnet.com/apex/DataContracts/}TravelPathCalculatorOptions" minOccurs="0"/&gt;
 *         &lt;element name="Coordinates" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCoordinate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateTravelPathOptions", propOrder = {
    "calculatorOptions",
    "coordinates"
})
public class GenerateTravelPathOptions
    extends TravelPathOptions
{

    @XmlElementRef(name = "CalculatorOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathCalculatorOptions> calculatorOptions;
    @XmlElementRef(name = "Coordinates", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoordinate> coordinates;

    /**
     * Obtém o valor da propriedade calculatorOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}
     *     
     */
    public JAXBElement<TravelPathCalculatorOptions> getCalculatorOptions() {
        return calculatorOptions;
    }

    /**
     * Define o valor da propriedade calculatorOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}
     *     
     */
    public void setCalculatorOptions(JAXBElement<TravelPathCalculatorOptions> value) {
        this.calculatorOptions = value;
    }

    /**
     * Obtém o valor da propriedade coordinates.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoordinate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCoordinate> getCoordinates() {
        return coordinates;
    }

    /**
     * Define o valor da propriedade coordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoordinate }{@code >}
     *     
     */
    public void setCoordinates(JAXBElement<ArrayOfCoordinate> value) {
        this.coordinates = value;
    }

}
