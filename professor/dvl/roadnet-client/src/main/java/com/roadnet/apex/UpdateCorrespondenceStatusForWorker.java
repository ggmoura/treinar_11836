
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfUpdateCorrespondenceStatusForWorkerArgs;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="argsList" type="{http://roadnet.com/apex/DataContracts/}ArrayOfUpdateCorrespondenceStatusForWorkerArgs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "workerEntityKey",
    "argsList"
})
@XmlRootElement(name = "UpdateCorrespondenceStatusForWorker")
public class UpdateCorrespondenceStatusForWorker {

    protected Long workerEntityKey;
    @XmlElementRef(name = "argsList", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUpdateCorrespondenceStatusForWorkerArgs> argsList;

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkerEntityKey(Long value) {
        this.workerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade argsList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdateCorrespondenceStatusForWorkerArgs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUpdateCorrespondenceStatusForWorkerArgs> getArgsList() {
        return argsList;
    }

    /**
     * Define o valor da propriedade argsList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdateCorrespondenceStatusForWorkerArgs }{@code >}
     *     
     */
    public void setArgsList(JAXBElement<ArrayOfUpdateCorrespondenceStatusForWorkerArgs> value) {
        this.argsList = value;
    }

}
