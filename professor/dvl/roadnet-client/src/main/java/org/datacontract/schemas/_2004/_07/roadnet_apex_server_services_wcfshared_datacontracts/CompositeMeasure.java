
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CompositeMeasure complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompositeMeasure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DimensionFilters" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDimensionFilter" minOccurs="0"/&gt;
 *         &lt;element name="Operand1" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure" minOccurs="0"/&gt;
 *         &lt;element name="Operand2" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure" minOccurs="0"/&gt;
 *         &lt;element name="OperatorType_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeMeasure", propOrder = {
    "dimensionFilters",
    "operand1",
    "operand2",
    "operatorTypeOperator"
})
public class CompositeMeasure
    extends IMeasure
{

    @XmlElementRef(name = "DimensionFilters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionFilter> dimensionFilters;
    @XmlElementRef(name = "Operand1", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<IMeasure> operand1;
    @XmlElementRef(name = "Operand2", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<IMeasure> operand2;
    @XmlElementRef(name = "OperatorType_Operator", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatorTypeOperator;

    /**
     * Obtém o valor da propriedade dimensionFilters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDimensionFilter> getDimensionFilters() {
        return dimensionFilters;
    }

    /**
     * Define o valor da propriedade dimensionFilters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}
     *     
     */
    public void setDimensionFilters(JAXBElement<ArrayOfDimensionFilter> value) {
        this.dimensionFilters = value;
    }

    /**
     * Obtém o valor da propriedade operand1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public JAXBElement<IMeasure> getOperand1() {
        return operand1;
    }

    /**
     * Define o valor da propriedade operand1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public void setOperand1(JAXBElement<IMeasure> value) {
        this.operand1 = value;
    }

    /**
     * Obtém o valor da propriedade operand2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public JAXBElement<IMeasure> getOperand2() {
        return operand2;
    }

    /**
     * Define o valor da propriedade operand2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public void setOperand2(JAXBElement<IMeasure> value) {
        this.operand2 = value;
    }

    /**
     * Obtém o valor da propriedade operatorTypeOperator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorTypeOperator() {
        return operatorTypeOperator;
    }

    /**
     * Define o valor da propriedade operatorTypeOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorTypeOperator(JAXBElement<String> value) {
        this.operatorTypeOperator = value;
    }

}
