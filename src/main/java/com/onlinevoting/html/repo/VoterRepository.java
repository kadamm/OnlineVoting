package com.onlinevoting.html.repo;

import org.springframework.data.repository.CrudRepository;

import com.onlinevoting.html.model.VoterDetails;

public interface VoterRepository extends CrudRepository<VoterDetails, String> {

}
