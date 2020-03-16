
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfTransitMatrixBuildRequest;


/**
 * <p>Classe Java de MatrixBuildRequestMessages complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MatrixBuildRequestMessages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Messages" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTransitMatrixBuildRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixBuildRequestMessages", propOrder = {
    "messages"
})
public class MatrixBuildRequestMessages {

    @XmlElementRef(name = "Messages", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransitMatrixBuildRequest> messages;

    /**
     * Obtém o valor da propriedade messages.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransitMatrixBuildRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransitMatrixBuildRequest> getMessages() {
        return messages;
    }

    /**
     * Define o valor da propriedade messages.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransitMatrixBuildRequest }{@code >}
     *     
     */
    public void setMessages(JAXBElement<ArrayOfTransitMatrixBuildRequest> value) {
        this.messages = value;
    }

}
