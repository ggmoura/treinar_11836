
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.TravelPathCalculatorOptions;


/**
 * <p>Classe Java de TravelPairImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TravelPairImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}ImportParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoordinateFormat" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}CoordinateFormat" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathCalculatorOptions" type="{http://roadnet.com/apex/DataContracts/}TravelPathCalculatorOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPairImportParameters", propOrder = {
    "coordinateFormat",
    "travelPathCalculatorOptions"
})
public class TravelPairImportParameters
    extends ImportParameters
{

    @XmlElement(name = "CoordinateFormat")
    @XmlSchemaType(name = "string")
    protected CoordinateFormat coordinateFormat;
    @XmlElementRef(name = "TravelPathCalculatorOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathCalculatorOptions> travelPathCalculatorOptions;

    /**
     * Obtém o valor da propriedade coordinateFormat.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateFormat }
     *     
     */
    public CoordinateFormat getCoordinateFormat() {
        return coordinateFormat;
    }

    /**
     * Define o valor da propriedade coordinateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateFormat }
     *     
     */
    public void setCoordinateFormat(CoordinateFormat value) {
        this.coordinateFormat = value;
    }

    /**
     * Obtém o valor da propriedade travelPathCalculatorOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}
     *     
     */
    public JAXBElement<TravelPathCalculatorOptions> getTravelPathCalculatorOptions() {
        return travelPathCalculatorOptions;
    }

    /**
     * Define o valor da propriedade travelPathCalculatorOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}
     *     
     */
    public void setTravelPathCalculatorOptions(JAXBElement<TravelPathCalculatorOptions> value) {
        this.travelPathCalculatorOptions = value;
    }

}
