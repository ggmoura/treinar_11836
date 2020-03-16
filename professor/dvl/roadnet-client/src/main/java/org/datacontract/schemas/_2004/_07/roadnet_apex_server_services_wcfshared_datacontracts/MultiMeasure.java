
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MultiMeasure complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MultiMeasure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Measures" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfIMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiMeasure", propOrder = {
    "measures"
})
public class MultiMeasure
    extends IMeasure
{

    @XmlElementRef(name = "Measures", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIMeasure> measures;

    /**
     * Obtém o valor da propriedade measures.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIMeasure }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIMeasure> getMeasures() {
        return measures;
    }

    /**
     * Define o valor da propriedade measures.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIMeasure }{@code >}
     *     
     */
    public void setMeasures(JAXBElement<ArrayOfIMeasure> value) {
        this.measures = value;
    }

}
