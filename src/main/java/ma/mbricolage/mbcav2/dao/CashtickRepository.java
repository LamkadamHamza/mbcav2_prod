package ma.mbricolage.mbcav2.dao;


import ma.mbricolage.mbcav2.entities.Cashtick;
import ma.mbricolage.mbcav2.entities.CashtickPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface CashtickRepository extends JpaRepository<Cashtick, CashtickPK> {



   /* @Query(value = "SELECT ct.CMINT, SUM(ct.ctqte * ct.ctputtc) as CA ,m.CMRAISOC " +
            "FROM capcash.cashtick ct ,capcash.cashmag m " +
            "WHERE ct.ctdate >= CURRENT_DATE() and ct.cmint=m.CMINT " +
            "AND ct.ctdate < ADDDATE(CURRENT_DATE(), INTERVAL 1 DAY) " +
            "AND ct.cttiptick = 1 " +
            "GROUP BY ct.CMINT", nativeQuery = true)*/

  @Query(value = " SELECT ct.CMINT,m.CMRAISOC , "+
    "SUM(CASE WHEN ct.ctdate >= CURRENT_DATE() THEN ct.ctqte * ct.ctputtc ELSE 0 END) AS CA_Actuel , "+
    "SUM(CASE WHEN ct.ctdate >= DATE_SUB(CURRENT_DATE(), INTERVAL 1 YEAR) AND ct.ctdate < DATE_SUB(CURRENT_DATE(), INTERVAL 1 YEAR)+1  THEN ct.ctqte * ct.ctputtc ELSE 0  END) AS CA_Annee_Precedente "+
    "FROM capcash.cashtick ct "+
    "INNER JOIN capcash.cashmag m ON ct.cmint = m.CMINT " +
    "WHERE ct.ctdate >= DATE_SUB(CURRENT_DATE(), INTERVAL 1 YEAR) AND ct.ctdate < ADDDATE(CURRENT_DATE(), INTERVAL 1 DAY) AND ct.cttiptick = 1 "+
    "GROUP BY ct.CMINT ",nativeQuery = true)
    List<Object[]> yourCustomQuery();
}
