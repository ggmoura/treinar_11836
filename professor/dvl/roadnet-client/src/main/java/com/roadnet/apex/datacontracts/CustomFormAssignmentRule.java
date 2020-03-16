
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * <p>Classe Java de CustomFormAssignmentRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomFormAssignmentRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignmentCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *         &lt;element name="IsEvaluatedDynamically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformedAt_PerformedAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFormAssignmentRule", propOrder = {
    "assignmentCriteria",
    "isEvaluatedDynamically",
    "performedAtPerformedAt"
})
public class CustomFormAssignmentRule
    extends DomainEntity
{

    @XmlElementRef(name = "AssignmentCriteria", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> assignmentCriteria;
    @XmlElement(name = "IsEvaluatedDynamically")
    protected Boolean isEvaluatedDynamically;
    @XmlElementRef(name = "PerformedAt_PerformedAt", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> performedAtPerformedAt;

    /**
     * Obtém o valor da propriedade assignmentCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getAssignmentCriteria() {
        return assignmentCriteria;
    }

    /**
     * Define o valor da propriedade assignmentCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setAssignmentCriteria(JAXBElement<SimpleExpressionBase> value) {
        this.assignmentCriteria = value;
    }

    /**
     * Obtém o valor da propriedade isEvaluatedDynamically.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEvaluatedDynamically() {
        return isEvaluatedDynamically;
    }

    /**
     * Define o valor da propriedade isEvaluatedDynamically.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEvaluatedDynamically(Boolean value) {
        this.isEvaluatedDynamically = value;
    }

    /**
     * Obtém o valor da propriedade performedAtPerformedAt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerformedAtPerformedAt() {
        return performedAtPerformedAt;
    }

    /**
     * Define o valor da propriedade performedAtPerformedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerformedAtPerformedAt(JAXBElement<String> value) {
        this.performedAtPerformedAt = value;
    }

}
