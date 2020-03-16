
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRegionRestrictedOperatingTimeDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRegionRestrictedOperatingTimeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegionRestrictedOperatingTimeDetail" type="{http://roadnet.com/apex/DataContracts/}RegionRestrictedOperatingTimeDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRegionRestrictedOperatingTimeDetail", propOrder = {
    "regionRestrictedOperatingTimeDetail"
})
public class ArrayOfRegionRestrictedOperatingTimeDetail {

    @XmlElement(name = "RegionRestrictedOperatingTimeDetail", nillable = true)
    protected List<RegionRestrictedOperatingTimeDetail> regionRestrictedOperatingTimeDetail;

    /**
     * Gets the value of the regionRestrictedOperatingTimeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionRestrictedOperatingTimeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionRestrictedOperatingTimeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionRestrictedOperatingTimeDetail }
     * 
     * 
     */
    public List<RegionRestrictedOperatingTimeDetail> getRegionRestrictedOperatingTimeDetail() {
        if (regionRestrictedOperatingTimeDetail == null) {
            regionRestrictedOperatingTimeDetail = new ArrayList<RegionRestrictedOperatingTimeDetail>();
        }
        return this.regionRestrictedOperatingTimeDetail;
    }

}
