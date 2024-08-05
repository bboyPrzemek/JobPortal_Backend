
package com.example.demo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kwartal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kodTerytorialny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "rok",
    "kwartal",
    "kodTerytorialny"
})
@XmlRootElement(name = "PobierzGeoTerytPlikPelny")
public class PobierzGeoTerytPlikPelny {

    @XmlElementRef(name = "rok", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rok;
    @XmlElementRef(name = "kwartal", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kwartal;
    @XmlElementRef(name = "kodTerytorialny", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kodTerytorialny;

    /**
     * Gets the value of the rok property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRok() {
        return rok;
    }

    /**
     * Sets the value of the rok property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRok(JAXBElement<String> value) {
        this.rok = value;
    }

    /**
     * Gets the value of the kwartal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKwartal() {
        return kwartal;
    }

    /**
     * Sets the value of the kwartal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKwartal(JAXBElement<String> value) {
        this.kwartal = value;
    }

    /**
     * Gets the value of the kodTerytorialny property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKodTerytorialny() {
        return kodTerytorialny;
    }

    /**
     * Sets the value of the kodTerytorialny property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKodTerytorialny(JAXBElement<String> value) {
        this.kodTerytorialny = value;
    }

}
