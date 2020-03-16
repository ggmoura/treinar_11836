
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfLayoverLocationOpenCloseDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLayoverLocationOpenCloseDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LayoverLocationOpenCloseDetail" type="{http://roadnet.com/apex/DataContracts/}LayoverLocationOpenCloseDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLayoverLocationOpenCloseDetail", propOrder = {
    "layoverLocationOpenCloseDetail"
})
public class ArrayOfLayoverLocationOpenCloseDetail {

    @XmlElement(name = "LayoverLocationOpenCloseDetail", nillable = true)
    protected List<LayoverLocationOpenCloseDetail> layoverLocationOpenCloseDetail;

    /**
     * Gets the value of the layoverLocationOpenCloseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoverLocationOpenCloseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoverLocationOpenCloseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoverLocationOpenCloseDetail }
     * 
     * 
     */
    public List<LayoverLocationOpenCloseDetail> getLayoverLocationOpenCloseDetail() {
        if (layoverLocationOpenCloseDetail == null) {
            layoverLocationOpenCloseDetail = new ArrayList<LayoverLocationOpenCloseDetail>();
        }
        return this.layoverLocationOpenCloseDetail;
    }

}
