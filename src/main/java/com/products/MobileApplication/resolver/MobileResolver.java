package com.products.MobileApplication.resolver;

import com.products.MobileApplication.model.Mobile;
import com.products.MobileApplication.repository.MobileRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;

public class MobileResolver implements GraphQLResolver<Mobile> {

    @Autowired
    private MobileRepository mobileRepository;

    public Mobile getMobile(Mobile mobile){
        return mobileRepository.findById(mobile.getMobileId()).orElseThrow(null);
    }
}
