
package com.example.demo.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdresoBudynki complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdresoBudynki"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdresoBudynki" type="{http://schemas.datacontract.org/2004/07/TerytUslugaWs1}AdresoBudynki" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdresoBudynki", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", propOrder = {
    "adresoBudynki"
})
public class ArrayOfAdresoBudynki {

    @XmlElement(name = "AdresoBudynki", nillable = true)
    protected List<AdresoBudynki> adresoBudynki;

    /**
     * Gets the value of the adresoBudynki property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the adresoBudynki property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresoBudynki().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresoBudynki }
     * 
     * 
     */
    public List<AdresoBudynki> getAdresoBudynki() {
        if (adresoBudynki == null) {
            adresoBudynki = new ArrayList<AdresoBudynki>();
        }
        return this.adresoBudynki;
    }

}
