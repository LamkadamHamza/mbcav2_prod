package ma.mbricolage.mbcav2.dao;


import ma.mbricolage.mbcav2.entities.Cashtick;
import ma.mbricolage.mbcav2.entities.CashtickPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface CashtickRepository extends JpaRepository<Cashtick, CashtickPK> {



    @Query(value = "SELECT ct.CMINT, SUM(ct.ctqte * ct.ctputtc) as CA ,m.CMRAISOC " +
            "FROM capcash.cashtick ct ,capcash.cashmag m " +
            "WHERE ct.ctdate >= CURRENT_DATE() and ct.cmint=m.CMINT " +
            "AND ct.ctdate < ADDDATE(CURRENT_DATE(), INTERVAL 1 DAY) " +
            "AND ct.cttiptick = 1 " +
            "GROUP BY ct.CMINT", nativeQuery = true)

    List<Object[]> yourCustomQuery();






}
