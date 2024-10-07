package com.example.socialMedia.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.socialMedia.controller.userController;
import com.example.socialMedia.model.Connection;
import com.example.socialMedia.repository.ConnectionDal;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;

@Service
public class ConnectionService {

	@Autowired
	ConnectionDal connectionDal;
	
	
	public List<Connection> getConnections() {
		return connectionDal.findAll();
	}

	public List<Connection> getConnectionsByCompany(String company) {
		return connectionDal.findByCompany(company);
	}

	public Connection addConnection(Connection connection) {
		return connectionDal.save(connection);
	}

}
