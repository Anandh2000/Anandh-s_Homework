package com.finzly.loanApplicationManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.finzly.loanApplicationManagement.entity.LoanDetails;

public interface LoanDetailsRepository extends JpaRepository<LoanDetails, Long>{

}
