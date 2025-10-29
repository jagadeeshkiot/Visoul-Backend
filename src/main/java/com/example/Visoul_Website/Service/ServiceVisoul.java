package com.example.Visoul_Website.Service;

import com.example.Visoul_Website.DtoEmail.DtoEmail;
import com.example.Visoul_Website.Mapper.MapperVisoul;
import com.example.Visoul_Website.Model.Email;
import com.example.Visoul_Website.Repo.RepoVisoul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceVisoul {
    @Autowired
    RepoVisoul repovisoul;
    public void saveEmail(DtoEmail dtoEmail) {
        repovisoul.save(MapperVisoul.mapTOEmail(dtoEmail));
    }

}
