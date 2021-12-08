package com.example.realty.requirementrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Subrequirementrepo extends JpaRepository<Subrequirementrepo,Long> {

    @Query("UPDATE SubRequirement c SET c.SubRequirement = :SubRequirement WHERE c.id = :SubRequirementId")
    void updatepublishSubRequirement(@Param("RequirementId") String[] RequirementId);

    @Query("UPDATE SubRequirement c SET c.SubRequirement = :SubRequirement WHERE c.id = :SubRequirementId")
    void updateunPublishSubRequirement(@Param("RequirementId") String[] RequirementId);

    @Query("UPDATE SubRequirement c SET c.SubRequirement = :SubRequirement WHERE c.id = :SubRequirementId")
    void updateSubRequirement(@Param("RequirementId") Subrequirementrepo RequirementId);


}
