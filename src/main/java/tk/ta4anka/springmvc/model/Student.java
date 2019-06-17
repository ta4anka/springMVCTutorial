package tk.ta4anka.springmvc.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
//@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String country;
Map <String, String> countryOptions;

    public Student (){
         countryOptions = new LinkedHashMap<>();
         countryOptions.put("UA","Ukraine");
         countryOptions.put("FR","France");
         countryOptions.put("DE","Germany");
    }

}
