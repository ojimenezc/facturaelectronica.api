


package com.softcorp.cr.facturaelectronica.api.dtos.receivermessage;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clave",
    "numeroCedulaEmisor",
    "fechaEmisionDoc",
    "mensaje",
    "detalleMensaje",
    "montoTotalImpuesto",
    "codigoActividad",
    "condicionImpuesto",
    "montoTotalImpuestoAcreditar",
    "montoTotalDeGastoAplicable",
    "totalFactura",
    "numeroCedulaReceptor",
    "numeroConsecutivoReceptor"
})
@XmlRootElement(name = "MensajeReceptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
public class MensajeReceptor {

    @XmlElement(name = "Clave", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected String clave;
    @XmlElement(name = "NumeroCedulaEmisor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected String numeroCedulaEmisor;
    @XmlElement(name = "FechaEmisionDoc", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmisionDoc;
    @XmlElement(name = "Mensaje", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected BigInteger mensaje;
    @XmlElement(name = "DetalleMensaje", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected String detalleMensaje;
    @XmlElement(name = "MontoTotalImpuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected BigDecimal montoTotalImpuesto;
    @XmlElement(name = "CodigoActividad", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected String codigoActividad;
    @XmlElement(name = "CondicionImpuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected String condicionImpuesto;
    @XmlElement(name = "MontoTotalImpuestoAcreditar", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected BigDecimal montoTotalImpuestoAcreditar;
    @XmlElement(name = "MontoTotalDeGastoAplicable", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected BigDecimal montoTotalDeGastoAplicable;
    @XmlElement(name = "TotalFactura", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected BigDecimal totalFactura;
    @XmlElement(name = "NumeroCedulaReceptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected String numeroCedulaReceptor;
    @XmlElement(name = "NumeroConsecutivoReceptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected String numeroConsecutivoReceptor;

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Gets the value of the numeroCedulaEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCedulaEmisor() {
        return numeroCedulaEmisor;
    }

    /**
     * Sets the value of the numeroCedulaEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCedulaEmisor(String value) {
        this.numeroCedulaEmisor = value;
    }

    /**
     * Gets the value of the fechaEmisionDoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmisionDoc() {
        return fechaEmisionDoc;
    }

    /**
     * Sets the value of the fechaEmisionDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmisionDoc(XMLGregorianCalendar value) {
        this.fechaEmisionDoc = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMensaje(BigInteger value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the detalleMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleMensaje() {
        return detalleMensaje;
    }

    /**
     * Sets the value of the detalleMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleMensaje(String value) {
        this.detalleMensaje = value;
    }

    /**
     * Gets the value of the montoTotalImpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalImpuesto() {
        return montoTotalImpuesto;
    }

    /**
     * Sets the value of the montoTotalImpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalImpuesto(BigDecimal value) {
        this.montoTotalImpuesto = value;
    }

    /**
     * Gets the value of the codigoActividad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoActividad() {
        return codigoActividad;
    }

    /**
     * Sets the value of the codigoActividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoActividad(String value) {
        this.codigoActividad = value;
    }

    /**
     * Gets the value of the condicionImpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionImpuesto() {
        return condicionImpuesto;
    }

    /**
     * Sets the value of the condicionImpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionImpuesto(String value) {
        this.condicionImpuesto = value;
    }

    /**
     * Gets the value of the montoTotalImpuestoAcreditar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalImpuestoAcreditar() {
        return montoTotalImpuestoAcreditar;
    }

    /**
     * Sets the value of the montoTotalImpuestoAcreditar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalImpuestoAcreditar(BigDecimal value) {
        this.montoTotalImpuestoAcreditar = value;
    }

    /**
     * Gets the value of the montoTotalDeGastoAplicable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalDeGastoAplicable() {
        return montoTotalDeGastoAplicable;
    }

    /**
     * Sets the value of the montoTotalDeGastoAplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalDeGastoAplicable(BigDecimal value) {
        this.montoTotalDeGastoAplicable = value;
    }

    /**
     * Gets the value of the totalFactura property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFactura() {
        return totalFactura;
    }

    /**
     * Sets the value of the totalFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFactura(BigDecimal value) {
        this.totalFactura = value;
    }

    /**
     * Gets the value of the numeroCedulaReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCedulaReceptor() {
        return numeroCedulaReceptor;
    }

    /**
     * Sets the value of the numeroCedulaReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCedulaReceptor(String value) {
        this.numeroCedulaReceptor = value;
    }

    /**
     * Gets the value of the numeroConsecutivoReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConsecutivoReceptor() {
        return numeroConsecutivoReceptor;
    }

    /**
     * Sets the value of the numeroConsecutivoReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConsecutivoReceptor(String value) {
        this.numeroConsecutivoReceptor = value;
    }

}
