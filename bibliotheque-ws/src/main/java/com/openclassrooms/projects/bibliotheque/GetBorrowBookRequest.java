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
 *         &lt;element name="workId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "workId",
    "memberId"
})
@XmlRootElement(name = "getBorrowBookRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
public class GetBorrowBookRequest {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    protected long workId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    protected long memberId;

    /**
     * Obtient la valeur de la propriété workId.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public long getWorkId() {
        return workId;
    }

    /**
     * Définit la valeur de la propriété workId.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public void setWorkId(long value) {
        this.workId = value;
    }

    /**
     * Obtient la valeur de la propriété memberId.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public long getMemberId() {
        return memberId;
    }

    /**
     * Définit la valeur de la propriété memberId.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public void setMemberId(long value) {
        this.memberId = value;
    }

}
