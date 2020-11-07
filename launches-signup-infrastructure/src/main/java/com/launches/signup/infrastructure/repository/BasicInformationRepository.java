package com.launches.signup.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.launches.signup.domain.entity.BasicInformation;

/**
 * @author <a href="mailto:dafediegogean@gmail.com">Diego Gean da Fé</a>
 * @version
 * @since 10 de out de 2020, 18:14:10
 */
@Repository
public interface BasicInformationRepository extends JpaRepository<BasicInformation, Long> {

}
