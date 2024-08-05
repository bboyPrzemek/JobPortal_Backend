
package com.example.demo.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWyszukanaMiejscowoscZPodstawowa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWyszukanaMiejscowoscZPodstawowa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WyszukanaMiejscowoscZPodstawowa" type="{http://schemas.datacontract.org/2004/07/TerytUslugaWs1}WyszukanaMiejscowoscZPodstawowa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWyszukanaMiejscowoscZPodstawowa", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", propOrder = {
    "wyszukanaMiejscowoscZPodstawowa"
})
public class ArrayOfWyszukanaMiejscowoscZPodstawowa {

    @XmlElement(name = "WyszukanaMiejscowoscZPodstawowa", nillable = true)
    protected List<WyszukanaMiejscowoscZPodstawowa> wyszukanaMiejscowoscZPodstawowa;

    /**
     * Gets the value of the wyszukanaMiejscowoscZPodstawowa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the wyszukanaMiejscowoscZPodstawowa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWyszukanaMiejscowoscZPodstawowa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WyszukanaMiejscowoscZPodstawowa }
     * 
     * 
     */
    public List<WyszukanaMiejscowoscZPodstawowa> getWyszukanaMiejscowoscZPodstawowa() {
        if (wyszukanaMiejscowoscZPodstawowa == null) {
            wyszukanaMiejscowoscZPodstawowa = new ArrayList<WyszukanaMiejscowoscZPodstawowa>();
        }
        return this.wyszukanaMiejscowoscZPodstawowa;
    }

}
