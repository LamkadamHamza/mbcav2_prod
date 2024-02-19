package ma.mbricolage.mbcav2.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Embeddable  @Getter @Setter @Builder @NoArgsConstructor  @AllArgsConstructor
public class CashtickPK implements Serializable {

    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctdate;
    @Basic(optional = false)
    @Column(nullable = false)
    private int trowid;

}
