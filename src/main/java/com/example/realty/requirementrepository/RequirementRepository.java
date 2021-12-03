package com.example.realty.requirementrepository;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

//public class RequirementRepository {

    @Repository
    public interface RequirementRepository extends JpaRepository<RequirementRepository, Long> {
        @Query("SELECT u FROM Requirement u WHERE u.Status = 1")
        Collection<RequirementRepository> findAllRequirement(Long a);

        @Query("UPDATE Requirement c SET c.requirement = :Requiremnt where c.id = :RequirementId")
        //int updateRequirement(@Param("RequirementId") int RequirementId, @Param("Requirement") String Requirement);
        void update(@Param("RequirementId") long RequirementId);

        @Query("SELECT u From Requirement u Where u.Status = 1")
        Collection<RequirementRepository> save(Long a);

        @Query("SELECT u From Requirement u where u.status = 1")
        Collection<RequirementRepository> delete(Long a);

        @Query("UPDATE SubRequirement c SET c.SubRequirement = :SubRequirement Where c.id = :SubRequirementId")
        int updateSubRequirement(@Param("SubRequirementId") int SubRequirementId, @Param("SubRequirement") String SubRequirement);
        List<RequirementRepository> findAllRequirement();
        void update(Long valueOf);
    }

