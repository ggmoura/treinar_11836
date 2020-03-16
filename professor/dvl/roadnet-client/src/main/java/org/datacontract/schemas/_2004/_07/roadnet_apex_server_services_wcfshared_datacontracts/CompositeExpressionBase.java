
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CompositeExpressionBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompositeExpressionBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Expressions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}ArrayOfSimpleExpressionBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeExpressionBase", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", propOrder = {
    "expressions"
})
@XmlSeeAlso({
    AndExpression.class,
    OrExpression.class
})
public class CompositeExpressionBase
    extends SimpleExpressionBase
{

    @XmlElementRef(name = "Expressions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSimpleExpressionBase> expressions;

    /**
     * Obtém o valor da propriedade expressions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSimpleExpressionBase> getExpressions() {
        return expressions;
    }

    /**
     * Define o valor da propriedade expressions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSimpleExpressionBase }{@code >}
     *     
     */
    public void setExpressions(JAXBElement<ArrayOfSimpleExpressionBase> value) {
        this.expressions = value;
    }

}
