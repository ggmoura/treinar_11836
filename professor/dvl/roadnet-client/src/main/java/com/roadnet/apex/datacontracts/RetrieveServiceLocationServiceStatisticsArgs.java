
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * <p>Classe Java de RetrieveServiceLocationServiceStatisticsArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveServiceLocationServiceStatisticsArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Expression" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *         &lt;element name="MaxServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MinServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveServiceLocationServiceStatisticsArgs", propOrder = {
    "expression",
    "maxServiceStartDate",
    "minServiceStartDate",
    "serviceLocationEntityKeys"
})
public class RetrieveServiceLocationServiceStatisticsArgs {

    @XmlElementRef(name = "Expression", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> expression;
    @XmlElementRef(name = "MaxServiceStartDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> maxServiceStartDate;
    @XmlElementRef(name = "MinServiceStartDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> minServiceStartDate;
    @XmlElementRef(name = "ServiceLocationEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> serviceLocationEntityKeys;

    /**
     * Obtém o valor da propriedade expression.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getExpression() {
        return expression;
    }

    /**
     * Define o valor da propriedade expression.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setExpression(JAXBElement<SimpleExpressionBase> value) {
        this.expression = value;
    }

    /**
     * Obtém o valor da propriedade maxServiceStartDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMaxServiceStartDate() {
        return maxServiceStartDate;
    }

    /**
     * Define o valor da propriedade maxServiceStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMaxServiceStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.maxServiceStartDate = value;
    }

    /**
     * Obtém o valor da propriedade minServiceStartDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMinServiceStartDate() {
        return minServiceStartDate;
    }

    /**
     * Define o valor da propriedade minServiceStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMinServiceStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.minServiceStartDate = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getServiceLocationEntityKeys() {
        return serviceLocationEntityKeys;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setServiceLocationEntityKeys(JAXBElement<ArrayOflong> value) {
        this.serviceLocationEntityKeys = value;
    }

}
