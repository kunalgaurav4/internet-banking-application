package com.cg.iba.service;


import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.cg.iba.entities.Nominee;


@Service
public interface INomineeService {
	public List<Nominee> addNominee(Nominee nominee);
	public List<Nominee> updateNominee(Nominee nominee);
	public List<Nominee> deleteNominee(int nomineeId);
	public Nominee findNomineeById(int nomineeId);
	public List<Nominee> listAllNominees(int accountId);
}
