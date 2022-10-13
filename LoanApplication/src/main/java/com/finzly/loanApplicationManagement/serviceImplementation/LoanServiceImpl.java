package com.finzly.loanApplicationManagement.serviceImplementation;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Stack;

import com.finzly.loanApplicationManagement.controller.LoanApplicationController;
import com.finzly.loanApplicationManagement.entity.LoanDetails;
import com.finzly.loanApplicationManagement.errorHandler.ErrorHandlerService;
import com.finzly.loanApplicationManagement.repository.LoanDetailsRepository;
import com.finzly.loanApplicationManagement.response.ErrorResponse;
import com.finzly.loanApplicationManagement.response.SuccessResponse;
import com.finzly.loanApplicationManagement.Service.LoanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component
public class LoanServiceImpl implements com.finzly.loanApplicationManagement.Service.LoanService{
	private static int tradeNo = 0;
	private static double rate = 66.00;
	private double ConvertedAmount;
	//private static Stack<FxTradingData> recentlyEnteredData = new Stack<>();

	@Autowired
	private ErrorHandlerService errorHandlerService;
	
	@Autowired
	private LoanDetailsRepository repository;

	@Override
	public ResponseEntity<?> applyLoan(LoanDetails details) {
		repository.save(details);
		return new ResponseEntity<>("created",HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<?> getAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> getLoansByCustomerId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> payementScheduler() {
		int paymentSchedule = 12/2;  
		LocalDate start = LocalDate.of(2022, 8, 12);
		LocalDate tempPaymentdate = LocalDate.of(start.getDayOfMonth(), LocalDate.now().getMonthValue(),LocalDate.now().getDayOfMonth());
		double res = 10000; //loanamount
		for(int i=1;i<paymentSchedule;i++) {
			res = res-10000/5;
		}
		double principle = res;
		return null;
	}

	@Override
	public ResponseEntity<?> setInterest(double rate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
