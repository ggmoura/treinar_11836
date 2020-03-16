
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SecondaryDimensionDescriber complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SecondaryDimensionDescriber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDescriber"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseSecondaryDimensionType_SecondaryDimension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryDimensionDescriber", propOrder = {
    "attributeName",
    "dataWarehouseSecondaryDimensionTypeSecondaryDimension"
})
public class SecondaryDimensionDescriber
    extends DimensionDescriber
{

    @XmlElementRef(name = "AttributeName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeName;
    @XmlElementRef(name = "DataWarehouseSecondaryDimensionType_SecondaryDimension", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseSecondaryDimensionTypeSecondaryDimension;

    /**
     * Obtém o valor da propriedade attributeName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeName() {
        return attributeName;
    }

    /**
     * Define o valor da propriedade attributeName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeName(JAXBElement<String> value) {
        this.attributeName = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseSecondaryDimensionTypeSecondaryDimension.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseSecondaryDimensionTypeSecondaryDimension() {
        return dataWarehouseSecondaryDimensionTypeSecondaryDimension;
    }

    /**
     * Define o valor da propriedade dataWarehouseSecondaryDimensionTypeSecondaryDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseSecondaryDimensionTypeSecondaryDimension(JAXBElement<String> value) {
        this.dataWarehouseSecondaryDimensionTypeSecondaryDimension = value;
    }

}
