
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoutedSolutionImportResultDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutedSolutionImportResultDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ImportResultDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateRoutesResult" type="{http://roadnet.com/apex/DataContracts/}CreateRoutesResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutedSolutionImportResultDetail", propOrder = {
    "createRoutesResult"
})
public class RoutedSolutionImportResultDetail
    extends ImportResultDetail
{

    @XmlElementRef(name = "CreateRoutesResult", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateRoutesResult> createRoutesResult;

    /**
     * Obtém o valor da propriedade createRoutesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateRoutesResult }{@code >}
     *     
     */
    public JAXBElement<CreateRoutesResult> getCreateRoutesResult() {
        return createRoutesResult;
    }

    /**
     * Define o valor da propriedade createRoutesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateRoutesResult }{@code >}
     *     
     */
    public void setCreateRoutesResult(JAXBElement<CreateRoutesResult> value) {
        this.createRoutesResult = value;
    }

}
