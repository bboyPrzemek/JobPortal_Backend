
package com.example.demo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdresoBudynki complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresoBudynki"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gmina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Miejscowosc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NazwaUlicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nazwa_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nazwa_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NrBudWa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NrDomu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NrbNier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObwodsSpisowy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OkreslenieBudynkuNiemieszkalnego" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Powiat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RejonStatystyczny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rodzaj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RodzajBudynku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Wojewodztwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresoBudynki", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", propOrder = {
    "cecha",
    "gmina",
    "miejscowosc",
    "nazwaUlicy",
    "nazwa1",
    "nazwa2",
    "nrBudWa",
    "nrDomu",
    "nrbNier",
    "obwodsSpisowy",
    "okreslenieBudynkuNiemieszkalnego",
    "powiat",
    "rejonStatystyczny",
    "rodzaj",
    "rodzajBudynku",
    "wojewodztwo"
})
public class AdresoBudynki {

    @XmlElementRef(name = "Cecha", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cecha;
    @XmlElementRef(name = "Gmina", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gmina;
    @XmlElementRef(name = "Miejscowosc", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> miejscowosc;
    @XmlElementRef(name = "NazwaUlicy", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaUlicy;
    @XmlElementRef(name = "Nazwa_1", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwa1;
    @XmlElementRef(name = "Nazwa_2", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwa2;
    @XmlElementRef(name = "NrBudWa", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nrBudWa;
    @XmlElementRef(name = "NrDomu", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nrDomu;
    @XmlElementRef(name = "NrbNier", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nrbNier;
    @XmlElementRef(name = "ObwodsSpisowy", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obwodsSpisowy;
    @XmlElementRef(name = "OkreslenieBudynkuNiemieszkalnego", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> okreslenieBudynkuNiemieszkalnego;
    @XmlElementRef(name = "Powiat", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> powiat;
    @XmlElementRef(name = "RejonStatystyczny", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rejonStatystyczny;
    @XmlElementRef(name = "Rodzaj", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rodzaj;
    @XmlElementRef(name = "RodzajBudynku", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rodzajBudynku;
    @XmlElementRef(name = "Wojewodztwo", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wojewodztwo;

    /**
     * Gets the value of the cecha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCecha() {
        return cecha;
    }

    /**
     * Sets the value of the cecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCecha(JAXBElement<String> value) {
        this.cecha = value;
    }

    /**
     * Gets the value of the gmina property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGmina() {
        return gmina;
    }

    /**
     * Sets the value of the gmina property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGmina(JAXBElement<String> value) {
        this.gmina = value;
    }

    /**
     * Gets the value of the miejscowosc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiejscowosc() {
        return miejscowosc;
    }

    /**
     * Sets the value of the miejscowosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiejscowosc(JAXBElement<String> value) {
        this.miejscowosc = value;
    }

    /**
     * Gets the value of the nazwaUlicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaUlicy() {
        return nazwaUlicy;
    }

    /**
     * Sets the value of the nazwaUlicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaUlicy(JAXBElement<String> value) {
        this.nazwaUlicy = value;
    }

    /**
     * Gets the value of the nazwa1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwa1() {
        return nazwa1;
    }

    /**
     * Sets the value of the nazwa1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwa1(JAXBElement<String> value) {
        this.nazwa1 = value;
    }

    /**
     * Gets the value of the nazwa2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwa2() {
        return nazwa2;
    }

    /**
     * Sets the value of the nazwa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwa2(JAXBElement<String> value) {
        this.nazwa2 = value;
    }

    /**
     * Gets the value of the nrBudWa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrBudWa() {
        return nrBudWa;
    }

    /**
     * Sets the value of the nrBudWa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrBudWa(JAXBElement<String> value) {
        this.nrBudWa = value;
    }

    /**
     * Gets the value of the nrDomu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrDomu() {
        return nrDomu;
    }

    /**
     * Sets the value of the nrDomu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrDomu(JAXBElement<String> value) {
        this.nrDomu = value;
    }

    /**
     * Gets the value of the nrbNier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrbNier() {
        return nrbNier;
    }

    /**
     * Sets the value of the nrbNier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrbNier(JAXBElement<String> value) {
        this.nrbNier = value;
    }

    /**
     * Gets the value of the obwodsSpisowy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObwodsSpisowy() {
        return obwodsSpisowy;
    }

    /**
     * Sets the value of the obwodsSpisowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObwodsSpisowy(JAXBElement<String> value) {
        this.obwodsSpisowy = value;
    }

    /**
     * Gets the value of the okreslenieBudynkuNiemieszkalnego property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOkreslenieBudynkuNiemieszkalnego() {
        return okreslenieBudynkuNiemieszkalnego;
    }

    /**
     * Sets the value of the okreslenieBudynkuNiemieszkalnego property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOkreslenieBudynkuNiemieszkalnego(JAXBElement<String> value) {
        this.okreslenieBudynkuNiemieszkalnego = value;
    }

    /**
     * Gets the value of the powiat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPowiat() {
        return powiat;
    }

    /**
     * Sets the value of the powiat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPowiat(JAXBElement<String> value) {
        this.powiat = value;
    }

    /**
     * Gets the value of the rejonStatystyczny property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejonStatystyczny() {
        return rejonStatystyczny;
    }

    /**
     * Sets the value of the rejonStatystyczny property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejonStatystyczny(JAXBElement<String> value) {
        this.rejonStatystyczny = value;
    }

    /**
     * Gets the value of the rodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRodzaj() {
        return rodzaj;
    }

    /**
     * Sets the value of the rodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRodzaj(JAXBElement<String> value) {
        this.rodzaj = value;
    }

    /**
     * Gets the value of the rodzajBudynku property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRodzajBudynku() {
        return rodzajBudynku;
    }

    /**
     * Sets the value of the rodzajBudynku property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRodzajBudynku(JAXBElement<String> value) {
        this.rodzajBudynku = value;
    }

    /**
     * Gets the value of the wojewodztwo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWojewodztwo() {
        return wojewodztwo;
    }

    /**
     * Sets the value of the wojewodztwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWojewodztwo(JAXBElement<String> value) {
        this.wojewodztwo = value;
    }

}
