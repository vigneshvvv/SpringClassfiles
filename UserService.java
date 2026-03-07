package com.sample.demo.service;

import com.sample.demo.model.UserDetails;

import org.springframework.stereotype.Service;

@Service no usages

public class UserService (

public UserDetails getUserDetailsSample(){ no usages

UserDetails ugong UserDetails.builder().id(1).firstName("kumar").lastName("M").build();

return users;

}
public UserDetails saveUserData(UserDetails userDetails){  return userDetailsRepository.save(userDetails);

}

public Optional<UserDetails>> getByIDExample (Integer id) {

return userDetailsRepository.findById(id);

}

public Optional<UserDetails> getByUSerName(String userName) (

return userDetailsRepository.FindByFirstNameNew(userName);

}

public List<UserDetails> getBYAge(int age){ return userDetailsRepository.FindByAge(age);

}

public Users getUser(){ no usages

Users user =Users.builder().id(1).firstName("kumar").lastName("").age(10).email("v@gmail.com").birthDate("1/1/21").build();

return user;

}
}
