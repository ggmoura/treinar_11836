
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DimensionDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DimensionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DimensionDescriber" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDescriber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionDetail", propOrder = {
    "dimensionDescriber"
})
@XmlSeeAlso({
    DimensionKeyDetail.class,
    BooleanDimensionDetail.class,
    EnumDimensionDetail.class,
    TimeVarianceDimensionDetail.class,
    PlannedAndActualDimensionDetail.class,
    LocationTypeDimensionDetail.class,
    NumericDimensionDetail.class,
    SecondaryDimensionDetail.class,
    StringDimensionDetail.class
})
public class DimensionDetail
    extends DataTransferObject
{

    @XmlElementRef(name = "DimensionDescriber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DimensionDescriber> dimensionDescriber;

    /**
     * Obtém o valor da propriedade dimensionDescriber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DimensionDescriber }{@code >}
     *     
     */
    public JAXBElement<DimensionDescriber> getDimensionDescriber() {
        return dimensionDescriber;
    }

    /**
     * Define o valor da propriedade dimensionDescriber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DimensionDescriber }{@code >}
     *     
     */
    public void setDimensionDescriber(JAXBElement<DimensionDescriber> value) {
        this.dimensionDescriber = value;
    }

}
