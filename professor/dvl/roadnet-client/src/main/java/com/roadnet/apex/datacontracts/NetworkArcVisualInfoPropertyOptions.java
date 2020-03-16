
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de NetworkArcVisualInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkArcVisualInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndZLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RenderingCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShapePoints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartZLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkArcVisualInfoPropertyOptions", propOrder = {
    "endZLevel",
    "renderingCode",
    "shapePoints",
    "startZLevel"
})
public class NetworkArcVisualInfoPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "EndZLevel")
    protected Boolean endZLevel;
    @XmlElement(name = "RenderingCode")
    protected Boolean renderingCode;
    @XmlElement(name = "ShapePoints")
    protected Boolean shapePoints;
    @XmlElement(name = "StartZLevel")
    protected Boolean startZLevel;

    /**
     * Obtém o valor da propriedade endZLevel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndZLevel() {
        return endZLevel;
    }

    /**
     * Define o valor da propriedade endZLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndZLevel(Boolean value) {
        this.endZLevel = value;
    }

    /**
     * Obtém o valor da propriedade renderingCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenderingCode() {
        return renderingCode;
    }

    /**
     * Define o valor da propriedade renderingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenderingCode(Boolean value) {
        this.renderingCode = value;
    }

    /**
     * Obtém o valor da propriedade shapePoints.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShapePoints() {
        return shapePoints;
    }

    /**
     * Define o valor da propriedade shapePoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShapePoints(Boolean value) {
        this.shapePoints = value;
    }

    /**
     * Obtém o valor da propriedade startZLevel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartZLevel() {
        return startZLevel;
    }

    /**
     * Define o valor da propriedade startZLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartZLevel(Boolean value) {
        this.startZLevel = value;
    }

}
