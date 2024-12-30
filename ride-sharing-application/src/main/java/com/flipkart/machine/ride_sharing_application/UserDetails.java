package com.flipkart.machine.ride_sharing_application;

import com.flipkart.machine.ride_sharing_application.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    String name;
    Gender gender;

    int age;
    Map<String, VechicleDetails> vechicleDetails;

    public UserDetails(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.vechicleDetails = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Map<String, VechicleDetails> getVechicleDetails() {
        return vechicleDetails;
    }
}

