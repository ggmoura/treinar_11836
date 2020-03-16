
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CustomFormAssignmentResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomFormAssignmentResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Assignments" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCustomFormAssignment" minOccurs="0"/&gt;
 *         &lt;element name="Forms" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCustomFormInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFormAssignmentResult", propOrder = {
    "assignments",
    "forms"
})
public class CustomFormAssignmentResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Assignments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomFormAssignment> assignments;
    @XmlElementRef(name = "Forms", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomFormInfo> forms;

    /**
     * Obtém o valor da propriedade assignments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomFormAssignment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomFormAssignment> getAssignments() {
        return assignments;
    }

    /**
     * Define o valor da propriedade assignments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomFormAssignment }{@code >}
     *     
     */
    public void setAssignments(JAXBElement<ArrayOfCustomFormAssignment> value) {
        this.assignments = value;
    }

    /**
     * Obtém o valor da propriedade forms.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomFormInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomFormInfo> getForms() {
        return forms;
    }

    /**
     * Define o valor da propriedade forms.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomFormInfo }{@code >}
     *     
     */
    public void setForms(JAXBElement<ArrayOfCustomFormInfo> value) {
        this.forms = value;
    }

}
