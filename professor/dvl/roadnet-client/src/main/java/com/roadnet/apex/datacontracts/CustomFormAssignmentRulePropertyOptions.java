
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CustomFormAssignmentRulePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomFormAssignmentRulePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignmentCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEvaluatedDynamically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformedAt_PerformedAt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFormAssignmentRulePropertyOptions", propOrder = {
    "assignmentCriteria",
    "isEvaluatedDynamically",
    "performedAtPerformedAt"
})
public class CustomFormAssignmentRulePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AssignmentCriteria")
    protected Boolean assignmentCriteria;
    @XmlElement(name = "IsEvaluatedDynamically")
    protected Boolean isEvaluatedDynamically;
    @XmlElement(name = "PerformedAt_PerformedAt")
    protected Boolean performedAtPerformedAt;

    /**
     * Obtém o valor da propriedade assignmentCriteria.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignmentCriteria() {
        return assignmentCriteria;
    }

    /**
     * Define o valor da propriedade assignmentCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignmentCriteria(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformedAtPerformedAt() {
        return performedAtPerformedAt;
    }

    /**
     * Define o valor da propriedade performedAtPerformedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformedAtPerformedAt(Boolean value) {
        this.performedAtPerformedAt = value;
    }

}
