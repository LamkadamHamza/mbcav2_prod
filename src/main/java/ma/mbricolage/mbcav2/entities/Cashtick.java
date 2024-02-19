package ma.mbricolage.mbcav2.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



@Entity   @Getter @Setter @NoArgsConstructor @AllArgsConstructor  @Builder
public class Cashtick implements Serializable {


    @EmbeddedId
    protected CashtickPK cashtickPK;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cmint;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ccint;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String ctnumtick;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ctnumlig;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ciint;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctdateinteg;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctdatemaj;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctdateannul;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 11, scale = 5)
    private BigDecimal ctqte;
    @Column(precision = 20, scale = 10)
    private BigDecimal ctpuht;
    @Column(precision = 5, scale = 2)
    private BigDecimal cttauxtva;
    @Column(precision = 15, scale = 5)
    private BigDecimal ctputtc;
    @Column(length = 10)
    private String cpmode;
    private Integer caint;
    private Short ctvint;
    @Column(length = 2)
    private String cttiptick;
    @Column(length = 200)
    private String ctnumcde;
    @Column(length = 5)
    private String ctcodpos;
    private Integer tint;
    @Column(length = 20)
    private String ctaccord;
    @Column(length = 20)
    private String cmean;
    @Column(length = 13)
    private String cdart;
    private Integer cdtypart;
    private Integer cdannul;
    @Column(length = 19)
    private String cdmariage;
    @Column(length = 60)
    private String ctvilpos;
    @Column(length = 13)
    private String ctfam;
    private Character flagfidel;
    @Column(length = 5)
    private String ctctmotchg;
    @Column(precision = 11, scale = 3)
    private BigDecimal ctpuinittc;
    private Long ctremlig;
    @Column(precision = 11, scale = 4)
    private BigDecimal ctremligtaux;
    @Column(precision = 11, scale = 3)
    private BigDecimal ctremligmt;
    private Long ctrempied;
    @Column(precision = 11, scale = 4)
    private BigDecimal ctrempiedtaux;
    @Column(precision = 11, scale = 3)
    private BigDecimal ctrempiedmt;
    @Column(length = 100)
    private String ctcodaccord;
    @Column(length = 4)
    private String ctdtaccord;
    @Column(length = 19)
    private String ctnumcartekdo;
    private Integer ctcoded3e;
    private Short ctvintd3e;
    @Basic(optional = false)
    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal cttvatauxd3e;
    @Basic(optional = false)
    @Column(nullable = false, precision = 15, scale = 5)
    private BigDecimal ctputtcd3e;
    @Basic(optional = false)
    @Column(nullable = false, precision = 15, scale = 5)
    private BigDecimal ctmthtd3e;
    @Basic(optional = false)
    @Column(nullable = false, precision = 15, scale = 5)
    private BigDecimal ctmttvad3e;
    @Basic(optional = false)
    @Column(nullable = false, precision = 15, scale = 5)
    private BigDecimal ctmtttcd3e;
    @Column(length = 5)
    private String cdint;
    @Column(precision = 13, scale = 10)
    private BigDecimal devtaux;
    @Column(precision = 20, scale = 10)
    private BigDecimal devpuht;
    @Column(precision = 15, scale = 5)
    private BigDecimal devputtc;
    @Column(precision = 15, scale = 5)
    private BigDecimal devremligmt;
    @Column(precision = 15, scale = 5)
    private BigDecimal devrempiedmt;
    @Column(length = 5)
    private String cdintedit;
    @Column(precision = 13, scale = 10)
    private BigDecimal devtauxedit;
    @Column(length = 50)
    private String ctnumtransbanq;
    private Short ctmoderouteur;
    @Column(length = 500)
    private String datafid;
    @Column(length = 500)
    private String datafidaco;
    @Column(length = 500)
    private String dataopeco;
    private Integer ciintannul;
    @Column(length = 500)
    private String datarem;
    @Column(length = 20)
    private String ctnumticklie;
    private Short cdmotreprise;
    @Column(length = 20)
    private String ctnumtickinitial;
    private Integer cmintcc;
    private Integer ciintven;
    @Column(length = 100)
    private String ctnumserie;
    @Column(length = 100)
    private String ctinfotransbanq;
    @Column(precision = 15, scale = 5)
    private BigDecimal ctpmp;
    @Column(length = 50)
    private String ctnumtickori;
    @Column(precision = 11, scale = 3)
    private BigDecimal ctqteret;
    @Column(precision = 15, scale = 5)
    private BigDecimal ctpuorittc;
    @Column(precision = 15, scale = 5)
    private BigDecimal ctrendu;
    private Short idcanal;
    private Integer ctsiteprep;
    private Short ctvteemp;
    @Column(length = 100)
    private String ctpseudo;
    @Column(length = 10)
    private String ctbipper;
    private Short ctokdiff;
    private Short ctbundle;
    private Short ctoption;
    @Column(length = 100)
    private String ctlib;
    @Column(length = 10)
    private String ctplace;
    private Integer ccintori;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctdateori;
    @Column(precision = 11, scale = 5)
    private BigDecimal ctqteori;
    private Integer ciintecole;
    private Integer cbpint;
    private Short ctokrp;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctdateliv;
    @Column(length = 200)
    private String ctcomm;
    @Column(length = 100)
    private String ctlibsup;
    @Basic(optional = false)
    @Column(nullable = false)
    private int idsoc;
    private Short cttypetransac;
    @Column(length = 100)
    private String cttoken;









}
