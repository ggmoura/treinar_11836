
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRoadnetTelematicsScriptVersion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoadnetTelematicsScriptVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoadnetTelematicsScriptVersion" type="{http://roadnet.com/apex/DataContracts/}RoadnetTelematicsScriptVersion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoadnetTelematicsScriptVersion", propOrder = {
    "roadnetTelematicsScriptVersion"
})
public class ArrayOfRoadnetTelematicsScriptVersion {

    @XmlElement(name = "RoadnetTelematicsScriptVersion", nillable = true)
    protected List<RoadnetTelematicsScriptVersion> roadnetTelematicsScriptVersion;

    /**
     * Gets the value of the roadnetTelematicsScriptVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadnetTelematicsScriptVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadnetTelematicsScriptVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadnetTelematicsScriptVersion }
     * 
     * 
     */
    public List<RoadnetTelematicsScriptVersion> getRoadnetTelematicsScriptVersion() {
        if (roadnetTelematicsScriptVersion == null) {
            roadnetTelematicsScriptVersion = new ArrayList<RoadnetTelematicsScriptVersion>();
        }
        return this.roadnetTelematicsScriptVersion;
    }

}
