
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateStrategicPlanningSessionCacheJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateStrategicPlanningSessionCacheJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UpdateStrategicPlanningSessionCacheStage_Stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStrategicPlanningSessionCacheJobInfo", propOrder = {
    "percentComplete",
    "updateStrategicPlanningSessionCacheStageStage"
})
public class UpdateStrategicPlanningSessionCacheJobInfo
    extends JobInfo
{

    @XmlElement(name = "PercentComplete")
    protected Double percentComplete;
    @XmlElementRef(name = "UpdateStrategicPlanningSessionCacheStage_Stage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updateStrategicPlanningSessionCacheStageStage;

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade updateStrategicPlanningSessionCacheStageStage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdateStrategicPlanningSessionCacheStageStage() {
        return updateStrategicPlanningSessionCacheStageStage;
    }

    /**
     * Define o valor da propriedade updateStrategicPlanningSessionCacheStageStage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdateStrategicPlanningSessionCacheStageStage(JAXBElement<String> value) {
        this.updateStrategicPlanningSessionCacheStageStage = value;
    }

}
