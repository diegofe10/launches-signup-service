package com.launches.signup.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.launches.signup.domain.entity.BasicInformation;

@Repository
public interface BasicInformationRepository extends JpaRepository<BasicInformation, Long> {

}
