package com.example.Visoul_Website.Mapper;

import com.example.Visoul_Website.DtoEmail.DtoEmail;
import com.example.Visoul_Website.Model.Email;

public class MapperVisoul {
public static Email mapTOEmail(DtoEmail dtoemail){
    return new Email(dtoemail.getEmail());
}
public static DtoEmail mapTODtoEmail(Email emailobj){
    return new DtoEmail(emailobj.getEmail());
}
}
