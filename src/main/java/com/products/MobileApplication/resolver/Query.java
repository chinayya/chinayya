package com.products.MobileApplication.resolver;

import com.products.MobileApplication.model.Mobile;
import com.products.MobileApplication.repository.MobileRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private MobileRepository mobileRepository;

    public List<Mobile> getAllMobiles(){
        return mobileRepository.findAll();
    }
}
