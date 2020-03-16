
package com.roadnet.apex.datacontracts;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de XrsMigrationJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="XrsMigrationJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MigrationResult" type="{http://roadnet.com/apex/DataContracts/}XrsMigrationResult" minOccurs="0"/&gt;
 *         &lt;element name="OverallPercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="StagePercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="XrsMigrationStage_Stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XrsMigrationJobInfo", propOrder = {
    "customerEntityKey",
    "migrationResult",
    "overallPercentComplete",
    "result",
    "stagePercentComplete",
    "xrsMigrationStageStage"
})
public class XrsMigrationJobInfo
    extends JobInfo
{

    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElementRef(name = "MigrationResult", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XrsMigrationResult> migrationResult;
    @XmlElement(name = "OverallPercentComplete")
    protected BigDecimal overallPercentComplete;
    @XmlElementRef(name = "Result", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> result;
    @XmlElement(name = "StagePercentComplete")
    protected BigDecimal stagePercentComplete;
    @XmlElementRef(name = "XrsMigrationStage_Stage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsMigrationStageStage;

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade migrationResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XrsMigrationResult }{@code >}
     *     
     */
    public JAXBElement<XrsMigrationResult> getMigrationResult() {
        return migrationResult;
    }

    /**
     * Define o valor da propriedade migrationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XrsMigrationResult }{@code >}
     *     
     */
    public void setMigrationResult(JAXBElement<XrsMigrationResult> value) {
        this.migrationResult = value;
    }

    /**
     * Obtém o valor da propriedade overallPercentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallPercentComplete() {
        return overallPercentComplete;
    }

    /**
     * Define o valor da propriedade overallPercentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallPercentComplete(BigDecimal value) {
        this.overallPercentComplete = value;
    }

    /**
     * Obtém o valor da propriedade result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getResult() {
        return result;
    }

    /**
     * Define o valor da propriedade result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setResult(JAXBElement<byte[]> value) {
        this.result = value;
    }

    /**
     * Obtém o valor da propriedade stagePercentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStagePercentComplete() {
        return stagePercentComplete;
    }

    /**
     * Define o valor da propriedade stagePercentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStagePercentComplete(BigDecimal value) {
        this.stagePercentComplete = value;
    }

    /**
     * Obtém o valor da propriedade xrsMigrationStageStage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsMigrationStageStage() {
        return xrsMigrationStageStage;
    }

    /**
     * Define o valor da propriedade xrsMigrationStageStage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsMigrationStageStage(JAXBElement<String> value) {
        this.xrsMigrationStageStage = value;
    }

}
