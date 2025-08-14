package com.example.demo.implement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.annotation.ErrorLog;
import com.example.demo.domain.User;
import com.example.demo.exception.BaseException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.helper.ErrorCode;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserCommandService;

import lombok.extern.log4j.Log4j2;

// @Log4j2
@Service
public class UserCommandServiceImpl implements UserCommandService {

    // private final Logger logger = LogManager.getLogger(UserCommandServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @ErrorLog
    @Override
    public void create(User user) {
        // logger.debug("", user);
        // log.debug("", user);
        // TODO Auto-generated method stub
        throw new BaseException("Unimplemented method 'create'", ErrorCode.INTERNAL_SERVER_ERROR);
    }

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        throw new BaseException("Unimplemented method 'update'", ErrorCode.INTERNAL_SERVER_ERROR);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new BaseException("Unimplemented method 'delete'", ErrorCode.INTERNAL_SERVER_ERROR);
    }

}
