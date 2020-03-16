
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DayCountMeasure complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DayCountMeasure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceMeasure" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}AtomicMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayCountMeasure", propOrder = {
    "referenceMeasure"
})
public class DayCountMeasure
    extends IMeasure
{

    @XmlElementRef(name = "ReferenceMeasure", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<AtomicMeasure> referenceMeasure;

    /**
     * Obtém o valor da propriedade referenceMeasure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AtomicMeasure }{@code >}
     *     
     */
    public JAXBElement<AtomicMeasure> getReferenceMeasure() {
        return referenceMeasure;
    }

    /**
     * Define o valor da propriedade referenceMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AtomicMeasure }{@code >}
     *     
     */
    public void setReferenceMeasure(JAXBElement<AtomicMeasure> value) {
        this.referenceMeasure = value;
    }

}
