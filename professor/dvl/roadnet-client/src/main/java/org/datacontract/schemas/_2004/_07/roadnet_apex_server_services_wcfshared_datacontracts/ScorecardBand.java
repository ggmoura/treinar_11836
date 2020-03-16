
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ScorecardBand complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardBand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighThreshold" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ScorecardBandThreshold" minOccurs="0"/&gt;
 *         &lt;element name="LowThreshold" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ScorecardBandThreshold" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardBand", propOrder = {
    "highThreshold",
    "lowThreshold"
})
public class ScorecardBand
    extends DataTransferObject
{

    @XmlElementRef(name = "HighThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ScorecardBandThreshold> highThreshold;
    @XmlElementRef(name = "LowThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ScorecardBandThreshold> lowThreshold;

    /**
     * Obtém o valor da propriedade highThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ScorecardBandThreshold }{@code >}
     *     
     */
    public JAXBElement<ScorecardBandThreshold> getHighThreshold() {
        return highThreshold;
    }

    /**
     * Define o valor da propriedade highThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ScorecardBandThreshold }{@code >}
     *     
     */
    public void setHighThreshold(JAXBElement<ScorecardBandThreshold> value) {
        this.highThreshold = value;
    }

    /**
     * Obtém o valor da propriedade lowThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ScorecardBandThreshold }{@code >}
     *     
     */
    public JAXBElement<ScorecardBandThreshold> getLowThreshold() {
        return lowThreshold;
    }

    /**
     * Define o valor da propriedade lowThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ScorecardBandThreshold }{@code >}
     *     
     */
    public void setLowThreshold(JAXBElement<ScorecardBandThreshold> value) {
        this.lowThreshold = value;
    }

}
