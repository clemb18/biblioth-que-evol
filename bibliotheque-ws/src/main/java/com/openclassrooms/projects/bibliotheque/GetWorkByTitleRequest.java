//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.03.07 à 07:52:15 AM CET 
//


package com.openclassrooms.projects.bibliotheque;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "title"
})
@XmlRootElement(name = "getWorkByTitleRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
public class GetWorkByTitleRequest {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    protected String title;

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public void setTitle(String value) {
        this.title = value;
    }

}
