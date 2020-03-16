
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ScoreMeasure complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScoreMeasure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bands" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfScorecardBand" minOccurs="0"/&gt;
 *         &lt;element name="Measure" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreMeasure", propOrder = {
    "bands",
    "measure",
    "weight"
})
public class ScoreMeasure
    extends IMeasure
{

    @XmlElementRef(name = "Bands", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfScorecardBand> bands;
    @XmlElementRef(name = "Measure", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<IMeasure> measure;
    @XmlElement(name = "Weight")
    protected Integer weight;

    /**
     * Obtém o valor da propriedade bands.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardBand }{@code >}
     *     
     */
    public JAXBElement<ArrayOfScorecardBand> getBands() {
        return bands;
    }

    /**
     * Define o valor da propriedade bands.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardBand }{@code >}
     *     
     */
    public void setBands(JAXBElement<ArrayOfScorecardBand> value) {
        this.bands = value;
    }

    /**
     * Obtém o valor da propriedade measure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public JAXBElement<IMeasure> getMeasure() {
        return measure;
    }

    /**
     * Define o valor da propriedade measure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public void setMeasure(JAXBElement<IMeasure> value) {
        this.measure = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

}
