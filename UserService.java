package com.sample.demo.service;

import com.sample.demo.model.UserDetails;

import org.springframework.stereotype.Service;

@Service no usages

public class UserService (

public UserDetails getUserDetailsSample(){ no usages

UserDetails ugong UserDetails.builder().id(1).firstName("kumar").lastName("M").build();

return users;

}
public UserDetails saveUserData(UserDetails userDetails){ 1 usage return userDetailsRepository.save(userDetails);

}

public Optional<UserDetails>> getByIDExample (Integer id) { 1 usage

return userDetailsRepository.findById(id);

}

public Optional<UserDetails> getByUSerName(String userName) ( 1 usage

return userDetailsRepository.FindByFirstNameNew(userName);

}

public List<UserDetails> getBYAge(int age){ 1 usage return userDetailsRepository.FindByAge(age);

}

public Users getUser(){ no usages

Users user Users.builder().id(1).firstName("kumar").lastName("").age(10).email("v@gmail.com").birthDate("1/1/21").build();

return useri;

}
}
