package com.st.json.repository;

import com.st.json.entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInformation,Integer> {
}
