package com.sample.pensionerdetail.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.pensionerdetail.model.BankDetails;
import com.sample.pensionerdetail.model.PensionerDetail;
import com.sample.pensionerdetail.model.PensionerDetailDto;
import com.sample.pensionerdetail.repository.PensionerDetailRepository;

@Service
public class PensionerDetailService {

	@Autowired
	private PensionerDetailRepository pensionerDetailRepository;

	public PensionerDetailDto getPensionerDetailByAadhaar(long id) {
		PensionerDetailDto dto = new PensionerDetailDto();
		Optional<PensionerDetail> deatilEntity = pensionerDetailRepository.findById(id);
		if (deatilEntity.isPresent()) {

			dto.setName(deatilEntity.get().getName());
			dto.setPan(deatilEntity.get().getPan());
			dto.setAllowances(deatilEntity.get().getAllowances());
			dto.setSalaryEarned(deatilEntity.get().getSalaryEarned());
			dto.setSelfOrFamilyPension(deatilEntity.get().getSelfOrFamilyPension());
			BankDetails bankDetail = new BankDetails();
			bankDetail.setBankName(deatilEntity.get().getBankName());
			bankDetail.setAccountNumber(deatilEntity.get().getAccountNum());
			bankDetail.setBankType(deatilEntity.get().getBankType());
			dto.setBankDetail(bankDetail);
		}
		return dto;
	}

	public PensionerDetail savePensionerDetails(PensionerDetail pensionerDetail) {

		return pensionerDetailRepository.save(pensionerDetail);
	}
}
