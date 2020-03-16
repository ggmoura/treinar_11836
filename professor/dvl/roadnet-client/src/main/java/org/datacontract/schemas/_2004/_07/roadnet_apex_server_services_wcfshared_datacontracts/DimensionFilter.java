
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DimensionFilter complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DimensionFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DimensionDetail" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Exclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionFilter", propOrder = {
    "dimensionDetail",
    "exclusive"
})
public class DimensionFilter
    extends DataTransferObject
{

    @XmlElementRef(name = "DimensionDetail", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DimensionDetail> dimensionDetail;
    @XmlElement(name = "Exclusive")
    protected Boolean exclusive;

    /**
     * Obtém o valor da propriedade dimensionDetail.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DimensionDetail }{@code >}
     *     
     */
    public JAXBElement<DimensionDetail> getDimensionDetail() {
        return dimensionDetail;
    }

    /**
     * Define o valor da propriedade dimensionDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DimensionDetail }{@code >}
     *     
     */
    public void setDimensionDetail(JAXBElement<DimensionDetail> value) {
        this.dimensionDetail = value;
    }

    /**
     * Obtém o valor da propriedade exclusive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusive() {
        return exclusive;
    }

    /**
     * Define o valor da propriedade exclusive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusive(Boolean value) {
        this.exclusive = value;
    }

}
