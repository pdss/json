package com.st.json.service.impl;

import com.st.json.entity.UserInformation;
import com.st.json.repository.UserRepository;
import com.st.json.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInformationServiceImpl implements UserInformationService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserInformation findOne(Integer id) {
        return userRepository.findById(id).get();
    }
}
